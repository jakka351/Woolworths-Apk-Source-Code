package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.v1.Document;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class SQLiteRemoteDocumentCache implements RemoteDocumentCache {

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15517a;
    public final LocalSerializer b;
    public IndexManager c;

    public SQLiteRemoteDocumentCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f15517a = sQLitePersistence;
        this.b = localSerializer;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final MutableDocument a(DocumentKey documentKey) {
        return (MutableDocument) e(Collections.singletonList(documentKey)).get(documentKey);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final Map b(String str, FieldIndex.IndexOffset indexOffset, int i) {
        List listF = this.c.f(str);
        ArrayList arrayList = new ArrayList(listF.size());
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add((ResourcePath) ((ResourcePath) it.next()).a(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return h(arrayList, indexOffset, i, null, null);
        }
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 100;
            map.putAll(h(arrayList.subList(i2, Math.min(arrayList.size(), i3)), indexOffset, i, null, null));
            i2 = i3;
        }
        final androidx.browser.trusted.a aVar = FieldIndex.IndexOffset.e;
        int i4 = Util.f15603a;
        if (map.size() <= i) {
            return map;
        }
        ArrayList arrayList2 = new ArrayList(map.entrySet());
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.firebase.firestore.util.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i5 = Util.f15603a;
                return aVar.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            }
        });
        HashMap map2 = new HashMap();
        for (int i5 = 0; i5 < i; i5++) {
            map2.put(((Map.Entry) arrayList2.get(i5)).getKey(), ((Map.Entry) arrayList2.get(i5)).getValue());
        }
        return map2;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final HashMap c(Query query, FieldIndex.IndexOffset indexOffset, Set set, QueryContext queryContext) {
        return h(Collections.singletonList(query.e), indexOffset, Integer.MAX_VALUE, new h(2, query, set), queryContext);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.b(!snapshotVersion.equals(SnapshotVersion.e), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        DocumentKey documentKey = mutableDocument.f15535a;
        Timestamp timestamp = snapshotVersion.d;
        RemoteSerializer remoteSerializer = this.b.f15485a;
        MaybeDocument.Builder builderU = MaybeDocument.U();
        if (mutableDocument.k()) {
            NoDocument.Builder builderQ = NoDocument.Q();
            String strH = remoteSerializer.h(mutableDocument.getKey());
            builderQ.p();
            NoDocument.L((NoDocument) builderQ.e, strH);
            com.google.protobuf.Timestamp timestampL = RemoteSerializer.l(mutableDocument.j().d);
            builderQ.p();
            NoDocument.M((NoDocument) builderQ.e, timestampL);
            NoDocument noDocument = (NoDocument) builderQ.m();
            builderU.p();
            MaybeDocument.M((MaybeDocument) builderU.e, noDocument);
        } else if (mutableDocument.b()) {
            Document.Builder builderS = Document.S();
            String strH2 = remoteSerializer.h(mutableDocument.getKey());
            builderS.p();
            Document.L((Document) builderS.e, strH2);
            Map mapO = mutableDocument.getData().b().d0().O();
            builderS.p();
            Document.M((Document) builderS.e).putAll(mapO);
            com.google.protobuf.Timestamp timestampL2 = RemoteSerializer.l(mutableDocument.j().d);
            builderS.p();
            Document.N((Document) builderS.e, timestampL2);
            Document document = (Document) builderS.m();
            builderU.p();
            MaybeDocument.N((MaybeDocument) builderU.e, document);
        } else {
            if (!mutableDocument.l()) {
                Assert.a("Cannot encode invalid document %s", mutableDocument);
                throw null;
            }
            UnknownDocument.Builder builderQ2 = UnknownDocument.Q();
            String strH3 = remoteSerializer.h(mutableDocument.getKey());
            builderQ2.p();
            UnknownDocument.L((UnknownDocument) builderQ2.e, strH3);
            com.google.protobuf.Timestamp timestampL3 = RemoteSerializer.l(mutableDocument.j().d);
            builderQ2.p();
            UnknownDocument.M((UnknownDocument) builderQ2.e, timestampL3);
            UnknownDocument unknownDocument = (UnknownDocument) builderQ2.m();
            builderU.p();
            MaybeDocument.O((MaybeDocument) builderU.e, unknownDocument);
        }
        boolean zE = mutableDocument.e();
        builderU.p();
        MaybeDocument.L((MaybeDocument) builderU.e, zE);
        this.f15517a.o("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", EncodedPath.b(documentKey.d), Integer.valueOf(documentKey.d.d.size()), Long.valueOf(timestamp.d), Integer.valueOf(timestamp.e), ((MaybeDocument) builderU.m()).toByteArray());
        this.c.d((ResourcePath) documentKey.d.o());
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final HashMap e(Iterable iterable) throws InterruptedException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            arrayList.add(EncodedPath.b(documentKey.d));
            map.put(documentKey, MutableDocument.n(documentKey));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f15517a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        while (longQuery.f.hasNext()) {
            Cursor cursorE = longQuery.b().e();
            while (cursorE.moveToNext()) {
                try {
                    i(backgroundQueue, map, cursorE, null);
                } catch (Throwable th) {
                    if (cursorE != null) {
                        try {
                            cursorE.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorE.close();
        }
        backgroundQueue.a();
        return map;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            arrayList2.add(EncodedPath.b(documentKey.d));
            immutableSortedMapJ = immutableSortedMapJ.j(documentKey, MutableDocument.o(documentKey, SnapshotVersion.e));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f15517a, "DELETE FROM remote_documents WHERE path IN (", arrayList2, ")");
        while (longQuery.f.hasNext()) {
            longQuery.e++;
            Object[] objArrA = longQuery.a();
            longQuery.f15515a.o(longQuery.b + ((Object) Util.g(objArrA.length, "?", ", ")) + longQuery.c, objArrA);
        }
        this.c.a(immutableSortedMapJ);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void g(IndexManager indexManager) {
        this.c = indexManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap h(List list, FieldIndex.IndexOffset indexOffset, int i, h hVar, QueryContext queryContext) throws InterruptedException {
        Timestamp timestamp = indexOffset.l().d;
        DocumentKey documentKeyE = indexOffset.e();
        StringBuilder sbG = Util.g(list.size(), "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", " UNION ");
        sbG.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        char c = 1;
        Object[] objArr = new Object[androidx.compose.ui.input.pointer.a.c(9, 1, list)];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ResourcePath resourcePath = (ResourcePath) it.next();
            String strB = EncodedPath.b(resourcePath);
            int i3 = i2 + 1;
            objArr[i2] = strB;
            int i4 = i2 + 2;
            StringBuilder sb = new StringBuilder(strB);
            int length = sb.length() - c;
            char cCharAt = sb.charAt(length);
            char c2 = c;
            Assert.b(cCharAt == c ? c2 : 0, "successor may only operate on paths generated by encode", new Object[0]);
            sb.setCharAt(length, (char) (cCharAt + 1));
            objArr[i3] = sb.toString();
            objArr[i4] = Integer.valueOf(resourcePath.d.size() + 1);
            long j = timestamp.d;
            int i5 = timestamp.e;
            objArr[i2 + 3] = Long.valueOf(j);
            objArr[i2 + 4] = Long.valueOf(j);
            objArr[i2 + 5] = Integer.valueOf(i5);
            objArr[i2 + 6] = Long.valueOf(j);
            int i6 = i2 + 8;
            objArr[i2 + 7] = Integer.valueOf(i5);
            i2 += 9;
            objArr[i6] = EncodedPath.b(documentKeyE.d);
            c = c2;
            sbG = sbG;
        }
        objArr[i2] = Integer.valueOf(i);
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        HashMap map = new HashMap();
        SQLitePersistence.Query queryP = this.f15517a.p(sbG.toString());
        queryP.a(objArr);
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                i(backgroundQueue, map, cursorE, hVar);
            } finally {
            }
        }
        cursorE.close();
        backgroundQueue.a();
        return map;
    }

    public final void i(BackgroundQueue backgroundQueue, final HashMap map, Cursor cursor, final Function function) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        final int i2 = cursor.getInt(2);
        Executor executor = backgroundQueue;
        if (cursor.isLast()) {
            executor = Executors.b;
        }
        executor.execute(new Runnable() { // from class: com.google.firebase.firestore.local.t
            @Override // java.lang.Runnable
            public final void run() {
                SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache = this.d;
                byte[] bArr = blob;
                int i3 = i;
                int i4 = i2;
                Function function2 = function;
                HashMap map2 = map;
                try {
                    MutableDocument mutableDocumentB = sQLiteRemoteDocumentCache.b.b(MaybeDocument.V(bArr));
                    mutableDocumentB.d = new SnapshotVersion(new Timestamp(i3, i4));
                    if (function2 == null || ((Boolean) function2.apply(mutableDocumentB)).booleanValue()) {
                        synchronized (map2) {
                            map2.put(mutableDocumentB.f15535a, mutableDocumentB);
                        }
                    }
                } catch (InvalidProtocolBufferException e) {
                    Assert.a("MaybeDocument failed to parse: %s", e);
                    throw null;
                }
            }
        });
    }
}

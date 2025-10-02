package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
final class MemoryRemoteDocumentCache implements RemoteDocumentCache {

    /* renamed from: a, reason: collision with root package name */
    public ImmutableSortedMap f15501a;
    public IndexManager b;

    public class DocumentIterable implements Iterable<Document> {

        /* renamed from: com.google.firebase.firestore.local.MemoryRemoteDocumentCache$DocumentIterable$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<Document> {
            public final /* synthetic */ Iterator d;

            public AnonymousClass1(Iterator it) {
                this.d = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            public final Document next() {
                return (Document) ((Map.Entry) this.d.next()).getValue();
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<Document> iterator() {
            throw null;
        }
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final MutableDocument a(DocumentKey documentKey) {
        Document document = (Document) this.f15501a.d(documentKey);
        return document != null ? document.a() : MutableDocument.n(documentKey);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final Map b(String str, FieldIndex.IndexOffset indexOffset, int i) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final HashMap c(Query query, FieldIndex.IndexOffset indexOffset, Set set, QueryContext queryContext) {
        HashMap map = new HashMap();
        ResourcePath resourcePath = query.e;
        Iterator itK = this.f15501a.k(new DocumentKey((ResourcePath) resourcePath.a("")));
        while (itK.hasNext()) {
            Map.Entry entry = (Map.Entry) itK.next();
            Document document = (Document) entry.getValue();
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            if (!resourcePath.m(documentKey.d)) {
                break;
            }
            if (documentKey.d.d.size() <= resourcePath.d.size() + 1 && FieldIndex.IndexOffset.d(document).compareTo(indexOffset) > 0 && (set.contains(document.getKey()) || query.d(document))) {
                map.put(document.getKey(), document.a());
            }
        }
        return map;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        DocumentKey documentKey = mutableDocument.f15535a;
        Assert.b(this.b != null, "setIndexManager() not called", new Object[0]);
        Assert.b(!snapshotVersion.equals(SnapshotVersion.e), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        ImmutableSortedMap immutableSortedMap = this.f15501a;
        MutableDocument mutableDocumentA = mutableDocument.a();
        mutableDocumentA.d = snapshotVersion;
        this.f15501a = immutableSortedMap.j(documentKey, mutableDocumentA);
        this.b.d((ResourcePath) documentKey.d.o());
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final HashMap e(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            map.put(documentKey, a(documentKey));
        }
        return map;
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void f(ArrayList arrayList) {
        Assert.b(this.b != null, "setIndexManager() not called", new Object[0]);
        ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            this.f15501a = this.f15501a.l(documentKey);
            immutableSortedMapJ = immutableSortedMapJ.j(documentKey, MutableDocument.o(documentKey, SnapshotVersion.e));
        }
        this.b.a(immutableSortedMapJ);
    }

    @Override // com.google.firebase.firestore.local.RemoteDocumentCache
    public final void g(IndexManager indexManager) {
        this.b = indexManager;
    }
}

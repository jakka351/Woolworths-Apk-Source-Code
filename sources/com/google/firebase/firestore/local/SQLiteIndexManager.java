package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.index.DirectionalIndexByteEncoder;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.index.IndexByteEncoder;
import com.google.firebase.firestore.index.OrderedCodeWriter;
import com.google.firebase.firestore.local.IndexManager;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.LogicUtils;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes6.dex */
final class SQLiteIndexManager implements IndexManager {
    public static final byte[] k = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLitePersistence f15508a;
    public final LocalSerializer b;
    public final String c;
    public final HashMap d = new HashMap();
    public final MemoryIndexManager.MemoryCollectionParentIndex e = new MemoryIndexManager.MemoryCollectionParentIndex();
    public final HashMap f = new HashMap();
    public final PriorityQueue g = new PriorityQueue(10, new a(3));
    public boolean h = false;
    public int i = -1;
    public long j = -1;

    public SQLiteIndexManager(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user) {
        this.f15508a = sQLitePersistence;
        this.b = localSerializer;
        String str = user.f15436a;
        this.c = str == null ? "" : str;
    }

    public static Object[] j(FieldIndex fieldIndex, Target target, Collection collection) {
        Iterator it;
        if (collection == null) {
            return null;
        }
        ArrayList<IndexByteEncoder> arrayList = new ArrayList();
        arrayList.add(new IndexByteEncoder());
        Iterator it2 = collection.iterator();
        Iterator it3 = fieldIndex.d().iterator();
        while (it3.hasNext()) {
            FieldIndex.Segment segment = (FieldIndex.Segment) it3.next();
            Value value = (Value) it2.next();
            for (IndexByteEncoder indexByteEncoder : arrayList) {
                FieldPath fieldPathB = segment.b();
                for (Filter filter : target.c) {
                    if (filter instanceof FieldFilter) {
                        FieldFilter fieldFilter = (FieldFilter) filter;
                        if (fieldFilter.c.equals(fieldPathB)) {
                            FieldFilter.Operator operator = fieldFilter.f15451a;
                            if (operator.equals(FieldFilter.Operator.IN) || operator.equals(FieldFilter.Operator.NOT_IN)) {
                                if (Values.f(value)) {
                                    ArrayList arrayList2 = new ArrayList(arrayList);
                                    arrayList = new ArrayList();
                                    for (Value value2 : value.W().i()) {
                                        Iterator it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            IndexByteEncoder indexByteEncoder2 = (IndexByteEncoder) it4.next();
                                            IndexByteEncoder indexByteEncoder3 = new IndexByteEncoder();
                                            OrderedCodeWriter orderedCodeWriter = indexByteEncoder2.f15475a;
                                            byte[] bArrCopyOf = Arrays.copyOf(orderedCodeWriter.f15479a, orderedCodeWriter.b);
                                            int length = bArrCopyOf.length;
                                            OrderedCodeWriter orderedCodeWriter2 = indexByteEncoder3.f15475a;
                                            orderedCodeWriter2.a(length);
                                            int length2 = bArrCopyOf.length;
                                            int i = 0;
                                            while (i < length2) {
                                                byte b = bArrCopyOf[i];
                                                Iterator it5 = it2;
                                                byte[] bArr = orderedCodeWriter2.f15479a;
                                                int i2 = orderedCodeWriter2.b;
                                                orderedCodeWriter2.b = i2 + 1;
                                                bArr[i2] = b;
                                                i++;
                                                it2 = it5;
                                            }
                                            Iterator it6 = it2;
                                            DirectionalIndexByteEncoder directionalIndexByteEncoderA = indexByteEncoder3.a(segment.c());
                                            FirestoreIndexValueWriter.a(value2, directionalIndexByteEncoderA);
                                            directionalIndexByteEncoderA.c();
                                            arrayList.add(indexByteEncoder3);
                                            it2 = it6;
                                        }
                                    }
                                    it = it2;
                                } else {
                                    it = it2;
                                    DirectionalIndexByteEncoder directionalIndexByteEncoderA2 = indexByteEncoder.a(segment.c());
                                    FirestoreIndexValueWriter.a(value, directionalIndexByteEncoderA2);
                                    directionalIndexByteEncoderA2.c();
                                }
                                it2 = it;
                            }
                        }
                    }
                    it2 = it2;
                }
                it = it2;
                DirectionalIndexByteEncoder directionalIndexByteEncoderA22 = indexByteEncoder.a(segment.c());
                FirestoreIndexValueWriter.a(value, directionalIndexByteEncoderA22);
                directionalIndexByteEncoderA22.c();
                it2 = it;
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            OrderedCodeWriter orderedCodeWriter3 = ((IndexByteEncoder) arrayList.get(i3)).f15475a;
            objArr[i3] = Arrays.copyOf(orderedCodeWriter3.f15479a, orderedCodeWriter3.b);
        }
        return objArr;
    }

    public static FieldIndex.IndexOffset m(Collection collection) {
        Assert.b(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        FieldIndex.IndexOffset indexOffsetC = ((FieldIndex) it.next()).f().c();
        int iF = indexOffsetC.f();
        while (it.hasNext()) {
            FieldIndex.IndexOffset indexOffsetC2 = ((FieldIndex) it.next()).f().c();
            if (indexOffsetC2.compareTo(indexOffsetC) < 0) {
                indexOffsetC = indexOffsetC2;
            }
            iF = Math.max(indexOffsetC2.f(), iF);
        }
        return FieldIndex.IndexOffset.b(indexOffsetC.l(), indexOffsetC.e(), iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    @Override // com.google.firebase.firestore.local.IndexManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.firebase.database.collection.ImmutableSortedMap r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLiteIndexManager.a(com.google.firebase.database.collection.ImmutableSortedMap):void");
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final FieldIndex.IndexOffset b(Target target) {
        ArrayList arrayList = new ArrayList();
        Iterator it = n(target).iterator();
        while (it.hasNext()) {
            FieldIndex fieldIndexK = k((Target) it.next());
            if (fieldIndexK != null) {
                arrayList.add(fieldIndexK);
            }
        }
        return m(arrayList);
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final FieldIndex.IndexOffset c(String str) {
        Collection collectionL = l(str);
        Assert.b(!collectionL.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return m(collectionL);
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void d(ResourcePath resourcePath) {
        Assert.b(this.h, "IndexManager not started", new Object[0]);
        Assert.b(resourcePath.d.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.e.a(resourcePath)) {
            this.f15508a.o("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", resourcePath.e(), EncodedPath.b((ResourcePath) resourcePath.o()));
        }
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void e(String str, FieldIndex.IndexOffset indexOffset) {
        Assert.b(this.h, "IndexManager not started", new Object[0]);
        this.j++;
        for (FieldIndex fieldIndex : l(str)) {
            FieldIndex fieldIndexA = FieldIndex.a(fieldIndex.e(), fieldIndex.c(), fieldIndex.g(), FieldIndex.IndexState.a(this.j, indexOffset));
            this.f15508a.o("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(fieldIndex.e()), this.c, Long.valueOf(this.j), Long.valueOf(indexOffset.l().d.d), Integer.valueOf(indexOffset.l().d.e), EncodedPath.b(indexOffset.e().d), Integer.valueOf(indexOffset.f()));
            o(fieldIndexA);
        }
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final List f(String str) {
        Assert.b(this.h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        SQLitePersistence.Query queryP = this.f15508a.p("SELECT parent FROM collection_parents WHERE collection_id = ?");
        queryP.a(str);
        Cursor cursorE = queryP.e();
        while (cursorE.moveToNext()) {
            try {
                arrayList.add(EncodedPath.a(cursorE.getString(0)));
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
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final String g() {
        Assert.b(this.h, "IndexManager not started", new Object[0]);
        FieldIndex fieldIndex = (FieldIndex) this.g.peek();
        if (fieldIndex != null) {
            return fieldIndex.c();
        }
        return null;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final IndexManager.IndexType h(Target target) {
        IndexManager.IndexType indexType;
        List listN = n(target);
        Iterator it = listN.iterator();
        IndexManager.IndexType indexType2 = IndexManager.IndexType.f;
        IndexManager.IndexType indexType3 = indexType2;
        while (true) {
            boolean zHasNext = it.hasNext();
            indexType = IndexManager.IndexType.e;
            if (!zHasNext) {
                break;
            }
            Target target2 = (Target) it.next();
            FieldIndex fieldIndexK = k(target2);
            if (fieldIndexK == null) {
                indexType3 = IndexManager.IndexType.d;
                break;
            }
            int size = fieldIndexK.g().size();
            HashSet hashSet = new HashSet();
            Iterator it2 = target2.c.iterator();
            int i = 0;
            while (it2.hasNext()) {
                for (FieldFilter fieldFilter : ((Filter) it2.next()).c()) {
                    FieldPath fieldPath = fieldFilter.c;
                    FieldFilter.Operator operator = fieldFilter.f15451a;
                    if (!fieldPath.equals(FieldPath.e)) {
                        if (operator.equals(FieldFilter.Operator.ARRAY_CONTAINS) || operator.equals(FieldFilter.Operator.ARRAY_CONTAINS_ANY)) {
                            i = 1;
                        } else {
                            hashSet.add(fieldFilter.c);
                        }
                    }
                }
            }
            for (OrderBy orderBy : target2.b) {
                if (!orderBy.b.equals(FieldPath.e)) {
                    hashSet.add(orderBy.b);
                }
            }
            if (size < hashSet.size() + i) {
                indexType3 = indexType;
            }
        }
        return (target.f == -1 || listN.size() <= 1 || indexType3 != indexType2) ? indexType3 : indexType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    @Override // com.google.firebase.firestore.local.IndexManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List i(com.google.firebase.firestore.core.Target r24) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLiteIndexManager.i(com.google.firebase.firestore.core.Target):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r8.add(((com.google.firebase.firestore.model.FieldIndex.Segment) r7.get(r9)).b().b());
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.firestore.model.FieldIndex k(com.google.firebase.firestore.core.Target r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLiteIndexManager.k(com.google.firebase.firestore.core.Target):com.google.firebase.firestore.model.FieldIndex");
    }

    public final Collection l(String str) {
        Assert.b(this.h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    public final List n(Target target) {
        List listSingletonList;
        HashMap map = this.d;
        if (map.containsKey(target)) {
            return (List) map.get(target);
        }
        ArrayList arrayList = new ArrayList();
        if (target.c.isEmpty()) {
            arrayList.add(target);
        } else {
            CompositeFilter compositeFilter = new CompositeFilter(target.c, CompositeFilter.Operator.AND);
            if (Collections.unmodifiableList(compositeFilter.f15443a).isEmpty()) {
                listSingletonList = Collections.EMPTY_LIST;
            } else {
                Filter filterE = LogicUtils.e(LogicUtils.f(compositeFilter));
                Assert.b(LogicUtils.g(filterE), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
                if (filterE instanceof FieldFilter) {
                    listSingletonList = Collections.singletonList(filterE);
                } else {
                    if (filterE instanceof CompositeFilter) {
                        CompositeFilter compositeFilter2 = (CompositeFilter) filterE;
                        Iterator it = compositeFilter2.f15443a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Filter) it.next()) instanceof CompositeFilter) {
                                    break;
                                }
                            } else if (compositeFilter2.e()) {
                            }
                        }
                    }
                    listSingletonList = filterE.b();
                }
            }
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Target(target.d, target.e, ((Filter) it2.next()).b(), target.b, target.f, target.g, target.h));
            }
        }
        map.put(target, arrayList);
        return arrayList;
    }

    public final void o(FieldIndex fieldIndex) {
        String strC = fieldIndex.c();
        HashMap map = this.f;
        Map map2 = (Map) map.get(strC);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(fieldIndex.c(), map2);
        }
        FieldIndex fieldIndex2 = (FieldIndex) map2.get(Integer.valueOf(fieldIndex.e()));
        PriorityQueue priorityQueue = this.g;
        if (fieldIndex2 != null) {
            priorityQueue.remove(fieldIndex2);
        }
        map2.put(Integer.valueOf(fieldIndex.e()), fieldIndex);
        priorityQueue.add(fieldIndex);
        this.i = Math.max(this.i, fieldIndex.e());
        this.j = Math.max(this.j, fieldIndex.f().d());
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void start() {
        HashMap map = new HashMap();
        SQLitePersistence sQLitePersistence = this.f15508a;
        SQLitePersistence.Query queryP = sQLitePersistence.p("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        queryP.a(this.c);
        queryP.c(new n(map, 0));
        sQLitePersistence.p("SELECT index_id, collection_group, index_proto FROM index_configuration").c(new o(0, this, map));
        this.h = true;
    }
}

package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ArraySortedMap;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.Overlay;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
class LocalDocumentsView {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteDocumentCache f15484a;
    public final MutationQueue b;
    public final DocumentOverlayCache c;
    public final IndexManager d;

    public LocalDocumentsView(RemoteDocumentCache remoteDocumentCache, MutationQueue mutationQueue, DocumentOverlayCache documentOverlayCache, IndexManager indexManager) {
        this.f15484a = remoteDocumentCache;
        this.b = mutationQueue;
        this.c = documentOverlayCache;
        this.d = indexManager;
    }

    public final HashMap a(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (MutableDocument mutableDocument : map.values()) {
            DocumentKey documentKey = mutableDocument.f15535a;
            Overlay overlay = (Overlay) map2.get(documentKey);
            if (set.contains(documentKey) && (overlay == null || (overlay.c() instanceof PatchMutation))) {
                map3.put(documentKey, mutableDocument);
            } else if (overlay != null) {
                map4.put(documentKey, overlay.c().c());
                overlay.c().a(mutableDocument, overlay.c().c(), new Timestamp(new Date()));
            } else {
                map4.put(documentKey, FieldMask.b);
            }
        }
        map4.putAll(f(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            DocumentKey documentKey2 = (DocumentKey) entry.getKey();
            Document document = (Document) entry.getValue();
            OverlayedDocument overlayedDocument = new OverlayedDocument();
            overlayedDocument.f15503a = document;
            map5.put(documentKey2, overlayedDocument);
        }
        return map5;
    }

    public final ImmutableSortedMap b(Iterable iterable) {
        return d(this.f15484a.e(iterable), new HashSet());
    }

    public final ImmutableSortedMap c(Query query, FieldIndex.IndexOffset indexOffset, QueryContext queryContext) {
        ResourcePath resourcePath = query.e;
        if (DocumentKey.d(resourcePath) && Collections.EMPTY_LIST.isEmpty()) {
            ArraySortedMap arraySortedMap = DocumentCollections.f15533a;
            DocumentKey documentKey = new DocumentKey(resourcePath);
            Overlay overlayF = this.c.f(documentKey);
            MutableDocument mutableDocumentA = (overlayF == null || (overlayF.c() instanceof PatchMutation)) ? this.f15484a.a(documentKey) : MutableDocument.n(documentKey);
            if (overlayF != null) {
                overlayF.c().a(mutableDocumentA, FieldMask.b, new Timestamp(new Date()));
            }
            return mutableDocumentA.b() ? arraySortedMap.j(mutableDocumentA.f15535a, mutableDocumentA) : arraySortedMap;
        }
        HashMap mapB = this.c.b(query.e, indexOffset.f());
        HashMap mapC = this.f15484a.c(query, indexOffset, mapB.keySet(), queryContext);
        for (Map.Entry entry : mapB.entrySet()) {
            if (!mapC.containsKey(entry.getKey())) {
                mapC.put((DocumentKey) entry.getKey(), MutableDocument.n((DocumentKey) entry.getKey()));
            }
        }
        ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
        for (Map.Entry entry2 : mapC.entrySet()) {
            Overlay overlay = (Overlay) mapB.get(entry2.getKey());
            if (overlay != null) {
                overlay.c().a((MutableDocument) entry2.getValue(), FieldMask.b, new Timestamp(new Date()));
            }
            if (query.d((Document) entry2.getValue())) {
                immutableSortedMapJ = immutableSortedMapJ.j((DocumentKey) entry2.getKey(), (Document) entry2.getValue());
            }
        }
        return immutableSortedMapJ;
    }

    public final ImmutableSortedMap d(Map map, HashSet hashSet) {
        HashMap map2 = new HashMap();
        e(map2, map.keySet());
        ImmutableSortedMap immutableSortedMapJ = DocumentCollections.f15533a;
        for (Map.Entry entry : a(map, map2, hashSet).entrySet()) {
            immutableSortedMapJ = immutableSortedMapJ.j((DocumentKey) entry.getKey(), ((OverlayedDocument) entry.getValue()).f15503a);
        }
        return immutableSortedMapJ;
    }

    public final void e(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            if (!map.containsKey(documentKey)) {
                treeSet.add(documentKey);
            }
        }
        map.putAll(this.c.a(treeSet));
    }

    public final HashMap f(Map map) {
        HashMap map2;
        Iterator it;
        Map.Entry entry;
        Object patchMutation;
        HashMap map3;
        Iterator it2;
        Map.Entry entry2;
        Map map4 = map;
        ArrayList arrayListF = this.b.f(map4.keySet());
        HashMap map5 = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it3 = arrayListF.iterator();
        while (it3.hasNext()) {
            MutationBatch mutationBatch = (MutationBatch) it3.next();
            Iterator it4 = mutationBatch.a().iterator();
            while (it4.hasNext()) {
                DocumentKey documentKey = (DocumentKey) it4.next();
                MutableDocument mutableDocument = (MutableDocument) map4.get(documentKey);
                if (mutableDocument != null) {
                    DocumentKey documentKey2 = mutableDocument.f15535a;
                    FieldMask fieldMaskA = map5.containsKey(documentKey) ? (FieldMask) map5.get(documentKey) : FieldMask.b;
                    ArrayList arrayList = mutationBatch.d;
                    Timestamp timestamp = mutationBatch.b;
                    ArrayList arrayList2 = mutationBatch.c;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        Mutation mutation = (Mutation) arrayList2.get(i);
                        Iterator it5 = it3;
                        if (mutation.f15543a.equals(documentKey2)) {
                            fieldMaskA = mutation.a(mutableDocument, fieldMaskA, timestamp);
                        }
                        i++;
                        it3 = it5;
                    }
                    Iterator it6 = it3;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Mutation mutation2 = (Mutation) arrayList.get(i2);
                        if (mutation2.f15543a.equals(documentKey2)) {
                            fieldMaskA = mutation2.a(mutableDocument, fieldMaskA, timestamp);
                        }
                    }
                    map5.put(documentKey, fieldMaskA);
                    int i3 = mutationBatch.f15544a;
                    if (!treeMap.containsKey(Integer.valueOf(i3))) {
                        treeMap.put(Integer.valueOf(i3), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i3))).add(documentKey);
                    it3 = it6;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it7 = treeMap.descendingMap().entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it7.next();
            HashMap map6 = new HashMap();
            for (DocumentKey documentKey3 : (Set) entry3.getValue()) {
                if (hashSet.contains(documentKey3)) {
                    map2 = map5;
                    it = it7;
                    entry = entry3;
                } else {
                    MutableDocument mutableDocument2 = (MutableDocument) map4.get(documentKey3);
                    FieldMask fieldMask = (FieldMask) map5.get(documentKey3);
                    boolean zF = mutableDocument2.f();
                    DocumentKey documentKey4 = mutableDocument2.f15535a;
                    if (!zF || (fieldMask != null && fieldMask.f15541a.isEmpty())) {
                        map2 = map5;
                        it = it7;
                        entry = entry3;
                        patchMutation = null;
                    } else if (fieldMask != null) {
                        ObjectValue objectValue = mutableDocument2.e;
                        ObjectValue objectValue2 = new ObjectValue();
                        HashSet hashSet2 = new HashSet();
                        Iterator it8 = fieldMask.f15541a.iterator();
                        while (it8.hasNext()) {
                            FieldPath fieldPath = (FieldPath) it8.next();
                            if (hashSet2.contains(fieldPath)) {
                                map3 = map5;
                                it2 = it7;
                                entry2 = entry3;
                            } else {
                                if (objectValue.e(fieldPath) == null && fieldPath.d.size() > 1) {
                                    fieldPath = (FieldPath) fieldPath.o();
                                }
                                Value valueE = objectValue.e(fieldPath);
                                map3 = map5;
                                it2 = it7;
                                entry2 = entry3;
                                Assert.b(!fieldPath.l(), "Cannot set field for empty path on ObjectValue", new Object[0]);
                                objectValue2.g(fieldPath, valueE);
                                hashSet2.add(fieldPath);
                            }
                            entry3 = entry2;
                            map5 = map3;
                            it7 = it2;
                        }
                        map2 = map5;
                        it = it7;
                        entry = entry3;
                        patchMutation = new PatchMutation(mutableDocument2.f15535a, objectValue2, new FieldMask(hashSet2), Precondition.c, new ArrayList());
                    } else if (mutableDocument2.k()) {
                        patchMutation = new DeleteMutation(documentKey4, Precondition.c);
                        map2 = map5;
                        it = it7;
                        entry = entry3;
                    } else {
                        map2 = map5;
                        it = it7;
                        entry = entry3;
                        patchMutation = new SetMutation(documentKey4, mutableDocument2.e, Precondition.c, new ArrayList());
                    }
                    if (patchMutation != null) {
                        map6.put(documentKey3, patchMutation);
                    }
                    hashSet.add(documentKey3);
                }
                map4 = map;
                entry3 = entry;
                map5 = map2;
                it7 = it;
            }
            this.c.e(((Integer) entry3.getKey()).intValue(), map6);
            map4 = map;
            map5 = map5;
            it7 = it7;
        }
        return map5;
    }
}

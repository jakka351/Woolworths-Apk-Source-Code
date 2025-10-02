package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class QueryEngine {

    /* renamed from: a, reason: collision with root package name */
    public LocalDocumentsView f15504a;
    public IndexManager b;
    public boolean c;

    public static ImmutableSortedSet a(Query query, ImmutableSortedMap immutableSortedMap) {
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.EMPTY_LIST, query.a());
        Iterator<Map.Entry<K, V>> it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Document document = (Document) ((Map.Entry) it.next()).getValue();
            if (query.d(document)) {
                immutableSortedSet = immutableSortedSet.b(document);
            }
        }
        return immutableSortedSet;
    }
}

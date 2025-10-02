package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;

/* loaded from: classes6.dex */
public class QueryResult {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableSortedMap f15505a;
    public final ImmutableSortedSet b;

    public QueryResult(ImmutableSortedMap immutableSortedMap, ImmutableSortedSet immutableSortedSet) {
        this.f15505a = immutableSortedMap;
        this.b = immutableSortedSet;
    }
}

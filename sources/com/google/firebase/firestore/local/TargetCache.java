package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;

/* loaded from: classes6.dex */
interface TargetCache {
    void a(ImmutableSortedSet immutableSortedSet, int i);

    TargetData b(Target target);

    int c();

    void d(ImmutableSortedSet immutableSortedSet, int i);

    void e(TargetData targetData);

    void f(SnapshotVersion snapshotVersion);

    void g(TargetData targetData);

    ImmutableSortedSet h(int i);

    SnapshotVersion i();
}

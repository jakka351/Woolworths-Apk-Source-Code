package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class MemoryTargetCache implements TargetCache {
    public int c;
    public final MemoryPersistence f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15502a = new HashMap();
    public final ReferenceSet b = new ReferenceSet();
    public SnapshotVersion d = SnapshotVersion.e;
    public long e = 0;

    public MemoryTargetCache(MemoryPersistence memoryPersistence) {
        this.f = memoryPersistence;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void a(ImmutableSortedSet immutableSortedSet, int i) {
        ReferenceSet referenceSet = this.b;
        referenceSet.getClass();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            referenceSet.d((DocumentKey) it.next(), i);
        }
        ReferenceDelegate referenceDelegate = this.f.h;
        Iterator it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            referenceDelegate.o((DocumentKey) it2.next());
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final TargetData b(Target target) {
        return (TargetData) this.f15502a.get(target);
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final int c() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void d(ImmutableSortedSet immutableSortedSet, int i) {
        ReferenceSet referenceSet = this.b;
        referenceSet.getClass();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            referenceSet.a((DocumentKey) it.next(), i);
        }
        ReferenceDelegate referenceDelegate = this.f.h;
        Iterator it2 = immutableSortedSet.iterator();
        while (it2.hasNext()) {
            referenceDelegate.n((DocumentKey) it2.next());
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void e(TargetData targetData) {
        g(targetData);
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void f(SnapshotVersion snapshotVersion) {
        this.d = snapshotVersion;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final void g(TargetData targetData) {
        this.f15502a.put(targetData.f15522a, targetData);
        int i = targetData.b;
        if (i > this.c) {
            this.c = i;
        }
        long j = targetData.c;
        if (j > this.e) {
            this.e = j;
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final ImmutableSortedSet h(int i) {
        return this.b.c(i);
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public final SnapshotVersion i() {
        return this.d;
    }
}

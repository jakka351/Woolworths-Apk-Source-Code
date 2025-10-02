package com.scandit.datacapture.core;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class Z3 extends AbstractC0958a4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConcurrentMapC1165x4 f18402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(ConcurrentMapC1165x4 concurrentMapC1165x4) {
        super(0);
        this.f18402a = concurrentMapC1165x4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18402a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18402a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18402a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Y3(this.f18402a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f18402a.remove(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18402a.size();
    }
}

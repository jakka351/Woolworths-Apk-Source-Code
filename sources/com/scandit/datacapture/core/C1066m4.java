package com.scandit.datacapture.core;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.scandit.datacapture.core.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1066m4 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConcurrentMapC1165x4 f18806a;

    public C1066m4(ConcurrentMapC1165x4 concurrentMapC1165x4) {
        this.f18806a = concurrentMapC1165x4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18806a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18806a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f18806a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1057l4(this.f18806a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18806a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        ArrayList arrayList = new ArrayList(size());
        AbstractC1173y3.a(arrayList, iterator());
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(size());
        AbstractC1173y3.a(arrayList, iterator());
        return arrayList.toArray(objArr);
    }
}

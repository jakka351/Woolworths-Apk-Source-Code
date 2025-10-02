package com.scandit.datacapture.core;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class U3 extends AbstractC0958a4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConcurrentMapC1165x4 f18382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(ConcurrentMapC1165x4 concurrentMapC1165x4) {
        super(0);
        this.f18382a = concurrentMapC1165x4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18382a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = this.f18382a.get(key)) != null && this.f18382a.f.a().a().b(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18382a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new T3(this.f18382a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f18382a.remove(key, entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18382a.size();
    }
}

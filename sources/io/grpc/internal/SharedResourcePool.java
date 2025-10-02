package io.grpc.internal;

import io.grpc.internal.SharedResourceHolder;

/* loaded from: classes7.dex */
public final class SharedResourcePool<T> implements ObjectPool<T> {

    /* renamed from: a, reason: collision with root package name */
    public final SharedResourceHolder.Resource f24106a;

    public SharedResourcePool(SharedResourceHolder.Resource resource) {
        this.f24106a = resource;
    }

    @Override // io.grpc.internal.ObjectPool
    public final void a(Object obj) {
        SharedResourceHolder.b(this.f24106a, obj);
    }

    @Override // io.grpc.internal.ObjectPool
    public final Object getObject() {
        return SharedResourceHolder.a(this.f24106a);
    }
}

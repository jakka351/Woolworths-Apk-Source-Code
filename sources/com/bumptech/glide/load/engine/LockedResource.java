package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* loaded from: classes4.dex */
final class LockedResource<Z> implements Resource<Z>, FactoryPools.Poolable {
    public static final Pools.Pool h = FactoryPools.a(20, new AnonymousClass1());
    public final StateVerifier d = StateVerifier.a();
    public Resource e;
    public boolean f;
    public boolean g;

    /* renamed from: com.bumptech.glide.load.engine.LockedResource$1, reason: invalid class name */
    public class AnonymousClass1 implements FactoryPools.Factory<LockedResource<?>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object create() {
            return new LockedResource();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return this.e.a();
    }

    public final synchronized void b() {
        this.d.c();
        if (!this.f) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f = false;
        if (this.g) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier c() {
        return this.d;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.e.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.e.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        this.d.c();
        this.g = true;
        if (!this.f) {
            this.e.recycle();
            this.e = null;
            h.b(this);
        }
    }
}

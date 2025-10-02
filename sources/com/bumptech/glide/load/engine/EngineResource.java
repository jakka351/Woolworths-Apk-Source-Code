package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes4.dex */
class EngineResource<Z> implements Resource<Z> {
    public final boolean d;
    public final boolean e;
    public final Resource f;
    public final ResourceListener g;
    public final Key h;
    public int i;
    public boolean j;

    /* loaded from: classes.dex */
    public interface ResourceListener {
        void c(Key key, EngineResource engineResource);
    }

    public EngineResource(Resource resource, boolean z, boolean z2, Key key, ResourceListener resourceListener) {
        Preconditions.c(resource, "Argument must not be null");
        this.f = resource;
        this.d = z;
        this.e = z2;
        this.h = key;
        Preconditions.c(resourceListener, "Argument must not be null");
        this.g = resourceListener;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return this.f.a();
    }

    public final synchronized void b() {
        if (this.j) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.i++;
    }

    public final boolean c() {
        return this.d;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.i;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.i = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.g.c(this.h, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.f.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        if (this.i > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.j) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.j = true;
        if (this.e) {
            this.f.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.d + ", listener=" + this.g + ", key=" + this.h + ", acquired=" + this.i + ", isRecycled=" + this.j + ", resource=" + this.f + '}';
    }
}

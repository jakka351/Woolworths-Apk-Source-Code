package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes4.dex */
public class MemoryCacheAdapter implements MemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public Engine f13836a;

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void b() {
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void c(float f) {
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final Resource d(Key key, Resource resource) {
        this.f13836a.h(resource);
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void e(Engine engine) {
        this.f13836a = engine;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final Resource f(Key key) {
        return null;
    }
}

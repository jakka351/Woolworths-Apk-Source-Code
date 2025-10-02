package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

/* loaded from: classes.dex */
public class LruResourceCache extends LruCache<Key, Resource<?>> implements MemoryCache {
    public Engine e;

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void a(int i) {
        long j;
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.c;
            }
            k(j / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void e(Engine engine) {
        this.e = engine;
    }

    @Override // com.bumptech.glide.util.LruCache
    public final int h(Object obj) {
        Resource resource = (Resource) obj;
        if (resource == null) {
            return 1;
        }
        return resource.getSize();
    }

    @Override // com.bumptech.glide.util.LruCache
    public final void i(Object obj, Object obj2) {
        Resource resource = (Resource) obj2;
        Engine engine = this.e;
        if (engine == null || resource == null) {
            return;
        }
        engine.h(resource);
    }
}

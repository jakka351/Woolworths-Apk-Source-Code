package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public interface MemoryCache {

    public interface ResourceRemovedListener {
    }

    void a(int i);

    void b();

    void c(float f);

    Resource d(Key key, Resource resource);

    void e(Engine engine);

    Resource f(Key key);
}

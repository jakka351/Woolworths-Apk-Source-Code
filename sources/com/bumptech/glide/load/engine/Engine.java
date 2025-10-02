package com.bumptech.glide.load.engine;

import YU.a;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.ActiveResources;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class Engine implements EngineJobListener, MemoryCache.ResourceRemovedListener, EngineResource.ResourceListener {
    public static final boolean i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final Jobs f13804a;
    public final EngineKeyFactory b;
    public final MemoryCache c;
    public final EngineJobFactory d;
    public final ResourceRecycler e;
    public final LazyDiskCacheProvider f;
    public final DecodeJobFactory g;
    public final ActiveResources h;

    @VisibleForTesting
    public static class DecodeJobFactory {

        /* renamed from: a, reason: collision with root package name */
        public final LazyDiskCacheProvider f13805a;
        public final Pools.Pool b = FactoryPools.a(150, new FactoryPools.Factory<DecodeJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.DecodeJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final Object create() {
                DecodeJobFactory decodeJobFactory = DecodeJobFactory.this;
                return new DecodeJob(decodeJobFactory.f13805a, decodeJobFactory.b);
            }
        });
        public int c;

        public DecodeJobFactory(LazyDiskCacheProvider lazyDiskCacheProvider) {
            this.f13805a = lazyDiskCacheProvider;
        }
    }

    @VisibleForTesting
    public static class EngineJobFactory {

        /* renamed from: a, reason: collision with root package name */
        public final GlideExecutor f13807a;
        public final GlideExecutor b;
        public final GlideExecutor c;
        public final GlideExecutor d;
        public final Engine e;
        public final Engine f;
        public final Pools.Pool g = FactoryPools.a(150, new FactoryPools.Factory<EngineJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.EngineJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final Object create() {
                EngineJobFactory engineJobFactory = EngineJobFactory.this;
                return new EngineJob(engineJobFactory.f13807a, engineJobFactory.b, engineJobFactory.c, engineJobFactory.d, engineJobFactory.e, engineJobFactory.f, engineJobFactory.g);
            }
        });

        public EngineJobFactory(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Engine engine, Engine engine2) {
            this.f13807a = glideExecutor;
            this.b = glideExecutor2;
            this.c = glideExecutor3;
            this.d = glideExecutor4;
            this.e = engine;
            this.f = engine2;
        }
    }

    public static class LazyDiskCacheProvider implements DecodeJob.DiskCacheProvider {

        /* renamed from: a, reason: collision with root package name */
        public final DiskCache.Factory f13809a;
        public volatile DiskCache b;

        public LazyDiskCacheProvider(DiskCache.Factory factory) {
            this.f13809a = factory;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider
        public final DiskCache a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.f13809a.build();
                        }
                        if (this.b == null) {
                            this.b = new DiskCacheAdapter();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    /* loaded from: classes4.dex */
    public class LoadStatus {

        /* renamed from: a, reason: collision with root package name */
        public final EngineJob f13810a;
        public final SingleRequest b;

        public LoadStatus(SingleRequest singleRequest, EngineJob engineJob) {
            this.b = singleRequest;
            this.f13810a = engineJob;
        }

        public final void a() {
            synchronized (Engine.this) {
                this.f13810a.i(this.b);
            }
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4) throws Throwable {
        this.c = memoryCache;
        LazyDiskCacheProvider lazyDiskCacheProvider = new LazyDiskCacheProvider(factory);
        this.f = lazyDiskCacheProvider;
        ActiveResources activeResources = new ActiveResources();
        this.h = activeResources;
        synchronized (this) {
            try {
                synchronized (activeResources) {
                    try {
                        try {
                            activeResources.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new EngineKeyFactory();
                this.f13804a = new Jobs();
                this.d = new EngineJobFactory(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this);
                this.g = new DecodeJobFactory(lazyDiskCacheProvider);
                this.e = new ResourceRecycler();
                memoryCache.e(this);
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void g(String str, long j, Key key) {
        StringBuilder sbT = a.t(str, " in ");
        sbT.append(LogTime.a(j));
        sbT.append("ms, key: ");
        sbT.append(key);
        Log.v("Engine", sbT.toString());
    }

    public static void i(Resource resource) {
        if (!(resource instanceof EngineResource)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((EngineResource) resource).d();
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public final synchronized void a(EngineJob engineJob, Key key, EngineResource engineResource) {
        if (engineResource != null) {
            try {
                if (engineResource.c()) {
                    this.h.a(key, engineResource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Jobs jobs = this.f13804a;
        jobs.getClass();
        HashMap map = engineJob.g() ? jobs.b : jobs.f13813a;
        if (engineJob.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public final synchronized void b(EngineJob engineJob, Key key) {
        Jobs jobs = this.f13804a;
        jobs.getClass();
        HashMap map = engineJob.g() ? jobs.b : jobs.f13813a;
        if (engineJob.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineResource.ResourceListener
    public final void c(Key key, EngineResource engineResource) {
        ActiveResources activeResources = this.h;
        synchronized (activeResources) {
            ActiveResources.ResourceWeakReference resourceWeakReference = (ActiveResources.ResourceWeakReference) activeResources.b.remove(key);
            if (resourceWeakReference != null) {
                resourceWeakReference.a();
            }
        }
        if (engineResource.c()) {
            this.c.d(key, engineResource);
        } else {
            this.e.a(engineResource, false);
        }
    }

    public final void d() {
        this.f.a().clear();
    }

    public final LoadStatus e(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, SingleRequest singleRequest, Executor executor) {
        long jB = i ? LogTime.b() : 0L;
        this.b.getClass();
        EngineKey engineKey = new EngineKey(obj, key, i2, i3, cachedHashCodeArrayMap, cls, cls2, options);
        synchronized (this) {
            try {
                EngineResource engineResourceF = f(engineKey, z3, jB);
                if (engineResourceF == null) {
                    return j(glideContext, obj, key, i2, i3, cls, cls2, priority, diskCacheStrategy, cachedHashCodeArrayMap, z, z2, options, z3, z4, z5, singleRequest, executor, engineKey, jB);
                }
                singleRequest.j(engineResourceF, DataSource.h, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final EngineResource f(EngineKey engineKey, boolean z, long j) throws Throwable {
        Throwable th;
        EngineResource<?> engineResource;
        Engine engine;
        EngineKey engineKey2;
        EngineResource engineResource2;
        if (z) {
            ActiveResources activeResources = this.h;
            synchronized (activeResources) {
                try {
                    ActiveResources.ResourceWeakReference resourceWeakReference = (ActiveResources.ResourceWeakReference) activeResources.b.get(engineKey);
                    if (resourceWeakReference == null) {
                        engineResource = null;
                    } else {
                        engineResource = resourceWeakReference.get();
                        if (engineResource == null) {
                            try {
                                activeResources.b(resourceWeakReference);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (engineResource != null) {
                        engineResource.b();
                    }
                    if (engineResource != null) {
                        if (i) {
                            g("Loaded resource from active resources", j, engineKey);
                        }
                        return engineResource;
                    }
                    Resource resourceF = this.c.f(engineKey);
                    if (resourceF == null) {
                        engine = this;
                        engineKey2 = engineKey;
                        engineResource2 = null;
                    } else if (resourceF instanceof EngineResource) {
                        engineResource2 = (EngineResource) resourceF;
                        engine = this;
                        engineKey2 = engineKey;
                    } else {
                        engine = this;
                        engineKey2 = engineKey;
                        engineResource2 = new EngineResource(resourceF, true, true, engineKey2, engine);
                    }
                    if (engineResource2 != null) {
                        engineResource2.b();
                        engine.h.a(engineKey2, engineResource2);
                    }
                    if (engineResource2 != null) {
                        if (i) {
                            g("Loaded resource from cache", j, engineKey2);
                        }
                        return engineResource2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    public final void h(Resource resource) {
        this.e.a(resource, true);
    }

    public final LoadStatus j(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, SingleRequest singleRequest, Executor executor, EngineKey engineKey, long j) {
        Jobs jobs = this.f13804a;
        EngineJob engineJob = (EngineJob) (z5 ? jobs.b : jobs.f13813a).get(engineKey);
        boolean z6 = i;
        if (engineJob != null) {
            engineJob.a(singleRequest, executor);
            if (z6) {
                g("Added to existing load", j, engineKey);
            }
            return new LoadStatus(singleRequest, engineJob);
        }
        EngineJob engineJob2 = (EngineJob) this.d.g.a();
        Preconditions.c(engineJob2, "Argument must not be null");
        engineJob2.e(engineKey, z3, z4, z5);
        DecodeJobFactory decodeJobFactory = this.g;
        DecodeJob decodeJob = (DecodeJob) decodeJobFactory.b.a();
        Preconditions.c(decodeJob, "Argument must not be null");
        int i4 = decodeJobFactory.c;
        decodeJobFactory.c = i4 + 1;
        decodeJob.n(glideContext, obj, engineKey, key, i2, i3, cls, cls2, priority, diskCacheStrategy, map, z, z2, z5, options, engineJob2, i4);
        (engineJob2.g() ? jobs.b : jobs.f13813a).put(engineKey, engineJob2);
        engineJob2.a(singleRequest, executor);
        engineJob2.j(decodeJob);
        if (z6) {
            g("Started new load", j, engineKey);
        }
        return new LoadStatus(singleRequest, engineJob2);
    }
}

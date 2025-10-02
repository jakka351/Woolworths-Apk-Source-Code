package com.bumptech.glide.load.engine;

import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
class EngineJob<R> implements DecodeJob.Callback<R>, FactoryPools.Poolable {
    public static final EngineResourceFactory A = new EngineResourceFactory();
    public final EngineResource.ResourceListener f;
    public final Pools.Pool g;
    public final EngineJobListener i;
    public final GlideExecutor j;
    public final GlideExecutor k;
    public final GlideExecutor l;
    public Key n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Resource r;
    public DataSource s;
    public boolean t;
    public GlideException u;
    public boolean v;
    public EngineResource w;
    public DecodeJob x;
    public volatile boolean y;
    public boolean z;
    public final ResourceCallbacksAndExecutors d = new ResourceCallbacksAndExecutors(new ArrayList(2));
    public final StateVerifier e = StateVerifier.a();
    public final AtomicInteger m = new AtomicInteger();
    public final EngineResourceFactory h = A;

    public class CallLoadFailed implements Runnable {
        public final SingleRequest d;

        public CallLoadFailed(SingleRequest singleRequest) {
            this.d = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.d.e()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.d.d.contains(new ResourceCallbackAndExecutor(this.d, Executors.b))) {
                            EngineJob engineJob = EngineJob.this;
                            try {
                                this.d.i(engineJob.u, 5);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        EngineJob.this.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class CallResourceReady implements Runnable {
        public final SingleRequest d;

        public CallResourceReady(SingleRequest singleRequest) {
            this.d = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.d.e()) {
                synchronized (EngineJob.this) {
                    try {
                        if (EngineJob.this.d.d.contains(new ResourceCallbackAndExecutor(this.d, Executors.b))) {
                            EngineJob.this.w.b();
                            EngineJob engineJob = EngineJob.this;
                            try {
                                this.d.j(engineJob.w, engineJob.s, engineJob.z);
                                EngineJob.this.i(this.d);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        EngineJob.this.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static class EngineResourceFactory {
    }

    public static final class ResourceCallbackAndExecutor {

        /* renamed from: a, reason: collision with root package name */
        public final SingleRequest f13811a;
        public final Executor b;

        public ResourceCallbackAndExecutor(SingleRequest singleRequest, Executor executor) {
            this.f13811a = singleRequest;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ResourceCallbackAndExecutor) {
                return this.f13811a.equals(((ResourceCallbackAndExecutor) obj).f13811a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13811a.hashCode();
        }
    }

    public static final class ResourceCallbacksAndExecutors implements Iterable<ResourceCallbackAndExecutor> {
        public final ArrayList d;

        public ResourceCallbacksAndExecutors(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<ResourceCallbackAndExecutor> iterator() {
            return this.d.iterator();
        }
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Engine engine, Engine engine2, Pools.Pool pool) {
        this.j = glideExecutor;
        this.k = glideExecutor2;
        this.l = glideExecutor4;
        this.i = engine;
        this.f = engine2;
        this.g = pool;
    }

    public final synchronized void a(SingleRequest singleRequest, Executor executor) {
        try {
            this.e.c();
            this.d.d.add(new ResourceCallbackAndExecutor(singleRequest, executor));
            if (this.t) {
                d(1);
                executor.execute(new CallResourceReady(singleRequest));
            } else if (this.v) {
                d(1);
                executor.execute(new CallLoadFailed(singleRequest));
            } else {
                Preconditions.a("Cannot add callbacks to a cancelled EngineJob", !this.y);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        EngineResource engineResource;
        synchronized (this) {
            try {
                this.e.c();
                Preconditions.a("Not yet complete!", f());
                int iDecrementAndGet = this.m.decrementAndGet();
                Preconditions.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    engineResource = this.w;
                    h();
                } else {
                    engineResource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineResource != null) {
            engineResource.d();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier c() {
        return this.e;
    }

    public final synchronized void d(int i) {
        EngineResource engineResource;
        Preconditions.a("Not yet complete!", f());
        if (this.m.getAndAdd(i) == 0 && (engineResource = this.w) != null) {
            engineResource.b();
        }
    }

    public final synchronized void e(Key key, boolean z, boolean z2, boolean z3) {
        this.n = key;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    public final boolean f() {
        return this.v || this.t || this.y;
    }

    public final boolean g() {
        return this.q;
    }

    public final synchronized void h() {
        boolean zA;
        if (this.n == null) {
            throw new IllegalArgumentException();
        }
        this.d.d.clear();
        this.n = null;
        this.w = null;
        this.r = null;
        this.v = false;
        this.y = false;
        this.t = false;
        this.z = false;
        DecodeJob decodeJob = this.x;
        DecodeJob.ReleaseManager releaseManager = decodeJob.j;
        synchronized (releaseManager) {
            releaseManager.f13801a = true;
            zA = releaseManager.a();
        }
        if (zA) {
            decodeJob.q();
        }
        this.x = null;
        this.u = null;
        this.s = null;
        this.g.b(this);
    }

    public final synchronized void i(SingleRequest singleRequest) {
        try {
            this.e.c();
            this.d.d.remove(new ResourceCallbackAndExecutor(singleRequest, Executors.b));
            if (this.d.d.isEmpty()) {
                if (!f()) {
                    this.y = true;
                    DecodeJob decodeJob = this.x;
                    decodeJob.H = true;
                    DataFetcherGenerator dataFetcherGenerator = decodeJob.F;
                    if (dataFetcherGenerator != null) {
                        dataFetcherGenerator.cancel();
                    }
                    this.i.b(this, this.n);
                }
                if (this.t || this.v) {
                    if (this.m.get() == 0) {
                        h();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(DecodeJob decodeJob) {
        this.x = decodeJob;
        DecodeJob.Stage stageM = decodeJob.m(DecodeJob.Stage.d);
        ((stageM == DecodeJob.Stage.e || stageM == DecodeJob.Stage.f) ? this.j : this.p ? this.l : this.k).execute(decodeJob);
    }
}

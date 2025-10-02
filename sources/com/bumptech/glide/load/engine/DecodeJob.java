package com.bumptech.glide.load.engine;

import YU.a;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class DecodeJob<R> implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable<DecodeJob<?>>, FactoryPools.Poolable {
    public Key A;
    public Key B;
    public Object C;
    public DataSource D;
    public DataFetcher E;
    public volatile DataFetcherGenerator F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public final DiskCacheProvider g;
    public final Pools.Pool h;
    public GlideContext k;
    public Key l;
    public Priority m;
    public EngineKey n;
    public int o;
    public int p;
    public DiskCacheStrategy q;
    public Options r;
    public EngineJob s;
    public int t;
    public Stage u;
    public RunReason v;
    public long w;
    public boolean x;
    public Object y;
    public Thread z;
    public final DecodeHelper d = new DecodeHelper();
    public final ArrayList e = new ArrayList();
    public final StateVerifier f = StateVerifier.a();
    public final DeferredEncodeManager i = new DeferredEncodeManager();
    public final ReleaseManager j = new ReleaseManager();

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13798a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            b = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[0] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f13798a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13798a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13798a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface Callback<R> {
    }

    public final class DecodeCallback<Z> implements DecodePath.DecodeCallback<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final DataSource f13799a;

        public DecodeCallback(DataSource dataSource) {
            this.f13799a = dataSource;
        }

        public final Resource a(Resource resource) {
            Resource resourceA;
            Transformation transformation;
            EncodeStrategy encodeStrategyB;
            boolean z;
            boolean z2;
            Key dataCacheKey;
            DecodeJob decodeJob = DecodeJob.this;
            DecodeHelper decodeHelper = decodeJob.d;
            Class<?> cls = resource.get().getClass();
            DataSource dataSource = DataSource.g;
            DataSource dataSource2 = this.f13799a;
            ResourceEncoder resourceEncoderB = null;
            if (dataSource2 != dataSource) {
                Transformation transformationD = decodeHelper.d(cls);
                transformation = transformationD;
                resourceA = transformationD.a(decodeJob.k, resource, decodeJob.o, decodeJob.p);
            } else {
                resourceA = resource;
                transformation = null;
            }
            if (!resource.equals(resourceA)) {
                resource.recycle();
            }
            if (decodeHelper.c.a().d.b(resourceA.a()) != null) {
                resourceEncoderB = decodeHelper.c.a().d.b(resourceA.a());
                if (resourceEncoderB == null) {
                    throw new Registry.NoResultEncoderAvailableException(resourceA.a());
                }
                encodeStrategyB = resourceEncoderB.b(decodeJob.r);
            } else {
                encodeStrategyB = EncodeStrategy.f;
            }
            ResourceEncoder resourceEncoder = resourceEncoderB;
            Key key = decodeJob.A;
            ArrayList arrayListB = decodeHelper.b();
            int size = arrayListB.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                if (((ModelLoader.LoadData) arrayListB.get(i)).f13862a.equals(key)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!decodeJob.q.d(!z, dataSource2, encodeStrategyB)) {
                return resourceA;
            }
            if (resourceEncoder == null) {
                throw new Registry.NoResultEncoderAvailableException(resourceA.get().getClass());
            }
            int iOrdinal = encodeStrategyB.ordinal();
            if (iOrdinal == 0) {
                z2 = true;
                dataCacheKey = new DataCacheKey(decodeJob.A, decodeJob.l);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyB);
                }
                z2 = true;
                dataCacheKey = new ResourceCacheKey(decodeHelper.c.f13758a, decodeJob.A, decodeJob.l, decodeJob.o, decodeJob.p, transformation, cls, decodeJob.r);
            }
            LockedResource lockedResource = (LockedResource) LockedResource.h.a();
            Preconditions.c(lockedResource, "Argument must not be null");
            lockedResource.g = false;
            lockedResource.f = z2;
            lockedResource.e = resourceA;
            DeferredEncodeManager deferredEncodeManager = decodeJob.i;
            deferredEncodeManager.f13800a = dataCacheKey;
            deferredEncodeManager.b = resourceEncoder;
            deferredEncodeManager.c = lockedResource;
            return lockedResource;
        }
    }

    public static class DeferredEncodeManager<Z> {

        /* renamed from: a, reason: collision with root package name */
        public Key f13800a;
        public ResourceEncoder b;
        public LockedResource c;
    }

    /* loaded from: classes.dex */
    public interface DiskCacheProvider {
        DiskCache a();
    }

    public static class ReleaseManager {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13801a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.f13801a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunReason {
        public static final RunReason d;
        public static final RunReason e;
        public static final RunReason f;
        public static final /* synthetic */ RunReason[] g;

        static {
            RunReason runReason = new RunReason("INITIALIZE", 0);
            d = runReason;
            RunReason runReason2 = new RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
            e = runReason2;
            RunReason runReason3 = new RunReason("DECODE_DATA", 2);
            f = runReason3;
            g = new RunReason[]{runReason, runReason2, runReason3};
        }

        public static RunReason valueOf(String str) {
            return (RunReason) Enum.valueOf(RunReason.class, str);
        }

        public static RunReason[] values() {
            return (RunReason[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Stage {
        public static final Stage d;
        public static final Stage e;
        public static final Stage f;
        public static final Stage g;
        public static final Stage h;
        public static final Stage i;
        public static final /* synthetic */ Stage[] j;

        static {
            Stage stage = new Stage("INITIALIZE", 0);
            d = stage;
            Stage stage2 = new Stage("RESOURCE_CACHE", 1);
            e = stage2;
            Stage stage3 = new Stage("DATA_CACHE", 2);
            f = stage3;
            Stage stage4 = new Stage("SOURCE", 3);
            g = stage4;
            Stage stage5 = new Stage("ENCODE", 4);
            h = stage5;
            Stage stage6 = new Stage("FINISHED", 5);
            i = stage6;
            j = new Stage[]{stage, stage2, stage3, stage4, stage5, stage6};
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) j.clone();
        }
    }

    public DecodeJob(Engine.LazyDiskCacheProvider lazyDiskCacheProvider, Pools.Pool pool) {
        this.g = lazyDiskCacheProvider;
        this.h = pool;
    }

    public final Resource a(DataFetcher dataFetcher, Object obj, DataSource dataSource) {
        if (obj == null) {
            return null;
        }
        try {
            int i = LogTime.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Resource resourceE = e(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                o(jElapsedRealtimeNanos, "Decoded result " + resourceE, null);
            }
            return resourceE;
        } finally {
            dataFetcher.b();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void b(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        dataFetcher.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dataFetcher.a();
        glideException.e = key;
        glideException.f = dataSource;
        glideException.g = clsA;
        this.e.add(glideException);
        if (Thread.currentThread() == this.z) {
            r();
            return;
        }
        this.v = RunReason.e;
        EngineJob engineJob = this.s;
        (engineJob.p ? engineJob.l : engineJob.k).execute(this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier c() {
        return this.f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.m.ordinal() - decodeJob2.m.ordinal();
        return iOrdinal == 0 ? this.t - decodeJob2.t : iOrdinal;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void d(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.A = key;
        this.C = obj;
        this.E = dataFetcher;
        this.D = dataSource;
        this.B = key2;
        this.I = key != this.d.a().get(0);
        if (Thread.currentThread() == this.z) {
            f();
            return;
        }
        this.v = RunReason.f;
        EngineJob engineJob = this.s;
        (engineJob.p ? engineJob.l : engineJob.k).execute(this);
    }

    public final Resource e(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        DecodeHelper decodeHelper = this.d;
        LoadPath loadPathC = decodeHelper.c(cls);
        Options options = this.r;
        boolean z = dataSource == DataSource.g || decodeHelper.r;
        Option option = Downsampler.i;
        Boolean bool = (Boolean) options.b(option);
        if (bool == null || (bool.booleanValue() && !z)) {
            options = new Options();
            CachedHashCodeArrayMap cachedHashCodeArrayMap = this.r.f13783a;
            CachedHashCodeArrayMap cachedHashCodeArrayMap2 = options.f13783a;
            cachedHashCodeArrayMap2.putAll((SimpleArrayMap) cachedHashCodeArrayMap);
            cachedHashCodeArrayMap2.put(option, Boolean.valueOf(z));
        }
        Options options2 = options;
        DataRewinder dataRewinderC = this.k.a().c(obj);
        try {
            int i = this.o;
            int i2 = this.p;
            DecodeCallback decodeCallback = new DecodeCallback(dataSource);
            Pools.Pool pool = loadPathC.f13814a;
            Object objA = pool.a();
            Preconditions.c(objA, "Argument must not be null");
            List list = (List) objA;
            try {
                Resource resourceA = loadPathC.a(dataRewinderC, options2, i, i2, decodeCallback, list);
                pool.b(list);
                return resourceA;
            } catch (Throwable th) {
                pool.b(list);
                throw th;
            }
        } finally {
            dataRewinderC.b();
        }
    }

    public final void f() {
        Resource resourceA;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            o(this.w, "Retrieved data", "data: " + this.C + ", cache key: " + this.A + ", fetcher: " + this.E);
        }
        LockedResource lockedResource = null;
        try {
            resourceA = a(this.E, this.C, this.D);
        } catch (GlideException e) {
            Key key = this.B;
            DataSource dataSource = this.D;
            e.e = key;
            e.f = dataSource;
            e.g = null;
            this.e.add(e);
            resourceA = null;
        }
        if (resourceA == null) {
            r();
            return;
        }
        DataSource dataSource2 = this.D;
        boolean z = this.I;
        if (resourceA instanceof Initializable) {
            ((Initializable) resourceA).initialize();
        }
        if (this.i.c != null) {
            lockedResource = (LockedResource) LockedResource.h.a();
            Preconditions.c(lockedResource, "Argument must not be null");
            lockedResource.g = false;
            lockedResource.f = true;
            lockedResource.e = resourceA;
            resourceA = lockedResource;
        }
        t();
        EngineJob engineJob = this.s;
        synchronized (engineJob) {
            engineJob.r = resourceA;
            engineJob.s = dataSource2;
            engineJob.z = z;
        }
        synchronized (engineJob) {
            try {
                engineJob.e.c();
                if (engineJob.y) {
                    engineJob.r.recycle();
                    engineJob.h();
                } else {
                    if (engineJob.d.d.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (engineJob.t) {
                        throw new IllegalStateException("Already have resource");
                    }
                    EngineJob.EngineResourceFactory engineResourceFactory = engineJob.h;
                    Resource resource = engineJob.r;
                    boolean z2 = engineJob.o;
                    Key key2 = engineJob.n;
                    EngineResource.ResourceListener resourceListener = engineJob.f;
                    engineResourceFactory.getClass();
                    engineJob.w = new EngineResource(resource, z2, true, key2, resourceListener);
                    engineJob.t = true;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.d;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.d);
                    engineJob.d(arrayList.size() + 1);
                    engineJob.i.a(engineJob, engineJob.n, engineJob.w);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor = (EngineJob.ResourceCallbackAndExecutor) it.next();
                        resourceCallbackAndExecutor.b.execute(new EngineJob.CallResourceReady(resourceCallbackAndExecutor.f13811a));
                    }
                    engineJob.b();
                }
            } finally {
            }
        }
        this.u = Stage.h;
        try {
            DeferredEncodeManager deferredEncodeManager = this.i;
            if (deferredEncodeManager.c != null) {
                DiskCacheProvider diskCacheProvider = this.g;
                Options options = this.r;
                deferredEncodeManager.getClass();
                try {
                    diskCacheProvider.a().a(deferredEncodeManager.f13800a, new DataCacheWriter(deferredEncodeManager.b, deferredEncodeManager.c, options));
                    deferredEncodeManager.c.b();
                } catch (Throwable th) {
                    deferredEncodeManager.c.b();
                    throw th;
                }
            }
            ReleaseManager releaseManager = this.j;
            synchronized (releaseManager) {
                releaseManager.b = true;
                zA = releaseManager.a();
            }
            if (zA) {
                q();
            }
        } finally {
            if (lockedResource != null) {
                lockedResource.b();
            }
        }
    }

    public final DataFetcherGenerator l() {
        int iOrdinal = this.u.ordinal();
        DecodeHelper decodeHelper = this.d;
        if (iOrdinal == 1) {
            return new ResourceCacheGenerator(decodeHelper, this);
        }
        if (iOrdinal == 2) {
            return new DataCacheGenerator(decodeHelper.a(), decodeHelper, this);
        }
        if (iOrdinal == 3) {
            return new SourceGenerator(decodeHelper, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.u);
    }

    public final Stage m(Stage stage) {
        int iOrdinal = stage.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.q.b();
            Stage stage2 = Stage.e;
            return zB ? stage2 : m(stage2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.q.a();
            Stage stage3 = Stage.f;
            return zA ? stage3 : m(stage3);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3 && iOrdinal != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + stage);
            }
        } else if (!this.x) {
            return Stage.g;
        }
        return Stage.i;
    }

    public final void n(GlideContext glideContext, Object obj, EngineKey engineKey, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, boolean z3, Options options, EngineJob engineJob, int i3) {
        DecodeHelper decodeHelper = this.d;
        decodeHelper.c = glideContext;
        decodeHelper.d = obj;
        decodeHelper.n = key;
        decodeHelper.e = i;
        decodeHelper.f = i2;
        decodeHelper.p = diskCacheStrategy;
        decodeHelper.g = cls;
        decodeHelper.h = this.g;
        decodeHelper.k = cls2;
        decodeHelper.o = priority;
        decodeHelper.i = options;
        decodeHelper.j = map;
        decodeHelper.q = z;
        decodeHelper.r = z2;
        this.k = glideContext;
        this.l = key;
        this.m = priority;
        this.n = engineKey;
        this.o = i;
        this.p = i2;
        this.q = diskCacheStrategy;
        this.x = z3;
        this.r = options;
        this.s = engineJob;
        this.t = i3;
        this.v = RunReason.d;
        this.y = obj;
    }

    public final void o(long j, String str, String str2) {
        StringBuilder sbT = a.t(str, " in ");
        sbT.append(LogTime.a(j));
        sbT.append(", load key: ");
        sbT.append(this.n);
        sbT.append(str2 != null ? ", ".concat(str2) : "");
        sbT.append(", thread: ");
        sbT.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbT.toString());
    }

    public final void p() {
        boolean zA;
        t();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.e));
        EngineJob engineJob = this.s;
        synchronized (engineJob) {
            engineJob.u = glideException;
        }
        synchronized (engineJob) {
            try {
                engineJob.e.c();
                if (engineJob.y) {
                    engineJob.h();
                } else {
                    if (engineJob.d.d.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (engineJob.v) {
                        throw new IllegalStateException("Already failed once");
                    }
                    engineJob.v = true;
                    Key key = engineJob.n;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.d;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.d);
                    engineJob.d(arrayList.size() + 1);
                    engineJob.i.a(engineJob, key, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor = (EngineJob.ResourceCallbackAndExecutor) it.next();
                        resourceCallbackAndExecutor.b.execute(new EngineJob.CallLoadFailed(resourceCallbackAndExecutor.f13811a));
                    }
                    engineJob.b();
                }
            } finally {
            }
        }
        ReleaseManager releaseManager = this.j;
        synchronized (releaseManager) {
            releaseManager.c = true;
            zA = releaseManager.a();
        }
        if (zA) {
            q();
        }
    }

    public final void q() {
        ReleaseManager releaseManager = this.j;
        synchronized (releaseManager) {
            releaseManager.b = false;
            releaseManager.f13801a = false;
            releaseManager.c = false;
        }
        DeferredEncodeManager deferredEncodeManager = this.i;
        deferredEncodeManager.f13800a = null;
        deferredEncodeManager.b = null;
        deferredEncodeManager.c = null;
        DecodeHelper decodeHelper = this.d;
        decodeHelper.c = null;
        decodeHelper.d = null;
        decodeHelper.n = null;
        decodeHelper.g = null;
        decodeHelper.k = null;
        decodeHelper.i = null;
        decodeHelper.o = null;
        decodeHelper.j = null;
        decodeHelper.p = null;
        decodeHelper.f13797a.clear();
        decodeHelper.l = false;
        decodeHelper.b.clear();
        decodeHelper.m = false;
        this.G = false;
        this.k = null;
        this.l = null;
        this.r = null;
        this.m = null;
        this.n = null;
        this.s = null;
        this.u = null;
        this.F = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.w = 0L;
        this.H = false;
        this.y = null;
        this.e.clear();
        this.h.b(this);
    }

    public final void r() {
        this.z = Thread.currentThread();
        int i = LogTime.b;
        this.w = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.H && this.F != null && !(zA = this.F.a())) {
            this.u = m(this.u);
            this.F = l();
            if (this.u == Stage.g) {
                this.v = RunReason.e;
                EngineJob engineJob = this.s;
                (engineJob.p ? engineJob.l : engineJob.k).execute(this);
                return;
            }
        }
        if ((this.u == Stage.i || this.H) && !zA) {
            p();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataFetcher dataFetcher = this.E;
        try {
            try {
                try {
                    if (this.H) {
                        p();
                        if (dataFetcher != null) {
                            dataFetcher.b();
                            return;
                        }
                        return;
                    }
                    s();
                    if (dataFetcher != null) {
                        dataFetcher.b();
                    }
                } catch (CallbackException e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.H + ", stage: " + this.u, th);
                }
                if (this.u != Stage.h) {
                    this.e.add(th);
                    p();
                }
                if (!this.H) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dataFetcher != null) {
                dataFetcher.b();
            }
            throw th2;
        }
    }

    public final void s() {
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 0) {
            this.u = m(Stage.d);
            this.F = l();
            r();
        } else if (iOrdinal == 1) {
            r();
        } else if (iOrdinal == 2) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.v);
        }
    }

    public final void t() {
        this.f.c();
        if (this.G) {
            throw new IllegalStateException("Already notified", this.e.isEmpty() ? null : (Throwable) a.c(1, this.e));
        }
        this.G = true;
    }
}

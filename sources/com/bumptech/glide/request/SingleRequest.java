package com.bumptech.glide.request;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a, reason: collision with root package name */
    public final String f13971a;
    public final StateVerifier b;
    public final Object c;
    public final RequestListener d;
    public final RequestCoordinator e;
    public final Context f;
    public final GlideContext g;
    public final Object h;
    public final Class i;
    public final BaseRequestOptions j;
    public final int k;
    public final int l;
    public final Priority m;
    public final Target n;
    public final List o;
    public final NoTransition.NoAnimationFactory p;
    public final Executor q;
    public Resource r;
    public Engine.LoadStatus s;
    public long t;
    public volatile Engine u;
    public Status v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final Status f;
        public static final Status g;
        public static final Status h;
        public static final Status i;
        public static final /* synthetic */ Status[] j;

        static {
            Status status = new Status("PENDING", 0);
            d = status;
            Status status2 = new Status("RUNNING", 1);
            e = status2;
            Status status3 = new Status("WAITING_FOR_SIZE", 2);
            f = status3;
            Status status4 = new Status("COMPLETE", 3);
            g = status4;
            Status status5 = new Status("FAILED", 4);
            h = status5;
            Status status6 = new Status("CLEARED", 5);
            i = status6;
            j = new Status[]{status, status2, status3, status4, status5, status6};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) j.clone();
        }
    }

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, BaseRequestOptions baseRequestOptions, int i, int i2, Priority priority, Target target, RequestListener requestListener, ArrayList arrayList, RequestCoordinator requestCoordinator, Engine engine, Executor executor) {
        NoTransition.NoAnimationFactory noAnimationFactory = NoTransition.b;
        this.f13971a = D ? String.valueOf(hashCode()) : null;
        this.b = StateVerifier.a();
        this.c = obj;
        this.f = context;
        this.g = glideContext;
        this.h = obj2;
        this.i = cls;
        this.j = baseRequestOptions;
        this.k = i;
        this.l = i2;
        this.m = priority;
        this.n = target;
        this.d = requestListener;
        this.o = arrayList;
        this.e = requestCoordinator;
        this.u = engine;
        this.p = noAnimationFactory;
        this.q = executor;
        this.v = Status.d;
        if (this.C == null && glideContext.h.f13759a.containsKey(GlideBuilder.LogRequestOrigins.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.v == Status.g;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public final void b(int i, int i2) {
        int i3;
        int i4;
        Class cls;
        Class cls2;
        Priority priority;
        DiskCacheStrategy diskCacheStrategy;
        CachedHashCodeArrayMap cachedHashCodeArrayMap;
        boolean z;
        boolean z2;
        Options options;
        boolean z3;
        boolean z4;
        boolean z5;
        Executor executor;
        SingleRequest<R> singleRequest = this;
        int iRound = i;
        singleRequest.b.c();
        Object obj = singleRequest.c;
        synchronized (obj) {
            try {
                try {
                    boolean z6 = D;
                    if (z6) {
                        singleRequest.g("Got onSizeReady in " + LogTime.a(singleRequest.t));
                    }
                    if (singleRequest.v == Status.f) {
                        Status status = Status.e;
                        singleRequest.v = status;
                        singleRequest.j.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        singleRequest.z = iRound;
                        singleRequest.A = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z6) {
                            singleRequest.g("finished setup for calling load in " + LogTime.a(singleRequest.t));
                        }
                        Engine engine = singleRequest.u;
                        GlideContext glideContext = singleRequest.g;
                        Object obj2 = singleRequest.h;
                        BaseRequestOptions baseRequestOptions = singleRequest.j;
                        Key key = baseRequestOptions.n;
                        try {
                            i3 = singleRequest.z;
                            i4 = singleRequest.A;
                            cls = baseRequestOptions.r;
                            try {
                                cls2 = singleRequest.i;
                                priority = singleRequest.m;
                                diskCacheStrategy = baseRequestOptions.e;
                                try {
                                    cachedHashCodeArrayMap = baseRequestOptions.q;
                                    z = baseRequestOptions.o;
                                    z2 = baseRequestOptions.w;
                                    try {
                                        options = baseRequestOptions.p;
                                        z3 = baseRequestOptions.k;
                                        z4 = baseRequestOptions.x;
                                        z5 = baseRequestOptions.v;
                                        executor = singleRequest.q;
                                        singleRequest = obj;
                                    } catch (Throwable th) {
                                        th = th;
                                        singleRequest = obj;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    singleRequest = obj;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                singleRequest = obj;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            singleRequest = obj;
                        }
                        try {
                            singleRequest.s = engine.e(glideContext, obj2, key, i3, i4, cls, cls2, priority, diskCacheStrategy, cachedHashCodeArrayMap, z, z2, options, z3, z4, z5, singleRequest, executor);
                            if (singleRequest.v != status) {
                                singleRequest.s = null;
                            }
                            if (z6) {
                                singleRequest.g("finished onSizeReady in " + LogTime.a(singleRequest.t));
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    singleRequest = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.v == Status.i;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.c();
                Status status = this.v;
                Status status2 = Status.i;
                if (status == status2) {
                    return;
                }
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.c();
                this.n.b(this);
                Engine.LoadStatus loadStatus = this.s;
                Resource resource = null;
                if (loadStatus != null) {
                    loadStatus.a();
                    this.s = null;
                }
                Resource resource2 = this.r;
                if (resource2 != null) {
                    this.r = null;
                    resource = resource2;
                }
                RequestCoordinator requestCoordinator = this.e;
                if (requestCoordinator == null || requestCoordinator.i(this)) {
                    this.n.d(f());
                }
                this.v = status2;
                if (resource != null) {
                    this.u.getClass();
                    Engine.i(resource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean d(Request request) {
        int i;
        int i2;
        Object obj;
        Class cls;
        BaseRequestOptions baseRequestOptions;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        BaseRequestOptions baseRequestOptions2;
        Priority priority2;
        int size2;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.k;
                i2 = this.l;
                obj = this.h;
                cls = this.i;
                baseRequestOptions = this.j;
                priority = this.m;
                List list = this.o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.c) {
            try {
                i3 = singleRequest.k;
                i4 = singleRequest.l;
                obj2 = singleRequest.h;
                cls2 = singleRequest.i;
                baseRequestOptions2 = singleRequest.j;
                priority2 = singleRequest.m;
                List list2 = singleRequest.o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = Util.f13989a;
        if ((obj == null ? obj2 == null : obj instanceof Model ? ((Model) obj).a() : obj.equals(obj2)) && cls.equals(cls2)) {
            return (baseRequestOptions == null ? baseRequestOptions2 == null : baseRequestOptions.g(baseRequestOptions2)) && priority == priority2 && size == size2;
        }
        return false;
    }

    public final Object e() {
        this.b.c();
        return this.c;
    }

    public final Drawable f() {
        int i;
        if (this.x == null) {
            BaseRequestOptions baseRequestOptions = this.j;
            Drawable drawable = baseRequestOptions.i;
            this.x = drawable;
            if (drawable == null && (i = baseRequestOptions.j) > 0) {
                Resources.Theme theme = baseRequestOptions.t;
                Context context = this.f;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.x = DrawableDecoderCompat.c(context, context, i, theme);
            }
        }
        return this.x;
    }

    public final void g(String str) {
        StringBuilder sbT = a.t(str, " this: ");
        sbT.append(this.f13971a);
        Log.v("GlideRequest", sbT.toString());
    }

    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.c();
                int i = LogTime.b;
                this.t = SystemClock.elapsedRealtimeNanos();
                if (this.h == null) {
                    if (Util.j(this.k, this.l)) {
                        this.z = this.k;
                        this.A = this.l;
                    }
                    if (this.y == null) {
                        this.j.getClass();
                        this.y = null;
                    }
                    i(new GlideException("Received null model"), this.y == null ? 5 : 3);
                    return;
                }
                Status status = this.v;
                if (status == Status.e) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.g) {
                    j(this.r, DataSource.h, false);
                    return;
                }
                List<RequestListener> list = this.o;
                if (list != null) {
                    for (RequestListener requestListener : list) {
                    }
                }
                Status status2 = Status.f;
                this.v = status2;
                if (Util.j(this.k, this.l)) {
                    b(this.k, this.l);
                } else {
                    this.n.g(this);
                }
                Status status3 = this.v;
                if (status3 == Status.e || status3 == status2) {
                    RequestCoordinator requestCoordinator = this.e;
                    if (requestCoordinator == null || requestCoordinator.e(this)) {
                        this.n.h(f());
                    }
                }
                if (D) {
                    g("finished run method in " + LogTime.a(this.t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.bumptech.glide.load.engine.GlideException r10, int r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.i(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.c) {
            z = this.v == Status.g;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            try {
                Status status = this.v;
                z = status == Status.e || status == Status.f;
            } finally {
            }
        }
        return z;
    }

    public final void j(Resource resource, DataSource dataSource, boolean z) {
        this.b.c();
        Resource resource2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.s = null;
                    if (resource == null) {
                        i(new GlideException("Expected to receive a Resource<R> with an object of " + this.i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = resource.get();
                    try {
                        if (obj == null || !this.i.isAssignableFrom(obj.getClass())) {
                            this.r = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.i);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(resource);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new GlideException(sb.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.e;
                            if (requestCoordinator == null || requestCoordinator.f(this)) {
                                k(resource, obj, dataSource, z);
                                return;
                            } else {
                                this.r = null;
                                this.v = Status.g;
                            }
                        }
                        this.u.getClass();
                        Engine.i(resource);
                    } catch (Throwable th) {
                        resource2 = resource;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (resource2 != null) {
                this.u.getClass();
                Engine.i(resource2);
            }
            throw th3;
        }
    }

    public final void k(Resource resource, Object obj, DataSource dataSource, boolean z) {
        boolean z2;
        boolean z3 = true;
        RequestCoordinator requestCoordinator = this.e;
        boolean z4 = requestCoordinator == null || !requestCoordinator.getRoot().a();
        this.v = Status.g;
        this.r = resource;
        if (this.g.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + this.h + " with size [" + this.z + "x" + this.A + "] in " + LogTime.a(this.t) + " ms");
        }
        if (requestCoordinator != null) {
            requestCoordinator.b(this);
        }
        this.B = true;
        try {
            List<RequestListener> list = this.o;
            if (list != null) {
                z2 = false;
                for (RequestListener requestListener : list) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    boolean zOnResourceReady = requestListener.onResourceReady(obj2, this.h, this.n, dataSource2, z4) | z2;
                    if (requestListener instanceof ExperimentalRequestListener) {
                        zOnResourceReady |= ((ExperimentalRequestListener) requestListener).a();
                    }
                    z2 = zOnResourceReady;
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                z2 = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            RequestListener requestListener2 = this.d;
            if (requestListener2 == null || !requestListener2.onResourceReady(obj3, this.h, this.n, dataSource3, z4)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.p.getClass();
                this.n.e(obj3, NoTransition.f13976a);
            }
            this.B = false;
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}

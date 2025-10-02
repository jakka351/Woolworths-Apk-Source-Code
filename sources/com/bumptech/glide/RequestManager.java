package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener, ModelTypes<RequestBuilder<Drawable>> {
    public static final RequestOptions n;
    public static final RequestOptions o;
    public static final RequestOptions p;
    public final Glide d;
    public final Context e;
    public final Lifecycle f;
    public final RequestTracker g;
    public final RequestManagerTreeNode h;
    public final TargetTracker i;
    public final Runnable j;
    public final ConnectivityMonitor k;
    public final CopyOnWriteArrayList l;
    public final RequestOptions m;

    /* loaded from: classes4.dex */
    public static class ClearTarget extends CustomViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        public final void e(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void j(Drawable drawable) {
        }
    }

    public class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {

        /* renamed from: a, reason: collision with root package name */
        public final RequestTracker f13764a;

        public RequestManagerConnectivityListener(RequestTracker requestTracker) {
            this.f13764a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void a(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    RequestTracker requestTracker = this.f13764a;
                    Iterator it = Util.e(requestTracker.f13953a).iterator();
                    while (it.hasNext()) {
                        Request request = (Request) it.next();
                        if (!request.isComplete() && !request.c()) {
                            request.clear();
                            if (requestTracker.c) {
                                requestTracker.b.add(request);
                            } else {
                                request.h();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        RequestOptions requestOptions = (RequestOptions) new RequestOptions().c(Bitmap.class);
        requestOptions.s = true;
        n = requestOptions;
        RequestOptions requestOptions2 = (RequestOptions) new RequestOptions().c(GifDrawable.class);
        requestOptions2.s = true;
        o = requestOptions2;
        p = (RequestOptions) ((RequestOptions) ((RequestOptions) new RequestOptions().d(DiskCacheStrategy.c)).p()).v(true);
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        RequestOptions requestOptions;
        RequestTracker requestTracker = new RequestTracker();
        ConnectivityMonitorFactory connectivityMonitorFactory = glide.j;
        this.i = new TargetTracker();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public final void run() {
                RequestManager requestManager = RequestManager.this;
                requestManager.f.b(requestManager);
            }
        };
        this.j = runnable;
        this.d = glide;
        this.f = lifecycle;
        this.h = requestManagerTreeNode;
        this.g = requestTracker;
        this.e = context;
        ConnectivityMonitor connectivityMonitorA = connectivityMonitorFactory.a(context.getApplicationContext(), new RequestManagerConnectivityListener(requestTracker));
        this.k = connectivityMonitorA;
        synchronized (glide.k) {
            if (glide.k.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.k.add(this);
        }
        char[] cArr = Util.f13989a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lifecycle.b(this);
        } else {
            Util.f().post(runnable);
        }
        lifecycle.b(connectivityMonitorA);
        this.l = new CopyOnWriteArrayList(glide.g.e);
        GlideContext glideContext = glide.g;
        synchronized (glideContext) {
            try {
                if (glideContext.j == null) {
                    RequestOptions requestOptionsBuild = glideContext.d.build();
                    requestOptionsBuild.s = true;
                    glideContext.j = requestOptionsBuild;
                }
                requestOptions = glideContext.j;
            } finally {
            }
        }
        synchronized (this) {
            RequestOptions requestOptions2 = (RequestOptions) requestOptions.clone();
            if (requestOptions2.s && !requestOptions2.u) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            requestOptions2.u = true;
            requestOptions2.s = true;
            this.m = requestOptions2;
        }
    }

    public final RequestBuilder c(Class cls) {
        return new RequestBuilder(this.d, this, cls, this.e);
    }

    public final void f(Target target) {
        if (target == null) {
            return;
        }
        boolean zO = o(target);
        Request requestA = target.a();
        if (zO) {
            return;
        }
        Glide glide = this.d;
        synchronized (glide.k) {
            try {
                Iterator it = glide.k.iterator();
                while (it.hasNext()) {
                    if (((RequestManager) it.next()).o(target)) {
                        return;
                    }
                }
                if (requestA != null) {
                    target.i(null);
                    requestA.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void k() {
        try {
            Iterator it = Util.e(this.i.d).iterator();
            while (it.hasNext()) {
                f((Target) it.next());
            }
            this.i.d.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final RequestBuilder l(String str) {
        return c(Drawable.class).M(str);
    }

    public final synchronized void m() {
        RequestTracker requestTracker = this.g;
        requestTracker.c = true;
        Iterator it = Util.e(requestTracker.f13953a).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (request.isRunning()) {
                request.pause();
                requestTracker.b.add(request);
            }
        }
    }

    public final synchronized void n() {
        RequestTracker requestTracker = this.g;
        requestTracker.c = false;
        Iterator it = Util.e(requestTracker.f13953a).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (!request.isComplete() && !request.isRunning()) {
                request.h();
            }
        }
        requestTracker.b.clear();
    }

    public final synchronized boolean o(Target target) {
        Request requestA = target.a();
        if (requestA == null) {
            return true;
        }
        if (!this.g.a(requestA)) {
            return false;
        }
        this.i.d.remove(target);
        target.i(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onDestroy() {
        this.i.onDestroy();
        k();
        RequestTracker requestTracker = this.g;
        Iterator it = Util.e(requestTracker.f13953a).iterator();
        while (it.hasNext()) {
            requestTracker.a((Request) it.next());
        }
        requestTracker.b.clear();
        this.f.a(this);
        this.f.a(this.k);
        Util.f().removeCallbacks(this.j);
        Glide glide = this.d;
        synchronized (glide.k) {
            if (!glide.k.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            glide.k.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStart() {
        n();
        this.i.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStop() {
        this.i.onStop();
        m();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.g + ", treeNode=" + this.h + "}";
    }
}

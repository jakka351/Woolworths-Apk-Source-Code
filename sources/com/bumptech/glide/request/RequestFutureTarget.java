package com.bumptech.glide.request;

import YU.a;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {
    public Object d;
    public Request e;
    public boolean f;
    public boolean g;
    public boolean h;
    public GlideException i;

    @VisibleForTesting
    public static class Waiter {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized Request a() {
        return this.e;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
    }

    public final synchronized Object c(Long l) {
        if (!isDone()) {
            char[] cArr = Util.f13989a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f) {
            throw new CancellationException();
        }
        if (this.h) {
            throw new ExecutionException(this.i);
        }
        if (this.g) {
            return this.d;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.h) {
            throw new ExecutionException(this.i);
        }
        if (this.f) {
            throw new CancellationException();
        }
        if (!this.g) {
            throw new TimeoutException();
        }
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f = true;
                notifyAll();
                Request request = null;
                if (z) {
                    Request request2 = this.e;
                    this.e = null;
                    request = request2;
                }
                if (request != null) {
                    request.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void e(Object obj, Transition transition) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(SingleRequest singleRequest) {
        singleRequest.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void h(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void i(Request request) {
        this.e = request;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.h     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.RequestFutureTarget.isDone():boolean");
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
        this.h = true;
        this.i = glideException;
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) {
        this.g = true;
        this.d = obj;
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }

    public final String toString() {
        Request request;
        String str;
        String strO = a.o(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                request = null;
                if (this.f) {
                    str = "CANCELLED";
                } else if (this.h) {
                    str = "FAILURE";
                } else if (this.g) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    request = this.e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (request == null) {
            return b.o(strO, str, "]");
        }
        return strO + str + ", request=[" + request + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return c(Long.valueOf(timeUnit.toMillis(j)));
    }
}

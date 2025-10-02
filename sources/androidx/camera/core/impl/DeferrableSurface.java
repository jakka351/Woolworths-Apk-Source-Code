package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class DeferrableSurface {
    public static final Size k = new Size(0, 0);
    public static final boolean l = Logger.d(3, "DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f486a = new Object();
    public int b = 0;
    public boolean c = false;
    public CallbackToFutureAdapter.Completer d;
    public final ListenableFuture e;
    public CallbackToFutureAdapter.Completer f;
    public final ListenableFuture g;
    public final Size h;
    public final int i;
    public Class j;

    @RestrictTo
    public static final class SurfaceClosedException extends Exception {
        public final DeferrableSurface d;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.d = deferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
    }

    public DeferrableSurface(Size size, int i) {
        this.h = size;
        this.i = i;
        final int i2 = 0;
        ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.core.impl.c
            public final /* synthetic */ DeferrableSurface e;

            {
                this.e = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                switch (i2) {
                    case 0:
                        DeferrableSurface deferrableSurface = this.e;
                        synchronized (deferrableSurface.f486a) {
                            deferrableSurface.d = completer;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + ")";
                    default:
                        DeferrableSurface deferrableSurface2 = this.e;
                        synchronized (deferrableSurface2.f486a) {
                            deferrableSurface2.f = completer;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface2 + ")";
                }
            }
        });
        this.e = listenableFutureA;
        final int i3 = 1;
        this.g = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.core.impl.c
            public final /* synthetic */ DeferrableSurface e;

            {
                this.e = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                switch (i3) {
                    case 0:
                        DeferrableSurface deferrableSurface = this.e;
                        synchronized (deferrableSurface.f486a) {
                            deferrableSurface.d = completer;
                        }
                        return "DeferrableSurface-termination(" + deferrableSurface + ")";
                    default:
                        DeferrableSurface deferrableSurface2 = this.e;
                        synchronized (deferrableSurface2.f486a) {
                            deferrableSurface2.f = completer;
                        }
                        return "DeferrableSurface-close(" + deferrableSurface2 + ")";
                }
            }
        });
        if (Logger.d(3, "DeferrableSurface")) {
            e(n.incrementAndGet(), m.get(), "Surface created");
            listenableFutureA.addListener(new f(3, this, Log.getStackTraceString(new Exception())), CameraXExecutors.a());
        }
    }

    public void a() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f486a) {
            try {
                if (this.c) {
                    completer = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        completer = this.d;
                        this.d = null;
                    } else {
                        completer = null;
                    }
                    if (Logger.d(3, "DeferrableSurface")) {
                        Logger.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (completer != null) {
            completer.b(null);
        }
    }

    public final void b() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f486a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    completer = this.d;
                    this.d = null;
                } else {
                    completer = null;
                }
                if (Logger.d(3, "DeferrableSurface")) {
                    Logger.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        e(n.get(), m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (completer != null) {
            completer.b(null);
        }
    }

    public final ListenableFuture c() {
        synchronized (this.f486a) {
            try {
                if (this.c) {
                    return Futures.e(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f486a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (Logger.d(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        e(n.get(), m.incrementAndGet(), "New surface in use");
                    }
                    Logger.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!l && Logger.d(3, "DeferrableSurface")) {
            Logger.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract ListenableFuture f();
}

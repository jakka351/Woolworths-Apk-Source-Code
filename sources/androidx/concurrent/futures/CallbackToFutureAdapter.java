package androidx.concurrent.futures;

import android.support.v4.media.session.a;
import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f2229a;
        public SafeFuture b;
        public ResolvableFuture c;
        public boolean d;

        public final void a(Runnable runnable, Executor executor) {
            ResolvableFuture resolvableFuture = this.c;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        public final boolean b(Object obj) {
            this.d = true;
            SafeFuture safeFuture = this.b;
            boolean z = safeFuture != null && safeFuture.e.n(obj);
            if (z) {
                this.f2229a = null;
                this.b = null;
                this.c = null;
            }
            return z;
        }

        public final void c() {
            this.d = true;
            SafeFuture safeFuture = this.b;
            if (safeFuture == null || !safeFuture.e.cancel(true)) {
                return;
            }
            this.f2229a = null;
            this.b = null;
            this.c = null;
        }

        public final boolean d(Throwable th) {
            this.d = true;
            SafeFuture safeFuture = this.b;
            boolean z = safeFuture != null && safeFuture.e.o(th);
            if (z) {
                this.f2229a = null;
                this.b = null;
                this.c = null;
            }
            return z;
        }

        public final void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.b;
            if (safeFuture != null) {
                AbstractResolvableFuture abstractResolvableFuture = safeFuture.e;
                if (!abstractResolvableFuture.isDone()) {
                    abstractResolvableFuture.o(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2229a));
                }
            }
            if (this.d || (resolvableFuture = this.c) == null) {
                return;
            }
            resolvableFuture.n(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface Resolver<T> {
        Object attachCompleter(Completer completer);
    }

    public static final class SafeFuture<T> implements ListenableFuture<T> {
        public final WeakReference d;
        public final AbstractResolvableFuture e = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String l() {
                Completer completer = (Completer) SafeFuture.this.d.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return a.o(completer.f2229a, "]", new StringBuilder("tag=["));
            }
        };

        public SafeFuture(Completer completer) {
            this.d = new WeakReference(completer);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.e.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            Completer completer = (Completer) this.d.get();
            boolean zCancel = this.e.cancel(z);
            if (zCancel && completer != null) {
                completer.f2229a = null;
                completer.b = null;
                completer.c.n(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.e.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.e.d instanceof AbstractResolvableFuture.Cancellation;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.e.isDone();
        }

        public final String toString() {
            return this.e.toString();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.e.get(j, timeUnit);
        }
    }

    public static ListenableFuture a(Resolver resolver) {
        Completer completer = new Completer();
        completer.c = new ResolvableFuture();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.b = safeFuture;
        completer.f2229a = resolver.getClass();
        try {
            Object objAttachCompleter = resolver.attachCompleter(completer);
            if (objAttachCompleter == null) {
                return safeFuture;
            }
            completer.f2229a = objAttachCompleter;
            return safeFuture;
        } catch (Exception e) {
            safeFuture.e.o(e);
            return safeFuture;
        }
    }
}

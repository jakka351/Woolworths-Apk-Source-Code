package androidx.concurrent.futures;

import YU.a;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo
/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(AbstractResolvableFuture.class.getName());
    public static final AtomicHelper i;
    public static final Object j;
    public volatile Object d;
    public volatile Listener e;
    public volatile Waiter f;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {
        public static final Cancellation c;
        public static final Cancellation d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2224a;
        public final Throwable b;

        static {
            if (AbstractResolvableFuture.g) {
                d = null;
                c = null;
            } else {
                d = new Cancellation(false, null);
                c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, Throwable th) {
            this.f2224a = z;
            this.b = th;
        }
    }

    public static final class Failure {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f2225a;

        static {
            new Failure(new Throwable() { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th) {
            boolean z = AbstractResolvableFuture.g;
            th.getClass();
            this.f2225a = th;
        }
    }

    public static final class Listener {
        public static final Listener d = new Listener(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f2226a;
        public final Executor b;
        public Listener c;

        public Listener(Runnable runnable, Executor executor) {
            this.f2226a = runnable;
            this.b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2227a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f2227a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == listener);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == waiter);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.b.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.f2227a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.e != listener) {
                        return false;
                    }
                    abstractResolvableFuture.e = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.d != obj) {
                        return false;
                    }
                    abstractResolvableFuture.d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.f = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.b = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.f2228a = thread;
        }
    }

    public static final class Waiter {
        public static final Waiter c = new Waiter();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f2228a;
        public volatile Waiter b;

        public Waiter() {
            AbstractResolvableFuture.i.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        i = synchronizedHelper;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void c(AbstractResolvableFuture abstractResolvableFuture) {
        Waiter waiter;
        Listener listener;
        do {
            waiter = abstractResolvableFuture.f;
        } while (!i.c(abstractResolvableFuture, waiter, Waiter.c));
        while (waiter != null) {
            Thread thread = waiter.f2228a;
            if (thread != null) {
                waiter.f2228a = null;
                LockSupport.unpark(thread);
            }
            waiter = waiter.b;
        }
        abstractResolvableFuture.b();
        do {
            listener = abstractResolvableFuture.e;
        } while (!i.a(abstractResolvableFuture, listener, Listener.d));
        Listener listener2 = null;
        while (listener != null) {
            Listener listener3 = listener.c;
            listener.c = listener2;
            listener2 = listener;
            listener = listener3;
        }
        while (listener2 != null) {
            Listener listener4 = listener2.c;
            Runnable runnable = listener2.f2226a;
            if (runnable instanceof SetFuture) {
                throw null;
            }
            d(runnable, listener2.b);
            listener2 = listener4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f2225a);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        Listener listener = this.e;
        Listener listener2 = Listener.d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.c = listener;
                if (i.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.e;
                }
            } while (listener != listener2);
        }
        d(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.d;
        if ((obj == null) | (obj instanceof SetFuture)) {
            Cancellation cancellation = g ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.c : Cancellation.d;
            while (!i.b(this, obj, cancellation)) {
                obj = this.d;
                if (!(obj instanceof SetFuture)) {
                }
            }
            c(this);
            if (obj instanceof SetFuture) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        Waiter waiter = Waiter.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter2 = this.f;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                z = true;
                do {
                    AtomicHelper atomicHelper = i;
                    atomicHelper.d(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(waiter3);
                    } else {
                        waiter2 = this.f;
                    }
                } while (waiter2 != waiter);
            }
            return e(this.d);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof SetFuture))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbT = b.t(j2, "Waited ", " ");
        sbT.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbT.toString();
        if (nanos + 1000 < 0) {
            String strG = a.g(string3, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strG2 = strG + jConvert + " " + lowerCase;
                if (z2) {
                    strG2 = a.g(strG2, ",");
                }
                strG = a.g(strG2, " ");
            }
            if (z2) {
                strG = strG + nanos2 + " nanoseconds ";
            }
            string3 = a.g(strG, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.g(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(b.o(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.d != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (this.d instanceof SetFuture) {
            return a.h("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m(Waiter waiter) {
        waiter.f2228a = null;
        while (true) {
            Waiter waiter2 = this.f;
            if (waiter2 == Waiter.c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.b;
                if (waiter2.f2228a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.b = waiter4;
                    if (waiter3.f2228a == null) {
                        break;
                    }
                } else if (!i.c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    public boolean n(Object obj) {
        if (obj == null) {
            obj = j;
        }
        if (!i.b(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean o(Throwable th) {
        th.getClass();
        if (!i.b(this, null, new Failure(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final boolean p() {
        Object obj = this.d;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f2224a;
    }

    public final String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e) {
                strL = "Exception thrown from implementation: " + e.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                androidx.compose.ui.input.pointer.a.w(sb, "PENDING, info=[", strL, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        Waiter waiter = Waiter.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return e(obj2);
            }
            Waiter waiter2 = this.f;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = i;
                    atomicHelper.d(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                m(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return e(obj);
                    }
                    waiter2 = this.f;
                } while (waiter2 != waiter);
            }
            return e(this.d);
        }
        throw new InterruptedException();
    }
}

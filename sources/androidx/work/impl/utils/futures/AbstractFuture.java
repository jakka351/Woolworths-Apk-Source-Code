package androidx.work.impl.utils.futures;

import YU.a;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(AbstractFuture.class.getName());
    public static final AtomicHelper i;
    public static final Object j;
    public volatile Object d;
    public volatile Listener e;
    public volatile Waiter f;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {
        public static final Cancellation b;
        public static final Cancellation c;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f4009a;

        static {
            if (AbstractFuture.g) {
                c = null;
                b = null;
            } else {
                c = new Cancellation(false, null);
                b = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, Throwable th) {
            this.f4009a = th;
        }
    }

    public static final class Failure {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f4010a;

        /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));
        }

        public Failure(Throwable th) {
            boolean z = AbstractFuture.g;
            th.getClass();
            this.f4010a = th;
        }
    }

    public static final class Listener {
        public static final Listener d = new Listener(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f4011a;
        public final Executor b;
        public Listener c;

        public Listener(Runnable runnable, Executor executor) {
            this.f4011a = runnable;
            this.b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4012a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f4012a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.b.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.f4012a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.e != listener) {
                        return false;
                    }
                    abstractFuture.e = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.d != obj) {
                        return false;
                    }
                    abstractFuture.d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f != waiter) {
                        return false;
                    }
                    abstractFuture.f = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.b = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.f4013a = thread;
        }
    }

    public static final class Waiter {
        public static final Waiter c = new Waiter();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f4013a;
        public volatile Waiter b;

        public Waiter() {
            AbstractFuture.i.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "d"));
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

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).f4009a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f4010a);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFuture abstractFuture) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = abstractFuture.get();
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
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
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
        b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Waiter waiter;
        Listener listener;
        Object obj = this.d;
        if ((obj == null) | (obj instanceof SetFuture)) {
            Cancellation cancellation = g ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.b : Cancellation.c;
            while (!i.b(this, obj, cancellation)) {
                obj = this.d;
                if (!(obj instanceof SetFuture)) {
                }
            }
            do {
                waiter = this.f;
            } while (!i.c(this, waiter, Waiter.c));
            while (waiter != null) {
                Thread thread = waiter.f4013a;
                if (thread != null) {
                    waiter.f4013a = null;
                    LockSupport.unpark(thread);
                }
                waiter = waiter.b;
            }
            do {
                listener = this.e;
            } while (!i.a(this, listener, Listener.d));
            Listener listener2 = null;
            while (listener != null) {
                Listener listener3 = listener.c;
                listener.c = listener2;
                listener2 = listener;
                listener = listener3;
            }
            while (listener2 != null) {
                Listener listener4 = listener2.c;
                Runnable runnable = listener2.f4011a;
                if (runnable instanceof SetFuture) {
                    throw null;
                }
                b(runnable, listener2.b);
                listener2 = listener4;
            }
            if (obj instanceof SetFuture) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e() {
        if (this.d instanceof SetFuture) {
            return a.h("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void f(Waiter waiter) {
        waiter.f4013a = null;
        while (true) {
            Waiter waiter2 = this.f;
            if (waiter2 == Waiter.c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.b;
                if (waiter2.f4013a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.b = waiter4;
                    if (waiter3.f4013a == null) {
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
            return c(obj);
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
                                f(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(waiter3);
                    } else {
                        waiter2 = this.f;
                    }
                } while (waiter2 != waiter);
            }
            return c(this.d);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof SetFuture))) {
                return c(obj3);
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

    public final String toString() {
        String strE;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strE = e();
            } catch (RuntimeException e) {
                strE = "Exception thrown from implementation: " + e.getClass();
            }
            if (strE != null && !strE.isEmpty()) {
                androidx.compose.ui.input.pointer.a.w(sb, "PENDING, info=[", strE, "]");
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
                return c(obj2);
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
                                f(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return c(obj);
                    }
                    waiter2 = this.f;
                } while (waiter2 != waiter);
            }
            return c(this.d);
        }
        throw new InterruptedException();
    }
}

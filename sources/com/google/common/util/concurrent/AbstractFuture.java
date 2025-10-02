package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtCompatible
@ReflectionSupport
/* loaded from: classes6.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    public static final boolean g;
    public static final LazyLogger h;
    public static final AtomicHelper i;
    public static final Object j;
    public volatile Object d;
    public volatile Listener e;
    public volatile Waiter f;

    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract Listener d(AbstractFuture abstractFuture);

        public abstract Waiter e(AbstractFuture abstractFuture);

        public abstract void f(Waiter waiter, Waiter waiter2);

        public abstract void g(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {
        public static final Cancellation c;
        public static final Cancellation d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14954a;
        public final Throwable b;

        static {
            if (AbstractFuture.g) {
                d = null;
                c = null;
            } else {
                d = new Cancellation(false, null);
                c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, Throwable th) {
            this.f14954a = z;
            this.b = th;
        }
    }

    public static final class Failure {
        public static final Failure b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f14955a;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            th.getClass();
            this.f14955a = th;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f14957a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f14957a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            return (Listener) this.d.getAndSet(abstractFuture, Listener.d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            return (Waiter) this.c.getAndSet(abstractFuture, Waiter.c);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            this.b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            this.f14957a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        public final AbstractFuture d;
        public final ListenableFuture e;

        public SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.d = abstractFuture;
            this.e = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.d.d != this) {
                return;
            }
            if (AbstractFuture.i.b(this.d, this, AbstractFuture.h(this.e))) {
                AbstractFuture.e(this.d, false);
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
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

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            Listener listener;
            Listener listener2 = Listener.d;
            synchronized (abstractFuture) {
                try {
                    listener = abstractFuture.e;
                    if (listener != listener2) {
                        abstractFuture.e = listener2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.c;
            synchronized (abstractFuture) {
                try {
                    waiter = abstractFuture.f;
                    if (waiter != waiter2) {
                        abstractFuture.f = waiter2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            waiter.b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            waiter.f14959a = thread;
        }
    }

    public interface Trusted<V> extends ListenableFuture<V> {
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return this.d instanceof Cancellation;
        }
    }

    public static final class UnsafeAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f14958a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1, reason: invalid class name */
        public class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
                }
                try {
                    c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("f"));
                    b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("e"));
                    d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                    e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                    f14958a = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return a.a(f14958a, abstractFuture, b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return a.a(f14958a, abstractFuture, d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return a.a(f14958a, abstractFuture, c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Listener d(AbstractFuture abstractFuture) {
            Listener listener;
            Listener listener2 = Listener.d;
            do {
                listener = abstractFuture.e;
                if (listener2 == listener) {
                    break;
                }
            } while (!a(abstractFuture, listener, listener2));
            return listener;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final Waiter e(AbstractFuture abstractFuture) {
            Waiter waiter;
            Waiter waiter2 = Waiter.c;
            do {
                waiter = abstractFuture.f;
                if (waiter2 == waiter) {
                    break;
                }
            } while (!c(abstractFuture, waiter, waiter2));
            return waiter;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void f(Waiter waiter, Waiter waiter2) {
            f14958a.putObject(waiter, f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        public final void g(Waiter waiter, Thread thread) {
            f14958a.putObject(waiter, e, thread);
        }
    }

    public static final class Waiter {
        public static final Waiter c = new Waiter();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f14959a;
        public volatile Waiter b;

        public Waiter() {
            AbstractFuture.i.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        AtomicHelper synchronizedHelper;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        g = z;
        h = new LazyLogger(AbstractFuture.class);
        Throwable th2 = null;
        try {
            synchronizedHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "d"));
            } catch (Error | Exception e2) {
                th2 = e2;
                synchronizedHelper = new SynchronizedHelper();
            }
        }
        i = synchronizedHelper;
        if (th2 != null) {
            LazyLogger lazyLogger = h;
            Logger loggerA = lazyLogger.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            lazyLogger.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        j = new Object();
    }

    public static void e(AbstractFuture abstractFuture, boolean z) {
        Listener listener = null;
        while (true) {
            for (Waiter waiterE = i.e(abstractFuture); waiterE != null; waiterE = waiterE.b) {
                Thread thread = waiterE.f14959a;
                if (thread != null) {
                    waiterE.f14959a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractFuture.i();
                z = false;
            }
            abstractFuture.c();
            Listener listener2 = listener;
            Listener listenerD = i.d(abstractFuture);
            Listener listener3 = listener2;
            while (listenerD != null) {
                Listener listener4 = listenerD.c;
                listenerD.c = listener3;
                listener3 = listenerD;
                listenerD = listener4;
            }
            while (listener3 != null) {
                listener = listener3.c;
                Runnable runnable = listener3.f14956a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractFuture = setFuture.d;
                    if (abstractFuture.d == setFuture) {
                        if (i.b(abstractFuture, setFuture, h(setFuture.e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = listener3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                listener3 = listener;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            h.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f14955a);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof Trusted) {
            Object cancellation = ((AbstractFuture) listenableFuture).d;
            if (cancellation instanceof Cancellation) {
                Cancellation cancellation2 = (Cancellation) cancellation;
                if (cancellation2.f14954a) {
                    cancellation = cancellation2.b != null ? new Cancellation(false, cancellation2.b) : Cancellation.d;
                }
            }
            Objects.requireNonNull(cancellation);
            return cancellation;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thA = ((InternalFutureFailureAccess) listenableFuture).a()) != null) {
            return new Failure(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!g) && zIsCancelled) {
            Cancellation cancellation3 = Cancellation.d;
            Objects.requireNonNull(cancellation3);
            return cancellation3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new Failure(e);
                    } catch (CancellationException e2) {
                        if (zIsCancelled) {
                            return new Cancellation(false, e2);
                        }
                        return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                    } catch (ExecutionException e3) {
                        if (!zIsCancelled) {
                            return new Failure(e3.getCause());
                        }
                        return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3));
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e4) {
                e = e4;
                return new Failure(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? j : obj;
        }
        return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    public final Throwable a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.d;
        if (obj instanceof Failure) {
            return ((Failure) obj).f14955a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Listener listener2 = Listener.d;
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        if (!isDone() && (listener = this.e) != listener2) {
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
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        d(sb, v);
        sb.append("]");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Cancellation cancellation;
        Object obj = this.d;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (g) {
            cancellation = new Cancellation(z, new CancellationException("Future.cancel() was called."));
        } else {
            cancellation = z ? Cancellation.c : Cancellation.d;
            Objects.requireNonNull(cancellation);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z2 = false;
        while (true) {
            if (i.b(abstractFuture, obj, cancellation)) {
                e(abstractFuture, z);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).e;
                if (!(listenableFuture instanceof Trusted)) {
                    listenableFuture.cancel(z);
                    break;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.d;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractFuture.d;
                if (!(obj instanceof SetFuture)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j3;
        Waiter waiter = Waiter.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return g(obj);
        }
        long j4 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter2 = this.f;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                z = true;
                while (true) {
                    AtomicHelper atomicHelper = i;
                    atomicHelper.f(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                l(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(waiter3);
                    } else {
                        long j5 = j4;
                        waiter2 = this.f;
                        if (waiter2 == waiter) {
                            break;
                        }
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.d;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof SetFuture))) {
                return g(obj4);
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
        StringBuilder sbT = androidx.camera.core.impl.b.t(j2, "Waited ", " ");
        sbT.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbT.toString();
        if (nanos + 1000 < j3) {
            String strG = YU.a.g(string3, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j3 || nanos2 > 1000) ? z : false;
            if (jConvert > j3) {
                String strG2 = strG + jConvert + " " + lowerCase;
                if (z2) {
                    strG2 = YU.a.g(strG2, ",");
                }
                strG = YU.a.g(strG2, " ");
            }
            if (z2) {
                strG = strG + nanos2 + " nanoseconds ";
            }
            string3 = YU.a.g(strG, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(YU.a.g(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(androidx.camera.core.impl.b.o(string3, " for ", string));
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.d instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.d != null);
    }

    public final void j(Future future) {
        boolean z = false;
        if ((future != null) && isCancelled()) {
            Object obj = this.d;
            if ((obj instanceof Cancellation) && ((Cancellation) obj).f14954a) {
                z = true;
            }
            future.cancel(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(Waiter waiter) {
        waiter.f14959a = null;
        while (true) {
            Waiter waiter2 = this.f;
            if (waiter2 == Waiter.c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.b;
                if (waiter2.f14959a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.b = waiter4;
                    if (waiter3.f14959a == null) {
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

    public boolean m(Object obj) {
        if (obj == null) {
            obj = j;
        }
        if (!i.b(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        th.getClass();
        if (!i.b(this, null, new Failure(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public final void o(ListenableFuture listenableFuture) {
        Failure failure;
        listenableFuture.getClass();
        Object obj = this.d;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (i.b(this, null, h(listenableFuture))) {
                    e(this, false);
                    return;
                }
                return;
            }
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (i.b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.d);
                    return;
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Error | Exception unused) {
                        failure = Failure.b;
                    }
                    i.b(this, setFuture, failure);
                    return;
                }
            }
            obj = this.d;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f14954a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcd
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Lcd
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.d
            boolean r4 = r3 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.common.util.concurrent.AbstractFuture$SetFuture r3 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r3
            com.google.common.util.concurrent.ListenableFuture r3 = r3.e
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbd
        L93:
            java.lang.String r3 = r6.k()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r3 == 0) goto La4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r4 == 0) goto Lb6
            goto La4
        La0:
            r3 = move-exception
            goto La6
        La2:
            r3 = move-exception
            goto La6
        La4:
            r3 = 0
            goto Lb6
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb6:
            if (r3 == 0) goto Lbd
            java.lang.String r4 = ", info=["
            androidx.compose.ui.input.pointer.a.w(r0, r4, r3, r2)
        Lbd:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcd
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Lcd:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.toString():java.lang.String");
    }

    public static final class Listener {
        public static final Listener d = new Listener();

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f14956a;
        public final Executor b;
        public Listener c;

        public Listener(Runnable runnable, Executor executor) {
            this.f14956a = runnable;
            this.b = executor;
        }

        public Listener() {
            this.f14956a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        Waiter waiter = Waiter.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return g(obj2);
            }
            Waiter waiter2 = this.f;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = i;
                    atomicHelper.f(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                l(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return g(obj);
                    }
                    waiter2 = this.f;
                } while (waiter2 != waiter);
            }
            Object obj3 = this.d;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}

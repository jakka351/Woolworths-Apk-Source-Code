package io.grpc;

import android.support.v4.media.session.a;
import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public final class SynchronizationContext implements Executor {
    public final Thread.UncaughtExceptionHandler d;
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public final AtomicReference f = new AtomicReference();

    public static class ManagedRunnable implements Runnable {
        public final Runnable d;
        public boolean e;
        public boolean f;

        public ManagedRunnable(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e) {
                return;
            }
            this.f = true;
            this.d.run();
        }
    }

    public static final class ScheduledHandle {

        /* renamed from: a, reason: collision with root package name */
        public final ManagedRunnable f23973a;
        public final ScheduledFuture b;

        public ScheduledHandle(ManagedRunnable managedRunnable, ScheduledFuture scheduledFuture) {
            this.f23973a = managedRunnable;
            Preconditions.j(scheduledFuture, "future");
            this.b = scheduledFuture;
        }

        public final void a() {
            this.f23973a.e = true;
            this.b.cancel(false);
        }

        public final boolean b() {
            ManagedRunnable managedRunnable = this.f23973a;
            return (managedRunnable.f || managedRunnable.e) ? false : true;
        }
    }

    public SynchronizationContext(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.d = uncaughtExceptionHandler;
    }

    public final void a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.e;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.d.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        Preconditions.j(runnable, "runnable is null");
        this.e.add(runnable);
    }

    public final ScheduledHandle c(final Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final ManagedRunnable managedRunnable = new ManagedRunnable(runnable);
        return new ScheduledHandle(managedRunnable, scheduledExecutorService.schedule(new Runnable() { // from class: io.grpc.SynchronizationContext.1
            @Override // java.lang.Runnable
            public final void run() {
                SynchronizationContext.this.execute(managedRunnable);
            }

            public final String toString() {
                return runnable.toString() + "(scheduled in SynchronizationContext)";
            }
        }, j, timeUnit));
    }

    public final ScheduledHandle d(final Runnable runnable, long j, final long j2, ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        final ManagedRunnable managedRunnable = new ManagedRunnable(runnable);
        return new ScheduledHandle(managedRunnable, scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: io.grpc.SynchronizationContext.2
            @Override // java.lang.Runnable
            public final void run() {
                SynchronizationContext.this.execute(managedRunnable);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(runnable.toString());
                sb.append("(scheduled in SynchronizationContext with delay of ");
                return a.l(j2, ")", sb);
            }
        }, j, j2, timeUnit));
    }

    public final void e() {
        Preconditions.q("Not called from the SynchronizationContext", Thread.currentThread() == this.f.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}

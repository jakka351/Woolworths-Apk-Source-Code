package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class IoScheduler extends Scheduler {
    public static final RxThreadFactory g;
    public static final RxThreadFactory h;
    public static final ThreadWorker k;
    public static final boolean l;
    public static final CachedWorkerPool m;
    public final AtomicReference f;
    public static final TimeUnit j = TimeUnit.SECONDS;
    public static final long i = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class CachedWorkerPool implements Runnable {
        public final long d;
        public final ConcurrentLinkedQueue e;
        public final CompositeDisposable f;
        public final ScheduledExecutorService g;
        public final ScheduledFuture h;
        public final ThreadFactory i;

        public CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            CachedWorkerPool cachedWorkerPool;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.d = nanos;
            this.e = new ConcurrentLinkedQueue();
            this.f = new CompositeDisposable();
            this.i = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.h);
                cachedWorkerPool = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(cachedWorkerPool, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                cachedWorkerPool = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            cachedWorkerPool.g = scheduledExecutorServiceNewScheduledThreadPool;
            cachedWorkerPool.h = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.e;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ThreadWorker threadWorker = (ThreadWorker) it.next();
                if (threadWorker.f > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.f.a(threadWorker);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class EventLoopWorker extends Scheduler.Worker implements Runnable {
        public final CachedWorkerPool e;
        public final ThreadWorker f;
        public final AtomicBoolean g = new AtomicBoolean();
        public final CompositeDisposable d = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            ThreadWorker threadWorker2;
            this.e = cachedWorkerPool;
            if (cachedWorkerPool.f.e) {
                threadWorker2 = IoScheduler.k;
            } else {
                while (true) {
                    if (cachedWorkerPool.e.isEmpty()) {
                        threadWorker = new ThreadWorker(cachedWorkerPool.i);
                        cachedWorkerPool.f.d(threadWorker);
                        break;
                    } else {
                        threadWorker = (ThreadWorker) cachedWorkerPool.e.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.f = threadWorker2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.d.e ? EmptyDisposable.d : this.f.f(runnable, j, timeUnit, this.d);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g.compareAndSet(false, true)) {
                this.d.dispose();
                if (IoScheduler.l) {
                    this.f.f(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                CachedWorkerPool cachedWorkerPool = this.e;
                cachedWorkerPool.getClass();
                long jNanoTime = System.nanoTime() + cachedWorkerPool.d;
                ThreadWorker threadWorker = this.f;
                threadWorker.f = jNanoTime;
                cachedWorkerPool.e.offer(threadWorker);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            CachedWorkerPool cachedWorkerPool = this.e;
            cachedWorkerPool.getClass();
            long jNanoTime = System.nanoTime() + cachedWorkerPool.d;
            ThreadWorker threadWorker = this.f;
            threadWorker.f = jNanoTime;
            cachedWorkerPool.e.offer(threadWorker);
        }
    }

    public static final class ThreadWorker extends NewThreadWorker {
        public long f;

        public ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        k = threadWorker;
        threadWorker.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        g = rxThreadFactory;
        h = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        l = Boolean.getBoolean("rx2.io-scheduled-release");
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        m = cachedWorkerPool;
        cachedWorkerPool.f.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        CachedWorkerPool cachedWorkerPool = m;
        AtomicReference atomicReference = new AtomicReference(cachedWorkerPool);
        this.f = atomicReference;
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(i, j, g);
        while (!atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
            if (atomicReference.get() != cachedWorkerPool) {
                cachedWorkerPool2.f.dispose();
                ScheduledFuture scheduledFuture = cachedWorkerPool2.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new EventLoopWorker((CachedWorkerPool) this.f.get());
    }
}

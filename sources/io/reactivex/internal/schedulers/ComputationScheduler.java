package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {
    public static final FixedSchedulerPool g;
    public static final RxThreadFactory h;
    public static final int i;
    public static final PoolWorker j;
    public final AtomicReference f;

    /* loaded from: classes7.dex */
    public static final class EventLoopWorker extends Scheduler.Worker {
        public final ListCompositeDisposable d;
        public final CompositeDisposable e;
        public final ListCompositeDisposable f;
        public final PoolWorker g;
        public volatile boolean h;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.g = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.d = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.e = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f = listCompositeDisposable2;
            listCompositeDisposable2.d(listCompositeDisposable);
            listCompositeDisposable2.d(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            return this.h ? EmptyDisposable.d : this.g.f(runnable, 0L, TimeUnit.MILLISECONDS, this.d);
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.h ? EmptyDisposable.d : this.g.f(runnable, j, timeUnit, this.e);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f.dispose();
        }
    }

    public static final class FixedSchedulerPool implements SchedulerMultiWorkerSupport {
        public final int d;
        public final PoolWorker[] e;
        public long f;

        public FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.d = i;
            this.e = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.e[i2] = new PoolWorker(threadFactory);
            }
        }

        public final PoolWorker a() {
            int i = this.d;
            if (i == 0) {
                return ComputationScheduler.j;
            }
            long j = this.f;
            this.f = 1 + j;
            return this.e[(int) (j % i)];
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        i = iAvailableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        j = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        h = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        g = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.e) {
            poolWorker2.dispose();
        }
    }

    public ComputationScheduler() {
        FixedSchedulerPool fixedSchedulerPool = g;
        AtomicReference atomicReference = new AtomicReference(fixedSchedulerPool);
        this.f = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(i, h);
        while (!atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
            if (atomicReference.get() != fixedSchedulerPool) {
                PoolWorker[] poolWorkerArr = fixedSchedulerPool2.e;
                for (PoolWorker poolWorker : poolWorkerArr) {
                    poolWorker.dispose();
                }
                return;
            }
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new EventLoopWorker(((FixedSchedulerPool) this.f.get()).a());
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = ((FixedSchedulerPool) this.f.get()).a().d;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.a(j2 <= 0 ? scheduledExecutorService.submit(scheduledDirectTask) : scheduledExecutorService.schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.d;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable f(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        PoolWorker poolWorkerA = ((FixedSchedulerPool) this.f.get()).a();
        ScheduledExecutorService scheduledExecutorService = poolWorkerA.d;
        if (j3 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
            try {
                instantPeriodicTask.a(j2 <= 0 ? scheduledExecutorService.submit(instantPeriodicTask) : scheduledExecutorService.schedule(instantPeriodicTask, j2, timeUnit));
                return instantPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.b(e);
            }
        } else {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            try {
                scheduledDirectPeriodicTask.a(poolWorkerA.d.scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.b(e2);
            }
        }
        return EmptyDisposable.d;
    }
}

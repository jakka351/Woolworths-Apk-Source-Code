package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class SingleScheduler extends Scheduler {
    public static final RxThreadFactory g;
    public static final ScheduledExecutorService h;
    public final AtomicReference f;

    /* loaded from: classes7.dex */
    public static final class ScheduledWorker extends Scheduler.Worker {
        public final ScheduledExecutorService d;
        public final CompositeDisposable e = new CompositeDisposable();
        public volatile boolean f;

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.d = scheduledExecutorService;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (this.f) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.e);
            this.e.d(scheduledRunnable);
            try {
                scheduledRunnable.a(j <= 0 ? this.d.submit((Callable) scheduledRunnable) : this.d.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        h = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        g = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        boolean z = SchedulerPoolFactory.f24238a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, g);
        if (SchedulerPoolFactory.f24238a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new ScheduledWorker((ScheduledExecutorService) this.f.get());
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        AtomicReference atomicReference = this.f;
        try {
            scheduledDirectTask.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.d;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        EmptyDisposable emptyDisposable = EmptyDisposable.d;
        AtomicReference atomicReference = this.f;
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            try {
                scheduledDirectPeriodicTask.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
        try {
            instantPeriodicTask.a(j <= 0 ? scheduledExecutorService.submit(instantPeriodicTask) : scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit));
            return instantPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.b(e2);
            return emptyDisposable;
        }
    }
}

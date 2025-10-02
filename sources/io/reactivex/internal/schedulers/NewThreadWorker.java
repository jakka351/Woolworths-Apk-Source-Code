package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {
    public final ScheduledExecutorService d;
    public volatile boolean e;

    public NewThreadWorker(ThreadFactory threadFactory) {
        boolean z = SchedulerPoolFactory.f24238a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (SchedulerPoolFactory.f24238a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.d = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.e;
    }

    @Override // io.reactivex.Scheduler.Worker
    public final Disposable c(Runnable runnable) {
        return d(runnable, 0L, null);
    }

    @Override // io.reactivex.Scheduler.Worker
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? EmptyDisposable.d : f(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.shutdownNow();
    }

    public final ScheduledRunnable f(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.d(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledExecutorService scheduledExecutorService = this.d;
        try {
            scheduledRunnable.a(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.a(scheduledRunnable);
            }
            RxJavaPlugins.b(e);
            return scheduledRunnable;
        }
    }
}

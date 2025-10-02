package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ExecutorScheduler extends Scheduler {
    public static final Scheduler g = Schedulers.f24242a;
    public final Executor f;

    public final class DelayedDispose implements Runnable {
        public final DelayedRunnable d;

        public DelayedDispose(DelayedRunnable delayedRunnable) {
            this.d = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DelayedRunnable delayedRunnable = this.d;
            SequentialDisposable sequentialDisposable = delayedRunnable.e;
            Disposable disposableD = ExecutorScheduler.this.d(delayedRunnable);
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposableD);
        }
    }

    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {
        public final SequentialDisposable d;
        public final SequentialDisposable e;

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.d = new SequentialDisposable();
            this.e = new SequentialDisposable();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                SequentialDisposable sequentialDisposable = this.d;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                SequentialDisposable sequentialDisposable2 = this.e;
                sequentialDisposable2.getClass();
                DisposableHelper.a(sequentialDisposable2);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SequentialDisposable sequentialDisposable = this.e;
            SequentialDisposable sequentialDisposable2 = this.d;
            DisposableHelper disposableHelper = DisposableHelper.d;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    sequentialDisposable2.lazySet(disposableHelper);
                    sequentialDisposable.lazySet(disposableHelper);
                }
            }
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        public final Executor d;
        public volatile boolean f;
        public final AtomicInteger g = new AtomicInteger();
        public final CompositeDisposable h = new CompositeDisposable();
        public final MpscLinkedQueue e = new MpscLinkedQueue();

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
            public final Runnable d;

            public BooleanRunnable(Runnable runnable) {
                this.d = runnable;
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return get();
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                lazySet(true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.d.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {
            public volatile Thread d;

            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return get() >= 2;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.d;
                        if (thread != null) {
                            thread.interrupt();
                            this.d = null;
                        }
                        set(4);
                        return;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.d = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.d = null;
                        return;
                    }
                    try {
                        throw null;
                    } catch (Throwable th) {
                        this.d = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        public final class SequentialDispose implements Runnable {
            public final SequentialDisposable d;
            public final Runnable e;

            public SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.d = sequentialDisposable;
                this.e = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Disposable disposableC = ExecutorWorker.this.c(this.e);
                SequentialDisposable sequentialDisposable = this.d;
                sequentialDisposable.getClass();
                DisposableHelper.d(sequentialDisposable, disposableC);
            }
        }

        public ExecutorWorker(Executor executor) {
            this.d = executor;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (this.f) {
                return emptyDisposable;
            }
            BooleanRunnable booleanRunnable = new BooleanRunnable(runnable);
            this.e.offer(booleanRunnable);
            if (this.g.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.d.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e) {
                this.f = true;
                this.e.clear();
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (j <= 0) {
                return c(runnable);
            }
            if (this.f) {
                return emptyDisposable;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, runnable), this.h);
            this.h.d(scheduledRunnable);
            Executor executor = this.d;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f = true;
                    RxJavaPlugins.b(e);
                    return emptyDisposable;
                }
            } else {
                scheduledRunnable.a(new DisposeOnCancel(ExecutorScheduler.g.e(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.d(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.h.dispose();
            if (this.g.getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            MpscLinkedQueue mpscLinkedQueue = this.e;
            int iAddAndGet = 1;
            while (!this.f) {
                do {
                    Runnable runnable = (Runnable) mpscLinkedQueue.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else if (this.f) {
                        mpscLinkedQueue.clear();
                        return;
                    } else {
                        iAddAndGet = this.g.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f);
                mpscLinkedQueue.clear();
                return;
            }
            mpscLinkedQueue.clear();
        }
    }

    public ExecutorScheduler(Executor executor) {
        this.f = executor;
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new ExecutorWorker(this.f);
    }

    @Override // io.reactivex.Scheduler
    public final Disposable d(Runnable runnable) {
        Executor executor = this.f;
        ObjectHelper.b(runnable, "run is null");
        try {
            if (executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.a(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
            executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.d;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        Executor executor = this.f;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.a(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.b(e);
                return EmptyDisposable.d;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        Disposable disposableE = g.e(new DelayedDispose(delayedRunnable), j, timeUnit);
        SequentialDisposable sequentialDisposable = delayedRunnable.d;
        sequentialDisposable.getClass();
        DisposableHelper.d(sequentialDisposable, disposableE);
        return delayedRunnable;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.f;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.f(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            scheduledDirectPeriodicTask.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.d;
        }
    }
}

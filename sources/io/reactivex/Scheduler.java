package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class Scheduler {
    public static final boolean d = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    public static final long e = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* loaded from: classes7.dex */
    public static final class DisposeTask implements Disposable, Runnable, SchedulerRunnableIntrospection {
        public final Runnable d;
        public final Worker e;
        public Thread f;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.d = runnable;
            this.e = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f == Thread.currentThread()) {
                Worker worker = this.e;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.e) {
                        return;
                    }
                    newThreadWorker.e = true;
                    newThreadWorker.d.shutdown();
                    return;
                }
            }
            this.e.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f = Thread.currentThread();
            try {
                this.d.run();
            } finally {
                dispose();
                this.f = null;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class PeriodicDirectTask implements Disposable, Runnable, SchedulerRunnableIntrospection {
        public final Runnable d;
        public final Worker e;
        public volatile boolean f;

        public PeriodicDirectTask(Runnable runnable, Worker worker) {
            this.d = runnable;
            this.e = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f = true;
            this.e.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f) {
                return;
            }
            try {
                this.d.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.dispose();
                throw ExceptionHelper.d(th);
            }
        }
    }

    public static abstract class Worker implements Disposable {

        /* loaded from: classes7.dex */
        public final class PeriodicTask implements Runnable, SchedulerRunnableIntrospection {
            public final Runnable d;
            public final SequentialDisposable e;
            public final long f;
            public long g;
            public long h;
            public long i;

            public PeriodicTask(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.d = runnable;
                this.e = sequentialDisposable;
                this.f = j3;
                this.h = j2;
                this.i = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.d.run();
                SequentialDisposable sequentialDisposable = this.e;
                if (sequentialDisposable.b()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                Worker worker = Worker.this;
                long jA = worker.a(timeUnit);
                long j2 = Scheduler.e;
                long j3 = jA + j2;
                long j4 = this.h;
                long j5 = this.f;
                if (j3 < j4 || jA >= j4 + j5 + j2) {
                    j = jA + j5;
                    long j6 = this.g + 1;
                    this.g = j6;
                    this.i = j - (j5 * j6);
                } else {
                    long j7 = this.i;
                    long j8 = this.g + 1;
                    this.g = j8;
                    j = (j8 * j5) + j7;
                }
                this.h = jA;
                DisposableHelper.d(sequentialDisposable, worker.d(this, j - jA, timeUnit));
            }
        }

        public long a(TimeUnit timeUnit) {
            return Scheduler.a(TimeUnit.NANOSECONDS);
        }

        public Disposable c(Runnable runnable) {
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract Disposable d(Runnable runnable, long j, TimeUnit timeUnit);

        public Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j2);
            long jA = a(TimeUnit.NANOSECONDS);
            Disposable disposableD = d(new PeriodicTask(timeUnit.toNanos(j) + jA, runnable, jA, sequentialDisposable2, nanos), j, timeUnit);
            if (disposableD == EmptyDisposable.d) {
                return disposableD;
            }
            sequentialDisposable.a(disposableD);
            return sequentialDisposable2;
        }
    }

    public static long a(TimeUnit timeUnit) {
        return !d ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract Worker c();

    public Disposable d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerC = c();
        DisposeTask disposeTask = new DisposeTask(runnable, workerC);
        workerC.d(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public Disposable f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Worker workerC = c();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(runnable, workerC);
        Disposable disposableE = workerC.e(periodicDirectTask, j, j2, timeUnit);
        return disposableE == EmptyDisposable.d ? disposableE : periodicDirectTask;
    }
}

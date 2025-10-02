package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler f = new TrampolineScheduler();

    /* loaded from: classes7.dex */
    public static final class SleepingRunnable implements Runnable {
        public final Runnable d;
        public final TrampolineWorker e;
        public final long f;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.d = runnable;
            this.e = trampolineWorker;
            this.f = j;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            if (this.e.g) {
                return;
            }
            long jA = Scheduler.a(TimeUnit.MILLISECONDS);
            long j = this.f;
            if (j > jA) {
                try {
                    Thread.sleep(j - jA);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.b(e);
                    return;
                }
            }
            if (this.e.g) {
                return;
            }
            this.d.run();
        }
    }

    /* loaded from: classes7.dex */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        public final Runnable d;
        public final long e;
        public final int f;
        public volatile boolean g;

        public TimedRunnable(Runnable runnable, Long l, int i) {
            this.d = runnable;
            this.e = l.longValue();
            this.f = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            long j = this.e;
            long j2 = timedRunnable2.e;
            int i = j < j2 ? -1 : j > j2 ? 1 : 0;
            if (i != 0) {
                return i;
            }
            int i2 = timedRunnable2.f;
            int i3 = this.f;
            if (i3 < i2) {
                return -1;
            }
            return i3 > i2 ? 1 : 0;
        }
    }

    /* loaded from: classes7.dex */
    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {
        public final PriorityBlockingQueue d = new PriorityBlockingQueue();
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicInteger f = new AtomicInteger();
        public volatile boolean g;

        public final class AppendToQueueTask implements Runnable {
            public final TimedRunnable d;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.d = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.g = true;
                TrampolineWorker.this.d.remove(this.d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            return f(runnable, Scheduler.a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + Scheduler.a(TimeUnit.MILLISECONDS);
            return f(new SleepingRunnable(runnable, this, millis), millis);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
        }

        public final Disposable f(Runnable runnable, long j) {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (!this.g) {
                TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.f.incrementAndGet());
                this.d.add(timedRunnable);
                if (this.e.getAndIncrement() != 0) {
                    return Disposables.b(new AppendToQueueTask(timedRunnable));
                }
                int iAddAndGet = 1;
                while (!this.g) {
                    TimedRunnable timedRunnable2 = (TimedRunnable) this.d.poll();
                    if (timedRunnable2 == null) {
                        iAddAndGet = this.e.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!timedRunnable2.g) {
                        timedRunnable2.d.run();
                    }
                }
                this.d.clear();
                return emptyDisposable;
            }
            return emptyDisposable;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.Scheduler
    public final Disposable d(Runnable runnable) {
        runnable.run();
        return EmptyDisposable.d;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.b(e);
        }
        return EmptyDisposable.d;
    }
}

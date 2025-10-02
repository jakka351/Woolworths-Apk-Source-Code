package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class TestScheduler extends Scheduler {

    public final class TestWorker extends Scheduler.Worker {
        public volatile boolean d;

        public final class QueueRemove implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public final long a(TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            TestScheduler.this.getClass();
            return timeUnit2.convert(0L, TimeUnit.NANOSECONDS);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            if (this.d) {
                return EmptyDisposable.d;
            }
            throw null;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.d) {
                return EmptyDisposable.d;
            }
            timeUnit.toNanos(j);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d = true;
        }
    }

    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new TestWorker();
    }
}

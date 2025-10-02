package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableInterval extends Observable<Long> {
    public final Scheduler d;
    public final long e;
    public final long f;

    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer d;
        public long e;

        public IntervalObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == DisposableHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.d) {
                long j = this.e;
                this.e = 1 + j;
                this.d.onNext(Long.valueOf(j));
            }
        }
    }

    public ObservableInterval(long j, long j2, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.e = j;
        this.f = j2;
        this.d = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.d(intervalObserver);
        Scheduler scheduler = this.d;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.f(intervalObserver, scheduler.f(intervalObserver, this.e, this.f, TimeUnit.MILLISECONDS));
        } else {
            Scheduler.Worker workerC = scheduler.c();
            DisposableHelper.f(intervalObserver, workerC);
            workerC.e(intervalObserver, this.e, this.f, TimeUnit.MILLISECONDS);
        }
    }
}

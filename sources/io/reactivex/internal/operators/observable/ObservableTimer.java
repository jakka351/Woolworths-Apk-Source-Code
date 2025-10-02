package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableTimer extends Observable<Long> {
    public final Scheduler d;
    public final long e;
    public final TimeUnit f;

    public static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer d;

        public TimerObserver(Observer observer) {
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
            if (b()) {
                return;
            }
            Observer observer = this.d;
            observer.onNext(0L);
            lazySet(EmptyDisposable.d);
            observer.onComplete();
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.e = j;
        this.f = timeUnit;
        this.d = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        boolean z;
        TimerObserver timerObserver = new TimerObserver(observer);
        observer.d(timerObserver);
        Disposable disposableE = this.d.e(timerObserver, this.e, this.f);
        while (true) {
            if (timerObserver.compareAndSet(null, disposableE)) {
                z = true;
                break;
            } else if (timerObserver.get() != null) {
                z = false;
                break;
            }
        }
        if (z || timerObserver.get() != DisposableHelper.d) {
            return;
        }
        disposableE.dispose();
    }
}

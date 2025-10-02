package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer d;
        public long e = 0;

        public IntervalRangeObserver(Observer observer) {
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
            long j = this.e;
            Long lValueOf = Long.valueOf(j);
            Observer observer = this.d;
            observer.onNext(lValueOf);
            if (j != 0) {
                this.e = j + 1;
            } else {
                DisposableHelper.a(this);
                observer.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(new IntervalRangeObserver(observer));
        throw null;
    }
}

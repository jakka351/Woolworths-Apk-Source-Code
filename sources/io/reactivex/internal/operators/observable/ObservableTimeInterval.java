package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;

/* loaded from: classes7.dex */
public final class ObservableTimeInterval<T> extends AbstractObservableWithUpstream<T, Timed<T>> {

    public static final class TimeIntervalObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;

        public TimeIntervalObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new TimeIntervalObserver(observer));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    public final class DelayObserver implements Observer<U> {
        public boolean d;

        public final class OnComplete implements Observer<T> {
            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            onComplete();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(new SequentialDisposable());
        throw null;
    }
}

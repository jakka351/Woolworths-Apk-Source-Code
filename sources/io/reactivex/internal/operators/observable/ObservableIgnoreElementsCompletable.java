package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;

/* loaded from: classes7.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {
    public final Observable d;

    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {
        public final CompletableObserver d;
        public Disposable e;

        public IgnoreObservable(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            this.e = disposable;
            this.d.d(this);
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
        }
    }

    public ObservableIgnoreElementsCompletable(Observable observable) {
        this.d = observable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final Observable b() {
        return new ObservableIgnoreElements(this.d);
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new IgnoreObservable(completableObserver));
    }
}

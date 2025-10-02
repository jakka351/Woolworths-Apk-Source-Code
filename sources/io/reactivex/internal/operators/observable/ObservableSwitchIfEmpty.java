package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* loaded from: classes7.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {
        public final Observer d;
        public final ObservableJust e;
        public boolean g = true;
        public final SequentialDisposable f = new SequentialDisposable();

        public SwitchIfEmptyObserver(Observer observer, ObservableJust observableJust) {
            this.d = observer;
            this.e = observableJust;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f;
            sequentialDisposable.getClass();
            DisposableHelper.e(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (!this.g) {
                this.d.onComplete();
            } else {
                this.g = false;
                this.e.a(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                this.g = false;
            }
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        SwitchIfEmptyObserver switchIfEmptyObserver = new SwitchIfEmptyObserver(observer, null);
        observer.d(switchIfEmptyObserver.f);
        this.d.a(switchIfEmptyObserver);
    }
}

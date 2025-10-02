package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes7.dex */
public final class SingleToObservable<T> extends Observable<T> {
    public final SingleSource d;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {
        public Disposable f;

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f.dispose();
        }
    }

    public SingleToObservable(SingleSource singleSource) {
        this.d = singleSource;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new SingleToObservableObserver(observer));
    }
}

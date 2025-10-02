package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableAmb<T> extends Observable<T> {

    public static final class AmbCoordinator<T> implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    public static final class AmbInnerObserver<T> extends AtomicReference<Disposable> implements Observer<T> {
        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
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

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.e(th, observer);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;

/* loaded from: classes7.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarCallable<T> {
    public final Object d;

    public ObservableJust(Object obj) {
        this.d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.d;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.d);
        observer.d(scalarDisposable);
        scalarDisposable.run();
    }
}

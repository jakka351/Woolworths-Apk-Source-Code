package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes7.dex */
public final class ObservableFromFuture<T> extends Observable<T> {
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.d(deferredScalarDisposable);
        if (deferredScalarDisposable.b()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            if (deferredScalarDisposable.b()) {
                return;
            }
            observer.onError(th);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class ObservableNever extends Observable<Object> {
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(EmptyDisposable.e);
    }
}

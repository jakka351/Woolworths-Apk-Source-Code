package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;

/* loaded from: classes7.dex */
public final class ObservableSerialized<T> extends AbstractObservableWithUpstream<T, T> {
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new SerializedObserver(observer));
    }
}

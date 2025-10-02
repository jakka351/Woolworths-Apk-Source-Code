package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.DisposableLambdaObserver;

/* loaded from: classes7.dex */
public final class ObservableDoOnLifecycle<T> extends AbstractObservableWithUpstream<T, T> {
    public final Consumer e;
    public final Action f;

    public ObservableDoOnLifecycle(Observable observable, Consumer consumer, Action action) {
        super(observable);
        this.e = consumer;
        this.f = action;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DisposableLambdaObserver(observer, this.e, this.f));
    }
}

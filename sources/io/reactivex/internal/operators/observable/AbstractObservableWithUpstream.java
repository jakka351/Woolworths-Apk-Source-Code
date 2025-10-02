package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* loaded from: classes.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> implements HasUpstreamObservableSource<T> {
    public final ObservableSource d;

    public AbstractObservableWithUpstream(ObservableSource observableSource) {
        this.d = observableSource;
    }
}

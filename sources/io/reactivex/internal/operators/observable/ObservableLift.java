package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableLift<R, T> extends AbstractObservableWithUpstream<T, R> {
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            throw null;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}

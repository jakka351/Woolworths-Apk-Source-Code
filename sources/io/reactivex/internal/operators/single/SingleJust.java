package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class SingleJust<T> extends Single<T> {
    public final Object d;

    public SingleJust(Object obj) {
        this.d = obj;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(EmptyDisposable.d);
        singleObserver.onSuccess(this.d);
    }
}

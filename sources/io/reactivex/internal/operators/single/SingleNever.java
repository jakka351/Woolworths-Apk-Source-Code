package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class SingleNever extends Single<Object> {
    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(EmptyDisposable.e);
    }
}

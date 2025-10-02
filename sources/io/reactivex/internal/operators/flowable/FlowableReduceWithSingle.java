package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {
    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}

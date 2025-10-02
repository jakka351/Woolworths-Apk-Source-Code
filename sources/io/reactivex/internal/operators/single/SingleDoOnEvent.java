package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes7.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    public final class DoOnEvent implements SingleObserver<T> {
        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        throw null;
    }
}

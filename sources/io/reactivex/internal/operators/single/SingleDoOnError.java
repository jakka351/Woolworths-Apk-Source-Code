package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* loaded from: classes7.dex */
public final class SingleDoOnError<T> extends Single<T> {
    public final Single d;
    public final Consumer e;

    public final class DoOnError implements SingleObserver<T> {
        public final SingleObserver d;

        public DoOnError(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnError.this.e.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }
    }

    public SingleDoOnError(Single single, Consumer consumer) {
        this.d = single;
        this.e = consumer;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new DoOnError(singleObserver));
    }
}

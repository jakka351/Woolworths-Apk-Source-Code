package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* loaded from: classes7.dex */
public final class SingleDoOnSuccess<T> extends Single<T> {
    public final Single d;
    public final Consumer e;

    public final class DoOnSuccess implements SingleObserver<T> {
        public final SingleObserver d;

        public DoOnSuccess(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.d;
            try {
                SingleDoOnSuccess.this.e.accept(obj);
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.b(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnSuccess(Single single, Consumer consumer) {
        this.d = single;
        this.e = consumer;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new DoOnSuccess(singleObserver));
    }
}

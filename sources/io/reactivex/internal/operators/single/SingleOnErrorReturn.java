package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

/* loaded from: classes7.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {
    public final Single d;
    public final Function e;

    public final class OnErrorReturn implements SingleObserver<T> {
        public final SingleObserver d;

        public OnErrorReturn(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            SingleObserver singleObserver = this.d;
            try {
                Object objMo0apply = SingleOnErrorReturn.this.e.mo0apply(th);
                if (objMo0apply != null) {
                    singleObserver.onSuccess(objMo0apply);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                singleObserver.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(Single single, Function function) {
        this.d = single;
        this.e = function;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new OnErrorReturn(singleObserver));
    }
}

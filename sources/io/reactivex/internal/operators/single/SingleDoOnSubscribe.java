package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {
    public final Single d;
    public final Consumer e;

    public static final class DoOnSubscribeSingleObserver<T> implements SingleObserver<T> {
        public final SingleObserver d;
        public final Consumer e;
        public boolean f;

        public DoOnSubscribeSingleObserver(SingleObserver singleObserver, Consumer consumer) {
            this.d = singleObserver;
            this.e = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            SingleObserver singleObserver = this.d;
            try {
                this.e.accept(disposable);
                singleObserver.d(disposable);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.f = true;
                disposable.dispose();
                EmptyDisposable.f(th, singleObserver);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
            } else {
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            if (this.f) {
                return;
            }
            this.d.onSuccess(obj);
        }
    }

    public SingleDoOnSubscribe(Single single, Consumer consumer) {
        this.d = single;
        this.e = consumer;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new DoOnSubscribeSingleObserver(singleObserver, this.e));
    }
}

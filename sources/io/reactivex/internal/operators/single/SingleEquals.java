package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    public static class InnerObserver<T> implements SingleObserver<T> {
        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        new AtomicInteger();
        singleObserver.d(new CompositeDisposable());
        throw null;
    }
}

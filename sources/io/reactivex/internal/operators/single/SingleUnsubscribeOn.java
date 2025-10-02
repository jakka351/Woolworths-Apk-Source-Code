package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public final SingleObserver d;
        public Disposable e;

        public UnsubscribeOnSingleObserver(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.d;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return;
            }
            this.e = andSet;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e.dispose();
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        new UnsubscribeOnSingleObserver(singleObserver);
        throw null;
    }
}

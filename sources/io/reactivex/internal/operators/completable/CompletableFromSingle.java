package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public final class CompletableFromSingle<T> extends Completable {
    public final Single d;

    public static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {
        public final CompletableObserver d;

        public CompletableFromSingleObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
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
            this.d.onComplete();
        }
    }

    public CompletableFromSingle(Single single) {
        this.d = single;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new CompletableFromSingleObserver(completableObserver));
    }
}

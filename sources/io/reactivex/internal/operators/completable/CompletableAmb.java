package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class CompletableAmb extends Completable {

    public static final class Amb implements CompletableObserver {
        public Disposable d;

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            this.d = disposable;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.c(th, completableObserver);
        }
    }
}

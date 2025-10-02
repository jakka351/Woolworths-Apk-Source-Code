package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes7.dex */
public final class CompletableDoOnEvent extends Completable {

    public final class DoOnEvent implements CompletableObserver {
        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        throw null;
    }
}

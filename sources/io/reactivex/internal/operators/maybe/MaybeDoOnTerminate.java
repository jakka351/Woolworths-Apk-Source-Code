package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes7.dex */
public final class MaybeDoOnTerminate<T> extends Maybe<T> {

    public final class DoOnTerminate implements MaybeObserver<T> {
        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        throw null;
    }
}

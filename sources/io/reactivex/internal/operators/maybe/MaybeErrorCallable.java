package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class MaybeErrorCallable<T> extends Maybe<T> {
    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(EmptyDisposable.d);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            maybeObserver.onError(th);
        }
    }
}

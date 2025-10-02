package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class MaybeLift<T, R> extends AbstractMaybeWithUpstream<T, R> {
    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.d(th, maybeObserver);
        }
    }
}

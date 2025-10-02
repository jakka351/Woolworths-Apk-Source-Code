package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class MaybeZipIterable<T, R> extends Maybe<R> {

    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

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

package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* loaded from: classes7.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {
    public final String d;

    public MaybeJust(String str) {
        this.d = str;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(EmptyDisposable.d);
        maybeObserver.onSuccess(this.d);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.d;
    }
}

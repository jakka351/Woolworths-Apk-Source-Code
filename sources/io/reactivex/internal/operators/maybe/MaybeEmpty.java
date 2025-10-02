package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* loaded from: classes7.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarCallable<Object> {
    public static final MaybeEmpty d = new MaybeEmpty();

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(EmptyDisposable.d);
        maybeObserver.onComplete();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class MaybeFromAction<T> extends Maybe<T> implements Callable<T> {
    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        Disposable disposableB = Disposables.b(Functions.b);
        maybeObserver.d(disposableB);
        if (disposableB.b()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            if (disposableB.b()) {
                RxJavaPlugins.b(th);
            } else {
                maybeObserver.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        throw null;
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
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
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.b(th);
            if (disposableB.b()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}

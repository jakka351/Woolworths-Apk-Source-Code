package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class MaybeDefer<T> extends Maybe<T> {
    public final Callable d;

    public MaybeDefer(Callable callable) {
        this.d = callable;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        try {
            Object objCall = this.d.call();
            ObjectHelper.b(objCall, "The maybeSupplier returned a null MaybeSource");
            ((MaybeSource) objCall).a(maybeObserver);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.d(th, maybeObserver);
        }
    }
}

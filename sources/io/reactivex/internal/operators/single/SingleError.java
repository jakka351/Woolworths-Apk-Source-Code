package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class SingleError<T> extends Single<T> {
    public final Callable d;

    public SingleError(Callable callable) {
        this.d = callable;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            Object objCall = this.d.call();
            ObjectHelper.b(objCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) objCall;
        } catch (Throwable th) {
            th = th;
            Exceptions.b(th);
        }
        EmptyDisposable.f(th, singleObserver);
    }
}

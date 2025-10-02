package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class ObservableError<T> extends Observable<T> {
    public final Callable d;

    public ObservableError(Callable callable) {
        this.d = callable;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            Object objCall = this.d.call();
            ObjectHelper.b(objCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) objCall;
        } catch (Throwable th) {
            th = th;
            Exceptions.b(th);
        }
        EmptyDisposable.e(th, observer);
    }
}

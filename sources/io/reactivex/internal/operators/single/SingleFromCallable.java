package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class SingleFromCallable<T> extends Single<T> {
    public final Callable d;

    public SingleFromCallable(Callable callable) {
        this.d = callable;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        Disposable disposableB = Disposables.b(Functions.b);
        singleObserver.d(disposableB);
        if (disposableB.b()) {
            return;
        }
        try {
            Object objCall = this.d.call();
            ObjectHelper.b(objCall, "The callable returned a null value");
            if (disposableB.b()) {
                return;
            }
            singleObserver.onSuccess(objCall);
        } catch (Throwable th) {
            Exceptions.b(th);
            if (disposableB.b()) {
                RxJavaPlugins.b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}

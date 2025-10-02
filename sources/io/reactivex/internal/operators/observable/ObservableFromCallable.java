package io.reactivex.internal.operators.observable;

import androidx.webkit.internal.a;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Callable<T> {
    public final a d;

    public ObservableFromCallable(a aVar) {
        this.d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objCall = this.d.call();
        ObjectHelper.b(objCall, "The callable returned a null value");
        return objCall;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.d(deferredScalarDisposable);
        if (deferredScalarDisposable.b()) {
            return;
        }
        try {
            Object objCall = this.d.call();
            ObjectHelper.b(objCall, "Callable returned null");
            deferredScalarDisposable.a(objCall);
        } catch (Throwable th) {
            Exceptions.b(th);
            if (deferredScalarDisposable.b()) {
                RxJavaPlugins.b(th);
            } else {
                observer.onError(th);
            }
        }
    }
}

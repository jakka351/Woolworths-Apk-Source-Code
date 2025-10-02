package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {
    public Disposable d;

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.d.b();
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.l(this.d, disposable)) {
            this.d = disposable;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                try {
                    disposable.dispose();
                    RxJavaPlugins.b(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        RxJavaPlugins.b(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
    }
}

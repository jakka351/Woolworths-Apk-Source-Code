package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {
    public Disposable f;

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.l(this.f, disposable)) {
            this.f = disposable;
            this.d.d(this);
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    public final void dispose() {
        super.dispose();
        this.f.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            a(obj);
        } else {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.d.onComplete();
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.Observer
    public final void onError(Throwable th) {
        this.e = null;
        c(th);
    }
}

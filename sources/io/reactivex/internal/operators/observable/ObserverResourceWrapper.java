package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.f(null, disposable)) {
            throw null;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}

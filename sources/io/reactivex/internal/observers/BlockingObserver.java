package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static final Object d = null;

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == DisposableHelper.d;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        DisposableHelper.f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.a(this)) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}

package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return DisposableHelper.c(get());
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        DisposableHelper.f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
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

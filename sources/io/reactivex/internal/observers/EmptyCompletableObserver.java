package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == DisposableHelper.d;
    }

    @Override // io.reactivex.CompletableObserver
    public final void d(Disposable disposable) {
        DisposableHelper.f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        lazySet(DisposableHelper.d);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.d);
        RxJavaPlugins.b(new OnErrorNotImplementedException(th));
    }
}

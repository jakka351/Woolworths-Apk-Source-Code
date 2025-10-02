package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {
    public final Consumer d;
    public final Action e;

    public CallbackCompletableObserver(Action action) {
        this.d = this;
        this.e = action;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        RxJavaPlugins.b(new OnErrorNotImplementedException((Throwable) obj));
    }

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
        try {
            this.e.run();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
        lazySet(DisposableHelper.d);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        try {
            this.d.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.b(th2);
        }
        lazySet(DisposableHelper.d);
    }

    public CallbackCompletableObserver(Consumer consumer, Action action) {
        this.d = consumer;
        this.e = action;
    }
}

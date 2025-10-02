package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer d;
    public final Consumer e;

    public ConsumerSingleObserver(Consumer consumer, Consumer consumer2) {
        this.d = consumer;
        this.e = consumer2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == DisposableHelper.d;
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
        DisposableHelper.f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.d);
        try {
            this.e.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.d);
        try {
            this.d.accept(obj);
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }
}

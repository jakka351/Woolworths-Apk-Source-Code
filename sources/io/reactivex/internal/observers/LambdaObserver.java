package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer d;
    public final Consumer e;
    public final Action f = Functions.c;
    public final Consumer g = Functions.d;

    public LambdaObserver(Consumer consumer, Consumer consumer2) {
        this.d = consumer;
        this.e = consumer2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == DisposableHelper.d;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.f(this, disposable)) {
            try {
                this.g.accept(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                disposable.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (b()) {
            return;
        }
        lazySet(DisposableHelper.d);
        try {
            this.f.run();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (b()) {
            RxJavaPlugins.b(th);
            return;
        }
        lazySet(DisposableHelper.d);
        try {
            this.e.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (b()) {
            return;
        }
        try {
            this.d.accept(obj);
        } catch (Throwable th) {
            Exceptions.b(th);
            get().dispose();
            onError(th);
        }
    }
}

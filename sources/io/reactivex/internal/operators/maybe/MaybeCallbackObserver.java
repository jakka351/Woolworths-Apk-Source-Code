package io.reactivex.internal.operators.maybe;

import au.com.woolworths.android.onesite.modules.search.searchscreen.c;
import io.reactivex.MaybeObserver;
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

/* loaded from: classes7.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, LambdaConsumerIntrospection {
    public final c d;
    public final Consumer e = Functions.e;
    public final Action f = Functions.c;

    public MaybeCallbackObserver(c cVar) {
        this.d = cVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return DisposableHelper.c(get());
    }

    @Override // io.reactivex.MaybeObserver
    public final void d(Disposable disposable) {
        DisposableHelper.f(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        lazySet(DisposableHelper.d);
        try {
            this.f.run();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.d);
        try {
            this.e.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.MaybeObserver
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

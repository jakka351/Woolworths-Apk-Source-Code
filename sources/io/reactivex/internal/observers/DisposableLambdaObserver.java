package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {
    public final Observer d;
    public final Consumer e;
    public final Action f;
    public Disposable g;

    public DisposableLambdaObserver(Observer observer, Consumer consumer, Action action) {
        this.d = observer;
        this.e = consumer;
        this.f = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.g.b();
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        Observer observer = this.d;
        try {
            this.e.accept(disposable);
            if (DisposableHelper.l(this.g, disposable)) {
                this.g = disposable;
                observer.d(this);
            }
        } catch (Throwable th) {
            Exceptions.b(th);
            disposable.dispose();
            this.g = DisposableHelper.d;
            EmptyDisposable.e(th, observer);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable disposable = this.g;
        DisposableHelper disposableHelper = DisposableHelper.d;
        if (disposable != disposableHelper) {
            this.g = disposableHelper;
            try {
                this.f.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        Disposable disposable = this.g;
        DisposableHelper disposableHelper = DisposableHelper.d;
        if (disposable != disposableHelper) {
            this.g = disposableHelper;
            this.d.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        Disposable disposable = this.g;
        DisposableHelper disposableHelper = DisposableHelper.d;
        if (disposable == disposableHelper) {
            RxJavaPlugins.b(th);
        } else {
            this.g = disposableHelper;
            this.d.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.d.onNext(obj);
    }
}

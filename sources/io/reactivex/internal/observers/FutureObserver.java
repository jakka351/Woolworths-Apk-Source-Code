package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {
    public Object d;
    public Throwable e;

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        DisposableHelper.f(null, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (getCount() != 0) {
            await();
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.d != null) {
            throw null;
        }
        onError(new NoSuchElementException("The source is empty"));
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.e != null) {
            RxJavaPlugins.b(th);
        } else {
            this.e = th;
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.d != null) {
            throw null;
        }
        this.d = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.c(j, timeUnit));
        }
        throw null;
    }
}

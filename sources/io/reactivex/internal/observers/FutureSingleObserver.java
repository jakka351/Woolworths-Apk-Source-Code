package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
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

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.c(j, timeUnit));
        }
        throw null;
    }
}

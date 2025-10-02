package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    public final AtomicReference d;
    public final SingleObserver e;

    public ResumeSingleObserver(AtomicReference atomicReference, SingleObserver singleObserver) {
        this.d = atomicReference;
        this.e = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
        DisposableHelper.d(this.d, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        this.e.onError(th);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.e.onSuccess(obj);
    }
}

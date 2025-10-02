package io.reactivex;

import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public interface MaybeObserver<T> {
    void d(Disposable disposable);

    void onComplete();

    void onError(Throwable th);

    void onSuccess(Object obj);
}

package io.reactivex;

import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public interface SingleObserver<T> {
    void d(Disposable disposable);

    void onError(Throwable th);

    void onSuccess(Object obj);
}

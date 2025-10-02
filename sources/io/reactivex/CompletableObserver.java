package io.reactivex;

import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public interface CompletableObserver {
    void d(Disposable disposable);

    void onComplete();

    void onError(Throwable th);
}

package io.reactivex;

import kotlinx.coroutines.rx2.RxCancellable;

/* loaded from: classes7.dex */
public interface SingleEmitter<T> {
    void a(RxCancellable rxCancellable);

    boolean b();

    boolean c(Throwable th);

    void onError(Throwable th);

    void onSuccess(Object obj);
}

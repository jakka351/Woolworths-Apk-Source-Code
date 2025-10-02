package io.reactivex;

import kotlinx.coroutines.rx2.RxCancellable;

/* loaded from: classes7.dex */
public interface ObservableEmitter<T> extends Emitter<T> {
    void a(RxCancellable rxCancellable);

    boolean b();
}

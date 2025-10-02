package io.reactivex;

import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public interface FlowableEmitter<T> extends Emitter<T> {
    void c(Disposable disposable);

    boolean isCancelled();
}

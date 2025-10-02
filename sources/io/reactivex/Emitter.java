package io.reactivex;

/* loaded from: classes7.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}

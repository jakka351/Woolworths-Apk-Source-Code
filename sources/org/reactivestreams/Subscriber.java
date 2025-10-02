package org.reactivestreams;

/* loaded from: classes8.dex */
public interface Subscriber<T> {
    void m(Subscription subscription);

    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}

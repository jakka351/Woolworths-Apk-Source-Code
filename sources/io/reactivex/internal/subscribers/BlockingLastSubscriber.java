package io.reactivex.internal.subscribers;

/* loaded from: classes7.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.d = null;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.d = obj;
    }
}

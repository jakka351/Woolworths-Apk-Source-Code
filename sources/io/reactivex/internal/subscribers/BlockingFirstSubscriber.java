package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.d != null) {
            RxJavaPlugins.b(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.d == null) {
            this.d = obj;
            this.e.cancel();
            countDown();
        }
    }
}

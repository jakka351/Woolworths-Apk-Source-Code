package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    public Object d;
    public Subscription e;

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.e, subscription)) {
            this.e = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }
}

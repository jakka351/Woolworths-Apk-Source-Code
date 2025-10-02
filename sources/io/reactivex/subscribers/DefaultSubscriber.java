package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    public Subscription d;

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        Subscription subscription2 = this.d;
        Class<?> cls = getClass();
        ObjectHelper.b(subscription, "next is null");
        if (subscription2 == null) {
            this.d = subscription;
            subscription.request(Long.MAX_VALUE);
        } else {
            subscription.cancel();
            if (subscription2 != SubscriptionHelper.d) {
                EndConsumerHelper.a(cls);
            }
        }
    }
}

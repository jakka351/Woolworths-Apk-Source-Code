package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {
    public Subscription f;

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f.cancel();
    }

    public void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.f, subscription)) {
            this.f = subscription;
            this.d.m(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        this.d.onComplete();
    }

    public void onError(Throwable th) {
        this.e = null;
        this.d.onError(th);
    }
}

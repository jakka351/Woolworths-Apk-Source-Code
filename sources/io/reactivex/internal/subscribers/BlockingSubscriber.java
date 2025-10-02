package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
    public static final Object d = null;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (SubscriptionHelper.a(this)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.e(this, subscription)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }
}

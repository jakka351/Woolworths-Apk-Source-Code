package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
    public volatile SimpleQueue d;
    public volatile boolean e;
    public long f;
    public int g;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.e(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iL = queueSubscription.l(3);
                if (iL == 1) {
                    this.g = iL;
                    this.d = queueSubscription;
                    this.e = true;
                    throw null;
                }
                if (iL == 2) {
                    this.g = iL;
                    this.d = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.d = new SpscArrayQueue(0);
            subscription.request(0);
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
        if (this.g != 0) {
            throw null;
        }
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (this.g != 1) {
            long j2 = this.f + j;
            if (j2 < 0) {
                this.f = j2;
            } else {
                this.f = 0L;
                get().request(j2);
            }
        }
    }
}

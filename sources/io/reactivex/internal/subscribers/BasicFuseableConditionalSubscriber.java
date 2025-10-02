package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    public final ConditionalSubscriber d;
    public Subscription e;
    public QueueSubscription f;
    public boolean g;
    public int h;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
        this.d = conditionalSubscriber;
    }

    public final void a(Throwable th) {
        Exceptions.b(th);
        this.e.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.e.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int l(int i) {
        QueueSubscription queueSubscription = this.f;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iL = queueSubscription.l(i);
        if (iL == 0) {
            return iL;
        }
        this.h = iL;
        return iL;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.e, subscription)) {
            this.e = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f = (QueueSubscription) subscription;
            }
            this.d.m(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.g) {
            RxJavaPlugins.b(th);
        } else {
            this.g = true;
            this.d.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.e.request(j);
    }
}

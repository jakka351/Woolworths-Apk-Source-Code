package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
    public final Subscriber d;
    public Subscription e;
    public Object f;
    public long g;

    public SinglePostCompleteSubscriber(Subscriber subscriber) {
        this.d = subscriber;
    }

    public final void a(Object obj) {
        long j = this.g;
        if (j != 0) {
            BackpressureHelper.e(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                b(obj);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                Subscriber subscriber = this.d;
                subscriber.onNext(obj);
                subscriber.onComplete();
                return;
            }
            this.f = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f = null;
            }
        }
    }

    public void b(Object obj) {
    }

    public void cancel() {
        this.e.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.e, subscription)) {
            this.e = subscription;
            this.d.m(this);
        }
    }

    public void onSuccess(Object obj) {
        a(obj);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.f(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.f;
                        Subscriber subscriber = this.d;
                        subscriber.onNext(obj);
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.c(j2, j)));
            this.e.request(j);
        }
    }
}

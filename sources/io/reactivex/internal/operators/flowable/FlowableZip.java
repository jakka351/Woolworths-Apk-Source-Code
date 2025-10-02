package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Subscription {
        public volatile boolean d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.d) {
                return;
            }
            this.d = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(null, j);
                throw null;
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        public SimpleQueue d;
        public long e;
        public int f;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.f = iL;
                        this.d = queueSubscription;
                        throw null;
                    }
                    if (iL == 2) {
                        this.f = iL;
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
            if (this.f != 2) {
                this.d.offer(obj);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.f != 1) {
                long j2 = this.e + j;
                if (j2 < 0) {
                    this.e = j2;
                } else {
                    this.e = 0L;
                    get().request(j2);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Object obj = null;
        obj.getClass();
        throw null;
    }
}

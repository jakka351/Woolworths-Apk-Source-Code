package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@SchedulerSupport
@BackpressureSupport
/* loaded from: classes7.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    public volatile SimpleQueue e;

    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        public final Subscriber d;
        public final MulticastProcessor e;

        public MulticastSubscription(Subscriber subscriber, MulticastProcessor multicastProcessor) {
            this.d = subscriber;
            this.e = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.e.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.f(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
                this.e.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new MulticastSubscription(flowableSubscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.e(null, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iL = queueSubscription.l(3);
                if (iL == 1) {
                    this.e = queueSubscription;
                    throw null;
                }
                if (iL == 2) {
                    this.e = queueSubscription;
                    subscription.request(0);
                    return;
                }
            }
            this.e = new SpscArrayQueue(0);
            subscription.request(0);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        throw null;
    }
}

package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {

    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public Subscription d;
        public SimpleQueue e;
        public int f;

        public final class RailSubscription implements Subscription {
            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                throw null;
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
                if (SubscriptionHelper.f(j)) {
                    throw null;
                }
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f != 1) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.f = iL;
                        this.e = queueSubscription;
                        throw null;
                    }
                    if (iL == 2) {
                        this.f = iL;
                        this.e = queueSubscription;
                        throw null;
                    }
                }
                this.e = new SpscArrayQueue(0);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f != 0 || this.e.offer(obj)) {
                a();
            } else {
                this.d.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }
    }
}

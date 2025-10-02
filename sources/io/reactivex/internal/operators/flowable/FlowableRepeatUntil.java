package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final SubscriptionArbiter e;
        public final Publisher f;
        public long g;

        public RepeatSubscriber(Subscriber subscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.d = subscriber;
            this.e = subscriptionArbiter;
            this.f = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            this.e.e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.g++;
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        flowableSubscriber.m(subscriptionArbiter);
        RepeatSubscriber repeatSubscriber = new RepeatSubscriber(flowableSubscriber, subscriptionArbiter, this.e);
        if (repeatSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!repeatSubscriber.e.j) {
                long j = repeatSubscriber.g;
                if (j != 0) {
                    repeatSubscriber.g = 0L;
                    repeatSubscriber.e.d(j);
                }
                repeatSubscriber.f.e(repeatSubscriber);
                iAddAndGet = repeatSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}

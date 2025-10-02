package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final SubscriptionArbiter e;
        public final Publisher f;
        public int g;
        public long h;

        public RetryBiSubscriber(Subscriber subscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
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
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                this.g++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.d.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.h++;
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        flowableSubscriber.m(subscriptionArbiter);
        RetryBiSubscriber retryBiSubscriber = new RetryBiSubscriber(flowableSubscriber, subscriptionArbiter, this.e);
        if (retryBiSubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retryBiSubscriber.e.j) {
                long j = retryBiSubscriber.h;
                if (j != 0) {
                    retryBiSubscriber.h = 0L;
                    retryBiSubscriber.e.d(j);
                }
                retryBiSubscriber.f.e(retryBiSubscriber);
                iAddAndGet = retryBiSubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}

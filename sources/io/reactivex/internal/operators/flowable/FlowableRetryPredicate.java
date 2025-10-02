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
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final SubscriptionArbiter e;
        public final Publisher f;
        public long g = 0;
        public long h;

        public RetrySubscriber(Subscriber subscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
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
            long j = this.g;
            if (j != Long.MAX_VALUE) {
                this.g = j - 1;
            }
            Subscriber subscriber = this.d;
            if (j == 0) {
                subscriber.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                subscriber.onError(new CompositeException(th, th2));
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
        RetrySubscriber retrySubscriber = new RetrySubscriber(flowableSubscriber, subscriptionArbiter, this.e);
        if (retrySubscriber.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retrySubscriber.e.j) {
                long j = retrySubscriber.h;
                if (j != 0) {
                    retrySubscriber.h = 0L;
                    retrySubscriber.e.d(j);
                }
                retrySubscriber.f.e(retrySubscriber);
                iAddAndGet = retrySubscriber.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}

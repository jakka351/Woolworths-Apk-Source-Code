package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final SubscriptionArbiter e;
        public final Publisher f;
        public long g = -1;
        public long h;

        public RepeatSubscriber(Subscriber subscriber, SubscriptionArbiter subscriptionArbiter, Publisher publisher) {
            this.d = subscriber;
            this.e = subscriptionArbiter;
            this.f = publisher;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.e.j) {
                    long j = this.h;
                    if (j != 0) {
                        this.h = 0L;
                        this.e.d(j);
                    }
                    this.f.e(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            this.e.e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.g;
            if (j != Long.MAX_VALUE) {
                this.g = j - 1;
            }
            if (j != 0) {
                a();
            } else {
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
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
        new RepeatSubscriber(flowableSubscriber, subscriptionArbiter, this.e).a();
    }
}

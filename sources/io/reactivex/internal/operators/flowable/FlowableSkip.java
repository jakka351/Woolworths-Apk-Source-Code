package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public long e = 0;
        public Subscription f;

        public SkipSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                long j = this.e;
                this.f = subscription;
                this.d.m(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.e;
            if (j != 0) {
                this.e = j - 1;
            } else {
                this.d.onNext(obj);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SkipSubscriber(flowableSubscriber));
    }
}

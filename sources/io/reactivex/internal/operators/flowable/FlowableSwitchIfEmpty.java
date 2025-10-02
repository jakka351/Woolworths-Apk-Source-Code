package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final Publisher e;
        public boolean g = true;
        public final SubscriptionArbiter f = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(Subscriber subscriber, FlowableJust flowableJust) {
            this.d = subscriber;
            this.e = flowableJust;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            this.f.e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (!this.g) {
                this.d.onComplete();
            } else {
                this.g = false;
                this.e.e(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                this.g = false;
            }
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(flowableSubscriber, null);
        flowableSubscriber.m(switchIfEmptySubscriber.f);
        this.e.a(switchIfEmptySubscriber);
    }
}

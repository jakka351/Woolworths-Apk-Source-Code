package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        public Subscriber d;
        public Subscription e;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.e;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscriber subscriber = this.d;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscriber subscriber = this.d;
            EmptyComponent emptyComponent = EmptyComponent.d;
            this.e = emptyComponent;
            this.d = emptyComponent;
            subscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.e.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        DetachSubscriber detachSubscriber = new DetachSubscriber();
        detachSubscriber.d = flowableSubscriber;
        this.e.a(detachSubscriber);
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        public Subscription f;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f.cancel();
            this.f = SubscriptionHelper.d;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f = subscriptionHelper;
            Object obj = this.e;
            if (obj != null) {
                b(obj);
            } else {
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.b(th);
            } else {
                this.f = subscriptionHelper;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f == SubscriptionHelper.d) {
                return;
            }
            if (this.e == null) {
                this.e = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.f.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new ReduceSubscriber(flowableSubscriber));
    }
}

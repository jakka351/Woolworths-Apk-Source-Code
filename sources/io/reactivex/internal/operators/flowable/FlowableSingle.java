package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        public Subscription f;
        public boolean g;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f.cancel();
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
            if (this.g) {
                return;
            }
            this.g = true;
            Object obj = this.e;
            this.e = null;
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                this.d.onComplete();
            } else {
                b(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.e == null) {
                this.e = obj;
                return;
            }
            this.g = true;
            this.f.cancel();
            this.d.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SingleElementSubscriber(flowableSubscriber));
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Subscription e;

        public SubscriptionLambdaSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            Subscription subscription = this.e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.e = subscriptionHelper;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                subscription.cancel();
                this.e = SubscriptionHelper.d;
                EmptySubscription.b(th, this.d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e != SubscriptionHelper.d) {
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e != SubscriptionHelper.d) {
                this.d.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
                this.e.request(j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SubscriptionLambdaSubscriber(flowableSubscriber));
    }
}

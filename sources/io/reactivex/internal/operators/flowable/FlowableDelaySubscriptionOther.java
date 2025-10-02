package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final OtherSubscriber e = new OtherSubscriber();
        public final AtomicReference f = new AtomicReference();

        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void m(Subscription subscription) {
                if (SubscriptionHelper.e(this, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (get() != SubscriptionHelper.d) {
                    throw null;
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                if (get() != SubscriptionHelper.d) {
                    MainSubscriber.this.d.onError(th);
                } else {
                    RxJavaPlugins.b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                Subscription subscription = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
                if (subscription == subscriptionHelper) {
                    return;
                }
                lazySet(subscriptionHelper);
                subscription.cancel();
                throw null;
            }
        }

        public MainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.e);
            SubscriptionHelper.a(this.f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.c(this.f, this, subscription);
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
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                SubscriptionHelper.b(this.f, this, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new MainSubscriber(flowableSubscriber));
        throw null;
    }
}

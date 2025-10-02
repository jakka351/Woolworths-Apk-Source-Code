package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicLong e = new AtomicLong();
        public final AtomicReference f = new AtomicReference();
        public final OtherSubscriber h = new OtherSubscriber();
        public final AtomicThrowable g = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void m(Subscription subscription) {
                SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.a(takeUntilMainSubscriber.f);
                HalfSerializer.b(takeUntilMainSubscriber.d, takeUntilMainSubscriber, takeUntilMainSubscriber.g);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                SubscriptionHelper.a(takeUntilMainSubscriber.f);
                HalfSerializer.d(takeUntilMainSubscriber.d, th, takeUntilMainSubscriber, takeUntilMainSubscriber.g);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                onComplete();
            }
        }

        public TakeUntilMainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.f);
            SubscriptionHelper.a(this.h);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.c(this.f, this.e, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.a(this.h);
            HalfSerializer.b(this.d, this, this.g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.h);
            HalfSerializer.d(this.d, th, this, this.g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.f(this.d, obj, this, this.g);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.b(this.f, this.e, j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new TakeUntilMainSubscriber(flowableSubscriber));
        throw null;
    }
}

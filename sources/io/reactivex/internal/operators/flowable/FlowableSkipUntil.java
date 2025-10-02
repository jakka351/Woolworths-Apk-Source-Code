package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicReference e = new AtomicReference();
        public final AtomicLong f = new AtomicLong();
        public final OtherSubscriber g = new OtherSubscriber();
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;

        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // org.reactivestreams.Subscriber
            public final void m(Subscription subscription) {
                SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                SkipUntilMainSubscriber.this.i = true;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                SubscriptionHelper.a(skipUntilMainSubscriber.e);
                HalfSerializer.d(skipUntilMainSubscriber.d, th, skipUntilMainSubscriber, skipUntilMainSubscriber.h);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SkipUntilMainSubscriber.this.i = true;
                get().cancel();
            }
        }

        public SkipUntilMainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.e);
            SubscriptionHelper.a(this.g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.c(this.e, this.f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.a(this.g);
            HalfSerializer.b(this.d, this, this.h);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.g);
            HalfSerializer.d(this.d, th, this, this.h);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (q(obj)) {
                return;
            }
            ((Subscription) this.e.get()).request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            if (!this.i) {
                return false;
            }
            HalfSerializer.f(this.d, obj, this, this.h);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.b(this.e, this.f, j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new SkipUntilMainSubscriber(flowableSubscriber));
        throw null;
    }
}

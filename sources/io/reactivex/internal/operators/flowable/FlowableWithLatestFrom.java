package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {
        public final SerializedSubscriber d;
        public final AtomicReference e = new AtomicReference();
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference g = new AtomicReference();

        public WithLatestFromSubscriber(SerializedSubscriber serializedSubscriber) {
            this.d = serializedSubscriber;
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
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.g);
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            q(obj);
            ((Subscription) this.e.get()).request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            if (get() == null) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                this.d.onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.b(this.e, this.f, j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(flowableSubscriber);
        serializedSubscriber.m(new WithLatestFromSubscriber(serializedSubscriber));
        throw null;
    }
}

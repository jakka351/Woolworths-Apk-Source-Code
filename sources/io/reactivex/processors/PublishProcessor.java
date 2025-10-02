package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        public final Subscriber d;
        public final PublishProcessor e;

        public PublishSubscription(Subscriber subscriber, PublishProcessor publishProcessor) {
            this.d = subscriber;
            this.e = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.e.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.b(this, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new PublishSubscription(flowableSubscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}

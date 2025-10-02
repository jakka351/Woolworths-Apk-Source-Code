package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        public final AsyncProcessor f;

        public AsyncSubscription(Subscriber subscriber, AsyncProcessor asyncProcessor) {
            super(subscriber);
            this.f = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new AsyncSubscription(flowableSubscriber, this));
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

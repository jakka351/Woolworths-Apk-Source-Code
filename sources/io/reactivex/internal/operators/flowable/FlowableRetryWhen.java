package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;

/* loaded from: classes7.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            f(th);
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new UnicastProcessor(8, null);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.b(th, flowableSubscriber);
        }
    }
}

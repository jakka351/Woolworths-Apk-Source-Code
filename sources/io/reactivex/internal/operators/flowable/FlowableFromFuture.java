package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* loaded from: classes7.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(flowableSubscriber);
        flowableSubscriber.m(deferredScalarSubscription);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            if (deferredScalarSubscription.get() == 4) {
                return;
            }
            flowableSubscriber.onError(th);
        }
    }
}

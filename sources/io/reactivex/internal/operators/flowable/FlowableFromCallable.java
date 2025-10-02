package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(flowableSubscriber);
        flowableSubscriber.m(deferredScalarSubscription);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            if (deferredScalarSubscription.get() == 4) {
                RxJavaPlugins.b(th);
            } else {
                flowableSubscriber.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        throw null;
    }
}

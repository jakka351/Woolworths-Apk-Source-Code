package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;

/* loaded from: classes7.dex */
public final class FlowableEmpty extends Flowable<Object> implements ScalarCallable<Object> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        EmptySubscription.a(flowableSubscriber);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}

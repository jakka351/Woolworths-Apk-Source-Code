package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;

/* loaded from: classes7.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (FlowableScalarXMap.a(null, flowableSubscriber)) {
            return;
        }
        new FlowableFlatMap.MergeSubscriber(flowableSubscriber);
        throw null;
    }
}

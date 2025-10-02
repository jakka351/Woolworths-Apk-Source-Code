package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;

/* loaded from: classes7.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(flowableSubscriber);
        throw null;
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;

/* loaded from: classes7.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (!FlowableScalarXMap.a(null, flowableSubscriber)) {
            throw null;
        }
    }
}

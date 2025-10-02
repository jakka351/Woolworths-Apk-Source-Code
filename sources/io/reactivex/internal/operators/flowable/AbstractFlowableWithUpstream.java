package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;

/* loaded from: classes7.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {
    public final Flowable e;

    public AbstractFlowableWithUpstream(Flowable flowable) {
        ObjectHelper.b(flowable, "source is null");
        this.e = flowable;
    }
}

package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1", f = "flows.kt", l = {31}, m = "emit")
/* loaded from: classes4.dex */
public final class FlowsKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FlowsKt$collectWhile$collector$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$collectWhile$collector$1$emit$1(FlowsKt$collectWhile$collector$1 flowsKt$collectWhile$collector$1, Continuation continuation) {
        super(continuation);
        this.q = flowsKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.emit(null, this);
        return Unit.f24250a;
    }
}

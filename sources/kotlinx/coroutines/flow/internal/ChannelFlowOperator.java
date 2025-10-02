package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    public final Flow g;

    public ChannelFlowOperator(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        super(coroutineContext, i, bufferOverflow);
        this.g = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.e
            r1 = -3
            if (r0 != r1) goto L5f
            kotlin.coroutines.CoroutineContext r0 = r6.getH()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.coroutines.a r2 = new kotlin.coroutines.a
            r3 = 1
            r2.<init>(r3)
            kotlin.coroutines.CoroutineContext r3 = r4.d
            java.lang.Object r1 = r3.fold(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L24
            kotlin.coroutines.CoroutineContext r1 = r0.plus(r3)
            goto L29
        L24:
            r1 = 0
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.a(r0, r3, r1)
        L29:
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r1, r0)
            if (r2 == 0) goto L38
            java.lang.Object r5 = r4.l(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r5 != r6) goto L68
            return r5
        L38:
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key.d
            kotlin.coroutines.CoroutineContext$Element r3 = r1.get(r2)
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r3, r0)
            if (r0 == 0) goto L5f
            kotlin.coroutines.CoroutineContext r0 = r6.getH()
            kotlinx.coroutines.flow.FlowCollector r5 = kotlinx.coroutines.flow.internal.ChannelFlowKt.a(r5, r0)
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r5 = kotlinx.coroutines.flow.internal.ChannelFlowKt.c(r1, r5, r0, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r5 != r6) goto L68
            return r5
        L5f:
            java.lang.Object r5 = super.collect(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r5 != r6) goto L68
            return r5
        L68:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowOperator.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object h(ProducerScope producerScope, Continuation continuation) {
        Object objL = l(new SendingCollector(producerScope), continuation);
        return objL == CoroutineSingletons.d ? objL : Unit.f24250a;
    }

    public abstract Object l(FlowCollector flowCollector, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return this.g + " -> " + super.toString();
    }
}

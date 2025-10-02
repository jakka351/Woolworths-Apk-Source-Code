package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperatorImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public ChannelFlowOperatorImpl(Flow flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? EmptyCoroutineContext.d : coroutineContext, (i2 & 8) != 0 ? BufferOverflow.d : bufferOverflow, flow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow i(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(i, coroutineContext, bufferOverflow, this.g);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow j() {
        return this.g;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object l(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.g.collect(flowCollector, continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}

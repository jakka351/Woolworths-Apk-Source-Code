package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    public final Iterable g;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable) {
        this(iterable, EmptyCoroutineContext.d, -2, BufferOverflow.d);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object h(ProducerScope producerScope, Continuation continuation) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator<T> it = this.g.iterator();
        while (it.hasNext()) {
            BuildersKt.c(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((Flow) it.next(), sendingCollector, null), 3);
        }
        return Unit.f24250a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow i(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.g, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel k(CoroutineScope coroutineScope) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        return ProduceKt.b(coroutineScope, this.d, this.e, BufferOverflow.d, CoroutineStart.d, channelFlow$collectToFun$1);
    }

    public ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.g = iterable;
    }
}

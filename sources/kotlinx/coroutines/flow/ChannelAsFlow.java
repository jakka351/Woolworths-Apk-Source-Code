package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final ReceiveChannel g;
    public final boolean h;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z) {
        this(receiveChannel, z, EmptyCoroutineContext.d, -3, BufferOverflow.d);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String c() {
        return "channel=" + this.g;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.e == -3) {
            boolean z = this.h;
            if (z && i.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objA = FlowKt__ChannelsKt.a(flowCollector, this.g, z, continuation);
            if (objA == CoroutineSingletons.d) {
                return objA;
            }
        } else {
            Object objCollect = super.collect(flowCollector, continuation);
            if (objCollect == CoroutineSingletons.d) {
                return objCollect;
            }
        }
        return Unit.f24250a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object h(ProducerScope producerScope, Continuation continuation) {
        Object objA = FlowKt__ChannelsKt.a(new SendingCollector(producerScope), this.g, this.h, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow i(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.g, this.h, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow j() {
        return new ChannelAsFlow(this.g, this.h);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel k(CoroutineScope coroutineScope) {
        if (this.h && i.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.e == -3 ? this.g : super.k(coroutineScope);
    }

    public ChannelAsFlow(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.g = receiveChannel;
        this.h = z;
    }
}

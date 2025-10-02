package ovh.plrapps.mapcompose.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$collectTiles$2", f = "TileCollector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCollector$collectTiles$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ TileCollector q;
    public final /* synthetic */ ReceiveChannel r;
    public final /* synthetic */ SendChannel s;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$collectTiles$2(TileCollector tileCollector, ReceiveChannel receiveChannel, SendChannel sendChannel, List list, Continuation continuation) {
        super(2, continuation);
        this.q = tileCollector;
        this.r = receiveChannel;
        this.s = sendChannel;
        this.t = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TileCollector$collectTiles$2 tileCollector$collectTiles$2 = new TileCollector$collectTiles$2(this.q, this.r, this.s, this.t, continuation);
        tileCollector$collectTiles$2.p = obj;
        return tileCollector$collectTiles$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCollector$collectTiles$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        int i = 0;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 6, null);
        BufferedChannel bufferedChannelA2 = ChannelKt.a(1, 6, null);
        TileCollector tileCollector = this.q;
        int i2 = tileCollector.f26936a;
        while (i < i2) {
            BufferedChannel bufferedChannel = bufferedChannelA2;
            BuildersKt.c(coroutineScope, tileCollector.f, null, new TileCollector$worker$1(this.t, tileCollector, bufferedChannelA, bufferedChannel, this.s, null), 2);
            i++;
            bufferedChannelA2 = bufferedChannel;
        }
        return BuildersKt.c(coroutineScope, Dispatchers.f24691a, null, new TileCollector$tileCollectorKernel$1(bufferedChannelA2, this.r, tileCollector, bufferedChannelA, null), 2);
    }
}

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
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lovh/plrapps/mapcompose/core/TileSpec;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$tileCollectorKernel$1$1$2", f = "TileCollector.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCollector$tileCollectorKernel$1$1$2 extends SuspendLambda implements Function2<TileSpec, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ List r;
    public final /* synthetic */ TileCollector s;
    public final /* synthetic */ BufferedChannel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$tileCollectorKernel$1$1$2(List list, TileCollector tileCollector, BufferedChannel bufferedChannel, Continuation continuation) {
        super(2, continuation);
        this.r = list;
        this.s = tileCollector;
        this.t = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TileCollector$tileCollectorKernel$1$1$2 tileCollector$tileCollectorKernel$1$1$2 = new TileCollector$tileCollectorKernel$1$1$2(this.r, this.s, this.t, continuation);
        tileCollector$tileCollectorKernel$1$1$2.q = obj;
        return tileCollector$tileCollectorKernel$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCollector$tileCollectorKernel$1$1$2) create((TileSpec) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            TileSpec tileSpec = (TileSpec) this.q;
            if (!this.r.contains(tileSpec)) {
                this.r.add(tileSpec);
                this.s.d = false;
                BufferedChannel bufferedChannel = this.t;
                this.p = 1;
                if (bufferedChannel.z(tileSpec, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}

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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lovh/plrapps/mapcompose/core/TileSpec;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$tileCollectorKernel$1$1$1", f = "TileCollector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCollector$tileCollectorKernel$1$1$1 extends SuspendLambda implements Function2<TileSpec, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ List q;
    public final /* synthetic */ TileCollector r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$tileCollectorKernel$1$1$1(List list, TileCollector tileCollector, Continuation continuation) {
        super(2, continuation);
        this.q = list;
        this.r = tileCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TileCollector$tileCollectorKernel$1$1$1 tileCollector$tileCollectorKernel$1$1$1 = new TileCollector$tileCollectorKernel$1$1$1(this.q, this.r, continuation);
        tileCollector$tileCollectorKernel$1$1$1.p = obj;
        return tileCollector$tileCollectorKernel$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TileCollector$tileCollectorKernel$1$1$1 tileCollector$tileCollectorKernel$1$1$1 = (TileCollector$tileCollectorKernel$1$1$1) create((TileSpec) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        tileCollector$tileCollectorKernel$1$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.q.remove((TileSpec) this.p);
        this.r.d = this.q.isEmpty();
        return Unit.f24250a;
    }
}

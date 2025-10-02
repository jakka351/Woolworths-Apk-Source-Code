package ovh.plrapps.mapcompose.ui.state;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$forgetTiles$2", f = "TileCanvasState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCanvasState$forgetTiles$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TileCanvasState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$forgetTiles$2(TileCanvasState tileCanvasState, Continuation continuation) {
        super(2, continuation);
        this.p = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCanvasState$forgetTiles$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TileCanvasState$forgetTiles$2 tileCanvasState$forgetTiles$2 = (TileCanvasState$forgetTiles$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        tileCanvasState$forgetTiles$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TileCanvasState tileCanvasState = this.p;
        tileCanvasState.i.setValue(null);
        tileCanvasState.o.clear();
        return Unit.f24250a;
    }
}

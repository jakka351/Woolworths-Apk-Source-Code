package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.ui.state.TileCanvasState;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$renderTask$1", f = "TileCanvasState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCanvasState$renderTask$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ TileCanvasState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$renderTask$1(TileCanvasState tileCanvasState, Continuation continuation) {
        super(1, continuation);
        this.p = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TileCanvasState$renderTask$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TileCanvasState$renderTask$1 tileCanvasState$renderTask$1 = (TileCanvasState$renderTask$1) create((Continuation) obj);
        Unit unit = Unit.f24250a;
        tileCanvasState$renderTask$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TileCanvasState tileCanvasState = this.p;
        TileCanvasState.VisibleState visibleState = (TileCanvasState.VisibleState) tileCanvasState.i.getValue();
        Unit unit = Unit.f24250a;
        if (visibleState == null) {
            return unit;
        }
        VisibleTiles visibleTiles = visibleState.f26958a;
        ArrayList arrayList = visibleState.b;
        ArrayList arrayList2 = visibleState.c;
        tileCanvasState.c(visibleTiles, arrayList, arrayList2, false);
        ((SnapshotMutableStateImpl) tileCanvasState.c).setValue(CollectionsKt.u0(new TileCanvasState$renderTiles$$inlined$sortedBy$1(visibleTiles, arrayList, arrayList2), tileCanvasState.o));
        return unit;
    }
}

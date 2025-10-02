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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.ui.state.TileCanvasState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$idleDebounced$1", f = "TileCanvasState.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class TileCanvasState$idleDebounced$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TileCanvasState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$idleDebounced$1(TileCanvasState tileCanvasState, Continuation continuation) {
        super(2, continuation);
        this.p = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCanvasState$idleDebounced$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TileCanvasState$idleDebounced$1 tileCanvasState$idleDebounced$1 = (TileCanvasState$idleDebounced$1) create((Unit) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        tileCanvasState$idleDebounced$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TileCanvasState tileCanvasState = this.p;
        TileCanvasState.VisibleState visibleState = (TileCanvasState.VisibleState) tileCanvasState.i.getValue();
        if (visibleState != null) {
            VisibleTiles visibleTiles = visibleState.f26958a;
            ArrayList arrayList = visibleState.b;
            ArrayList arrayList2 = visibleState.c;
            tileCanvasState.c(visibleTiles, arrayList, arrayList2, true);
            ((SnapshotMutableStateImpl) tileCanvasState.c).setValue(CollectionsKt.u0(new TileCanvasState$renderTiles$$inlined$sortedBy$1(visibleTiles, arrayList, arrayList2), tileCanvasState.o));
        }
        return Unit.f24250a;
    }
}

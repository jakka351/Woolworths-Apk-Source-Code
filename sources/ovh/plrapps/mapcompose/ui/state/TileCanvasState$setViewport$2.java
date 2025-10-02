package ovh.plrapps.mapcompose.ui.state;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import ovh.plrapps.mapcompose.core.Layer;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.ui.state.TileCanvasState;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$2", f = "TileCanvasState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCanvasState$setViewport$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TileCanvasState p;
    public final /* synthetic */ VisibleTiles q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$setViewport$2(TileCanvasState tileCanvasState, VisibleTiles visibleTiles, Continuation continuation) {
        super(2, continuation);
        this.p = tileCanvasState;
        this.q = visibleTiles;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TileCanvasState$setViewport$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TileCanvasState$setViewport$2 tileCanvasState$setViewport$2 = (TileCanvasState$setViewport$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        tileCanvasState$setViewport$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TileCanvasState tileCanvasState = this.p;
        MutableStateFlow mutableStateFlow = tileCanvasState.e;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((Layer) it.next()).getClass();
            arrayList.add(null);
        }
        Iterable iterable2 = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            ((Layer) it2.next()).getClass();
            arrayList2.add(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        }
        tileCanvasState.i.setValue(new TileCanvasState.VisibleState(this.q, arrayList, arrayList2));
        BufferedChannel bufferedChannel = tileCanvasState.n;
        Unit unit = Unit.f24250a;
        bufferedChannel.k(unit);
        return unit;
    }
}

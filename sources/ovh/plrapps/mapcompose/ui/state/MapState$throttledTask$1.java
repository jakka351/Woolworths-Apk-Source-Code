package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import ovh.plrapps.mapcompose.core.Viewport;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.MapState$throttledTask$1", f = "MapState.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MapState$throttledTask$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MapState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapState$throttledTask$1(MapState mapState, Continuation continuation) {
        super(1, continuation);
        this.q = mapState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapState$throttledTask$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MapState$throttledTask$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        this.p = 1;
        MapState mapState = this.q;
        int i2 = mapState.j;
        Viewport viewport = mapState.i;
        ZoomPanRotateState zoomPanRotateState = mapState.b;
        viewport.f26938a = ((int) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f()) - i2;
        viewport.b = ((int) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f()) - i2;
        int i3 = i2 * 2;
        viewport.c = viewport.f26938a + ((int) (zoomPanRotateState.t() >> 32)) + i3;
        viewport.d = viewport.b + ((int) (zoomPanRotateState.t() & 4294967295L)) + i3;
        viewport.e = ((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).a() * 0.017453292f;
        Object objF = mapState.g.f(viewport, this);
        if (objF != coroutineSingletons) {
            objF = unit;
        }
        return objF == coroutineSingletons ? coroutineSingletons : unit;
    }
}

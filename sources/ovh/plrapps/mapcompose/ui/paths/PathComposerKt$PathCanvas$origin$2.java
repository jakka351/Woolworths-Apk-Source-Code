package ovh.plrapps.mapcompose.ui.paths;

import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/ui/unit/IntOffset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.paths.PathComposerKt$PathCanvas$origin$2", f = "PathComposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PathComposerKt$PathCanvas$origin$2 extends SuspendLambda implements Function2<ProduceStateScope<IntOffset>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ZoomPanRotateState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathComposerKt$PathCanvas$origin$2(ZoomPanRotateState zoomPanRotateState, Continuation continuation) {
        super(2, continuation);
        this.q = zoomPanRotateState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PathComposerKt$PathCanvas$origin$2 pathComposerKt$PathCanvas$origin$2 = new PathComposerKt$PathCanvas$origin$2(this.q, continuation);
        pathComposerKt$PathCanvas$origin$2.p = obj;
        return pathComposerKt$PathCanvas$origin$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PathComposerKt$PathCanvas$origin$2 pathComposerKt$PathCanvas$origin$2 = (PathComposerKt$PathCanvas$origin$2) create((ProduceStateScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        pathComposerKt$PathCanvas$origin$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProduceStateScope produceStateScope = (ProduceStateScope) this.p;
        ZoomPanRotateState zoomPanRotateState = this.q;
        double dF = ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).f();
        int i = (int) (((IntOffset) produceStateScope.getD()).f2200a >> 32);
        int i2 = (int) (((IntOffset) produceStateScope.getD()).f2200a & 4294967295L);
        double d = 65536;
        int iCeil = (int) ((Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f() / d) * d) / dF);
        int iCeil2 = (int) ((Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f() / d) * d) / dF);
        if (Math.abs(iCeil - i) * dF > 65536.0d || Math.abs(iCeil2 - i2) * dF > 65536.0d) {
            produceStateScope.setValue(new IntOffset(IntOffsetKt.a(iCeil, iCeil2)));
        }
        return Unit.f24250a;
    }
}

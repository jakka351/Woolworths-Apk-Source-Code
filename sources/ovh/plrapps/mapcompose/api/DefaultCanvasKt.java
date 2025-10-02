package ovh.plrapps.mapcompose.api;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultCanvasKt {
    public static final void a(final Modifier modifier, final MapState mapState, final Function1 drawBlock, Composer composer, final int i) {
        Intrinsics.h(modifier, "modifier");
        Intrinsics.h(drawBlock, "drawBlock");
        ComposerImpl composerImplV = composer.v(-1464436302);
        CanvasKt.a(modifier, new Function1<DrawScope, Unit>() { // from class: ovh.plrapps.mapcompose.api.DefaultCanvasKt$DefaultCanvas$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                MapState mapState2 = mapState;
                ZoomPanRotateState zoomPanRotateState = mapState2.b;
                Function1 function1 = drawBlock;
                CanvasDrawScope$drawContext$1 e = Canvas.getE();
                long jD = e.d();
                e.a().save();
                try {
                    CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = e.f1798a;
                    MutexImpl mutexImpl = LayoutApiKt.f26931a;
                    double dF = ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f();
                    ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f();
                    ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f();
                    canvasDrawScopeKt$asDrawTransform$1.f(-((float) dF), -((float) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f()));
                    canvasDrawScopeKt$asDrawTransform$1.d(OffsetKt.a((float) (((SnapshotMutableDoubleStateImpl) zoomPanRotateState.r).f() * ((int) (LayoutApiKt.b(mapState2) >> 32)) * LayoutApiKt.c(mapState2)), (float) (((float) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.s).f()) * ((int) (LayoutApiKt.b(mapState2) & 4294967295L)) * LayoutApiKt.c(mapState2))), ((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).a());
                    float fC = (float) LayoutApiKt.c(mapState2);
                    canvasDrawScopeKt$asDrawTransform$1.e(0L, fC, fC);
                    function1.invoke(Canvas);
                    b.C(e, jD);
                    return Unit.f24250a;
                } catch (Throwable th) {
                    b.C(e, jD);
                    throw th;
                }
            }
        }, composerImplV, i & 14);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: ovh.plrapps.mapcompose.api.DefaultCanvasKt$DefaultCanvas$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    DefaultCanvasKt.a(modifier, mapState, drawBlock, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}

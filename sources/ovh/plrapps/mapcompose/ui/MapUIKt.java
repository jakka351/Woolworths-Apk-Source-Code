package ovh.plrapps.mapcompose.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ovh.plrapps.mapcompose.core.ColorFilterProvider;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;
import ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt;
import ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt;
import ovh.plrapps.mapcompose.ui.paths.PathComposerKt;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.PathState;
import ovh.plrapps.mapcompose.ui.state.TileCanvasState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerRenderState;
import ovh.plrapps.mapcompose.ui.view.TileCanvasKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapUIKt {
    public static final void a(final Modifier modifier, final MapState mapState, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1881966959);
        final ZoomPanRotateState zoomPanRotateState = mapState.b;
        final MarkerRenderState markerRenderState = mapState.c;
        final PathState pathState = mapState.e;
        composerImplV.J(2007186829, mapState);
        ZoomPanRotateKt.a(BackgroundKt.b(ClipKt.b(modifier), ((Color) ((SnapshotMutableStateImpl) mapState.l).getD()).f1766a, RectangleShapeKt.f1779a), zoomPanRotateState, zoomPanRotateState, ComposableLambdaKt.c(1603808211, new Function2<Composer, Integer, Unit>() { // from class: ovh.plrapps.mapcompose.ui.MapUIKt$MapUI$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    MapState mapState2 = mapState;
                    VisibleTilesResolver visibleTilesResolver = mapState2.f;
                    TileCanvasState tileCanvasState = mapState2.g;
                    TileCanvasKt.a(zoomPanRotateState, visibleTilesResolver, ((SnapshotMutableIntStateImpl) mapState2.k).d(), tileCanvasState.j, (ColorFilterProvider) ((SnapshotMutableStateImpl) tileCanvasState.k).getD(), (List) ((SnapshotMutableStateImpl) tileCanvasState.c).getD(), (Function0) ((SnapshotMutableStateImpl) mapState2.m).getD(), composer2, 2097734);
                    MarkerComposerKt.a(ZIndexModifierKt.a(Modifier.Companion.d, 1.0f), zoomPanRotateState, markerRenderState, mapState2, composer2, 4678);
                    PathComposerKt.b(zoomPanRotateState, pathState, composer2, 582);
                    composableLambdaImpl.invoke(composer2, 0);
                }
                return Unit.f24250a;
            }
        }, composerImplV), composerImplV, 3648);
        composerImplV.V(false);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(mapState, composableLambdaImpl, i) { // from class: ovh.plrapps.mapcompose.ui.MapUIKt$MapUI$2
                public final /* synthetic */ MapState i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(449);
                    MapUIKt.a(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}

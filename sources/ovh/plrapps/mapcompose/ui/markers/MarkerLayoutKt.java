package ovh.plrapps.mapcompose.ui.markers;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "origin", "mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerLayoutKt {
    public static final void a(final Modifier modifier, final ZoomPanRotateState zoomPRState, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        Intrinsics.h(modifier, "modifier");
        Intrinsics.h(zoomPRState, "zoomPRState");
        ComposerImpl composerImplV = composer.v(-505790457);
        composerImplV.o(-1374512145);
        Object objG = composerImplV.G();
        if (objG == Composer.Companion.f1624a) {
            objG = SnapshotStateKt.d(new Function0<IntOffset>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerLayoutKt$MarkerLayout$origin$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ZoomPanRotateState zoomPanRotateState = zoomPRState;
                    double d = 65536;
                    return new IntOffset(IntOffsetKt.a((int) (Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f() / d) * d), (int) (Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f() / d) * d)));
                }
            });
            composerImplV.A(objG);
        }
        final State state = (State) objG;
        composerImplV.V(false);
        final Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
        Modifier modifierX0 = BackgroundKt.b(GraphicsLayerModifierKt.a(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerLayoutKt$MarkerLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                ZoomPanRotateState zoomPanRotateState = zoomPRState;
                double d = -((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f();
                State state2 = state;
                graphicsLayer.m((float) (d + ((int) (((IntOffset) state2.getD()).f2200a >> 32))));
                graphicsLayer.c((float) ((-((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f()) + ((int) (((IntOffset) state2.getD()).f2200a & 4294967295L))));
                return Unit.f24250a;
            }
        }), Color.j, RectangleShapeKt.f1779a).x0(SizeKt.c);
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerLayoutKt$MarkerLayout$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult c(MeasureScope Layout, final List measurables, long j) {
                Intrinsics.h(Layout, "$this$Layout");
                Intrinsics.h(measurables, "measurables");
                final long jA = Constraints.a(j, 0, 0, 0, 0, 10);
                int iH = Constraints.h(j);
                int iG = Constraints.g(j);
                final ZoomPanRotateState zoomPanRotateState = zoomPRState;
                final State state2 = state;
                final Density density2 = density;
                return Layout.L0(iH, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerLayoutKt$MarkerLayout$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                        Intrinsics.h(layout, "$this$layout");
                        for (Measurable measurable : measurables) {
                            Object objA = LayoutIdKt.a(measurable);
                            MarkerData markerData = objA instanceof MarkerData ? (MarkerData) objA : null;
                            if (markerData != null) {
                                MutableState mutableState = markerData.g;
                                MutableFloatState mutableFloatState = markerData.o;
                                MutableDoubleState mutableDoubleState = markerData.e;
                                MutableDoubleState mutableDoubleState2 = markerData.d;
                                androidx.compose.ui.layout.Placeable placeableC0 = measurable.c0(jA);
                                markerData.q = placeableC0.i0();
                                markerData.r = placeableC0.h0();
                                float fE = Offset.e(markerData.b()) * placeableC0.i0();
                                float fA = DpOffset.a(((DpOffset) ((SnapshotMutableStateImpl) mutableState).getD()).f2198a);
                                Density density3 = density2;
                                float fT1 = density3.T1(fA) + fE;
                                float fT12 = density3.T1(DpOffset.b(((DpOffset) ((SnapshotMutableStateImpl) mutableState).getD()).f2198a)) + (Offset.f(markerData.b()) * placeableC0.h0());
                                ZoomPanRotateState zoomPanRotateState2 = zoomPanRotateState;
                                MutableFloatState mutableFloatState2 = zoomPanRotateState2.m;
                                int i2 = zoomPanRotateState2.b;
                                int i3 = zoomPanRotateState2.f26960a;
                                MutableDoubleState mutableDoubleState3 = zoomPanRotateState2.l;
                                float fA2 = ((SnapshotMutableFloatStateImpl) mutableFloatState2).a();
                                State state3 = state2;
                                if (fA2 == BitmapDescriptorFactory.HUE_RED) {
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) mutableDoubleState3;
                                    double dF = (snapshotMutableDoubleStateImpl.f() * ((SnapshotMutableDoubleStateImpl) mutableDoubleState2).f() * i3) + fT1;
                                    double dF2 = (snapshotMutableDoubleStateImpl.f() * ((SnapshotMutableDoubleStateImpl) mutableDoubleState).f() * i2) + fT12;
                                    markerData.s = Double.valueOf(dF);
                                    markerData.t = Double.valueOf(dF2);
                                    layout.e(placeableC0, (int) (dF - ((int) (((IntOffset) state3.getD()).f2200a >> 32))), (int) (dF2 - ((int) (((IntOffset) state3.getD()).f2200a & 4294967295L))), ((SnapshotMutableFloatStateImpl) mutableFloatState).a());
                                } else {
                                    float fA3 = ((SnapshotMutableFloatStateImpl) zoomPanRotateState2.m).a() * 0.017453292f;
                                    double d = i3;
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl2 = (SnapshotMutableDoubleStateImpl) mutableDoubleState3;
                                    double dF3 = ((SnapshotMutableDoubleStateImpl) mutableDoubleState2).f() * d * snapshotMutableDoubleStateImpl2.f();
                                    double d2 = i2;
                                    double dF4 = ((SnapshotMutableDoubleStateImpl) mutableDoubleState).f() * d2 * snapshotMutableDoubleStateImpl2.f();
                                    double dF5 = ((SnapshotMutableDoubleStateImpl) zoomPanRotateState2.r).f() * d * snapshotMutableDoubleStateImpl2.f();
                                    double dF6 = snapshotMutableDoubleStateImpl2.f() * ((SnapshotMutableDoubleStateImpl) zoomPanRotateState2.s).f() * d2;
                                    double dA = RotationUtilsKt.a(dF3, dF4, dF5, dF6, fA3) + fT1;
                                    double dB = RotationUtilsKt.b(dF3, dF4, dF5, dF6, fA3) + fT12;
                                    markerData.s = Double.valueOf(dA);
                                    markerData.t = Double.valueOf(dB);
                                    layout.e(placeableC0, (int) (dA - ((int) (((IntOffset) state3.getD()).f2200a >> 32))), (int) (dB - ((int) (((IntOffset) state3.getD()).f2200a & 4294967295L))), ((SnapshotMutableFloatStateImpl) mutableFloatState).a());
                                }
                            }
                        }
                        return Unit.f24250a;
                    }
                });
            }
        };
        int i2 = composerImplV.P;
        PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
        Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
        ComposeUiNode.e3.getClass();
        Function0 function0 = ComposeUiNode.Companion.b;
        composerImplV.i();
        if (composerImplV.O) {
            composerImplV.K(function0);
        } else {
            composerImplV.e();
        }
        Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
        Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
            b.B(i2, composerImplV, i2, function2);
        }
        Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
        composableLambdaImpl.invoke(composerImplV, 6);
        composerImplV.V(true);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(zoomPRState, composableLambdaImpl, i) { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerLayoutKt$MarkerLayout$3
                public final /* synthetic */ ZoomPanRotateState i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(455);
                    MarkerLayoutKt.a(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}

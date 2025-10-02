package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    default int A0(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator nodeCoordinator = getD().k;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate v = nodeCoordinator.getV();
        Intrinsics.e(v);
        return v.C0() ? NodeMeasuringIntrinsics.c(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j) {
                return this.f1874a.s0(approachIntrinsicsMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.b0(i);
    }

    default int B0(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator nodeCoordinator = getD().k;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate v = nodeCoordinator.getV();
        Intrinsics.e(v);
        return v.C0() ? NodeMeasuringIntrinsics.a(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j) {
                return this.f1873a.s0(approachIntrinsicsMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.J(i);
    }

    default int F0(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator nodeCoordinator = getD().k;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate v = nodeCoordinator.getV();
        Intrinsics.e(v);
        return v.C0() ? NodeMeasuringIntrinsics.e(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j) {
                return this.f1875a.s0(approachIntrinsicsMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.T(i);
    }

    default boolean e2(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    default MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }

    MeasureResult s0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j);

    default int s1(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator nodeCoordinator = getD().k;
        Intrinsics.e(nodeCoordinator);
        LookaheadDelegate v = nodeCoordinator.getV();
        Intrinsics.e(v);
        return v.C0() ? NodeMeasuringIntrinsics.g(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j) {
                return this.f1876a.s0(approachIntrinsicsMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.a0(i);
    }

    boolean w1(long j);
}

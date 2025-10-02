package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.modifier.SingleLocalMap;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {
    public final ValueInsets r;
    public long s;
    public final SingleLocalMap t;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.r = valueInsets;
        this.s = 0L;
        this.t = ModifierLocalModifierNodeKt.a(new Pair(WindowInsetsPaddingKt.f986a, valueInsets));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.T(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.J(i);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        long jC = IntOffsetKt.c(nodeCoordinator.G(0L));
        boolean zB = IntOffset.b(this.s, jC);
        this.s = jC;
        if (zB) {
            return;
        }
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
        layoutNodeG.l0(false);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap f0() {
        return this.t;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, final Measurable measurable, long j) {
        if (Constraints.f(j) && Constraints.e(j)) {
            final int iH = Constraints.h(j);
            final int iG = Constraints.g(j);
            return measureScope.L0(iH, iG, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WindowInsets windowInsets;
                    Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                    LayoutCoordinates layoutCoordinatesB = placementScope.b();
                    RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode = this.h;
                    if (layoutCoordinatesB != null) {
                        recalculateWindowInsetsModifierNode.s = IntOffsetKt.c(layoutCoordinatesB.G(0L));
                    }
                    if (layoutCoordinatesB == null) {
                        windowInsets = (WindowInsets) recalculateWindowInsetsModifierNode.u(WindowInsetsPaddingKt.f986a);
                    } else {
                        long jG = layoutCoordinatesB.G(0L);
                        long jA = layoutCoordinatesB.a();
                        long jG2 = layoutCoordinatesB.G((Float.floatToRawIntBits((int) (jA & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jA >> 32)) << 32));
                        long jA2 = LayoutCoordinatesKt.c(layoutCoordinatesB).a();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jG >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jG & 4294967295L)));
                        int iRound3 = ((int) (jA2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jG2 >> 32)));
                        int iRound4 = ((int) (jA2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jG2 & 4294967295L)));
                        ValueInsets valueInsets = recalculateWindowInsetsModifierNode.r;
                        InsetsValues insetsValuesE = valueInsets.e();
                        if (insetsValuesE.f967a != iRound || insetsValuesE.b != iRound2 || insetsValuesE.c != iRound3 || insetsValuesE.d != iRound4) {
                            valueInsets.f(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        windowInsets = valueInsets;
                    }
                    recalculateWindowInsetsModifierNode.I1(WindowInsetsPaddingKt.f986a, windowInsets);
                    placementScope.e(measurable.c0(Constraints.Companion.c(iH, iG)), 0, 0, BitmapDescriptorFactory.HUE_RED);
                    return Unit.f24250a;
                }
            });
        }
        ProvidableModifierLocal providableModifierLocal = WindowInsetsPaddingKt.f986a;
        I1(providableModifierLocal, u(providableModifierLocal));
        final Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.a0(i);
    }
}

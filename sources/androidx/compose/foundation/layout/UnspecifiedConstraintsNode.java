package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    public float r;
    public float s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iT = intrinsicMeasurable.T(i);
        int iR1 = !Float.isNaN(this.s) ? lookaheadCapablePlaceable.r1(this.s) : 0;
        return iT < iR1 ? iR1 : iT;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iB0 = intrinsicMeasurable.b0(i);
        int iR1 = !Float.isNaN(this.r) ? lookaheadCapablePlaceable.r1(this.r) : 0;
        return iB0 < iR1 ? iR1 : iB0;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iJ = intrinsicMeasurable.J(i);
        int iR1 = !Float.isNaN(this.s) ? lookaheadCapablePlaceable.r1(this.s) : 0;
        return iJ < iR1 ? iR1 : iJ;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.r) || Constraints.j(j) != 0) {
            iJ = Constraints.j(j);
        } else {
            int iR1 = measureScope.r1(this.r);
            iJ = Constraints.h(j);
            if (iR1 < 0) {
                iR1 = 0;
            }
            if (iR1 <= iJ) {
                iJ = iR1;
            }
        }
        int iH = Constraints.h(j);
        if (Float.isNaN(this.s) || Constraints.i(j) != 0) {
            i = Constraints.i(j);
        } else {
            int iR12 = measureScope.r1(this.s);
            i = Constraints.g(j);
            int i2 = iR12 >= 0 ? iR12 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.a(iJ, iH, i, Constraints.g(j)));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeableC0, 0, 0);
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iA0 = intrinsicMeasurable.a0(i);
        int iR1 = !Float.isNaN(this.r) ? lookaheadCapablePlaceable.r1(this.r) : 0;
        return iA0 < iR1 ? iR1 : iA0;
    }
}

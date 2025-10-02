package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    public int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.T(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.b0(i);
    }

    public int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.J(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        long jS2 = s2(measurable, j);
        if (getS()) {
            jS2 = ConstraintsKt.e(j, jS2);
        }
        final Placeable placeableC0 = measurable.c0(jS2);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                LayoutDirection c = placementScope.getC();
                LayoutDirection layoutDirection = LayoutDirection.d;
                Placeable placeable = placeableC0;
                if (c == layoutDirection || placementScope.getB() == 0) {
                    Placeable.PlacementScope.a(placementScope, placeable);
                    placeable.s0(IntOffset.d(0L, placeable.h), BitmapDescriptorFactory.HUE_RED, null);
                } else {
                    long b = ((placementScope.getB() - placeable.d) - r1) << 32;
                    Placeable.PlacementScope.a(placementScope, placeable);
                    placeable.s0(IntOffset.d((((int) 0) & 4294967295L) | b, placeable.h), BitmapDescriptorFactory.HUE_RED, null);
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.a0(i);
    }

    public abstract long s2(Measurable measurable, long j);

    /* renamed from: t2 */
    public abstract boolean getS();
}

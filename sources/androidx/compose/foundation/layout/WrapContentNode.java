package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    public Direction r;
    public boolean s;
    public Lambda t;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        Direction direction = this.r;
        Direction direction2 = Direction.d;
        int iJ = direction != direction2 ? 0 : Constraints.j(j);
        Direction direction3 = this.r;
        Direction direction4 = Direction.e;
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.a(iJ, (this.r == direction2 || !this.s) ? Constraints.h(j) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.i(j) : 0, (this.r == direction4 || !this.s) ? Constraints.g(j) : Integer.MAX_VALUE));
        final int iC = RangesKt.c(placeableC0.d, Constraints.j(j), Constraints.h(j));
        final int iC2 = RangesKt.c(placeableC0.e, Constraints.i(j), Constraints.g(j));
        return measureScope.L0(iC, iC2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ?? r0 = this.h.t;
                Placeable.PlacementScope.g((Placeable.PlacementScope) obj, placeableC0, ((IntOffset) r0.invoke(new IntSize(((iC - r1.d) << 32) | ((iC2 - r1.e) & 4294967295L)), measureScope.getD())).f2200a);
                return Unit.f24250a;
            }
        });
    }
}

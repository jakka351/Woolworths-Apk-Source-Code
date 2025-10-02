package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    public Direction r;
    public float s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!Constraints.d(j) || this.r == Direction.d) {
            iJ = Constraints.j(j);
            iH = Constraints.h(j);
        } else {
            int iRound = Math.round(Constraints.h(j) * this.s);
            int iJ2 = Constraints.j(j);
            iJ = Constraints.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!Constraints.c(j) || this.r == Direction.e) {
            int i = Constraints.i(j);
            iG = Constraints.g(j);
            iG2 = i;
        } else {
            int iRound2 = Math.round(Constraints.g(j) * this.s);
            int i2 = Constraints.i(j);
            iG2 = Constraints.g(j);
            if (iRound2 < i2) {
                iRound2 = i2;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.a(iJ, iH, iG2, iG));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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
}

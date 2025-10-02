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
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    public float r;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.r) : intrinsicMeasurable.T(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.r) : intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.r) : intrinsicMeasurable.J(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        long jT2 = t2(j, true);
        if (IntSize.b(jT2, 0L)) {
            jT2 = s2(j, true);
            if (IntSize.b(jT2, 0L)) {
                jT2 = v2(j, true);
                if (IntSize.b(jT2, 0L)) {
                    jT2 = u2(j, true);
                    if (IntSize.b(jT2, 0L)) {
                        jT2 = t2(j, false);
                        if (IntSize.b(jT2, 0L)) {
                            jT2 = s2(j, false);
                            if (IntSize.b(jT2, 0L)) {
                                jT2 = v2(j, false);
                                if (IntSize.b(jT2, 0L)) {
                                    jT2 = u2(j, false);
                                    if (IntSize.b(jT2, 0L)) {
                                        jT2 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!IntSize.b(jT2, 0L)) {
            j = Constraints.Companion.c((int) (jT2 >> 32), (int) (jT2 & 4294967295L));
        }
        final Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        return i != Integer.MAX_VALUE ? Math.round(i * this.r) : intrinsicMeasurable.a0(i);
    }

    public final long s2(long j, boolean z) {
        int iRound;
        int iG = Constraints.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.r)) <= 0) {
            return 0L;
        }
        if (!z || AspectRatioKt.b(iRound, iG, j)) {
            return (iRound << 32) | (iG & 4294967295L);
        }
        return 0L;
    }

    public final long t2(long j, boolean z) {
        int iRound;
        int iH = Constraints.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.r)) <= 0) {
            return 0L;
        }
        if (!z || AspectRatioKt.b(iH, iRound, j)) {
            return (iH << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    public final long u2(long j, boolean z) {
        int i = Constraints.i(j);
        int iRound = Math.round(i * this.r);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || AspectRatioKt.b(iRound, i, j)) {
            return (iRound << 32) | (i & 4294967295L);
        }
        return 0L;
    }

    public final long v2(long j, boolean z) {
        int iJ = Constraints.j(j);
        int iRound = Math.round(iJ / this.r);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || AspectRatioKt.b(iJ, iRound, j)) {
            return (iJ << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }
}

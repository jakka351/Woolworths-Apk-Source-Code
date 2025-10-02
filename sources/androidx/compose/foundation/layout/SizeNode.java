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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jS2 = s2(lookaheadCapablePlaceable);
        if (Constraints.e(jS2)) {
            return Constraints.g(jS2);
        }
        if (!this.v) {
            i = ConstraintsKt.g(i, jS2);
        }
        return ConstraintsKt.f(intrinsicMeasurable.T(i), jS2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jS2 = s2(lookaheadCapablePlaceable);
        if (Constraints.f(jS2)) {
            return Constraints.h(jS2);
        }
        if (!this.v) {
            i = ConstraintsKt.f(i, jS2);
        }
        return ConstraintsKt.g(intrinsicMeasurable.b0(i), jS2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jS2 = s2(lookaheadCapablePlaceable);
        if (Constraints.e(jS2)) {
            return Constraints.g(jS2);
        }
        if (!this.v) {
            i = ConstraintsKt.g(i, jS2);
        }
        return ConstraintsKt.f(intrinsicMeasurable.J(i), jS2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jS2 = s2(measureScope);
        if (this.v) {
            jA = ConstraintsKt.e(j, jS2);
        } else {
            if (Float.isNaN(this.r)) {
                iJ = Constraints.j(j);
                int iH2 = Constraints.h(jS2);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = Constraints.j(jS2);
            }
            if (Float.isNaN(this.t)) {
                iH = Constraints.h(j);
                int iJ2 = Constraints.j(jS2);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = Constraints.h(jS2);
            }
            if (Float.isNaN(this.s)) {
                i = Constraints.i(j);
                int iG2 = Constraints.g(jS2);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = Constraints.i(jS2);
            }
            if (Float.isNaN(this.u)) {
                iG = Constraints.g(j);
                int i2 = Constraints.i(jS2);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = Constraints.g(jS2);
            }
            jA = ConstraintsKt.a(iJ, iH, i, iG);
        }
        final Placeable placeableC0 = measurable.c0(jA);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long jS2 = s2(lookaheadCapablePlaceable);
        if (Constraints.f(jS2)) {
            return Constraints.h(jS2);
        }
        if (!this.v) {
            i = ConstraintsKt.f(i, jS2);
        }
        return ConstraintsKt.g(intrinsicMeasurable.a0(i), jS2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long s2(androidx.compose.ui.layout.MeasureScope r7) {
        /*
            r6 = this;
            float r0 = r6.t
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.t
            int r0 = r7.r1(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.u
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.u
            int r3 = r7.r1(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.r
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.r
            int r4 = r7.r1(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.s
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.s
            int r7 = r7.r1(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.s2(androidx.compose.ui.layout.MeasureScope):long");
    }
}

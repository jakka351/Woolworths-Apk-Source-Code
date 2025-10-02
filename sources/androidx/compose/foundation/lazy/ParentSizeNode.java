package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    public float r;
    public State s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult n(androidx.compose.ui.layout.MeasureScope r5, androidx.compose.ui.layout.Measurable r6, long r7) {
        /*
            r4 = this;
            androidx.compose.runtime.State r0 = r4.s
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L23
            androidx.compose.runtime.MutableIntState r0 = (androidx.compose.runtime.MutableIntState) r0
            java.lang.Integer r2 = r0.getD()
            int r2 = r2.intValue()
            if (r2 == r1) goto L23
            java.lang.Integer r0 = r0.getD()
            float r0 = r0.floatValue()
            float r2 = r4.r
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == r1) goto L28
            r2 = r0
            goto L2c
        L28:
            int r2 = androidx.compose.ui.unit.Constraints.j(r7)
        L2c:
            int r3 = androidx.compose.ui.unit.Constraints.i(r7)
            if (r0 == r1) goto L33
            goto L37
        L33:
            int r0 = androidx.compose.ui.unit.Constraints.h(r7)
        L37:
            int r7 = androidx.compose.ui.unit.Constraints.g(r7)
            long r7 = androidx.compose.ui.unit.ConstraintsKt.a(r2, r0, r3, r7)
            androidx.compose.ui.layout.Placeable r6 = r6.c0(r7)
            int r7 = r6.d
            int r8 = r6.e
            androidx.compose.foundation.lazy.ParentSizeNode$measure$1 r0 = new androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            r0.<init>()
            java.util.Map r6 = kotlin.collections.MapsKt.d()
            androidx.compose.ui.layout.MeasureResult r5 = r5.L0(r7, r8, r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.ParentSizeNode.n(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }
}

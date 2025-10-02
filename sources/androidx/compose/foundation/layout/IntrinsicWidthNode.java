package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    public IntrinsicSize r;
    public boolean s;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.r == IntrinsicSize.d ? intrinsicMeasurable.a0(i) : intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.r == IntrinsicSize.d ? intrinsicMeasurable.a0(i) : intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long s2(Measurable measurable, long j) {
        int iA0 = this.r == IntrinsicSize.d ? measurable.a0(Constraints.g(j)) : measurable.b0(Constraints.g(j));
        if (iA0 < 0) {
            iA0 = 0;
        }
        return Constraints.Companion.e(iA0);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: t2, reason: from getter */
    public final boolean getS() {
        return this.s;
    }
}

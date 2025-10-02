package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutModifierNode extends DelegatableNode {
    default int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.f(new LayoutModifierNode$minIntrinsicHeight$1(this), lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    default int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.d(new LayoutModifierNode$maxIntrinsicWidth$1(this), lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    default int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.b(new LayoutModifierNode$maxIntrinsicHeight$1(this), lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    MeasureResult n(MeasureScope measureScope, Measurable measurable, long j);

    default int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return NodeMeasuringIntrinsics.h(new LayoutModifierNode$minIntrinsicWidth$1(this), lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }
}

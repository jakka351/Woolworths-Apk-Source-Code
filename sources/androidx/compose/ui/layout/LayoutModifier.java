package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.c(this, lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    default int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.b(this, lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    default int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.a(this, lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }

    MeasureResult n(MeasureScope measureScope, Measurable measurable, long j);

    default int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.d(this, lookaheadCapablePlaceable, intrinsicMeasurable, i);
    }
}

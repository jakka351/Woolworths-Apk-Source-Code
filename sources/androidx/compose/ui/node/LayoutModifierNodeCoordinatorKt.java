package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinatorKt {
    public static final int a(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableA0 = lookaheadCapablePlaceable.A0();
        if (lookaheadCapablePlaceableA0 == null) {
            InlineClassHelperKt.b("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.D0().getC().containsKey(alignmentLine)) {
            Integer num = (Integer) lookaheadCapablePlaceable.D0().getC().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iD0 = lookaheadCapablePlaceableA0.d0(alignmentLine);
            if (iD0 != Integer.MIN_VALUE) {
                lookaheadCapablePlaceableA0.j = true;
                lookaheadCapablePlaceable.k = true;
                lookaheadCapablePlaceable.O0();
                lookaheadCapablePlaceableA0.j = false;
                lookaheadCapablePlaceable.k = false;
                return iD0 + ((int) (alignmentLine instanceof HorizontalAlignmentLine ? lookaheadCapablePlaceableA0.getC() & 4294967295L : lookaheadCapablePlaceableA0.getC() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }
}

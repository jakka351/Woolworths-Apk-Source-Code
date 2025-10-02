package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LookaheadAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j) {
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        long j2 = w.q;
        return Offset.h((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L), j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map c(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.D0().getF1028a();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate w = nodeCoordinator.getV();
        Intrinsics.e(w);
        return w.d0(alignmentLine);
    }
}

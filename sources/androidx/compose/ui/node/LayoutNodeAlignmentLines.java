package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.Map;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j) {
        OwnedLayer ownedLayer = nodeCoordinator.L;
        if (ownedLayer != null) {
            j = ownedLayer.e(j, false);
        }
        return IntOffsetKt.b(j, nodeCoordinator.C);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map c(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.D0().getF1094a();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.d0(alignmentLine);
    }
}

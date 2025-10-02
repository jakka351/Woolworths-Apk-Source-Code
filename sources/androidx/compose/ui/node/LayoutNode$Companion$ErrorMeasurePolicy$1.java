package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/LayoutNode$Companion$ErrorMeasurePolicy$1", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNode$Companion$ErrorMeasurePolicy$1 extends LayoutNode.NoIntrinsicsMeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        throw new IllegalStateException("Undefined measure and it is required");
    }
}

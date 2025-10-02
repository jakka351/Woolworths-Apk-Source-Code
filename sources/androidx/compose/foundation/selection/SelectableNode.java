package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/selection/SelectableNode;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectableNode extends ClickableNode {
    public boolean K;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void v2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.s(semanticsPropertyReceiver, this.K);
    }
}

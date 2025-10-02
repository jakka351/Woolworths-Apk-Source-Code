package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TailModifierNode extends Modifier.Node {
    public boolean r;

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.r = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.r = false;
    }

    public final String toString() {
        return "<tail>";
    }
}

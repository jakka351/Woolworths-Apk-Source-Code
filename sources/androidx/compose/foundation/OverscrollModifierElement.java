package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/OverscrollModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OverscrollModifierElement extends ModifierNodeElement<OverscrollModifierNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        OverscrollModifierNode overscrollModifierNode = new OverscrollModifierNode();
        overscrollModifierNode.t = null;
        return overscrollModifierNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OverscrollModifierNode overscrollModifierNode = (OverscrollModifierNode) node;
        DelegatableNode delegatableNode = overscrollModifierNode.t;
        if (delegatableNode != null) {
            overscrollModifierNode.t2(delegatableNode);
        }
        overscrollModifierNode.t = null;
        overscrollModifierNode.t = null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OverscrollModifierElement);
    }

    public final int hashCode() {
        return 0;
    }
}

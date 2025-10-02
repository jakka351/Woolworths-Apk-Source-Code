package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ReceiveContentNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ReceiveContentNode) node).getClass();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ReceiveContentElement);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=null)";
    }
}

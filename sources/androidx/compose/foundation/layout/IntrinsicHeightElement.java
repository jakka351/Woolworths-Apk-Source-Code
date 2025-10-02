package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    public final IntrinsicSize d;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, Function1 function1) {
        this.d = intrinsicSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        IntrinsicHeightNode intrinsicHeightNode = new IntrinsicHeightNode();
        intrinsicHeightNode.r = this.d;
        intrinsicHeightNode.s = true;
        return intrinsicHeightNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IntrinsicHeightNode intrinsicHeightNode = (IntrinsicHeightNode) node;
        intrinsicHeightNode.r = this.d;
        intrinsicHeightNode.s = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.d == intrinsicHeightElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.d.hashCode() * 31);
    }
}

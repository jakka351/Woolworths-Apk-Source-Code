package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {
    public final IntrinsicSize d;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, Function1 function1) {
        this.d = intrinsicSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        IntrinsicWidthNode intrinsicWidthNode = new IntrinsicWidthNode();
        intrinsicWidthNode.r = this.d;
        intrinsicWidthNode.s = true;
        return intrinsicWidthNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IntrinsicWidthNode intrinsicWidthNode = (IntrinsicWidthNode) node;
        intrinsicWidthNode.r = this.d;
        intrinsicWidthNode.s = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.d == intrinsicWidthElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.d.hashCode() * 31);
    }
}

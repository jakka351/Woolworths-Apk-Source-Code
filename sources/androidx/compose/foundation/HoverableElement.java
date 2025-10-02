package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/HoverableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {
    public final MutableInteractionSource d;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.d = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        HoverableNode hoverableNode = new HoverableNode();
        hoverableNode.r = this.d;
        return hoverableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        HoverableNode hoverableNode = (HoverableNode) node;
        MutableInteractionSource mutableInteractionSource = hoverableNode.r;
        MutableInteractionSource mutableInteractionSource2 = this.d;
        if (Intrinsics.c(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        hoverableNode.u2();
        hoverableNode.r = mutableInteractionSource2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.c(((HoverableElement) obj).d, this.d);
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }
}

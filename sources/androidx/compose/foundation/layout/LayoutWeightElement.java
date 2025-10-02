package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {
    public final float d;
    public final boolean e;

    public LayoutWeightElement(float f, boolean z) {
        this.d = f;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        LayoutWeightNode layoutWeightNode = new LayoutWeightNode();
        layoutWeightNode.r = this.d;
        layoutWeightNode.s = this.e;
        return layoutWeightNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LayoutWeightNode layoutWeightNode = (LayoutWeightNode) node;
        layoutWeightNode.r = this.d;
        layoutWeightNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.d == layoutWeightElement.d && this.e == layoutWeightElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }
}

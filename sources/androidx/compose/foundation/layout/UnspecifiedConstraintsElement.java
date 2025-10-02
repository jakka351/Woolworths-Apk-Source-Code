package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    public final float d;
    public final float e;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        UnspecifiedConstraintsNode unspecifiedConstraintsNode = new UnspecifiedConstraintsNode();
        unspecifiedConstraintsNode.r = this.d;
        unspecifiedConstraintsNode.s = this.e;
        return unspecifiedConstraintsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        UnspecifiedConstraintsNode unspecifiedConstraintsNode = (UnspecifiedConstraintsNode) node;
        unspecifiedConstraintsNode.r = this.d;
        unspecifiedConstraintsNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.a(this.d, unspecifiedConstraintsElement.d) && Dp.a(this.e, unspecifiedConstraintsElement.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }
}

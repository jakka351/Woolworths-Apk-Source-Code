package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {
    public final Function1 d;
    public final Function1 e;

    public OffsetPxElement(Function1 function1, Function1 function12) {
        this.d = function1;
        this.e = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        OffsetPxNode offsetPxNode = new OffsetPxNode();
        offsetPxNode.r = this.d;
        offsetPxNode.s = true;
        return offsetPxNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OffsetPxNode offsetPxNode = (OffsetPxNode) node;
        Function1 function1 = offsetPxNode.r;
        Function1 function12 = this.d;
        if (function1 != function12 || !offsetPxNode.s) {
            LayoutNode layoutNodeG = DelegatableNodeKt.g(offsetPxNode);
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            layoutNodeG.l0(false);
        }
        offsetPxNode.r = function12;
        offsetPxNode.s = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.d == offsetPxElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.d + ", rtlAware=true)";
    }
}

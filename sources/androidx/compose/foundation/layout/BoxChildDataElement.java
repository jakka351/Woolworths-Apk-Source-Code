package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {
    public final Alignment d;
    public final boolean e;

    public BoxChildDataElement(Alignment alignment, boolean z, Function1 function1) {
        this.d = alignment;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        BoxChildDataNode boxChildDataNode = new BoxChildDataNode();
        boxChildDataNode.r = this.d;
        boxChildDataNode.s = this.e;
        return boxChildDataNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BoxChildDataNode boxChildDataNode = (BoxChildDataNode) node;
        boxChildDataNode.r = this.d;
        boxChildDataNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.c(this.d, boxChildDataElement.d) && this.e == boxChildDataElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}

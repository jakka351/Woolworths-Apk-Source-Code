package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new LegacyDragAndDropSourceNode(null, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LegacyDragAndDropSourceNode legacyDragAndDropSourceNode = (LegacyDragAndDropSourceNode) node;
        legacyDragAndDropSourceNode.getClass();
        legacyDragAndDropSourceNode.u = null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LegacyDragAndDropSourceElement);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=null, dragAndDropSourceHandler=null)";
    }
}

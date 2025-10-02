package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FocusTargetNodeKt {
    public static final void a(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator nodeCoordinator = focusTargetNode.d.k;
        if (nodeCoordinator == null || (layoutNode = nodeCoordinator.p) == null || (owner = layoutNode.s) == null) {
            return;
        }
        owner.getFocusOwner();
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.h(focusTargetNode).getFocusOwner().n(focusTargetNode);
    }
}

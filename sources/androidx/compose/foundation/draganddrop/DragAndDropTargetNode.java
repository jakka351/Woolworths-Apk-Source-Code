package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DragAndDropTargetNode extends DelegatingNode {
    public DragAndDropTargetModifierNode t;

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        DragAndDropNode dragAndDropNodeA = DragAndDropNodeKt.a(new DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(1), null);
        s2(dragAndDropNodeA);
        this.t = dragAndDropNodeA;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.t;
        Intrinsics.e(dragAndDropTargetModifierNode);
        t2(dragAndDropTargetModifierNode);
    }
}

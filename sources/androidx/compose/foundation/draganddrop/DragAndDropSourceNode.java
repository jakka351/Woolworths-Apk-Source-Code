package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public Function1 t;
    public final DragAndDropSourceModifierNode u;
    public PointerInputModifierNode v;

    public DragAndDropSourceNode(Function1 function1) {
        this.t = function1;
        DragAndDropNode dragAndDropNode = new DragAndDropNode(new DragAndDropSourceNode$dragAndDropModifierNode$1(2), null, 2);
        s2(dragAndDropNode);
        this.u = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        this.u.G(j);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        if (this.u.k1()) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new DragAndDropSourceNode$onAttach$1());
            s2(suspendingPointerInputModifierNodeImplA);
            this.v = suspendingPointerInputModifierNodeImplA;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        PointerInputModifierNode pointerInputModifierNode = this.v;
        if (pointerInputModifierNode != null) {
            t2(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void q(LayoutCoordinates layoutCoordinates) {
        this.u.q(layoutCoordinates);
    }
}

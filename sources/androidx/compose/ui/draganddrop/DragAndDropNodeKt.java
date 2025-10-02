package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DragAndDropNodeKt {
    public static final DragAndDropNode a(final Function1 function1, final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new Function1<DragAndDropEvent, DragAndDropTarget>(function1, dragAndDropTarget) { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropTargetModifierNode$1
            public final /* synthetic */ Lambda h;
            public final /* synthetic */ DragAndDropTarget i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.h = (Lambda) function1;
                this.i = dragAndDropTarget;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                if (((Boolean) this.h.invoke((DragAndDropEvent) obj)).booleanValue()) {
                    return this.i;
                }
                return null;
            }
        }, 1);
    }

    public static final boolean b(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.d.q) {
            return false;
        }
        InnerNodeCoordinator innerNodeCoordinator = DelegatableNodeKt.g(dragAndDropNode).K.b;
        if (!innerNodeCoordinator.U.q) {
            return false;
        }
        long jG = innerNodeCoordinator.G(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
        long j2 = dragAndDropNode.w;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static final void c(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.p1(dragAndDropEvent);
        dragAndDropTarget.V0(dragAndDropEvent);
    }

    public static final void d(TraversableNode traversableNode, Function1 function1) {
        if (function1.invoke(traversableNode) != TraversableNode.Companion.TraverseDescendantsAction.d) {
            return;
        }
        TraversableNodeKt.c(traversableNode, function1);
    }
}

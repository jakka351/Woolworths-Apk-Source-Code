package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    public final Function2 r;
    public final Function1 s;
    public final Object t;
    public DragAndDropNode u;
    public DragAndDropTarget v;
    public long w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "DragAndDropTraversableKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DragAndDropTraversableKey {

            /* renamed from: a, reason: collision with root package name */
            public static final DragAndDropTraversableKey f1740a = new DragAndDropTraversableKey();
        }
    }

    public DragAndDropNode(Function2 function2, Function1 function1, int i) {
        function2 = (i & 1) != 0 ? null : function2;
        function1 = (i & 2) != 0 ? null : function1;
        this.r = function2;
        this.s = function1;
        this.t = Companion.DragAndDropTraversableKey.f1740a;
        this.w = 0L;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        this.w = j;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void R0(final DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.d(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DragAndDropNode dragAndDropNode = (DragAndDropNode) obj;
                if (!dragAndDropNode.d.q) {
                    return TraversableNode.Companion.TraverseDescendantsAction.e;
                }
                DragAndDropTarget dragAndDropTarget = dragAndDropNode.v;
                if (dragAndDropTarget != null) {
                    dragAndDropTarget.R0(dragAndDropEvent);
                }
                dragAndDropNode.v = null;
                dragAndDropNode.u = null;
                return TraversableNode.Companion.TraverseDescendantsAction.d;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void T(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.v;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.T(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.u;
        if (dragAndDropNode != null) {
            dragAndDropNode.T(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void V0(final DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.u;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.b(dragAndDropNode2, DragAndDrop_androidKt.a(dragAndDropEvent))) {
            if (this.d.q) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.c(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TraversableNode traversableNode2 = (TraversableNode) obj;
                        DragAndDropNode dragAndDropNode3 = (DragAndDropNode) traversableNode2;
                        if (!DelegatableNodeKt.h(this).getDragAndDropManager().b(dragAndDropNode3) || !DragAndDropNodeKt.b(dragAndDropNode3, DragAndDrop_androidKt.a(dragAndDropEvent))) {
                            return TraversableNode.Companion.TraverseDescendantsAction.d;
                        }
                        objectRef.d = traversableNode2;
                        return TraversableNode.Companion.TraverseDescendantsAction.f;
                    }
                });
                traversableNode = (TraversableNode) objectRef.d;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.c(dragAndDropNode, dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.v;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.a0(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.v;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.c(dragAndDropTarget2, dragAndDropEvent);
            }
            dragAndDropNode2.a0(dragAndDropEvent);
        } else if (!Intrinsics.c(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.c(dragAndDropNode, dragAndDropEvent);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.a0(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.V0(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.v;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.V0(dragAndDropEvent);
            }
        }
        this.u = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0, reason: from getter */
    public final Object getT() {
        return this.t;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void a0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.v;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.a0(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.u;
        if (dragAndDropNode != null) {
            dragAndDropNode.a0(dragAndDropEvent);
        }
        this.u = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public final boolean k1() {
        DelegatableNodeKt.h(this).getDragAndDropManager().getClass();
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.v = null;
        this.u = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void p1(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.v;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.p1(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.u;
        if (dragAndDropNode != null) {
            dragAndDropNode.p1(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public final void s(long j) {
        if (this.r == null) {
            InlineClassHelperKt.b("Check failed.");
        }
        DelegatableNodeKt.h(this).getDragAndDropManager().a(this, j);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final boolean u0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.u;
        if (dragAndDropNode != null) {
            return dragAndDropNode.u0(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.v;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.u0(dragAndDropEvent);
        }
        return false;
    }
}

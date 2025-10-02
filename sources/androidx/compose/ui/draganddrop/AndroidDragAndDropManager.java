package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {

    /* renamed from: a, reason: collision with root package name */
    public final Function3 f1736a;
    public final DragAndDropNode b = new DragAndDropNode(null, null, 3);
    public final ArraySet c = new ArraySet(0);
    public final AndroidDragAndDropManager$modifier$1 d = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            return this.d.b;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.d.b.hashCode();
        }
    };

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public AndroidDragAndDropManager(Function3 function3) {
        this.f1736a = function3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1] */
    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public final void a(DragAndDropNode dragAndDropNode, final long j) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ?? r5 = new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.ui.draganddrop.DragAndDropStartTransferScope
            public final boolean a(DragAndDropTransferData dragAndDropTransferData, long j2, Function1 function1) {
                boolean zBooleanValue = ((Boolean) this.f1736a.invoke(dragAndDropTransferData, new Size(j2), function1)).booleanValue();
                Ref.BooleanRef booleanRef2 = booleanRef;
                booleanRef2.d = zBooleanValue;
                return booleanRef2.d;
            }
        };
        final AndroidDragAndDropManager$requestDragAndDropTransfer$1$1 androidDragAndDropManager$requestDragAndDropTransfer$1$1 = new AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(booleanRef);
        final InnerNodeCoordinator innerNodeCoordinator = DelegatableNodeKt.g(dragAndDropNode).K.b;
        DragAndDropNodeKt.d(dragAndDropNode, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DragAndDropNode dragAndDropNode2 = (DragAndDropNode) obj;
                if (!dragAndDropNode2.q) {
                    return TraversableNode.Companion.TraverseDescendantsAction.e;
                }
                Function2 function2 = dragAndDropNode2.r;
                if (function2 == null) {
                    return TraversableNode.Companion.TraverseDescendantsAction.d;
                }
                long j2 = j;
                boolean zC = Offset.c(j2, 9205357640488583168L);
                AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1 androidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1 = r5;
                if (zC) {
                    function2.invoke(androidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1, new Offset(9205357640488583168L));
                } else {
                    long jC1 = DelegatableNodeKt.g(dragAndDropNode2).K.b.C1(innerNodeCoordinator, j2, true);
                    if (!RectKt.a(0L, IntSizeKt.d(dragAndDropNode2.w)).a(jC1)) {
                        return TraversableNode.Companion.TraverseDescendantsAction.d;
                    }
                    function2.invoke(androidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1, new Offset(jC1));
                }
                return ((Boolean) ((AndroidDragAndDropManager$requestDragAndDropTransfer$1$1) androidDragAndDropManager$requestDragAndDropTransfer$1$1).invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.f : TraversableNode.Companion.TraverseDescendantsAction.d;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public final boolean b(DragAndDropNode dragAndDropNode) {
        return this.c.contains(dragAndDropNode);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public final void c(DragAndDropNode dragAndDropNode) {
        this.c.add(dragAndDropNode);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        int action = dragEvent.getAction();
        ArraySet arraySet = this.c;
        final DragAndDropNode dragAndDropNode = this.b;
        switch (action) {
            case 1:
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                DragAndDropNodeKt.d(dragAndDropNode, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DragAndDropNode dragAndDropNode2 = (DragAndDropNode) obj;
                        if (!dragAndDropNode2.q) {
                            return TraversableNode.Companion.TraverseDescendantsAction.e;
                        }
                        if (dragAndDropNode2.v != null) {
                            InlineClassHelperKt.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        Function1 function1 = dragAndDropNode2.s;
                        DragAndDropTarget dragAndDropTarget = function1 != null ? (DragAndDropTarget) function1.invoke(dragAndDropEvent) : null;
                        dragAndDropNode2.v = dragAndDropTarget;
                        boolean z = dragAndDropTarget != null;
                        if (z) {
                            DelegatableNodeKt.h(dragAndDropNode).getDragAndDropManager().c(dragAndDropNode2);
                        }
                        Ref.BooleanRef booleanRef2 = booleanRef;
                        booleanRef2.d = booleanRef2.d || z;
                        return TraversableNode.Companion.TraverseDescendantsAction.d;
                    }
                });
                boolean z = booleanRef.d;
                Iterator it = arraySet.iterator();
                while (true) {
                    IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                    if (!indexBasedArrayIterator.hasNext()) {
                        break;
                    } else {
                        ((DragAndDropTarget) indexBasedArrayIterator.next()).T(dragAndDropEvent);
                    }
                }
            case 2:
                dragAndDropNode.V0(dragAndDropEvent);
                break;
            case 4:
                dragAndDropNode.R0(dragAndDropEvent);
                arraySet.clear();
                break;
            case 5:
                dragAndDropNode.p1(dragAndDropEvent);
                break;
            case 6:
                dragAndDropNode.a0(dragAndDropEvent);
                break;
        }
        return false;
    }
}

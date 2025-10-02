package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final void a(MutableVector mutableVector, Modifier.Node node) {
        MutableVector mutableVectorN = g(node).N();
        int i = mutableVectorN.f - 1;
        Object[] objArr = mutableVectorN.d;
        if (i < objArr.length) {
            while (i >= 0) {
                mutableVector.c(((LayoutNode) objArr[i]).K.e);
                i--;
            }
        }
    }

    public static final Modifier.Node b(MutableVector mutableVector) {
        int i;
        if (mutableVector == null || (i = mutableVector.f) == 0) {
            return null;
        }
        return (Modifier.Node) mutableVector.l(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode c(Modifier.Node node) {
        if ((node.f & 2) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node node2 = ((DelegatingNode) node).s;
                while (node2 != 0) {
                    if (node2 instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) node2;
                    }
                    node2 = (!(node2 instanceof DelegatingNode) || (node2.f & 2) == 0) ? node2.i : ((DelegatingNode) node2).s;
                }
            }
        }
        return null;
    }

    public static final void d(DelegatableNode delegatableNode) {
        LayoutNode layoutNodeG = g(delegatableNode);
        if (layoutNodeG.y) {
            return;
        }
        LayoutNodeKt.a(layoutNodeG).d(layoutNodeG);
    }

    public static final NodeCoordinator e(DelegatableNode delegatableNode, int i) {
        NodeCoordinator nodeCoordinator = delegatableNode.getD().k;
        Intrinsics.e(nodeCoordinator);
        if (nodeCoordinator.j1() != delegatableNode || !NodeKindKt.g(i)) {
            return nodeCoordinator;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.s;
        Intrinsics.e(nodeCoordinator2);
        return nodeCoordinator2;
    }

    public static final NodeCoordinator f(DelegatableNode delegatableNode) {
        if (!delegatableNode.getD().q) {
            InlineClassHelperKt.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        NodeCoordinator nodeCoordinatorE = e(delegatableNode, 2);
        if (!nodeCoordinatorE.j1().q) {
            InlineClassHelperKt.b("LayoutCoordinates is not attached.");
        }
        return nodeCoordinatorE;
    }

    public static final LayoutNode g(DelegatableNode delegatableNode) {
        NodeCoordinator nodeCoordinator = delegatableNode.getD().k;
        if (nodeCoordinator != null) {
            return nodeCoordinator.p;
        }
        throw b.w("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner h(DelegatableNode delegatableNode) {
        Owner owner = g(delegatableNode).s;
        if (owner != null) {
            return owner;
        }
        throw b.w("This node does not have an owner.");
    }
}

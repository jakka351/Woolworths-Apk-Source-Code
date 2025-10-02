package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeChain {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f1926a;
    public final InnerNodeCoordinator b;
    public NodeCoordinator c;
    public final TailModifierNode d;
    public Modifier.Node e;
    public MutableVector f;
    public MutableVector g;
    public Differ h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public final class Differ implements DiffCallback {

        /* renamed from: a, reason: collision with root package name */
        public Modifier.Node f1927a;
        public int b;
        public MutableVector c;
        public MutableVector d;
        public boolean e;

        public Differ(Modifier.Node node, int i, MutableVector mutableVector, MutableVector mutableVector2, boolean z) {
            this.f1927a = node;
            this.b = i;
            this.c = mutableVector;
            this.d = mutableVector2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            MutableVector mutableVector = this.c;
            int i3 = this.b;
            Modifier.Element element = (Modifier.Element) mutableVector.d[i + i3];
            Modifier.Element element2 = (Modifier.Element) this.d.d[i3 + i2];
            NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f1928a;
            return Intrinsics.c(element, element2) || element.getClass() == element2.getClass();
        }

        public final void b(MutableVector mutableVector) {
            this.d = mutableVector;
        }

        public final void c(MutableVector mutableVector) {
            this.c = mutableVector;
        }

        public final void d(Modifier.Node node) {
            this.f1927a = node;
        }

        public final void e(int i) {
            this.b = i;
        }

        public final void f(boolean z) {
            this.e = z;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Logger {
    }

    public NodeChain(LayoutNode layoutNode) {
        this.f1926a = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.b = innerNodeCoordinator;
        this.c = innerNodeCoordinator;
        TailModifierNode tailModifierNode = innerNodeCoordinator.U;
        this.d = tailModifierNode;
        this.e = tailModifierNode;
    }

    public static final void a(NodeChain nodeChain, Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node node2 = node.h; node2 != null; node2 = node2.h) {
            if (node2 == NodeChainKt.f1928a) {
                LayoutNode layoutNodeK = nodeChain.f1926a.K();
                nodeCoordinator.t = layoutNodeK != null ? layoutNodeK.K.b : null;
                nodeChain.c = nodeCoordinator;
                return;
            } else {
                if ((node2.f & 2) != 0) {
                    return;
                }
                node2.r2(nodeCoordinator);
            }
        }
    }

    public static Modifier.Node b(Modifier.Element element, Modifier.Node node) {
        Modifier.Node nodeA;
        if (element instanceof ModifierNodeElement) {
            nodeA = ((ModifierNodeElement) element).a();
            nodeA.f = NodeKindKt.f(nodeA);
        } else {
            BackwardsCompatNode backwardsCompatNode = new BackwardsCompatNode();
            backwardsCompatNode.f = NodeKindKt.d(element);
            backwardsCompatNode.r = element;
            backwardsCompatNode.s = true;
            backwardsCompatNode.u = new HashSet();
            nodeA = backwardsCompatNode;
        }
        if (nodeA.q) {
            InlineClassHelperKt.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        nodeA.l = true;
        Modifier.Node node2 = node.i;
        if (node2 != null) {
            node2.h = nodeA;
            nodeA.i = node2;
        }
        node.i = nodeA;
        nodeA.h = node;
        return nodeA;
    }

    public static Modifier.Node c(Modifier.Node node) {
        boolean z = node.q;
        if (z) {
            MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f1929a;
            if (!z) {
                InlineClassHelperKt.b("autoInvalidateRemovedNode called on unattached node");
            }
            NodeKindKt.a(node, -1, 2);
            node.p2();
            node.j2();
        }
        Modifier.Node node2 = node.i;
        Modifier.Node node3 = node.h;
        if (node2 != null) {
            node2.h = node3;
            node.i = null;
        }
        if (node3 != null) {
            node3.i = node2;
            node.h = null;
        }
        Intrinsics.e(node3);
        return node3;
    }

    public static void i(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f1928a;
            Intrinsics.f(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((ModifierNodeElement) element2).b(node);
            if (node.q) {
                NodeKindKt.c(node);
                return;
            } else {
                node.m = true;
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.b("Unknown Modifier.Node type");
            return;
        }
        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) node;
        if (backwardsCompatNode.q) {
            backwardsCompatNode.t2();
        }
        backwardsCompatNode.r = element2;
        backwardsCompatNode.f = NodeKindKt.d(element2);
        if (backwardsCompatNode.q) {
            backwardsCompatNode.s2(false);
        }
        if (node.q) {
            NodeKindKt.c(node);
        } else {
            node.m = true;
        }
    }

    public final boolean d(int i) {
        return (i & this.e.g) != 0;
    }

    public final void e() {
        InnerNodeCoordinator innerNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.c;
        while (true) {
            innerNodeCoordinator = this.b;
            if (nodeCoordinator == innerNodeCoordinator) {
                break;
            }
            nodeCoordinator.E1();
            nodeCoordinator = nodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
        }
        innerNodeCoordinator.E1();
        for (Modifier.Node node = this.e; node != null; node = node.i) {
            node.o2();
            if (node.l) {
                MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f1929a;
                if (!node.q) {
                    InlineClassHelperKt.b("autoInvalidateInsertedNode called on unattached node");
                }
                NodeKindKt.a(node, -1, 1);
            }
            if (node.m) {
                NodeKindKt.c(node);
            }
            node.l = false;
            node.m = false;
        }
    }

    public final void f() {
        for (Modifier.Node node = this.d; node != null; node = node.h) {
            if (node.q) {
                node.p2();
            }
        }
        NodeCoordinator nodeCoordinator = this.c;
        NodeCoordinator nodeCoordinator2 = this.b;
        while (nodeCoordinator2 != nodeCoordinator) {
            OwnedLayer ownedLayer = nodeCoordinator2.L;
            if (ownedLayer != null) {
                ownedLayer.destroy();
            }
            nodeCoordinator2.L = null;
            nodeCoordinator2 = nodeCoordinator2.t;
            Intrinsics.e(nodeCoordinator2);
        }
        OwnedLayer ownedLayer2 = nodeCoordinator.L;
        if (ownedLayer2 != null) {
            ownedLayer2.destroy();
        }
        nodeCoordinator.L = null;
    }

    public final void g(int i, MutableVector mutableVector, MutableVector mutableVector2, Modifier.Node node, boolean z) {
        NodeChain nodeChain;
        int i2;
        MutableVector mutableVector3;
        MutableVector mutableVector4;
        Differ differ = this.h;
        if (differ == null) {
            nodeChain = this;
            i2 = i;
            mutableVector3 = mutableVector;
            mutableVector4 = mutableVector2;
            Differ differ2 = nodeChain.new Differ(node, i2, mutableVector3, mutableVector4, z);
            nodeChain.h = differ2;
            differ = differ2;
        } else {
            nodeChain = this;
            i2 = i;
            mutableVector3 = mutableVector;
            mutableVector4 = mutableVector2;
            differ.d(node);
            differ.e(i2);
            differ.c(mutableVector3);
            differ.b(mutableVector4);
            differ.f(z);
        }
        MyersDiffKt.a(mutableVector3.f - i2, mutableVector4.f - i2, differ);
        int i3 = 0;
        for (Modifier.Node node2 = nodeChain.d.h; node2 != null && node2 != NodeChainKt.f1928a; node2 = node2.h) {
            i3 |= node2.f;
            node2.g = i3;
        }
    }

    public final void h() {
        LayoutNode layoutNode;
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        Modifier.Node node = this.d.h;
        NodeCoordinator nodeCoordinator = this.b;
        Modifier.Node node2 = node;
        while (true) {
            layoutNode = this.f1926a;
            if (node2 == null) {
                break;
            }
            LayoutModifierNode layoutModifierNodeC = DelegatableNodeKt.c(node2);
            if (layoutModifierNodeC != null) {
                NodeCoordinator nodeCoordinator2 = node2.k;
                if (nodeCoordinator2 != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = (LayoutModifierNodeCoordinator) nodeCoordinator2;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator2.U;
                    layoutModifierNodeCoordinator2.h2(layoutModifierNodeC);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    if (layoutModifierNode != node2) {
                        OwnedLayer ownedLayer = layoutModifierNodeCoordinator2.L;
                        layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        if (ownedLayer != null) {
                            ownedLayer.invalidate();
                            layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        }
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = new LayoutModifierNodeCoordinator(layoutNode, layoutModifierNodeC);
                    node2.r2(layoutModifierNodeCoordinator3);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator3;
                }
                nodeCoordinator.t = layoutModifierNodeCoordinator;
                layoutModifierNodeCoordinator.s = nodeCoordinator;
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                node2.r2(nodeCoordinator);
            }
            node2 = node2.h;
        }
        LayoutNode layoutNodeK = layoutNode.K();
        nodeCoordinator.t = layoutNodeK != null ? layoutNodeK.K.b : null;
        this.c = nodeCoordinator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Modifier.Node node = this.e;
        TailModifierNode tailModifierNode = this.d;
        if (node == tailModifierNode) {
            sb.append("]");
        } else {
            while (true) {
                if (node == null || node == tailModifierNode) {
                    break;
                }
                sb.append(String.valueOf(node));
                if (node.i == tailModifierNode) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                node = node.i;
            }
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}

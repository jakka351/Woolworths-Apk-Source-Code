package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public final int r = NodeKindKt.e(this);
    public Modifier.Node s;

    @Override // androidx.compose.ui.Modifier.Node
    public final void i2() {
        super.i2();
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.r2(this.k);
            if (!node.q) {
                node.i2();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void j2() {
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.j2();
        }
        super.j2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void n2() {
        super.n2();
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.n2();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void o2() {
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.o2();
        }
        super.o2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void p2() {
        super.p2();
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.p2();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void q2(Modifier.Node node) {
        this.d = node;
        for (Modifier.Node node2 = this.s; node2 != null; node2 = node2.i) {
            node2.q2(node);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void r2(NodeCoordinator nodeCoordinator) {
        this.k = nodeCoordinator;
        for (Modifier.Node node = this.s; node != null; node = node.i) {
            node.r2(nodeCoordinator);
        }
    }

    public final DelegatableNode s2(DelegatableNode delegatableNode) {
        Modifier.Node d = delegatableNode.getD();
        if (d != delegatableNode) {
            Modifier.Node node = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node node2 = node != null ? node.h : null;
            if (d != this.d || !Intrinsics.c(node2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (d.q) {
                InlineClassHelperKt.b("Cannot delegate to an already attached node");
            }
            d.q2(this.d);
            int i = this.f;
            int iF = NodeKindKt.f(d);
            d.f = iF;
            int i2 = this.f;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof LayoutModifierNode)) {
                InlineClassHelperKt.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + d);
            }
            d.i = this.s;
            this.s = d;
            d.h = this;
            u2(iF | this.f, false);
            if (this.q) {
                if (i3 == 0 || (i & 2) != 0) {
                    r2(this.k);
                } else {
                    NodeChain nodeChain = DelegatableNodeKt.g(this).K;
                    this.d.r2(null);
                    nodeChain.h();
                }
                d.i2();
                d.o2();
                if (!d.q) {
                    InlineClassHelperKt.b("autoInvalidateInsertedNode called on unattached node");
                }
                NodeKindKt.a(d, -1, 1);
            }
        }
        return delegatableNode;
    }

    public final void t2(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.s; node2 != null; node2 = node2.i) {
            if (node2 == delegatableNode) {
                boolean z = node2.q;
                if (z) {
                    MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f1929a;
                    if (!z) {
                        InlineClassHelperKt.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    NodeKindKt.a(node2, -1, 2);
                    node2.p2();
                    node2.j2();
                }
                node2.q2(node2);
                node2.g = 0;
                if (node == null) {
                    this.s = node2.i;
                } else {
                    node.i = node2.i;
                }
                node2.i = null;
                node2.h = null;
                int i = this.f;
                int iF = NodeKindKt.f(this);
                u2(iF, true);
                if (this.q && (i & 2) != 0 && (iF & 2) == 0) {
                    NodeChain nodeChain = DelegatableNodeKt.g(this).K;
                    this.d.r2(null);
                    nodeChain.h();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    public final void u2(int i, boolean z) {
        Modifier.Node node;
        int i2 = this.f;
        this.f = i;
        if (i2 != i) {
            Modifier.Node node2 = this.d;
            if (node2 == this) {
                this.g = i;
            }
            if (this.q) {
                Modifier.Node node3 = this;
                while (node3 != null) {
                    i |= node3.f;
                    node3.f = i;
                    if (node3 == node2) {
                        break;
                    } else {
                        node3 = node3.h;
                    }
                }
                if (z && node3 == node2) {
                    i = NodeKindKt.f(node2);
                    node2.f = i;
                }
                int i3 = i | ((node3 == null || (node = node3.i) == null) ? 0 : node.g);
                while (node3 != null) {
                    i3 |= node3.f;
                    node3.g = i3;
                    node3 = node3.h;
                }
            }
        }
    }
}

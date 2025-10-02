package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {
    public final NestedScrollConnection d;
    public final NestedScrollDispatcher e;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.d = nestedScrollConnection;
        this.e = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new NestedScrollNode(this.d, this.e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) node;
        nestedScrollNode.r = this.d;
        NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.s;
        if (nestedScrollDispatcher.f1845a == nestedScrollNode) {
            nestedScrollDispatcher.f1845a = null;
        }
        NestedScrollDispatcher nestedScrollDispatcher2 = this.e;
        if (nestedScrollDispatcher2 == null) {
            nestedScrollNode.s = new NestedScrollDispatcher();
        } else if (!nestedScrollDispatcher2.equals(nestedScrollDispatcher)) {
            nestedScrollNode.s = nestedScrollDispatcher2;
        }
        if (nestedScrollNode.q) {
            NestedScrollDispatcher nestedScrollDispatcher3 = nestedScrollNode.s;
            nestedScrollDispatcher3.f1845a = nestedScrollNode;
            nestedScrollDispatcher3.b = null;
            nestedScrollNode.t = null;
            nestedScrollDispatcher3.c = new NestedScrollNode$updateDispatcherFields$1(nestedScrollNode);
            nestedScrollDispatcher3.d = nestedScrollNode.g2();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.c(nestedScrollElement.d, this.d) && Intrinsics.c(nestedScrollElement.e, this.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.e;
        return iHashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }
}

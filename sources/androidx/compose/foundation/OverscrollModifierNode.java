package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class OverscrollModifierNode extends DelegatingNode {
    public DelegatableNode t;

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        DelegatableNode delegatableNode;
        Modifier.Node d;
        DelegatableNode delegatableNode2 = this.t;
        if (delegatableNode2 == null || (d = delegatableNode2.getD()) == null || d.q) {
            delegatableNode = null;
        } else {
            delegatableNode = this.t;
            Intrinsics.e(delegatableNode);
            s2(delegatableNode);
        }
        this.t = delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        DelegatableNode delegatableNode = this.t;
        if (delegatableNode != null) {
            t2(delegatableNode);
        }
    }
}

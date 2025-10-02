package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {
    public final BringIntoViewRequester d;

    public BringIntoViewRequesterElement(BringIntoViewRequester bringIntoViewRequester) {
        this.d = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        BringIntoViewRequesterNode bringIntoViewRequesterNode = new BringIntoViewRequesterNode();
        bringIntoViewRequesterNode.r = this.d;
        return bringIntoViewRequesterNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) node;
        BringIntoViewRequester bringIntoViewRequester = bringIntoViewRequesterNode.r;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).f1096a.k(bringIntoViewRequesterNode);
        }
        BringIntoViewRequester bringIntoViewRequester2 = this.d;
        if (bringIntoViewRequester2 instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester2).f1096a.c(bringIntoViewRequesterNode);
        }
        bringIntoViewRequesterNode.r = bringIntoViewRequester2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return Intrinsics.c(this.d, ((BringIntoViewRequesterElement) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

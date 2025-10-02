package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    public final float d;
    public final State e;

    public ParentSizeElement(float f, State state) {
        this.d = f;
        this.e = state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ParentSizeNode parentSizeNode = new ParentSizeNode();
        parentSizeNode.r = this.d;
        parentSizeNode.s = this.e;
        return parentSizeNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ParentSizeNode parentSizeNode = (ParentSizeNode) node;
        parentSizeNode.r = this.d;
        parentSizeNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.d == parentSizeElement.d && Intrinsics.c(this.e, parentSizeElement.e);
    }

    public final int hashCode() {
        State state = this.e;
        return Float.hashCode(this.d) + ((state != null ? state.hashCode() : 0) * 961);
    }
}

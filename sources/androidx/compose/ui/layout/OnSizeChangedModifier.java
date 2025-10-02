package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnSizeChangedNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {
    public final Function1 d;

    public OnSizeChangedModifier(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        OnSizeChangedNode onSizeChangedNode = new OnSizeChangedNode();
        onSizeChangedNode.r = this.d;
        long j = Integer.MIN_VALUE;
        onSizeChangedNode.s = (j & 4294967295L) | (j << 32);
        return onSizeChangedNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OnSizeChangedNode onSizeChangedNode = (OnSizeChangedNode) node;
        onSizeChangedNode.r = this.d;
        long j = Integer.MIN_VALUE;
        onSizeChangedNode.s = (j & 4294967295L) | (j << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.d == ((OnSizeChangedModifier) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

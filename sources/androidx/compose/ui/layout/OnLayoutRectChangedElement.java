package androidx.compose.ui.layout;

import androidx.camera.core.impl.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    public final Function1 d;

    public OnLayoutRectChangedElement(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        OnLayoutRectChangedNode onLayoutRectChangedNode = new OnLayoutRectChangedNode();
        onLayoutRectChangedNode.r = 64L;
        onLayoutRectChangedNode.s = this.d;
        return onLayoutRectChangedNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OnLayoutRectChangedNode onLayoutRectChangedNode = (OnLayoutRectChangedNode) node;
        onLayoutRectChangedNode.getClass();
        onLayoutRectChangedNode.r = 64L;
        onLayoutRectChangedNode.s = this.d;
        onLayoutRectChangedNode.s2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnLayoutRectChangedElement) && Intrinsics.c(this.d, ((OnLayoutRectChangedElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.b(Long.hashCode(0L) * 31, 31, 64L);
    }

    public final String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=0, debounceMillis=64, callback=" + this.d + ')';
    }
}

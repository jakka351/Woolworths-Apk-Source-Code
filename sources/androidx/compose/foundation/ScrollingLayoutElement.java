package androidx.compose.foundation;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public final ScrollState d;
    public final boolean e;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z) {
        this.d = scrollState;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ScrollNode scrollNode = new ScrollNode();
        scrollNode.r = this.d;
        scrollNode.s = this.e;
        return scrollNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ScrollNode scrollNode = (ScrollNode) node;
        scrollNode.r = this.d;
        scrollNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.c(this.d, scrollingLayoutElement.d) && this.e == scrollingLayoutElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e(this.d.hashCode() * 31, 31, false);
    }
}

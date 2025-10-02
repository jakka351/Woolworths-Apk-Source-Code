package androidx.compose.foundation.gestures;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/ScrollableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {
    public final ScrollableState d;
    public final Orientation e;
    public final boolean f;
    public final boolean g;
    public final MutableInteractionSource h;

    public ScrollableElement(ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        this.d = scrollableState;
        this.e = orientation;
        this.f = z;
        this.g = z2;
        this.h = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ScrollableNode(null, null, null, this.e, this.d, this.h, this.f, this.g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ScrollableNode) node).E2(null, null, null, this.e, this.d, this.h, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.c(this.d, scrollableElement.d) && this.e == scrollableElement.e && this.f == scrollableElement.f && this.g == scrollableElement.g && Intrinsics.c(this.h, scrollableElement.h);
    }

    public final int hashCode() {
        int iE = b.e(b.e((this.e.hashCode() + (this.d.hashCode() * 31)) * 961, 31, this.f), 961, this.g);
        MutableInteractionSource mutableInteractionSource = this.h;
        return (iE + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
    }
}

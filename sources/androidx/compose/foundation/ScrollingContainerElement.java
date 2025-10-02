package androidx.compose.foundation;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollingContainerNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingContainerElement extends ModifierNodeElement<ScrollingContainerNode> {
    public final ScrollableState d;
    public final Orientation e;
    public final boolean f;
    public final boolean g;
    public final FlingBehavior h;
    public final MutableInteractionSource i;
    public final BringIntoViewSpec j;
    public final boolean k;
    public final OverscrollEffect l;

    public ScrollingContainerElement(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z, boolean z2, boolean z3) {
        this.d = scrollableState;
        this.e = orientation;
        this.f = z;
        this.g = z2;
        this.h = flingBehavior;
        this.i = mutableInteractionSource;
        this.j = bringIntoViewSpec;
        this.k = z3;
        this.l = overscrollEffect;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ScrollingContainerNode scrollingContainerNode = new ScrollingContainerNode();
        scrollingContainerNode.t = this.d;
        scrollingContainerNode.u = this.e;
        scrollingContainerNode.v = this.f;
        scrollingContainerNode.w = this.g;
        scrollingContainerNode.x = this.h;
        scrollingContainerNode.y = this.i;
        scrollingContainerNode.z = this.j;
        scrollingContainerNode.A = this.k;
        scrollingContainerNode.B = this.l;
        return scrollingContainerNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        MutableInteractionSource mutableInteractionSource = this.i;
        ((ScrollingContainerNode) node).x2(this.l, this.j, this.h, this.e, this.d, mutableInteractionSource, this.k, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return Intrinsics.c(this.d, scrollingContainerElement.d) && this.e == scrollingContainerElement.e && this.f == scrollingContainerElement.f && this.g == scrollingContainerElement.g && Intrinsics.c(this.h, scrollingContainerElement.h) && Intrinsics.c(this.i, scrollingContainerElement.i) && Intrinsics.c(this.j, scrollingContainerElement.j) && this.k == scrollingContainerElement.k && Intrinsics.c(this.l, scrollingContainerElement.l);
    }

    public final int hashCode() {
        int iE = b.e(b.e((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f), 31, this.g);
        FlingBehavior flingBehavior = this.h;
        int iHashCode = (iE + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.i;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.j;
        int iE2 = b.e((iHashCode2 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0)) * 31, 31, this.k);
        OverscrollEffect overscrollEffect = this.l;
        return iE2 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0);
    }
}

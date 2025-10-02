package androidx.compose.foundation.lazy.layout;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement<LazyLayoutBeyondBoundsModifierNode> {
    public final LazyLayoutBeyondBoundsState d;
    public final LazyLayoutBeyondBoundsInfo e;
    public final boolean f;
    public final Orientation g;

    public LazyLayoutBeyondBoundsModifierElement(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.d = lazyLayoutBeyondBoundsState;
        this.e = lazyLayoutBeyondBoundsInfo;
        this.f = z;
        this.g = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode = new LazyLayoutBeyondBoundsModifierNode();
        lazyLayoutBeyondBoundsModifierNode.r = this.d;
        lazyLayoutBeyondBoundsModifierNode.s = this.e;
        lazyLayoutBeyondBoundsModifierNode.t = this.f;
        lazyLayoutBeyondBoundsModifierNode.u = this.g;
        return lazyLayoutBeyondBoundsModifierNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode = (LazyLayoutBeyondBoundsModifierNode) node;
        lazyLayoutBeyondBoundsModifierNode.r = this.d;
        lazyLayoutBeyondBoundsModifierNode.s = this.e;
        lazyLayoutBeyondBoundsModifierNode.t = this.f;
        lazyLayoutBeyondBoundsModifierNode.u = this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.c(this.d, lazyLayoutBeyondBoundsModifierElement.d) && Intrinsics.c(this.e, lazyLayoutBeyondBoundsModifierElement.e) && this.f == lazyLayoutBeyondBoundsModifierElement.f && this.g == lazyLayoutBeyondBoundsModifierElement.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + b.e((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f);
    }
}

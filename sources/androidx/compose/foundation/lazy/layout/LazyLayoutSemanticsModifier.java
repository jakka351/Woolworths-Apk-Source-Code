package androidx.compose.foundation.lazy.layout;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends ModifierNodeElement<LazyLayoutSemanticsModifierNode> {
    public final Function0 d;
    public final LazyLayoutSemanticState e;
    public final Orientation f;
    public final boolean g;
    public final boolean h;

    public LazyLayoutSemanticsModifier(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.d = function0;
        this.e = lazyLayoutSemanticState;
        this.f = orientation;
        this.g = z;
        this.h = z2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new LazyLayoutSemanticsModifierNode(this.d, this.e, this.f, this.g, this.h);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = (LazyLayoutSemanticsModifierNode) node;
        lazyLayoutSemanticsModifierNode.r = this.d;
        lazyLayoutSemanticsModifierNode.s = this.e;
        Orientation orientation = lazyLayoutSemanticsModifierNode.t;
        Orientation orientation2 = this.f;
        if (orientation != orientation2) {
            lazyLayoutSemanticsModifierNode.t = orientation2;
            SemanticsModifierNodeKt.a(lazyLayoutSemanticsModifierNode);
        }
        boolean z = lazyLayoutSemanticsModifierNode.u;
        boolean z2 = this.g;
        boolean z3 = this.h;
        if (z == z2 && lazyLayoutSemanticsModifierNode.v == z3) {
            return;
        }
        lazyLayoutSemanticsModifierNode.u = z2;
        lazyLayoutSemanticsModifierNode.v = z3;
        lazyLayoutSemanticsModifierNode.s2();
        SemanticsModifierNodeKt.a(lazyLayoutSemanticsModifierNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.d == lazyLayoutSemanticsModifier.d && Intrinsics.c(this.e, lazyLayoutSemanticsModifier.e) && this.f == lazyLayoutSemanticsModifier.f && this.g == lazyLayoutSemanticsModifier.g && this.h == lazyLayoutSemanticsModifier.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + b.e((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.g);
    }
}

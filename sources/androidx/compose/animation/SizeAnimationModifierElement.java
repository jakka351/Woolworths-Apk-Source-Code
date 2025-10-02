package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    public final FiniteAnimationSpec d;
    public final Function2 e;

    public SizeAnimationModifierElement(FiniteAnimationSpec finiteAnimationSpec, Function2 function2) {
        this.d = finiteAnimationSpec;
        this.e = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SizeAnimationModifierNode(this.d, this.e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SizeAnimationModifierNode sizeAnimationModifierNode = (SizeAnimationModifierNode) node;
        sizeAnimationModifierNode.r = this.d;
        sizeAnimationModifierNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!this.d.equals(sizeAnimationModifierElement.d)) {
            return false;
        }
        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
        return biasAlignment.equals(biasAlignment) && Intrinsics.c(this.e, sizeAnimationModifierElement.e);
    }

    public final int hashCode() {
        int iHashCode = (Alignment.Companion.f1719a.hashCode() + (this.d.hashCode() * 31)) * 31;
        Function2 function2 = this.e;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.d + ", alignment=" + Alignment.Companion.f1719a + ", finishedListener=" + this.e + ')';
    }
}

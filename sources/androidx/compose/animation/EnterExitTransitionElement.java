package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {
    public final Transition d;
    public final Transition.DeferredAnimation e;
    public final Transition.DeferredAnimation f;
    public final Transition.DeferredAnimation g;
    public final EnterTransition h;
    public final ExitTransition i;
    public final Function0 j = EnterExitTransitionKt$createModifier$1.h;
    public final GraphicsLayerBlockForEnterExit k;

    public EnterExitTransitionElement(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.d = transition;
        this.e = deferredAnimation;
        this.f = deferredAnimation2;
        this.g = deferredAnimation3;
        this.h = enterTransition;
        this.i = exitTransition;
        this.k = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new EnterExitTransitionModifierNode(this.d, this.e, this.f, this.g, this.h, this.i, this.k);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = (EnterExitTransitionModifierNode) node;
        enterExitTransitionModifierNode.r = this.d;
        enterExitTransitionModifierNode.s = this.e;
        enterExitTransitionModifierNode.t = this.f;
        enterExitTransitionModifierNode.u = this.g;
        enterExitTransitionModifierNode.v = this.h;
        enterExitTransitionModifierNode.w = this.i;
        enterExitTransitionModifierNode.x = EnterExitTransitionKt$createModifier$1.h;
        enterExitTransitionModifierNode.y = this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.c(this.d, enterExitTransitionElement.d) && Intrinsics.c(this.e, enterExitTransitionElement.e) && Intrinsics.c(this.f, enterExitTransitionElement.f) && Intrinsics.c(this.g, enterExitTransitionElement.g) && Intrinsics.c(this.h, enterExitTransitionElement.h) && Intrinsics.c(this.i, enterExitTransitionElement.i) && Intrinsics.c(this.j, enterExitTransitionElement.j) && Intrinsics.c(this.k, enterExitTransitionElement.k);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Transition.DeferredAnimation deferredAnimation = this.e;
        int iHashCode2 = (iHashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation2 = this.f;
        int iHashCode3 = (iHashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition.DeferredAnimation deferredAnimation3 = this.g;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.d + ", sizeAnimation=" + this.e + ", offsetAnimation=" + this.f + ", slideAnimation=" + this.g + ", enter=" + this.h + ", exit=" + this.i + ", isEnabled=" + this.j + ", graphicsLayerBlock=" + this.k + ')';
    }
}

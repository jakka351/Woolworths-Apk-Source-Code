package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/IndicationModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IndicationModifierElement extends ModifierNodeElement<IndicationModifierNode> {
    public final InteractionSource d;
    public final IndicationNodeFactory e;

    public IndicationModifierElement(InteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory) {
        this.d = interactionSource;
        this.e = indicationNodeFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        DelegatableNode delegatableNodeA = this.e.a(this.d);
        IndicationModifierNode indicationModifierNode = new IndicationModifierNode();
        indicationModifierNode.t = delegatableNodeA;
        indicationModifierNode.s2(delegatableNodeA);
        return indicationModifierNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        IndicationModifierNode indicationModifierNode = (IndicationModifierNode) node;
        DelegatableNode delegatableNodeA = this.e.a(this.d);
        indicationModifierNode.t2(indicationModifierNode.t);
        indicationModifierNode.t = delegatableNodeA;
        indicationModifierNode.s2(delegatableNodeA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.c(this.d, indicationModifierElement.d) && Intrinsics.c(this.e, indicationModifierElement.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}

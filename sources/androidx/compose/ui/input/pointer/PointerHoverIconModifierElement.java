package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    public final AndroidPointerIconType d;

    public PointerHoverIconModifierElement(AndroidPointerIconType androidPointerIconType) {
        this.d = androidPointerIconType;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new PointerHoverIconModifierNode(this.d, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) node;
        AndroidPointerIconType androidPointerIconType = pointerHoverIconModifierNode.s;
        AndroidPointerIconType androidPointerIconType2 = this.d;
        if (Intrinsics.c(androidPointerIconType, androidPointerIconType2)) {
            return;
        }
        pointerHoverIconModifierNode.s = androidPointerIconType2;
        if (pointerHoverIconModifierNode.t) {
            pointerHoverIconModifierNode.u2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.d.equals(((PointerHoverIconModifierElement) obj).d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.d.getB() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.d + ", overrideDescendants=false)";
    }
}

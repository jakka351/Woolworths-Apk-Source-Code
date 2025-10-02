package androidx.compose.ui.input.pointer;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/StylusHoverIconModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StylusHoverIconModifierElement extends ModifierNodeElement<StylusHoverIconModifierNode> {
    public final DpTouchBoundsExpansion d;

    public StylusHoverIconModifierElement(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.d = dpTouchBoundsExpansion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new StylusHoverIconModifierNode(TextPointerIcon_androidKt.b, this.d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        StylusHoverIconModifierNode stylusHoverIconModifierNode = (StylusHoverIconModifierNode) node;
        AndroidPointerIconType androidPointerIconType = stylusHoverIconModifierNode.s;
        AndroidPointerIconType androidPointerIconType2 = TextPointerIcon_androidKt.b;
        if (!Intrinsics.c(androidPointerIconType, androidPointerIconType2)) {
            stylusHoverIconModifierNode.s = androidPointerIconType2;
            if (stylusHoverIconModifierNode.t) {
                stylusHoverIconModifierNode.u2();
            }
        }
        stylusHoverIconModifierNode.r = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        AndroidPointerIconType androidPointerIconType = TextPointerIcon_androidKt.b;
        return androidPointerIconType.equals(androidPointerIconType) && Intrinsics.c(this.d, stylusHoverIconModifierElement.d);
    }

    public final int hashCode() {
        int iE = b.e(31682, 31, false);
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.d;
        return iE + (dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + TextPointerIcon_androidKt.b + ", overrideDescendants=false, touchBoundsExpansion=" + this.d + ')';
    }
}

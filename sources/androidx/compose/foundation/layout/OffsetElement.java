package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    public final float d;
    public final float e;
    public final Function1 f;

    public OffsetElement(float f, float f2, Function1 function1) {
        this.d = f;
        this.e = f2;
        this.f = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        OffsetNode offsetNode = new OffsetNode();
        offsetNode.r = this.d;
        offsetNode.s = this.e;
        offsetNode.t = true;
        return offsetNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OffsetNode offsetNode = (OffsetNode) node;
        float f = offsetNode.r;
        float f2 = this.d;
        boolean zA = Dp.a(f, f2);
        float f3 = this.e;
        if (!zA || !Dp.a(offsetNode.s, f3) || !offsetNode.t) {
            LayoutNode layoutNodeG = DelegatableNodeKt.g(offsetNode);
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            layoutNodeG.l0(false);
        }
        offsetNode.r = f2;
        offsetNode.s = f3;
        offsetNode.t = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Dp.a(this.d, offsetElement.d) && Dp.a(this.e, offsetElement.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.b(this.e, Float.hashCode(this.d) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.b(this.d)) + ", y=" + ((Object) Dp.b(this.e)) + ", rtlAware=true)";
    }
}

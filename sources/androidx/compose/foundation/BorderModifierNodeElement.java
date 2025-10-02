package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public final float d;
    public final SolidColor e;
    public final Shape f;

    public BorderModifierNodeElement(float f, SolidColor solidColor, Shape shape) {
        this.d = f;
        this.e = solidColor;
        this.f = shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BorderModifierNode(this.d, this.e, this.f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BorderModifierNode borderModifierNode = (BorderModifierNode) node;
        float f = borderModifierNode.u;
        CacheDrawModifierNode cacheDrawModifierNode = borderModifierNode.x;
        float f2 = this.d;
        if (!Dp.a(f, f2)) {
            borderModifierNode.u = f2;
            cacheDrawModifierNode.z1();
        }
        SolidColor solidColor = borderModifierNode.v;
        SolidColor solidColor2 = this.e;
        if (!Intrinsics.c(solidColor, solidColor2)) {
            borderModifierNode.v = solidColor2;
            cacheDrawModifierNode.z1();
        }
        Shape shape = borderModifierNode.w;
        Shape shape2 = this.f;
        if (Intrinsics.c(shape, shape2)) {
            return;
        }
        borderModifierNode.w = shape2;
        cacheDrawModifierNode.z1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.a(this.d, borderModifierNodeElement.d) && this.e.equals(borderModifierNodeElement.e) && Intrinsics.c(this.f, borderModifierNodeElement.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (Float.hashCode(this.d) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.b(this.d)) + ", brush=" + this.e + ", shape=" + this.f + ')';
    }
}

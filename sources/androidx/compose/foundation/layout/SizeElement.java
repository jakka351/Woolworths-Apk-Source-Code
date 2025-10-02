package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SizeNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final Function1 i;

    public SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = z;
        this.i = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        SizeNode sizeNode = new SizeNode();
        sizeNode.r = this.d;
        sizeNode.s = this.e;
        sizeNode.t = this.f;
        sizeNode.u = this.g;
        sizeNode.v = this.h;
        return sizeNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SizeNode sizeNode = (SizeNode) node;
        sizeNode.r = this.d;
        sizeNode.s = this.e;
        sizeNode.t = this.f;
        sizeNode.u = this.g;
        sizeNode.v = this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.a(this.d, sizeElement.d) && Dp.a(this.e, sizeElement.e) && Dp.a(this.f, sizeElement.f) && Dp.a(this.g, sizeElement.g) && this.h == sizeElement.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + a.b(this.g, a.b(this.f, a.b(this.e, Float.hashCode(this.d) * 31, 31), 31), 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i) {
        Function1 function12;
        boolean z2;
        float f5;
        f = (i & 1) != 0 ? Float.NaN : f;
        f2 = (i & 2) != 0 ? Float.NaN : f2;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        if ((i & 8) != 0) {
            function12 = function1;
            z2 = z;
            f5 = Float.NaN;
        } else {
            function12 = function1;
            z2 = z;
            f5 = f4;
        }
        this(f, f2, f3, f5, z2, function12);
    }
}

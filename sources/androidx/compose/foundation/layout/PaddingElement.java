package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public PaddingElement(float f, float f2, float f3, float f4, Function1 function1) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        boolean z = true;
        boolean z2 = (f >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f)) & (f2 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f2)) & (f3 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f3));
        if (f4 < BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        PaddingNode paddingNode = new PaddingNode();
        paddingNode.r = this.d;
        paddingNode.s = this.e;
        paddingNode.t = this.f;
        paddingNode.u = this.g;
        paddingNode.v = true;
        return paddingNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PaddingNode paddingNode = (PaddingNode) node;
        paddingNode.r = this.d;
        paddingNode.s = this.e;
        paddingNode.t = this.f;
        paddingNode.u = this.g;
        paddingNode.v = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.a(this.d, paddingElement.d) && Dp.a(this.e, paddingElement.e) && Dp.a(this.f, paddingElement.f) && Dp.a(this.g, paddingElement.g);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.b(this.g, a.b(this.f, a.b(this.e, Float.hashCode(this.d) * 31, 31), 31), 31);
    }
}

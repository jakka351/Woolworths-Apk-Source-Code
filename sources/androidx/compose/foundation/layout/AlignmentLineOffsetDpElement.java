package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetDpNode;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    public final AlignmentLine d;
    public final float e;
    public final float f;

    public AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f, float f2, Function1 function1) {
        this.d = alignmentLine;
        this.e = f;
        this.f = f2;
        boolean z = true;
        boolean z2 = f >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f);
        if (f2 < BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            InlineClassHelperKt.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        AlignmentLineOffsetDpNode alignmentLineOffsetDpNode = new AlignmentLineOffsetDpNode();
        alignmentLineOffsetDpNode.r = this.d;
        alignmentLineOffsetDpNode.s = this.e;
        alignmentLineOffsetDpNode.t = this.f;
        return alignmentLineOffsetDpNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        AlignmentLineOffsetDpNode alignmentLineOffsetDpNode = (AlignmentLineOffsetDpNode) node;
        alignmentLineOffsetDpNode.r = this.d;
        alignmentLineOffsetDpNode.s = this.e;
        alignmentLineOffsetDpNode.t = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && Intrinsics.c(this.d, alignmentLineOffsetDpElement.d) && Dp.a(this.e, alignmentLineOffsetDpElement.e) && Dp.a(this.f, alignmentLineOffsetDpElement.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + a.b(this.e, this.d.hashCode() * 31, 31);
    }
}

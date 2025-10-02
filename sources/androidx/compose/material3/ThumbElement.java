package androidx.compose.material3;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ThumbNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ThumbElement extends ModifierNodeElement<ThumbNode> {
    public final InteractionSource d;
    public final boolean e;

    public ThumbElement(InteractionSource interactionSource, boolean z) {
        this.d = interactionSource;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ThumbNode thumbNode = new ThumbNode();
        thumbNode.r = this.d;
        thumbNode.s = this.e;
        thumbNode.w = Float.NaN;
        thumbNode.x = Float.NaN;
        return thumbNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ThumbNode thumbNode = (ThumbNode) node;
        thumbNode.r = this.d;
        boolean z = thumbNode.s;
        boolean z2 = this.e;
        if (z != z2) {
            DelegatableNodeKt.g(thumbNode).W();
        }
        thumbNode.s = z2;
        if (thumbNode.v == null && !Float.isNaN(thumbNode.x)) {
            thumbNode.v = AnimatableKt.a(thumbNode.x);
        }
        if (thumbNode.u != null || Float.isNaN(thumbNode.w)) {
            return;
        }
        thumbNode.u = AnimatableKt.a(thumbNode.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.c(this.d, thumbElement.d) && this.e == thumbElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThumbElement(interactionSource=");
        sb.append(this.d);
        sb.append(", checked=");
        return androidx.camera.core.impl.b.s(sb, this.e, ')');
    }
}

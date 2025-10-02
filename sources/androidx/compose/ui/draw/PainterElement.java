package androidx.compose.ui.draw;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends ModifierNodeElement<PainterNode> {
    public final Painter d;
    public final Alignment e;
    public final ContentScale f;
    public final float g;
    public final ColorFilter h;

    public PainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.d = painter;
        this.e = alignment;
        this.f = contentScale;
        this.g = f;
        this.h = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        PainterNode painterNode = new PainterNode();
        painterNode.r = this.d;
        painterNode.s = true;
        painterNode.t = this.e;
        painterNode.u = this.f;
        painterNode.v = this.g;
        painterNode.w = this.h;
        return painterNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PainterNode painterNode = (PainterNode) node;
        boolean z = painterNode.s;
        Painter painter = this.d;
        boolean z2 = (z && Size.a(painterNode.r.getL(), painter.getL())) ? false : true;
        painterNode.r = painter;
        painterNode.s = true;
        painterNode.t = this.e;
        painterNode.u = this.f;
        painterNode.v = this.g;
        painterNode.w = this.h;
        if (z2) {
            DelegatableNodeKt.g(painterNode).W();
        }
        DrawModifierNodeKt.a(painterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.c(this.d, painterElement.d) && Intrinsics.c(this.e, painterElement.e) && Intrinsics.c(this.f, painterElement.f) && Float.compare(this.g, painterElement.g) == 0 && Intrinsics.c(this.h, painterElement.h);
    }

    public final int hashCode() {
        int iB = a.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + b.e(this.d.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.h;
        return iB + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.d + ", sizeToIntrinsics=true, alignment=" + this.e + ", contentScale=" + this.f + ", alpha=" + this.g + ", colorFilter=" + this.h + ')';
    }
}

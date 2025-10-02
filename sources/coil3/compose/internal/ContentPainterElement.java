package coil3.compose.internal;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/ContentPainterNode;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {
    public final Painter d;
    public final Alignment e;
    public final ContentScale f;
    public final float g;
    public final ColorFilter h;

    public ContentPainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.d = painter;
        this.e = alignment;
        this.f = contentScale;
        this.g = f;
        this.h = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ContentPainterNode contentPainterNode = new ContentPainterNode();
        contentPainterNode.r = this.d;
        contentPainterNode.s = this.e;
        contentPainterNode.t = this.f;
        contentPainterNode.u = this.g;
        contentPainterNode.v = this.h;
        return contentPainterNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) node;
        long j = contentPainterNode.r.getJ();
        Painter painter = this.d;
        boolean zA = Size.a(j, painter.getJ());
        contentPainterNode.r = painter;
        contentPainterNode.s = this.e;
        contentPainterNode.t = this.f;
        contentPainterNode.u = this.g;
        contentPainterNode.v = this.h;
        if (!zA) {
            DelegatableNodeKt.g(contentPainterNode).W();
        }
        DrawModifierNodeKt.a(contentPainterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.c(this.d, contentPainterElement.d) && Intrinsics.c(this.e, contentPainterElement.e) && Intrinsics.c(this.f, contentPainterElement.f) && Float.compare(this.g, contentPainterElement.g) == 0 && Intrinsics.c(this.h, contentPainterElement.h);
    }

    public final int hashCode() {
        int iB = a.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.h;
        return iB + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.d + ", alignment=" + this.e + ", contentScale=" + this.f + ", alpha=" + this.g + ", colorFilter=" + this.h + ')';
    }
}

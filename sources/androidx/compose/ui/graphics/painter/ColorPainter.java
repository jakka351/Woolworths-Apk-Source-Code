package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorPainter extends Painter {
    public final long i;
    public ColorFilter k;
    public float j = 1.0f;
    public final long l = 9205357640488583168L;

    public ColorPainter(long j) {
        this.i = j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        this.j = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        this.k = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return Color.c(this.i, ((ColorPainter) obj).i);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f, reason: from getter */
    public final long getL() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        DrawScope.S(drawScope, this.i, 0L, 0L, this.j, null, this.k, 86);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.i);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) Color.i(this.i)) + ')';
    }
}

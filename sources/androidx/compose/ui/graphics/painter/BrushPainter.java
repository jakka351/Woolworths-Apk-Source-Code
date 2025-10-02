package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BrushPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrushPainter extends Painter {
    public float i;
    public ColorFilter j;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        this.i = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        this.j = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BrushPainter);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long f() {
        throw null;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        DrawScope.z0(drawScope, null, 0L, 0L, this.i, null, this.j, 86);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BrushPainter(brush=null)";
    }
}

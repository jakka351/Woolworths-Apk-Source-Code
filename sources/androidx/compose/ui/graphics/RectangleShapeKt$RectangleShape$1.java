package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/RectangleShapeKt$RectangleShape$1", "Landroidx/compose/ui/graphics/Shape;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectangleShapeKt$RectangleShape$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        return new Outline.Rectangle(RectKt.a(0L, j));
    }

    public final String toString() {
        return "RectangleShape";
    }
}

package androidx.compose.ui.text;

import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/CircleShape;", "Landroidx/compose/ui/graphics/Shape;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CircleShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public static final CircleShape f2040a = new CircleShape();

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        float fC = Size.c(j) / 2.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fC) & 4294967295L);
        return new Outline.Rounded(RoundRectKt.a(RectKt.a(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}

package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OutlineKt {
    public static void a(DrawScope drawScope, Outline outline, long j) {
        boolean z = outline instanceof Outline.Rectangle;
        Fill fill = Fill.f1802a;
        if (z) {
            Rect rect = ((Outline.Rectangle) outline).f1775a;
            float f = rect.f1752a;
            float f2 = rect.b;
            drawScope.D1(j, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), b(rect), 1.0f, fill, null, 3);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.l0(((Outline.Generic) outline).f1774a, j, 1.0f, fill);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        AndroidPath androidPath = rounded.b;
        if (androidPath != null) {
            drawScope.l0(androidPath, j, 1.0f, fill);
            return;
        }
        RoundRect roundRect = rounded.f1776a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.h >> 32));
        float f3 = roundRect.f1753a;
        float f4 = roundRect.b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        float fB = roundRect.b();
        float fA = roundRect.a();
        drawScope.V1(j, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), fill, 1.0f);
    }

    public static final long b(Rect rect) {
        float f = rect.c - rect.f1752a;
        float f2 = rect.d - rect.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}

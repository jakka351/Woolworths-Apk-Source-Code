package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    public static final float a(float f, Function0 function0) {
        return Float.isNaN(f) ? ((Number) ((TextForegroundStyle$merge$1) function0).invoke()).floatValue() : f;
    }

    public static final TextForegroundStyle b(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.b(ColorKt.h(textForegroundStyle.getF2150a(), f, textForegroundStyle2.getF2150a()));
        }
        if (!z || !(textForegroundStyle2 instanceof BrushStyle)) {
            return (TextForegroundStyle) SpanStyleKt.b(f, textForegroundStyle, textForegroundStyle2);
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        BrushStyle brushStyle2 = (BrushStyle) textForegroundStyle2;
        return TextForegroundStyle.Companion.a((Brush) SpanStyleKt.b(f, brushStyle.f2149a, brushStyle2.f2149a), MathHelpersKt.b(brushStyle.b, brushStyle2.b, f));
    }

    public static final long c(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : Color.b(j, Color.d(j) * f);
    }
}

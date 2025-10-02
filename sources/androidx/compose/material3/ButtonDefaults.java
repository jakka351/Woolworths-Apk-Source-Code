package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ButtonDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f1404a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        float f = 24;
        float f2 = 8;
        new PaddingValuesImpl(f, f2, f, f2);
        float f3 = 16;
        new PaddingValuesImpl(f3, f2, f, f2);
        float f4 = 12;
        f1404a = new PaddingValuesImpl(f4, f2, f4, f2);
        new PaddingValuesImpl(f4, f2, f3, f2);
        b = 58;
        c = 40;
        int i = FilledButtonTokens.f1581a;
        d = f2;
    }

    public static ButtonColors a(ColorScheme colorScheme) {
        ButtonColors buttonColors = colorScheme.K;
        if (buttonColors != null) {
            return buttonColors;
        }
        long j = Color.j;
        ButtonColors buttonColors2 = new ButtonColors(j, ColorSchemeKt.c(colorScheme, ColorSchemeKeyTokens.p), j, Color.b(ColorSchemeKt.c(colorScheme, ColorSchemeKeyTokens.k), 0.38f));
        colorScheme.K = buttonColors2;
        return buttonColors2;
    }

    public static ButtonColors b(long j, long j2, Composer composer, int i) {
        long j3 = (i & 1) != 0 ? Color.k : j;
        long j4 = Color.k;
        ButtonColors buttonColorsA = a(MaterialTheme.a(composer));
        if (j3 == 16) {
            j3 = buttonColorsA.f1403a;
        }
        long j5 = j3;
        long j6 = j2 != 16 ? j2 : buttonColorsA.b;
        long j7 = j4 != 16 ? j4 : buttonColorsA.c;
        if (j4 == 16) {
            j4 = buttonColorsA.d;
        }
        return new ButtonColors(j5, j6, j7, j4);
    }
}

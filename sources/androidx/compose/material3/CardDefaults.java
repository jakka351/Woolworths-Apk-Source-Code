package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardDefaults {
    public static CardColors a(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5 = (i2 & 4) != 0 ? Color.k : j3;
        long jB = (i2 & 8) != 0 ? Color.b(j2, 0.38f) : j4;
        ColorScheme colorSchemeA = MaterialTheme.a(composer);
        CardColors cardColors = colorSchemeA.L;
        if (cardColors == null) {
            float f = FilledCardTokens.f1582a;
            ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.w;
            CardColors cardColors2 = new CardColors(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens), ColorSchemeKt.a(colorSchemeA, ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens)), ColorKt.g(Color.b(ColorSchemeKt.c(colorSchemeA, FilledCardTokens.b), FilledCardTokens.d), ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens)), Color.b(ColorSchemeKt.a(colorSchemeA, ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens)), 0.38f));
            colorSchemeA.L = cardColors2;
            cardColors = cardColors2;
        }
        long j6 = j != 16 ? j : cardColors.f1406a;
        long j7 = j2 != 16 ? j2 : cardColors.b;
        if (j5 == 16) {
            j5 = cardColors.c;
        }
        if (jB == 16) {
            jB = cardColors.d;
        }
        return new CardColors(j6, j7, j5, jB);
    }

    public static CardElevation b() {
        return new CardElevation(FilledCardTokens.f1582a, FilledCardTokens.h, FilledCardTokens.f, FilledCardTokens.g, FilledCardTokens.e, FilledCardTokens.c);
    }
}

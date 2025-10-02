package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final Density a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverterA = FontScaleConverterFactory.a(f);
        if (fontScaleConverterA == null) {
            fontScaleConverterA = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, fontScaleConverterA);
    }
}

package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UtilsKt {
    public static final float a(float f, float f2, Composer composer, int i) {
        composer.o(26708577);
        composer.o(-1633490746);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.q(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.q(f2)) || (i & 48) == 32);
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            float f3 = (f2 - f) % 360.0f;
            if (f3 > 180.0f) {
                f3 -= 360.0f;
            } else if (f3 < -180.0f) {
                f3 += 360.0f;
            }
            objG = Float.valueOf(f3);
            composer.A(objG);
        }
        float fFloatValue = ((Number) objG).floatValue();
        composer.l();
        composer.l();
        return fFloatValue;
    }
}

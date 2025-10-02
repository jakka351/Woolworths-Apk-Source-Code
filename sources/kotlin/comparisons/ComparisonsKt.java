package kotlin.comparisons;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/comparisons/ComparisonsKt__ComparisonsKt", "kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt", "kotlin/comparisons/ComparisonsKt___ComparisonsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class ComparisonsKt extends ComparisonsKt___ComparisonsKt {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static float b(float[] fArr, float f) {
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static int c(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static Comparable d(Dp dp, Dp dp2) {
        return dp.compareTo(dp2) >= 0 ? dp : dp2;
    }

    public static float e(float[] fArr, float f) {
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}

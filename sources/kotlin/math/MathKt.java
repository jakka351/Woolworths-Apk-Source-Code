package kotlin.math;

import kotlin.Metadata;

@Metadata(d1 = {"kotlin/math/MathKt__MathHKt", "kotlin/math/MathKt__MathJVMKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class MathKt extends MathKt__MathJVMKt {
    public static int a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int b(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}

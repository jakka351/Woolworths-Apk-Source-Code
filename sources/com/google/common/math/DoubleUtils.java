package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
final class DoubleUtils {
    public static long a(double d) {
        Preconditions.f("not a normal value", b(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d) {
        return Math.getExponent(d) <= 1023;
    }
}

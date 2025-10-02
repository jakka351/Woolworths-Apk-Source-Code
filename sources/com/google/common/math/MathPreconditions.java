package com.google.common.math;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
final class MathPreconditions {
    public static void a(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new ArithmeticException(a.m(b.u("overflow: ", i, str, "(", ", "), i2, ")"));
        }
    }

    public static void b(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

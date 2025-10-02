package com.google.zxing.common.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class MathUtils {
    public static float a(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static float b(int i, int i2, int i3, int i4) {
        double d = i - i3;
        double d2 = i2 - i4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static int c(float f) {
        return (int) (f + (f < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}

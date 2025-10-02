package com.google.android.material.carousel;

/* loaded from: classes6.dex */
final class CarouselStrategyHelper {
    public static float a(float f, float f2, int i) {
        return (Math.max(0, i - 1) * f2) + f;
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? (f2 / 2.0f) + f : f;
    }

    public static int c(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float d(float f, float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f;
    }
}

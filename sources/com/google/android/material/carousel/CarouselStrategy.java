package com.google.android.material.carousel;

/* loaded from: classes6.dex */
public abstract class CarouselStrategy {

    /* renamed from: a, reason: collision with root package name */
    public float f14536a;
    public float b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }
}

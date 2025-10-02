package com.google.android.material.math;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class MathUtils {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f, float f2, float f3, float f4) {
        float fA = a(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float fA2 = a(f, f2, f3, BitmapDescriptorFactory.HUE_RED);
        float fA3 = a(f, f2, f3, f4);
        float fA4 = a(f, f2, BitmapDescriptorFactory.HUE_RED, f4);
        return (fA <= fA2 || fA <= fA3 || fA <= fA4) ? (fA2 <= fA3 || fA2 <= fA4) ? fA3 > fA4 ? fA3 : fA4 : fA2 : fA;
    }

    public static float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}

package com.google.android.material.internal;

/* loaded from: classes6.dex */
final class FadeThroughUtils {
    public static void a(float[] fArr, float f) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }
}

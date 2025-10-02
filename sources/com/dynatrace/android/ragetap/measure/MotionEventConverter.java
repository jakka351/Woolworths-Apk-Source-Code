package com.dynatrace.android.ragetap.measure;

/* loaded from: classes.dex */
public class MotionEventConverter {

    /* renamed from: a, reason: collision with root package name */
    public final float f14177a;

    public MotionEventConverter(float f) {
        float f2 = 1.0f / f;
        this.f14177a = f2;
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            throw new ArithmeticException("invalid value");
        }
    }
}

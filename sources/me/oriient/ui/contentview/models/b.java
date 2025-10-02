package me.oriient.ui.contentview.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class b {
    public static final float a(a toPixelsOnViewWidth, float f) {
        Intrinsics.h(toPixelsOnViewWidth, "$this$toPixelsOnViewWidth");
        return ((double) toPixelsOnViewWidth.a()) < 1.0E-5d ? PixelsInViewWidth.m591constructorimpl(Float.MAX_VALUE) : PixelsInViewWidth.m591constructorimpl(f / toPixelsOnViewWidth.a());
    }

    public static final a a(float f, float f2) {
        if (f < 1.0E-5d) {
            return new a(Float.MAX_VALUE);
        }
        return new a(f2 / f);
    }

    public static final a a(Number number, a scale) {
        Intrinsics.h(number, "<this>");
        Intrinsics.h(scale, "scale");
        return new a(number.floatValue() / scale.a());
    }
}

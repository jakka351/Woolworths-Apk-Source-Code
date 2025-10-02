package com.google.android.material.animation;

import YU.a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo
/* loaded from: classes6.dex */
public class AnimationUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f14504a = new LinearInterpolator();
    public static final FastOutSlowInInterpolator b = new FastOutSlowInInterpolator();
    public static final FastOutLinearInInterpolator c = new FastOutLinearInInterpolator();
    public static final LinearOutSlowInInterpolator d = new LinearOutSlowInInterpolator();
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}

package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f14600a;

    public ReversableAnimatedValueInterpolator(TimeInterpolator timeInterpolator) {
        this.f14600a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.f14600a.getInterpolation(f);
    }
}

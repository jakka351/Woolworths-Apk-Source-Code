package com.dynatrace.android.lifecycle.activitytracking.metrics;

import android.support.v4.media.session.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class ScreenMetrics {

    /* renamed from: a, reason: collision with root package name */
    public final int f14162a;
    public final int b;
    public final int c;
    public final float d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f14163a;
        public int b;
        public int c;
        public float d;
    }

    public ScreenMetrics(Builder builder) {
        this.f14162a = builder.f14163a;
        this.b = builder.b;
        this.d = builder.d;
        this.c = builder.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ScreenMetrics screenMetrics = (ScreenMetrics) obj;
            if (this.f14162a == screenMetrics.f14162a && this.b == screenMetrics.b && this.c == screenMetrics.c && Float.compare(screenMetrics.d, this.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f14162a * 31) + this.b) * 31) + this.c) * 31;
        float f = this.d;
        return i + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityMetrics{screenWidth=");
        sb.append(this.f14162a);
        sb.append(", screenHeight=");
        sb.append(this.b);
        sb.append(", screenDensityDpi=");
        sb.append(this.c);
        sb.append(", screenDensityFactor=");
        return a.r(sb, this.d, '}');
    }
}

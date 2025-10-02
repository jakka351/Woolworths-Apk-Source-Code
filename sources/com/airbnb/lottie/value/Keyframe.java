package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.GradientColor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class Keyframe<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LottieComposition f13481a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f13481a = lottieComposition;
        this.b = obj;
        this.c = obj2;
        this.d = baseInterpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public final float a() {
        LottieComposition lottieComposition = this.f13481a;
        if (lottieComposition == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                this.n = ((this.h.floatValue() - this.g) / (lottieComposition.m - lottieComposition.l)) + b();
            }
        }
        return this.n;
    }

    public final float b() {
        LottieComposition lottieComposition = this.f13481a;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.m == Float.MIN_VALUE) {
            float f = lottieComposition.l;
            this.m = (this.g - f) / (lottieComposition.m - f);
        }
        return this.m;
    }

    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f13481a = lottieComposition;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = baseInterpolator;
        this.f = baseInterpolator2;
        this.g = f;
        this.h = null;
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f13481a = lottieComposition;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public Keyframe(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f13481a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public Keyframe(GradientColor gradientColor, GradientColor gradientColor2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f13481a = null;
        this.b = gradientColor;
        this.c = gradientColor2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}

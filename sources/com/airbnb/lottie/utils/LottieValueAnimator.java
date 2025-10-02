package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.LottieComposition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    public float g;
    public boolean h;
    public long i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public LottieComposition o;
    public boolean p;
    public boolean q;

    public final float c() {
        LottieComposition lottieComposition = this.o;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.k;
        float f2 = lottieComposition.l;
        return (f - f2) / (lottieComposition.m - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(f());
        g(true);
    }

    public final float d() {
        LottieComposition lottieComposition = this.o;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.n;
        return f == 2.14748365E9f ? lottieComposition.m : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.p) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        LottieComposition lottieComposition = this.o;
        if (lottieComposition == null || !this.p) {
            return;
        }
        float fAbs = (this.i != 0 ? j - r2 : 0L) / ((1.0E9f / lottieComposition.n) / Math.abs(this.g));
        float f = this.j;
        if (f()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fE = e();
        float fD = d();
        PointF pointF = MiscUtils.f13479a;
        if (f2 >= fE && f2 <= fD) {
            z = true;
        }
        float f3 = this.j;
        float fB = MiscUtils.b(f2, e(), d());
        this.j = fB;
        if (this.q) {
            fB = (float) Math.floor(fB);
        }
        this.k = fB;
        this.i = j;
        if (!this.q || this.j != f3) {
            b();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.l < getRepeatCount()) {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.l++;
                if (getRepeatMode() == 2) {
                    this.h = !this.h;
                    this.g = -this.g;
                } else {
                    float fD2 = f() ? d() : e();
                    this.j = fD2;
                    this.k = fD2;
                }
                this.i = j;
            } else {
                float fE2 = this.g < BitmapDescriptorFactory.HUE_RED ? e() : d();
                this.j = fE2;
                this.k = fE2;
                g(true);
                a(f());
            }
        }
        if (this.o == null) {
            return;
        }
        float f4 = this.k;
        if (f4 < this.m || f4 > this.n) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.m), Float.valueOf(this.n), Float.valueOf(this.k)));
        }
    }

    public final float e() {
        LottieComposition lottieComposition = this.o;
        if (lottieComposition == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.m;
        return f == -2.14748365E9f ? lottieComposition.l : f;
    }

    public final boolean f() {
        return this.g < BitmapDescriptorFactory.HUE_RED;
    }

    public final void g(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.p = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fE;
        float fD;
        float fE2;
        if (this.o == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f()) {
            fE = d() - this.k;
            fD = d();
            fE2 = e();
        } else {
            fE = this.k - e();
            fD = d();
            fE2 = e();
        }
        return fE / (fD - fE2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        LottieComposition lottieComposition = this.o;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.b();
    }

    public final void h(float f) {
        if (this.j == f) {
            return;
        }
        float fB = MiscUtils.b(f, e(), d());
        this.j = fB;
        if (this.q) {
            fB = (float) Math.floor(fB);
        }
        this.k = fB;
        this.i = 0L;
        b();
    }

    public final void i(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        LottieComposition lottieComposition = this.o;
        float f3 = lottieComposition == null ? -3.4028235E38f : lottieComposition.l;
        float f4 = lottieComposition == null ? Float.MAX_VALUE : lottieComposition.m;
        float fB = MiscUtils.b(f, f3, f4);
        float fB2 = MiscUtils.b(f2, f3, f4);
        if (fB == this.m && fB2 == this.n) {
            return;
        }
        this.m = fB;
        this.n = fB2;
        h((int) MiscUtils.b(this.k, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.p;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.h) {
            return;
        }
        this.h = false;
        this.g = -this.g;
    }
}

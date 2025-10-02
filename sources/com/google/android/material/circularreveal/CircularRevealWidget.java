package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.math.MathUtils;

/* loaded from: classes6.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {
        public static final CircularRevealEvaluator b = new CircularRevealEvaluator();

        /* renamed from: a, reason: collision with root package name */
        public final RevealInfo f14547a = new RevealInfo();

        @Override // android.animation.TypeEvaluator
        public final RevealInfo evaluate(float f, RevealInfo revealInfo, RevealInfo revealInfo2) {
            RevealInfo revealInfo3 = revealInfo;
            RevealInfo revealInfo4 = revealInfo2;
            float fC = MathUtils.c(revealInfo3.f14550a, revealInfo4.f14550a, f);
            float fC2 = MathUtils.c(revealInfo3.b, revealInfo4.b, f);
            float fC3 = MathUtils.c(revealInfo3.c, revealInfo4.c, f);
            RevealInfo revealInfo5 = this.f14547a;
            revealInfo5.f14550a = fC;
            revealInfo5.b = fC2;
            revealInfo5.c = fC3;
            return revealInfo5;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CircularRevealProperty f14548a = new CircularRevealProperty(RevealInfo.class, "circularReveal");

        @Override // android.util.Property
        public final RevealInfo get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final CircularRevealScrimColorProperty f14549a = new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    void a();

    void d();

    int getCircularRevealScrimColor();

    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(RevealInfo revealInfo);

    public static class RevealInfo {

        /* renamed from: a, reason: collision with root package name */
        public float f14550a;
        public float b;
        public float c;

        public RevealInfo(float f, float f2, float f3) {
            this.f14550a = f;
            this.b = f2;
            this.c = f3;
        }

        public RevealInfo(RevealInfo revealInfo) {
            this(revealInfo.f14550a, revealInfo.b, revealInfo.c);
        }
    }
}

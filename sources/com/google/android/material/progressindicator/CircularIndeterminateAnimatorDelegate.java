package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final Property n = new AnonymousClass3(Float.class, "animationFraction");
    public static final Property o = new AnonymousClass4(Float.class, "completeEndFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final FastOutSlowInInterpolator e;
    public final CircularProgressIndicatorSpec f;
    public int g;
    public float h;
    public float i;
    public Animatable2Compat.AnimationCallback j;

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.h);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate2 = circularIndeterminateAnimatorDelegate;
            float fFloatValue = f.floatValue();
            circularIndeterminateAnimatorDelegate2.h = fFloatValue;
            int i = (int) (fFloatValue * 5400.0f);
            FastOutSlowInInterpolator fastOutSlowInInterpolator = circularIndeterminateAnimatorDelegate2.e;
            ArrayList arrayList = circularIndeterminateAnimatorDelegate2.b;
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            float f2 = circularIndeterminateAnimatorDelegate2.h * 1520.0f;
            activeIndicator.f14620a = (-20.0f) + f2;
            activeIndicator.b = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                activeIndicator.b = (fastOutSlowInInterpolator.getInterpolation(IndeterminateAnimatorDelegate.b(i, CircularIndeterminateAnimatorDelegate.k[i2], 667)) * 250.0f) + activeIndicator.b;
                activeIndicator.f14620a = (fastOutSlowInInterpolator.getInterpolation(IndeterminateAnimatorDelegate.b(i, CircularIndeterminateAnimatorDelegate.l[i2], 667)) * 250.0f) + activeIndicator.f14620a;
            }
            float f3 = activeIndicator.f14620a;
            float f4 = activeIndicator.b;
            activeIndicator.f14620a = (((f4 - f3) * circularIndeterminateAnimatorDelegate2.i) + f3) / 360.0f;
            activeIndicator.b = f4 / 360.0f;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                float fB = IndeterminateAnimatorDelegate.b(i, CircularIndeterminateAnimatorDelegate.m[i3], 333);
                if (fB >= BitmapDescriptorFactory.HUE_RED && fB <= 1.0f) {
                    int i4 = i3 + circularIndeterminateAnimatorDelegate2.g;
                    int[] iArr = circularIndeterminateAnimatorDelegate2.f.c;
                    int length = i4 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i5 = iArr[length];
                    int i6 = iArr[length2];
                    ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).c = ArgbEvaluatorCompat.a(fastOutSlowInInterpolator.getInterpolation(fB), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                    break;
                }
                i3++;
            }
            circularIndeterminateAnimatorDelegate2.f14621a.invalidateSelf();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4, reason: invalid class name */
    public class AnonymousClass4 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.i);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.i = f.floatValue();
        }
    }

    public CircularIndeterminateAnimatorDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec;
        this.e = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void c() {
        this.g = 0;
        ((DrawingDelegate.ActiveIndicator) this.b.get(0)).c = this.f.c[0];
        this.i = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(Animatable2Compat.AnimationCallback animationCallback) {
        this.j = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f14621a.isVisible()) {
            this.d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAnimatorDelegate, Float>) n, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.g = (circularIndeterminateAnimatorDelegate.g + 4) % circularIndeterminateAnimatorDelegate.f.c.length;
                }
            });
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CircularIndeterminateAnimatorDelegate, Float>) o, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.a();
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.j;
                    if (animationCallback != null) {
                        animationCallback.a(circularIndeterminateAnimatorDelegate.f14621a);
                    }
                }
            });
        }
        this.g = 0;
        ((DrawingDelegate.ActiveIndicator) this.b.get(0)).c = this.f.c[0];
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
        this.j = null;
    }
}

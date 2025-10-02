package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final Property i = new AnonymousClass2(Float.class, "animationFraction");
    public ObjectAnimator c;
    public final FastOutSlowInInterpolator d;
    public final LinearProgressIndicatorSpec e;
    public int f;
    public boolean g;
    public float h;

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<LinearIndeterminateContiguousAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.h);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate2 = linearIndeterminateContiguousAnimatorDelegate;
            float fFloatValue = f.floatValue();
            linearIndeterminateContiguousAnimatorDelegate2.h = fFloatValue;
            ArrayList arrayList = linearIndeterminateContiguousAnimatorDelegate2.b;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f14620a = BitmapDescriptorFactory.HUE_RED;
            float fB = IndeterminateAnimatorDelegate.b((int) (fFloatValue * 333.0f), 0, 667);
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            FastOutSlowInInterpolator fastOutSlowInInterpolator = linearIndeterminateContiguousAnimatorDelegate2.d;
            float interpolation = fastOutSlowInInterpolator.getInterpolation(fB);
            activeIndicator2.f14620a = interpolation;
            activeIndicator.b = interpolation;
            DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            DrawingDelegate.ActiveIndicator activeIndicator4 = (DrawingDelegate.ActiveIndicator) arrayList.get(2);
            float interpolation2 = fastOutSlowInInterpolator.getInterpolation(fB + 0.49925038f);
            activeIndicator4.f14620a = interpolation2;
            activeIndicator3.b = interpolation2;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).b = 1.0f;
            if (linearIndeterminateContiguousAnimatorDelegate2.g && ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).b < 1.0f) {
                ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).c = ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).c = ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).c = linearIndeterminateContiguousAnimatorDelegate2.e.c[linearIndeterminateContiguousAnimatorDelegate2.f];
                linearIndeterminateContiguousAnimatorDelegate2.g = false;
            }
            linearIndeterminateContiguousAnimatorDelegate2.f14621a.invalidateSelf();
        }
    }

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f = 1;
        this.e = linearProgressIndicatorSpec;
        this.d = new FastOutSlowInInterpolator();
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
        h();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void d(Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateContiguousAnimatorDelegate, Float>) i, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.f = (linearIndeterminateContiguousAnimatorDelegate.f + 1) % linearIndeterminateContiguousAnimatorDelegate.e.c.length;
                    linearIndeterminateContiguousAnimatorDelegate.g = true;
                }
            });
        }
        h();
        this.c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
    }

    public final void h() {
        this.g = true;
        this.f = 1;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) it.next();
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.e;
            activeIndicator.c = linearProgressIndicatorSpec.c[0];
            activeIndicator.d = linearProgressIndicatorSpec.g / 2;
        }
    }
}

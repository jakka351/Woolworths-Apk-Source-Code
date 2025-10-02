package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final Property m = new AnonymousClass3(Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final LinearProgressIndicatorSpec f;
    public int g;
    public boolean h;
    public float i;
    public Animatable2Compat.AnimationCallback j;

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<LinearIndeterminateDisjointAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.i);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate2 = linearIndeterminateDisjointAnimatorDelegate;
            float fFloatValue = f.floatValue();
            linearIndeterminateDisjointAnimatorDelegate2.i = fFloatValue;
            int i = (int) (fFloatValue * 1800.0f);
            Interpolator[] interpolatorArr = linearIndeterminateDisjointAnimatorDelegate2.e;
            ArrayList arrayList = linearIndeterminateDisjointAnimatorDelegate2.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(i2);
                int[] iArr = LinearIndeterminateDisjointAnimatorDelegate.l;
                int i3 = i2 * 2;
                int i4 = iArr[i3];
                int[] iArr2 = LinearIndeterminateDisjointAnimatorDelegate.k;
                activeIndicator.f14620a = MathUtils.a(interpolatorArr[i3].getInterpolation(IndeterminateAnimatorDelegate.b(i, i4, iArr2[i3])), BitmapDescriptorFactory.HUE_RED, 1.0f);
                int i5 = i3 + 1;
                activeIndicator.b = MathUtils.a(interpolatorArr[i5].getInterpolation(IndeterminateAnimatorDelegate.b(i, iArr[i5], iArr2[i5])), BitmapDescriptorFactory.HUE_RED, 1.0f);
            }
            if (linearIndeterminateDisjointAnimatorDelegate2.h) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((DrawingDelegate.ActiveIndicator) it.next()).c = linearIndeterminateDisjointAnimatorDelegate2.f.c[linearIndeterminateDisjointAnimatorDelegate2.g];
                }
                linearIndeterminateDisjointAnimatorDelegate2.h = false;
            }
            linearIndeterminateDisjointAnimatorDelegate2.f14621a.invalidateSelf();
        }
    }

    public LinearIndeterminateDisjointAnimatorDelegate(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = linearProgressIndicatorSpec;
        this.e = new Interpolator[]{AnimationUtilsCompat.a(R.anim.linear_indeterminate_line1_head_interpolator, context), AnimationUtilsCompat.a(R.anim.linear_indeterminate_line1_tail_interpolator, context), AnimationUtilsCompat.a(R.anim.linear_indeterminate_line2_head_interpolator, context), AnimationUtilsCompat.a(R.anim.linear_indeterminate_line2_tail_interpolator, context)};
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
        this.j = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f14621a.isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void f() {
        ObjectAnimator objectAnimator = this.c;
        Property property = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) property, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.g = (linearIndeterminateDisjointAnimatorDelegate.g + 1) % linearIndeterminateDisjointAnimatorDelegate.f.c.length;
                    linearIndeterminateDisjointAnimatorDelegate.h = true;
                }
            });
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) property, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.a();
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.j;
                    if (animationCallback != null) {
                        animationCallback.a(linearIndeterminateDisjointAnimatorDelegate.f14621a);
                    }
                }
            });
        }
        h();
        this.c.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public final void g() {
        this.j = null;
    }

    public final void h() {
        this.g = 0;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((DrawingDelegate.ActiveIndicator) it.next()).c = this.f.c[0];
        }
    }
}

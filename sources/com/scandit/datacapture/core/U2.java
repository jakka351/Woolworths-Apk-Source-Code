package com.scandit.datacapture.core;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class U2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f18381a = R.id.sc_animator_tag;

    public static final void a(C1011g3 c1011g3, boolean z) {
        Intrinsics.h(c1011g3, "<this>");
        if (!z) {
            int i = f18381a;
            Object tag = c1011g3.getTag(i);
            Animator animator = tag instanceof Animator ? (Animator) tag : null;
            if (animator != null) {
                animator.cancel();
            }
            c1011g3.setTag(i, null);
            c1011g3.setVisibility(0);
            c1011g3.setAlpha(1.0f);
            return;
        }
        if (c1011g3.getVisibility() != 0) {
            c1011g3.setVisibility(0);
            c1011g3.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        ValueAnimator valueAnimatorA = a(c1011g3, 1.0f);
        S2 s2 = S2.f18371a;
        int i2 = f18381a;
        Object tag2 = c1011g3.getTag(i2);
        Animator animator2 = tag2 instanceof Animator ? (Animator) tag2 : null;
        if (animator2 != null) {
            animator2.cancel();
        }
        valueAnimatorA.addListener(new T2(c1011g3, s2));
        valueAnimatorA.start();
        c1011g3.setTag(i2, valueAnimatorA);
    }

    public static final void a(C1011g3 c1011g3, boolean z, Function0 then) {
        Intrinsics.h(c1011g3, "<this>");
        Intrinsics.h(then, "then");
        if (z) {
            ValueAnimator valueAnimatorA = a(c1011g3, BitmapDescriptorFactory.HUE_RED);
            R2 r2 = new R2(c1011g3, then);
            int i = f18381a;
            Object tag = c1011g3.getTag(i);
            Animator animator = tag instanceof Animator ? (Animator) tag : null;
            if (animator != null) {
                animator.cancel();
            }
            valueAnimatorA.addListener(new T2(c1011g3, r2));
            valueAnimatorA.start();
            c1011g3.setTag(i, valueAnimatorA);
            return;
        }
        int i2 = f18381a;
        Object tag2 = c1011g3.getTag(i2);
        Animator animator2 = tag2 instanceof Animator ? (Animator) tag2 : null;
        if (animator2 != null) {
            animator2.cancel();
        }
        c1011g3.setTag(i2, null);
        c1011g3.setVisibility(4);
        c1011g3.setAlpha(BitmapDescriptorFactory.HUE_RED);
        then.invoke();
    }

    private static final ValueAnimator a(View view, float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new au.com.woolworths.shop.addtolist.utils.a(view, 5));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View this_fadeAnimator, ValueAnimator it) {
        Intrinsics.h(this_fadeAnimator, "$this_fadeAnimator");
        Intrinsics.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this_fadeAnimator.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void a(C1011g3 c1011g3, Animator animator) {
        animator.removeAllListeners();
        c1011g3.setTag(f18381a, null);
    }
}

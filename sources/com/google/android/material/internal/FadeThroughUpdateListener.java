package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;

@RestrictTo
/* loaded from: classes6.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final View d;
    public final View e;
    public final float[] f = new float[2];

    public FadeThroughUpdateListener(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.d = actionMenuView;
        this.e = actionMenuView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f;
        FadeThroughUtils.a(fArr, fFloatValue);
        View view = this.d;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}

package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ EndIconDelegate e;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i) {
        this.d = i;
        this.e = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.d) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.e;
                clearTextEndIconDelegate.getClass();
                clearTextEndIconDelegate.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ClearTextEndIconDelegate clearTextEndIconDelegate2 = (ClearTextEndIconDelegate) this.e;
                clearTextEndIconDelegate2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = clearTextEndIconDelegate2.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.e;
                dropdownMenuEndIconDelegate.getClass();
                dropdownMenuEndIconDelegate.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

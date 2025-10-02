package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.woolworths.R;

/* loaded from: classes6.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final a j;
    public final b k;
    public AnimatorSet l;
    public ValueAnimator m;

    public ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.j = new a(this, 0);
        this.k = new b(this, 0);
        this.e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 100);
        this.f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 150);
        this.g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f14504a);
        this.h = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.d);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.b.s != null) {
            return;
        }
        s(t());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        this.i = editText;
        this.f14669a.setEndIconVisible(t());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void o(boolean z) {
        if (this.b.s == null) {
            return;
        }
        s(z);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) throws Resources.NotFoundException {
                ClearTextEndIconDelegate.this.b.h(true);
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
                ClearTextEndIconDelegate.this.b.h(false);
            }
        });
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new d(this, 0));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}

package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public final LinkedHashSet d;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public int i;
    public int j;
    public int k;
    public ViewPropertyAnimator l;

    public interface OnScrollStateChangedListener {
        void a();
    }

    @RestrictTo
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
        this.k = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.e = MotionUtils.c(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = MotionUtils.c(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.d);
        this.h = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.d;
        if (i > 0) {
            if (this.j == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.l;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((OnScrollStateChangedListener) it.next()).a();
            }
            this.l = view.animate().translationY(this.i + this.k).setInterpolator(this.h).setDuration(this.f).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    HideBottomViewOnScrollBehavior.this.l = null;
                }
            });
            return;
        }
        if (i >= 0 || this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.l;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((OnScrollStateChangedListener) it2.next()).a();
        }
        this.l = view.animate().translationY(0).setInterpolator(this.g).setDuration(this.e).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.l = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
        this.k = 0;
    }
}

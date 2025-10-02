package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.woolworths.R;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    public final float g;
    public final float h;
    public final float i;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public final void c(BackEventCompat backEventCompat, final int i, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i2;
        final boolean z = backEventCompat.d == 0;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i2 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        float f = scaleX + i2;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.c(backEventCompat.c, this.c, this.d));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper materialSideContainerBackHelper = MaterialSideContainerBackHelper.this;
                materialSideContainerBackHelper.b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                materialSideContainerBackHelper.d(z, BitmapDescriptorFactory.HUE_RED, i);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void d(boolean z, float f, int i) {
        float interpolation = this.f14611a.getInterpolation(f);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            float f3 = height;
            if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fA = AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, f5, interpolation);
            float f7 = fA + 1.0f;
            view.setScaleX(f7);
            float fA2 = 1.0f - AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, f6, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fA : 1.0f;
                    float f9 = fA2 != BitmapDescriptorFactory.HUE_RED ? (f7 / fA2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}

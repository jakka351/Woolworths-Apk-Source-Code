package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {
    public final float g;
    public final float h;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public final void c(BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        View view = this.b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.c(backEventCompat.c, this.c, this.d));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper materialBottomContainerBackHelper = MaterialBottomContainerBackHelper.this;
                materialBottomContainerBackHelper.b.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                materialBottomContainerBackHelper.d(BitmapDescriptorFactory.HUE_RED);
            }
        });
        objectAnimatorOfFloat.addListener(animatorListener);
        objectAnimatorOfFloat.start();
    }

    public final void d(float f) {
        float interpolation = this.f14611a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float fA = 1.0f - AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, f2, interpolation);
        float fA2 = 1.0f - AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, f3, interpolation);
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != BitmapDescriptorFactory.HUE_RED ? fA / fA2 : 1.0f);
            }
        }
    }
}

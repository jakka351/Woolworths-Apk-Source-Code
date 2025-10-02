package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class Hold extends Visibility {
    @Override // androidx.transition.Visibility
    public final Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.transition.Visibility
    public final Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED);
    }
}

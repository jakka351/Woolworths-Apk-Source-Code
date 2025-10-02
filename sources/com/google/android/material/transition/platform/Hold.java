package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RequiresApi
/* loaded from: classes6.dex */
public final class Hold extends Visibility {
    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED);
    }
}

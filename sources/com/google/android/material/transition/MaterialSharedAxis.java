package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.TransitionValues;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Axis {
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public final Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        MaterialVisibility.W();
        throw null;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public final Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        MaterialVisibility.W();
        throw null;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Transition
    public final /* bridge */ /* synthetic */ boolean v() {
        return true;
    }
}

package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes6.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$1, reason: invalid class name */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            throw null;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }
    }
}

package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z6 extends View {
    private Animator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        setVisibility(8);
        setBackground(new ColorDrawable(0));
    }

    public final void a() {
        this.b = null;
    }

    public final void a(int i) {
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
        }
        setBackground(new ColorDrawable(i));
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 1.0f).setDuration(100L);
        Intrinsics.g(duration, "ofFloat(this, \"alpha\", 1…ation(ANIMATION_DURATION)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "alpha", BitmapDescriptorFactory.HUE_RED).setDuration(0L);
        Intrinsics.g(duration2, "ofFloat(this, \"alpha\", 0f).setDuration(0L)");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "alpha", 0.5f).setDuration(100L);
        Intrinsics.g(duration3, "ofFloat(this, \"alpha\", 0…ation(ANIMATION_DURATION)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        animatorSet.addListener(new Y6(this));
        animatorSet.start();
        this.b = animatorSet;
    }
}

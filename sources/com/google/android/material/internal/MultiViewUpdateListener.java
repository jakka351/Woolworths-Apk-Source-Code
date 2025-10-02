package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final Listener d;
    public final View[] e;

    public interface Listener {
        void a(View view, ValueAnimator valueAnimator);
    }

    public MultiViewUpdateListener(Listener listener, View... viewArr) {
        this.d = listener;
        this.e = viewArr;
    }

    public static MultiViewUpdateListener a(View... viewArr) {
        return new MultiViewUpdateListener(new a(1), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.e) {
            this.d.a(view, valueAnimator);
        }
    }
}

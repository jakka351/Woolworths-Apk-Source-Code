package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14610a;

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void a(View view, ValueAnimator valueAnimator) {
        switch (this.f14610a) {
            case 0:
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                Float f = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f.floatValue());
                view.setScaleY(f.floatValue());
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

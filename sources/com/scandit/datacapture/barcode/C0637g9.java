package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0637g9 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0653h9 f17681a;
    final /* synthetic */ Function0 b;

    public C0637g9(C0653h9 c0653h9, Function0 function0) {
        this.f17681a = c0653h9;
        this.b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.h(animation, "animation");
        AnimatorSet animatorSet = (AnimatorSet) animation;
        this.f17681a.c = null;
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.g(childAnimations, "animation.childAnimations");
        for (Animator animator : childAnimations) {
            Intrinsics.f(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animatorSet.removeAllListeners();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        AnimatorSet animatorSet = (AnimatorSet) animation;
        this.f17681a.c = null;
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.g(childAnimations, "animation.childAnimations");
        for (Animator animator : childAnimations) {
            Intrinsics.f(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animatorSet.removeAllListeners();
        this.b.invoke();
    }
}

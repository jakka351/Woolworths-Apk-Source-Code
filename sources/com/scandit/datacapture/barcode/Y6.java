package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y6 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z6 f17354a;

    public Y6(Z6 z6) {
        this.f17354a = z6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        animation.removeAllListeners();
        this.f17354a.setVisibility(8);
        this.f17354a.a();
    }
}

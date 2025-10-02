package com.scandit.datacapture.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T2 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1011g3 f18376a;
    final /* synthetic */ Function0 b;

    public T2(C1011g3 c1011g3, Function0 function0) {
        this.f18376a = c1011g3;
        this.b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.h(animation, "animation");
        U2.a(this.f18376a, animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        this.b.invoke();
        U2.a(this.f18376a, animation);
    }
}

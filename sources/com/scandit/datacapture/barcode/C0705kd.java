package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.kd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0705kd extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0 f17833a;

    public C0705kd(Function0 function0) {
        this.f17833a = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        animation.removeAllListeners();
        this.f17833a.invoke();
    }
}

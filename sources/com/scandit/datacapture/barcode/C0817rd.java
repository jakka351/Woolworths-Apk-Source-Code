package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0817rd extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0877ud f17995a;
    final /* synthetic */ Function0 b;

    public C0817rd(C0877ud c0877ud, Function0 function0) {
        this.f17995a = c0877ud;
        this.b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.h(animation, "animation");
        this.f17995a.c = null;
        this.b.invoke();
        C0877ud.a(this.f17995a);
    }
}

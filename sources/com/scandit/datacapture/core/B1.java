package com.scandit.datacapture.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class B1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I1 f18298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(I1 i1) {
        super(0);
        this.f18298a = i1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewParent parent = this.f18298a.b().getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return Integer.valueOf(((ViewGroup) parent).getHeight());
    }
}

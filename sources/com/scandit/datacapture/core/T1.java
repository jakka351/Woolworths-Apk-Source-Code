package com.scandit.datacapture.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class T1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U1 f18375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(U1 u1) {
        super(0);
        this.f18375a = u1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.f18375a.getResources().getDisplayMetrics().scaledDensity * 8.0f);
    }
}

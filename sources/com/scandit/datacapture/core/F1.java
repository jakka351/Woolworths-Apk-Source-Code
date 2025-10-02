package com.scandit.datacapture.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class F1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I1 f18314a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(I1 i1) {
        super(0);
        this.f18314a = i1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(-this.f18314a.b().getHeight());
    }
}

package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S6 f17256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O6(S6 s6) {
        super(0);
        this.f17256a = s6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17256a.f.b(new N6(this.f17256a));
    }
}

package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R0 f17252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(R0 r0) {
        super(0);
        this.f17252a = r0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17252a.invalidate();
        this.f17252a.invalidateOutline();
        return Unit.f24250a;
    }
}

package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Q0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R0 f17274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r0) {
        super(0);
        this.f17274a = r0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17274a.invalidate();
        return Unit.f24250a;
    }
}

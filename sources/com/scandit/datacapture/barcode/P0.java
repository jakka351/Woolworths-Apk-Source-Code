package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class P0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R0 f17263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r0) {
        super(0);
        this.f17263a = r0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17263a.invalidate();
        return Unit.f24250a;
    }
}

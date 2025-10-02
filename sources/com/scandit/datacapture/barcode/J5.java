package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class J5 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f17204a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J5(S5 s5, Function0 function0) {
        super(0);
        this.f17204a = s5;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17204a.f = true;
        this.f17204a.c.setVisibility(4);
        this.b.invoke();
        return Unit.f24250a;
    }
}

package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ib extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17196a;
    final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(C0540bc c0540bc, Function1 function1) {
        super(1);
        this.f17196a = c0540bc;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0540bc.a(this.f17196a, new Hb(this.b, obj));
        return Unit.f24250a;
    }
}

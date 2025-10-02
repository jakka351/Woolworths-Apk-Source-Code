package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Y9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z9 f17357a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y9(Z9 z9, boolean z, Function0 function0) {
        super(0);
        this.f17357a = z9;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17357a.a(this.b, this.c);
        return Unit.f24250a;
    }
}

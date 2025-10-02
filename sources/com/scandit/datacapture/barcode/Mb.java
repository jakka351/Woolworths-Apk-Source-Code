package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Mb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17241a;
    final /* synthetic */ TorchState b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mb(C0540bc c0540bc, TorchState torchState, Function0 function0) {
        super(0);
        this.f17241a = c0540bc;
        this.b = torchState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0540bc c0540bc = this.f17241a;
        C0540bc.a(c0540bc, this.b, new Lb(c0540bc, this.c));
        return Unit.f24250a;
    }
}

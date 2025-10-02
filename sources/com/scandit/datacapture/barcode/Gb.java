package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Gb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17173a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(C0540bc c0540bc, Function0 function0) {
        super(0);
        this.f17173a = c0540bc;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0540bc c0540bc = this.f17173a;
        C0540bc.a(c0540bc, TorchState.OFF, new Fb(c0540bc, this.b));
        return Unit.f24250a;
    }
}

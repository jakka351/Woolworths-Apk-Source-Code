package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ub extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17319a;
    final /* synthetic */ Callback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ub(C0540bc c0540bc, Callback callback) {
        super(0);
        this.f17319a = c0540bc;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0540bc c0540bc = this.f17319a;
        C0540bc.a(c0540bc, TorchState.OFF, new Tb(c0540bc, this.b));
        return Unit.f24250a;
    }
}

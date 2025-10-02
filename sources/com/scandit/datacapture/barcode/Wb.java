package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Wb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wb(C0540bc c0540bc) {
        super(0);
        this.f17336a = c0540bc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0799qa interfaceC0799qaI = this.f17336a.i();
        if (interfaceC0799qaI != null) {
            interfaceC0799qaI.onCameraOnEnd();
        }
        return Unit.f24250a;
    }
}

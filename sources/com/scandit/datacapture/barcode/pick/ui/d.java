package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
final /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
    public d(Object obj) {
        super(0, obj, BarcodePickView.class, "onShutterButtonClick", "onShutterButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BarcodePickView) this.receiver).m.c();
        return Unit.f24250a;
    }
}

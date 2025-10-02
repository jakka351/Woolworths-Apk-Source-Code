package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.scandit.datacapture.barcode.pick.ui.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C0786b extends FunctionReferenceImpl implements Function0 {
    public C0786b(Object obj) {
        super(0, obj, BarcodePickView.class, "onShutterButtonClick", "onShutterButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BarcodePickView) this.receiver).m.c();
        return Unit.f24250a;
    }
}

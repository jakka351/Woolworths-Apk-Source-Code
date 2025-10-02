package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
final /* synthetic */ class i extends FunctionReferenceImpl implements Function0 {
    public i(BarcodeCountUiHandler barcodeCountUiHandler) {
        super(0, barcodeCountUiHandler, BarcodeCountUiHandler.class, "clickShutterButton", "clickShutterButton()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BarcodeCountUiHandler) this.receiver).g();
        return Unit.f24250a;
    }
}

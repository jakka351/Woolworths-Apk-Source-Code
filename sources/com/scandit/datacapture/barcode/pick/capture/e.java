package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickScanningSession f17905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodePickScanningSession barcodePickScanningSession) {
        super(0);
        this.f17905a = barcodePickScanningSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodePickScanningSessionProxyAdapter((NativeBarcodePickScanningSession) this.f17905a.f17893a.invoke(), null, 2, null);
    }
}

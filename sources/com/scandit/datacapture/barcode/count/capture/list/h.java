package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountCaptureListSession f17504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BarcodeCountCaptureListSession barcodeCountCaptureListSession) {
        super(0);
        this.f17504a = barcodeCountCaptureListSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeCountCaptureListSessionProxyAdapter((NativeBarcodeCountCaptureListSession) this.f17504a.f17493a.invoke(), null, 2, null);
    }
}

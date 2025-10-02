package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeTrackingSession f18163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(BarcodeTrackingSession barcodeTrackingSession) {
        super(0);
        this.f18163a = barcodeTrackingSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeTrackingSessionProxyAdapter((NativeBarcodeTrackingSession) this.f18163a.f18155a.invoke(), null, 2, null);
    }
}

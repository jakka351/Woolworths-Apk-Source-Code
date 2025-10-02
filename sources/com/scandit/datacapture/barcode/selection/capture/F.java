package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeSelectionSession f18039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(BarcodeSelectionSession barcodeSelectionSession) {
        super(0);
        this.f18039a = barcodeSelectionSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeSelectionSessionProxyAdapter((NativeBarcodeSelectionSession) this.f18039a.f18029a.invoke(), null, 2, null);
    }
}

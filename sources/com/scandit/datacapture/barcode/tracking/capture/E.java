package com.scandit.datacapture.barcode.tracking.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeTracking f18161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(BarcodeTracking barcodeTracking) {
        super(0);
        this.f18161a = barcodeTracking;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18161a.getF18146a();
    }
}

package com.scandit.datacapture.barcode.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCapture f17430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(BarcodeCapture barcodeCapture) {
        super(0);
        this.f17430a = barcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17430a;
    }
}

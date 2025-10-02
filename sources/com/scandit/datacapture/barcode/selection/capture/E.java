package com.scandit.datacapture.barcode.selection.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeSelection f18038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(BarcodeSelection barcodeSelection) {
        super(0);
        this.f18038a = barcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18038a.getF18011a();
    }
}

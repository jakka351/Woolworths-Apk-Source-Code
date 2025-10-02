package com.scandit.datacapture.barcode.selection.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeSelection f18010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(BarcodeSelection barcodeSelection) {
        super(0);
        this.f18010a = barcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f18010a.getF18011a();
    }
}

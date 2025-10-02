package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class C7 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCount f17119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(BarcodeCount barcodeCount) {
        super(0);
        this.f17119a = barcodeCount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17119a;
    }
}

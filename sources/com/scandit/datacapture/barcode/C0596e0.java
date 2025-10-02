package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0596e0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountBasicOverlay f17623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596e0(BarcodeCountBasicOverlay barcodeCountBasicOverlay) {
        super(0);
        this.f17623a = barcodeCountBasicOverlay;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17623a.brushFromFilterSettings();
    }
}

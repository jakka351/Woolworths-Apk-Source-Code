package com.scandit.datacapture.barcode.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0555a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCapture f17438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555a(BarcodeCapture barcodeCapture) {
        super(1);
        this.f17438a = barcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        BarcodeCapture barcodeCapture = this.f17438a;
        BarcodeCapture.access$applyBatterySavingMode(barcodeCapture, barcodeCapture.c, zBooleanValue);
        return Unit.f24250a;
    }
}

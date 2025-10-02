package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InternalBarcodeCountSession f17480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InternalBarcodeCountSession internalBarcodeCountSession) {
        super(0);
        this.f17480a = internalBarcodeCountSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17480a.f();
        return Unit.f24250a;
    }
}

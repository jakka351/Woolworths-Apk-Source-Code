package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0544c0 c0544c0) {
        super(0);
        this.f17349a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17349a.m.clearHighlights();
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListenerB = this.f17349a.b();
        if (barcodeCountViewInternalUiListenerB != null) {
            barcodeCountViewInternalUiListenerB.onClearButtonTapped();
        }
        return Unit.f24250a;
    }
}

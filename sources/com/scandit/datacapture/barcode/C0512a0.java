package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0512a0 extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512a0(C0544c0 c0544c0) {
        super(2);
        this.f17370a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListenerB;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue() && (barcodeCountViewInternalUiListenerB = this.f17370a.b()) != null) {
            barcodeCountViewInternalUiListenerB.onStatusButtonTapped();
        }
        O oJ = this.f17370a.j();
        if (oJ != null) {
            oJ.a(zBooleanValue);
        }
        this.f17370a.m.setStatusModeEnabled$scandit_barcode_capture(zBooleanValue);
        return Unit.f24250a;
    }
}

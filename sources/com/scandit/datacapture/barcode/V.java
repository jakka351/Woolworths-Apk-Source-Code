package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class V extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0544c0 f17322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0544c0 c0544c0) {
        super(1);
        this.f17322a = c0544c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListenerB = this.f17322a.b();
            if (barcodeCountViewInternalUiListenerB != null) {
                barcodeCountViewInternalUiListenerB.onFloatingShutterButtonTapped();
            }
        } else {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListenerB2 = this.f17322a.b();
            if (barcodeCountViewInternalUiListenerB2 != null) {
                barcodeCountViewInternalUiListenerB2.onShutterButtonTapped();
            }
        }
        ((Z9) this.f17322a.f17395a).c(false, (Function0) M9.f17239a);
        this.f17322a.l();
        return Unit.f24250a;
    }
}

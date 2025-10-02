package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class P extends NativeBarcodeCountViewHandler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17262a;

    public P(C0544c0 owner) {
        Intrinsics.h(owner, "owner");
        this.f17262a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void clear() {
        C0544c0 c0544c0 = (C0544c0) this.f17262a.get();
        if (c0544c0 != null) {
            ((Z9) c0544c0.f17395a).b(false, (Function0) L9.f17229a);
            ((Z9) c0544c0.f17395a).c(true, (Function0) M9.f17239a);
            ((C0536b8) c0544c0.b).a(U7.f17315a);
            c0544c0.c(false);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setEnableProgressBar(boolean z) {
        C0544c0 c0544c0 = (C0544c0) this.f17262a.get();
        if (c0544c0 == null) {
            return;
        }
        c0544c0.c(z);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setEnableShutterAnimation(boolean z) {
        N9 n9;
        C0544c0 c0544c0 = (C0544c0) this.f17262a.get();
        if (c0544c0 == null || (n9 = c0544c0.f17395a) == null) {
            return;
        }
        ((Z9) n9).b(z, L9.f17229a);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setProgressBarState(int i, int i2) {
        InterfaceC0588d8 interfaceC0588d8;
        C0544c0 c0544c0 = (C0544c0) this.f17262a.get();
        if (c0544c0 == null || (interfaceC0588d8 = c0544c0.k) == null) {
            return;
        }
        ((C0652h8) interfaceC0588d8).a(i, i2);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setShutterDimmed(boolean z) {
        N9 n9;
        C0544c0 c0544c0 = (C0544c0) this.f17262a.get();
        if (c0544c0 == null || (n9 = c0544c0.f17395a) == null) {
            return;
        }
        ((Z9) n9).c(!z, M9.f17239a);
    }
}

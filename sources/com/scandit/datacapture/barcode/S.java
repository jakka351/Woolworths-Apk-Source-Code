package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class S extends NativeBarcodeCountGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17293a;

    public S(C0544c0 owner) {
        Intrinsics.h(owner, "owner");
        this.f17293a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void clear() {
        O oJ;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 != null) {
            C0544c0.a(c0544c0);
        }
        C0544c0 c0544c02 = (C0544c0) this.f17293a.get();
        if (c0544c02 == null || (oJ = c0544c02.j()) == null) {
            return;
        }
        oJ.b();
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setMoveCloserAndRescan(boolean z, String str) {
        xe xeVar;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 == null || (xeVar = c0544c0.i) == null) {
            return;
        }
        ((De) xeVar).c(z, str, we.f18254a);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setMoveFurtherAndRescan(boolean z, String str) {
        xe xeVar;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 == null || (xeVar = c0544c0.i) == null) {
            return;
        }
        ((De) xeVar).b(z, str, ve.f18242a);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setScanning(boolean z, String str) {
        InterfaceC0872u8 interfaceC0872u8;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 == null || (interfaceC0872u8 = c0544c0.j) == null) {
            return;
        }
        ((C8) interfaceC0872u8).b(z, str, C0849t8.f18140a);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setScanningProgress(int i) {
        InterfaceC0872u8 interfaceC0872u8;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 == null || (interfaceC0872u8 = c0544c0.j) == null) {
            return;
        }
        ((C8) interfaceC0872u8).a(i / 100.0f);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setTapToScan(boolean z, String str) {
        xe xeVar;
        C0544c0 c0544c0 = (C0544c0) this.f17293a.get();
        if (c0544c0 == null || (xeVar = c0544c0.i) == null) {
            return;
        }
        ((De) xeVar).a(z, str, ue.f18225a);
    }
}

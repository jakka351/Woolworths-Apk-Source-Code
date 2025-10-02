package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.pick.ui.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0785a implements BarcodePickStatusListenerInternal {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17956a;

    public C0785a(BarcodePickView owner) {
        Intrinsics.h(owner, "owner");
        this.f17956a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void a() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f17956a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerStarted$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void b() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f17956a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerStopped$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void c() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f17956a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerFreezed$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void d() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f17956a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerPaused$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStarted(BarcodePick mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStopped(BarcodePick mode) {
        Intrinsics.h(mode, "mode");
    }
}

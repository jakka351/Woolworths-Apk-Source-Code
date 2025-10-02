package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements BarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiListener f17576a;
    private final WeakReference b;

    public c(BarcodeCountViewUiListener barcodeCountViewUiListener, BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17576a = barcodeCountViewUiListener;
        this.b = new WeakReference(owner);
    }

    public final BarcodeCountViewUiListener a() {
        return this.f17576a;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onExitButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountViewUiListener barcodeCountViewUiListener;
        Intrinsics.h(overlay, "overlay");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.b.get();
        if (barcodeCountView == null || (barcodeCountViewUiListener = this.f17576a) == null) {
            return;
        }
        barcodeCountViewUiListener.onExitButtonTapped(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onListButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountViewUiListener barcodeCountViewUiListener;
        Intrinsics.h(overlay, "overlay");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.b.get();
        if (barcodeCountView == null || (barcodeCountViewUiListener = this.f17576a) == null) {
            return;
        }
        barcodeCountViewUiListener.onListButtonTapped(barcodeCountView);
    }
}

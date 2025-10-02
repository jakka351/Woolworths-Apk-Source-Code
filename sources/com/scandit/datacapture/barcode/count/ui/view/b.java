package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements BarcodeCountBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17575a;
    private final WeakReference b;

    public b(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17575a = new WeakReference(owner);
        this.b = new WeakReference(barcodeCountViewListener);
    }

    public final WeakReference a() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return null;
        }
        return barcodeCountViewListener.brushForRecognizedBarcode(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return null;
        }
        return barcodeCountViewListener.brushForRecognizedBarcodeNotInList(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return null;
        }
        return barcodeCountViewListener.brushForUnrecognizedBarcode(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onFilteredBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(filteredBarcode, "filteredBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return;
        }
        barcodeCountViewListener.onFilteredBarcodeTapped(barcodeCountView, filteredBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return;
        }
        barcodeCountViewListener.onRecognizedBarcodeNotInListTapped(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return;
        }
        barcodeCountViewListener.onRecognizedBarcodeTapped(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener barcodeCountViewListener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17575a.get();
        if (barcodeCountView == null || (barcodeCountViewListener = (BarcodeCountViewListener) this.b.get()) == null) {
            return;
        }
        barcodeCountViewListener.onUnrecognizedBarcodeTapped(barcodeCountView, trackedBarcode);
    }
}

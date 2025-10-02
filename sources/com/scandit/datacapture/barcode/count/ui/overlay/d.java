package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class d implements BarcodeCountBasicOverlayListener, BarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17551a;

    public d(BarcodeCountBasicOverlay owner) {
        Intrinsics.h(owner, "owner");
        this.f17551a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForRecognizedBarcode;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null && (brushBrushForRecognizedBarcode = listener.brushForRecognizedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForRecognizedBarcode;
        }
        NativeBrush scannedBrush = overlay.getB().getScannedBrush();
        if (scannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, scannedBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForRecognizedBarcodeNotInList;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null && (brushBrushForRecognizedBarcodeNotInList = listener.brushForRecognizedBarcodeNotInList(overlay, trackedBarcode)) != null) {
            return brushBrushForRecognizedBarcodeNotInList;
        }
        NativeBrush notInListBrush = overlay.getB().getNotInListBrush();
        if (notInListBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, notInListBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForUnrecognizedBarcode;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null && (brushBrushForUnrecognizedBarcode = listener.brushForUnrecognizedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForUnrecognizedBarcode;
        }
        NativeBrush unscannedBrush = overlay.getB().getUnscannedBrush();
        if (unscannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, unscannedBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onExitButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountBasicOverlayUiListener uiListener;
        Intrinsics.h(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (uiListener = barcodeCountBasicOverlay.getUiListener()) == null) {
            return;
        }
        uiListener.onExitButtonTapped(barcodeCountBasicOverlay);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onFilteredBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(filteredBarcode, "filteredBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onFilteredBarcodeTapped(overlay, filteredBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onListButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountBasicOverlayUiListener uiListener;
        Intrinsics.h(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (uiListener = barcodeCountBasicOverlay.getUiListener()) == null) {
            return;
        }
        uiListener.onListButtonTapped(barcodeCountBasicOverlay);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onRecognizedBarcodeNotInListTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onRecognizedBarcodeTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17551a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onUnrecognizedBarcodeTapped(overlay, trackedBarcode);
    }
}

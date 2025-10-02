package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountBasicOverlayListener {
    public abstract NativeBrush brushForTrackedBarcode(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForTrackedBarcodeNotInList(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForUntrackedBarcode(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void onFilteredBarcodeTapped(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void onTrackedBarcodeNotInListTapped(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void onTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void onUnTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);
}

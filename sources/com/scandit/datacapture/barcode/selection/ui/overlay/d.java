package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class d implements BarcodeSelectionBrushProvider {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18082a;

    public d(BarcodeSelectionBasicOverlay owner) {
        Intrinsics.h(owner, "owner");
        this.f18082a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider
    public final Brush brushForBarcode(Barcode barcode) {
        BarcodeSelectionBrushProvider trackedBarcodeBrushProvider;
        Intrinsics.h(barcode, "barcode");
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.f18082a.get();
        if (barcodeSelectionBasicOverlay == null || (trackedBarcodeBrushProvider = barcodeSelectionBasicOverlay.getTrackedBarcodeBrushProvider()) == null) {
            return null;
        }
        return trackedBarcodeBrushProvider.brushForBarcode(barcode);
    }
}

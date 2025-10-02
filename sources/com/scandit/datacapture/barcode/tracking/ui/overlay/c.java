package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements BarcodeTrackingBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18209a;

    public c(BarcodeTrackingBasicOverlay owner) {
        Intrinsics.h(owner, "owner");
        this.f18209a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayListener
    public final Brush brushForTrackedBarcode(BarcodeTrackingBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeTrackingBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.f18209a.get();
        if (barcodeTrackingBasicOverlay != null && (listener = barcodeTrackingBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) != null) {
            return listener.brushForTrackedBarcode(overlay, trackedBarcode);
        }
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay2 = (BarcodeTrackingBasicOverlay) this.f18209a.get();
        if (barcodeTrackingBasicOverlay2 != null) {
            return barcodeTrackingBasicOverlay2.getBrush();
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayListener
    public final void onTrackedBarcodeTapped(BarcodeTrackingBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeTrackingBasicOverlayListener listener;
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.f18209a.get();
        if (barcodeTrackingBasicOverlay == null || (listener = barcodeTrackingBasicOverlay.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onTrackedBarcodeTapped(overlay, trackedBarcode);
    }
}

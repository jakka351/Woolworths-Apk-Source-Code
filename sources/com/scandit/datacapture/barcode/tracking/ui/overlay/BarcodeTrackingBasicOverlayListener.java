package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ProxyReversedAdapter(owner = BarcodeTrackingBasicOverlay.class, value = NativeBarcodeTrackingBasicOverlayListener.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;", "", "brushForTrackedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "overlay", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "onTrackedBarcodeTapped", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeTrackingBasicOverlayListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onTrackedBarcodeTapped(@NotNull BarcodeTrackingBasicOverlayListener barcodeTrackingBasicOverlayListener, @NotNull BarcodeTrackingBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }
    }

    @ProxyFunction
    @Nullable
    Brush brushForTrackedBarcode(@NotNull BarcodeTrackingBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction
    void onTrackedBarcodeTapped(@NotNull BarcodeTrackingBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);
}

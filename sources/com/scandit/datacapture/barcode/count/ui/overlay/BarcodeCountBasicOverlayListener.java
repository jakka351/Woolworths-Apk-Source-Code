package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ProxyReversedAdapter(owner = BarcodeCountBasicOverlay.class, value = NativeBarcodeCountBasicOverlayListener.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0017J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "", "brushForRecognizedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "overlay", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "brushForRecognizedBarcodeNotInList", "brushForUnrecognizedBarcode", "onFilteredBarcodeTapped", "", "filteredBarcode", "onRecognizedBarcodeNotInListTapped", "onRecognizedBarcodeTapped", "onUnrecognizedBarcodeTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountBasicOverlayListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "brushForTrackedBarcode")
        @Nullable
        public static Brush brushForRecognizedBarcode(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForTrackedBarcodeNotInList")
        @Nullable
        public static Brush brushForRecognizedBarcodeNotInList(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForUntrackedBarcode")
        @Nullable
        public static Brush brushForUnrecognizedBarcode(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "onFilteredBarcodeTapped")
        public static void onFilteredBarcodeTapped(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode filteredBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(filteredBarcode, "filteredBarcode");
        }

        @ProxyFunction(nativeName = "onTrackedBarcodeNotInListTapped")
        public static void onRecognizedBarcodeNotInListTapped(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onTrackedBarcodeTapped")
        public static void onRecognizedBarcodeTapped(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onUnTrackedBarcodeTapped")
        public static void onUnrecognizedBarcodeTapped(@NotNull BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, @NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(overlay, "overlay");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }
    }

    @ProxyFunction(nativeName = "brushForTrackedBarcode")
    @Nullable
    Brush brushForRecognizedBarcode(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForTrackedBarcodeNotInList")
    @Nullable
    Brush brushForRecognizedBarcodeNotInList(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForUntrackedBarcode")
    @Nullable
    Brush brushForUnrecognizedBarcode(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onFilteredBarcodeTapped")
    void onFilteredBarcodeTapped(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode filteredBarcode);

    @ProxyFunction(nativeName = "onTrackedBarcodeNotInListTapped")
    void onRecognizedBarcodeNotInListTapped(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onTrackedBarcodeTapped")
    void onRecognizedBarcodeTapped(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onUnTrackedBarcodeTapped")
    void onUnrecognizedBarcodeTapped(@NotNull BarcodeCountBasicOverlay overlay, @NotNull TrackedBarcode trackedBarcode);
}

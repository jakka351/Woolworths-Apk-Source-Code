package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "", "brushForRecognizedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "view", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "brushForRecognizedBarcodeNotInList", "brushForUnrecognizedBarcode", "onCaptureListCompleted", "", "onFilteredBarcodeTapped", "filteredBarcode", "onRecognizedBarcodeNotInListTapped", "onRecognizedBarcodeTapped", "onUnrecognizedBarcodeTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountViewListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Brush brushForRecognizedBarcode(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        @Nullable
        public static Brush brushForRecognizedBarcodeNotInList(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        @Nullable
        public static Brush brushForUnrecognizedBarcode(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
            return null;
        }

        public static void onCaptureListCompleted(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view) {
            Intrinsics.h(view, "view");
        }

        public static void onFilteredBarcodeTapped(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode filteredBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(filteredBarcode, "filteredBarcode");
        }

        public static void onRecognizedBarcodeNotInListTapped(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }

        public static void onRecognizedBarcodeTapped(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }

        public static void onUnrecognizedBarcodeTapped(@NotNull BarcodeCountViewListener barcodeCountViewListener, @NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode) {
            Intrinsics.h(view, "view");
            Intrinsics.h(trackedBarcode, "trackedBarcode");
        }
    }

    @Nullable
    Brush brushForRecognizedBarcode(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);

    @Nullable
    Brush brushForRecognizedBarcodeNotInList(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);

    @Nullable
    Brush brushForUnrecognizedBarcode(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);

    void onCaptureListCompleted(@NotNull BarcodeCountView view);

    void onFilteredBarcodeTapped(@NotNull BarcodeCountView view, @NotNull TrackedBarcode filteredBarcode);

    void onRecognizedBarcodeNotInListTapped(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);

    void onRecognizedBarcodeTapped(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);

    void onUnrecognizedBarcodeTapped(@NotNull BarcodeCountView view, @NotNull TrackedBarcode trackedBarcode);
}

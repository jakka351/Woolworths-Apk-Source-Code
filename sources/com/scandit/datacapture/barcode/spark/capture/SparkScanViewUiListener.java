package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewUiListener;", "", "onBarcodeCountButtonTap", "", "view", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "onBarcodeFindButtonTap", "onFastFindButtonTap", "onScanningModeChange", "newScanningMode", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SparkScanViewUiListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBarcodeCountButtonTap(@NotNull SparkScanViewUiListener sparkScanViewUiListener, @NotNull SparkScanView view) {
            Intrinsics.h(view, "view");
        }

        public static void onBarcodeFindButtonTap(@NotNull SparkScanViewUiListener sparkScanViewUiListener, @NotNull SparkScanView view) {
            Intrinsics.h(view, "view");
        }

        @Deprecated
        public static void onFastFindButtonTap(@NotNull SparkScanViewUiListener sparkScanViewUiListener, @NotNull SparkScanView view) {
            Intrinsics.h(view, "view");
        }

        public static void onScanningModeChange(@NotNull SparkScanViewUiListener sparkScanViewUiListener, @NotNull SparkScanScanningMode newScanningMode) {
            Intrinsics.h(newScanningMode, "newScanningMode");
        }
    }

    void onBarcodeCountButtonTap(@NotNull SparkScanView view);

    void onBarcodeFindButtonTap(@NotNull SparkScanView view);

    @Deprecated
    void onFastFindButtonTap(@NotNull SparkScanView view);

    void onScanningModeChange(@NotNull SparkScanScanningMode newScanningMode);
}

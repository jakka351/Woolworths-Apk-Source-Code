package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.core.data.FrameData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanListener;", "", "onBarcodeScanned", "", "sparkScan", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "session", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "onSessionUpdated", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SparkScanListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBarcodeScanned(@NotNull SparkScanListener sparkScanListener, @NotNull SparkScan sparkScan, @NotNull SparkScanSession session, @Nullable FrameData frameData) {
            Intrinsics.h(sparkScan, "sparkScan");
            Intrinsics.h(session, "session");
        }

        public static void onSessionUpdated(@NotNull SparkScanListener sparkScanListener, @NotNull SparkScan sparkScan, @NotNull SparkScanSession session, @Nullable FrameData frameData) {
            Intrinsics.h(sparkScan, "sparkScan");
            Intrinsics.h(session, "session");
        }
    }

    void onBarcodeScanned(@NotNull SparkScan sparkScan, @NotNull SparkScanSession session, @Nullable FrameData data);

    void onSessionUpdated(@NotNull SparkScan sparkScan, @NotNull SparkScanSession session, @Nullable FrameData data);
}

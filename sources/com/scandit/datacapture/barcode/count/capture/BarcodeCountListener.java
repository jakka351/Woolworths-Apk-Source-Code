package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.core.data.FrameData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountListener;", "", "onObservationStarted", "", "mode", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "onObservationStopped", "onScan", "session", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "onSessionUpdated", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onObservationStarted(@NotNull BarcodeCountListener barcodeCountListener, @NotNull BarcodeCount mode) {
            Intrinsics.h(mode, "mode");
        }

        public static void onObservationStopped(@NotNull BarcodeCountListener barcodeCountListener, @NotNull BarcodeCount mode) {
            Intrinsics.h(mode, "mode");
        }

        public static void onScan(@NotNull BarcodeCountListener barcodeCountListener, @NotNull BarcodeCount mode, @NotNull BarcodeCountSession session, @NotNull FrameData data) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(session, "session");
            Intrinsics.h(data, "data");
        }

        public static void onSessionUpdated(@NotNull BarcodeCountListener barcodeCountListener, @NotNull BarcodeCount mode, @NotNull BarcodeCountSession session, @NotNull FrameData data) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(session, "session");
            Intrinsics.h(data, "data");
        }
    }

    void onObservationStarted(@NotNull BarcodeCount mode);

    void onObservationStopped(@NotNull BarcodeCount mode);

    void onScan(@NotNull BarcodeCount mode, @NotNull BarcodeCountSession session, @NotNull FrameData data);

    void onSessionUpdated(@NotNull BarcodeCount mode, @NotNull BarcodeCountSession session, @NotNull FrameData data);
}

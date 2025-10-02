package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeTracking.class, value = NativeBarcodeTrackingListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingListener;", "", "onObservationStarted", "", "barcodeTracking", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "onObservationStopped", "onSessionUpdated", "mode", "session", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeTrackingListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onObservationStarted(@NotNull BarcodeTrackingListener barcodeTrackingListener, @NotNull BarcodeTracking barcodeTracking) {
            Intrinsics.h(barcodeTracking, "barcodeTracking");
        }

        @ProxyFunction
        public static void onObservationStopped(@NotNull BarcodeTrackingListener barcodeTrackingListener, @NotNull BarcodeTracking barcodeTracking) {
            Intrinsics.h(barcodeTracking, "barcodeTracking");
        }

        @ProxyFunction
        public static void onSessionUpdated(@NotNull BarcodeTrackingListener barcodeTrackingListener, @NotNull BarcodeTracking mode, @NotNull BarcodeTrackingSession session, @NotNull FrameData data) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(session, "session");
            Intrinsics.h(data, "data");
        }
    }

    @ProxyFunction
    void onObservationStarted(@NotNull BarcodeTracking barcodeTracking);

    @ProxyFunction
    void onObservationStopped(@NotNull BarcodeTracking barcodeTracking);

    @ProxyFunction
    void onSessionUpdated(@NotNull BarcodeTracking mode, @NotNull BarcodeTrackingSession session, @NotNull FrameData data);
}

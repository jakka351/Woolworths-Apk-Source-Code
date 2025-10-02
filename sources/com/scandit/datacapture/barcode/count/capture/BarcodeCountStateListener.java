package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeCount.class, value = NativeBarcodeCountStateListener.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J(\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListener;", "", "onObservationStarted", "", "mode", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "onObservationStopped", "onStateChanged", "oldState", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountState;", "newState", "frameData", "Lcom/scandit/datacapture/core/data/FrameData;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountStateListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onObservationStarted(@NotNull BarcodeCountStateListener barcodeCountStateListener, @NotNull BarcodeCount mode) {
            Intrinsics.h(mode, "mode");
        }

        @ProxyFunction
        public static void onObservationStopped(@NotNull BarcodeCountStateListener barcodeCountStateListener, @NotNull BarcodeCount mode) {
            Intrinsics.h(mode, "mode");
        }

        @ProxyFunction
        public static void onStateChanged(@NotNull BarcodeCountStateListener barcodeCountStateListener, @NotNull BarcodeCountState oldState, @NotNull BarcodeCountState newState, @NotNull FrameData frameData, @NotNull BarcodeCount mode) {
            Intrinsics.h(oldState, "oldState");
            Intrinsics.h(newState, "newState");
            Intrinsics.h(frameData, "frameData");
            Intrinsics.h(mode, "mode");
        }
    }

    @ProxyFunction
    void onObservationStarted(@NotNull BarcodeCount mode);

    @ProxyFunction
    void onObservationStopped(@NotNull BarcodeCount mode);

    @ProxyFunction
    void onStateChanged(@NotNull BarcodeCountState oldState, @NotNull BarcodeCountState newState, @NotNull FrameData frameData, @NotNull BarcodeCount mode);
}

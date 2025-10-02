package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(owner = BarcodeCountCaptureList.class, value = NativeBarcodeCountCaptureListListener.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;", "", "onCaptureListCompleted", "", "list", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "session", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSession;", "onCaptureListSessionUpdated", "onObservationStarted", "onObservationStopped", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountCaptureListListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onCaptureListCompleted(@NotNull BarcodeCountCaptureListListener barcodeCountCaptureListListener, @NotNull BarcodeCountCaptureList list, @NotNull BarcodeCountCaptureListSession session) {
            Intrinsics.h(list, "list");
            Intrinsics.h(session, "session");
        }

        @ProxyFunction
        public static void onCaptureListSessionUpdated(@NotNull BarcodeCountCaptureListListener barcodeCountCaptureListListener, @NotNull BarcodeCountCaptureList list, @NotNull BarcodeCountCaptureListSession session) {
            Intrinsics.h(list, "list");
            Intrinsics.h(session, "session");
        }

        @ProxyFunction
        public static void onObservationStarted(@NotNull BarcodeCountCaptureListListener barcodeCountCaptureListListener, @NotNull BarcodeCountCaptureList list) {
            Intrinsics.h(list, "list");
        }

        @ProxyFunction
        public static void onObservationStopped(@NotNull BarcodeCountCaptureListListener barcodeCountCaptureListListener, @NotNull BarcodeCountCaptureList list) {
            Intrinsics.h(list, "list");
        }
    }

    @ProxyFunction
    void onCaptureListCompleted(@NotNull BarcodeCountCaptureList list, @NotNull BarcodeCountCaptureListSession session);

    @ProxyFunction
    void onCaptureListSessionUpdated(@NotNull BarcodeCountCaptureList list, @NotNull BarcodeCountCaptureListSession session);

    @ProxyFunction
    void onObservationStarted(@NotNull BarcodeCountCaptureList list);

    @ProxyFunction
    void onObservationStopped(@NotNull BarcodeCountCaptureList list);
}

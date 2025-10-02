package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;", "", "onFrameSourceChanged", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "onModeAdded", "dataCaptureMode", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "onModeRemoved", "onObservationStarted", "onObservationStopped", "onStatusChanged", "contextStatus", "Lcom/scandit/datacapture/core/common/ContextStatus;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DataCaptureContextListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFrameSourceChanged(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext, @Nullable FrameSource frameSource) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }

        public static void onModeAdded(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(dataCaptureMode, "dataCaptureMode");
        }

        public static void onModeRemoved(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(dataCaptureMode, "dataCaptureMode");
        }

        public static void onObservationStarted(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }

        public static void onObservationStopped(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        }

        public static void onStatusChanged(@NotNull DataCaptureContextListener dataCaptureContextListener, @NotNull DataCaptureContext dataCaptureContext, @NotNull ContextStatus contextStatus) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(contextStatus, "contextStatus");
        }
    }

    void onFrameSourceChanged(@NotNull DataCaptureContext dataCaptureContext, @Nullable FrameSource frameSource);

    void onModeAdded(@NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode);

    void onModeRemoved(@NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode);

    void onObservationStarted(@NotNull DataCaptureContext dataCaptureContext);

    void onObservationStopped(@NotNull DataCaptureContext dataCaptureContext);

    void onStatusChanged(@NotNull DataCaptureContext dataCaptureContext, @NotNull ContextStatus contextStatus);
}

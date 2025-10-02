package com.scandit.datacapture.core.framesave;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSessionListener;", "", "onFrameSave", "", "processedFrameCount", "", "finished", "", "onObservationStarted", "onObservationStopped", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraSequenceFrameSaveSessionListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFrameSave(@NotNull CameraSequenceFrameSaveSessionListener cameraSequenceFrameSaveSessionListener, int i, boolean z) {
        }

        public static void onObservationStarted(@NotNull CameraSequenceFrameSaveSessionListener cameraSequenceFrameSaveSessionListener) {
        }

        public static void onObservationStopped(@NotNull CameraSequenceFrameSaveSessionListener cameraSequenceFrameSaveSessionListener) {
        }
    }

    void onFrameSave(int processedFrameCount, boolean finished);

    void onObservationStarted();

    void onObservationStopped();
}

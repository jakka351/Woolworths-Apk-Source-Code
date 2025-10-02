package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18514a;

    public b(CameraSequenceFrameSaveSession owner) {
        Intrinsics.h(owner, "owner");
        this.f18514a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        DataCaptureContextFrameListener.DefaultImpls.onFrameProcessingFinished(this, dataCaptureContext, frameData);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(frameData, "frameData");
        CameraSequenceFrameSaveSession cameraSequenceFrameSaveSession = (CameraSequenceFrameSaveSession) this.f18514a.get();
        if (cameraSequenceFrameSaveSession != null) {
            if (cameraSequenceFrameSaveSession.g) {
                cameraSequenceFrameSaveSession.g = false;
                cameraSequenceFrameSaveSession.onFrameSaveFinished();
            } else if (cameraSequenceFrameSaveSession.e) {
                SingleFrameRecorder singleFrameRecorder = cameraSequenceFrameSaveSession.b;
                if (singleFrameRecorder != null) {
                    singleFrameRecorder.saveFrame(frameData, dataCaptureContext);
                }
                cameraSequenceFrameSaveSession.onFrameSaveSuccess();
            }
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        DataCaptureContextFrameListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextFrameListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }
}

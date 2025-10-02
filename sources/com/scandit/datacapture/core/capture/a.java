package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.capture.DataCaptureContextFrameListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements DataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18432a;

    public a(DataCaptureContext owner) {
        Intrinsics.h(owner, "owner");
        this.f18432a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData) {
        CopyOnWriteArraySet<DataCaptureContextFrameListener> frameListeners$scandit_capture_core;
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(frameData, "frameData");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f18432a.get();
        if (dataCaptureContext2 == null || (frameListeners$scandit_capture_core = dataCaptureContext2.getFrameListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = frameListeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextFrameListener) it.next()).onFrameProcessingFinished(dataCaptureContext, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextFrameListener
    public final void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData) {
        CopyOnWriteArraySet<DataCaptureContextFrameListener> frameListeners$scandit_capture_core;
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(frameData, "frameData");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f18432a.get();
        if (dataCaptureContext2 == null || (frameListeners$scandit_capture_core = dataCaptureContext2.getFrameListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = frameListeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextFrameListener) it.next()).onFrameProcessingStarted(dataCaptureContext, frameData);
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

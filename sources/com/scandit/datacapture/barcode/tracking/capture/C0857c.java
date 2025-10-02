package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0857c implements BarcodeTrackingListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18167a;

    public C0857c(BarcodeTracking owner) {
        Intrinsics.h(owner, "owner");
        this.f18167a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
    public final void onObservationStarted(BarcodeTracking barcodeTracking) {
        BarcodeTrackingListener.DefaultImpls.onObservationStarted(this, barcodeTracking);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
    public final void onObservationStopped(BarcodeTracking barcodeTracking) {
        BarcodeTrackingListener.DefaultImpls.onObservationStopped(this, barcodeTracking);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
    public final void onSessionUpdated(BarcodeTracking mode, BarcodeTrackingSession session, FrameData data) {
        CopyOnWriteArrayList<BarcodeTrackingListener> listeners$scandit_barcode_capture;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeTracking barcodeTracking = (BarcodeTracking) this.f18167a.get();
        if (barcodeTracking == null || (listeners$scandit_barcode_capture = barcodeTracking.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_barcode_capture.iterator();
        while (it.hasNext()) {
            ((BarcodeTrackingListener) it.next()).onSessionUpdated(mode, session, data);
        }
    }
}

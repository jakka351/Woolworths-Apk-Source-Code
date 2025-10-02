package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSession;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0619f7 implements BarcodeTrackingListener {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f17638a;
    private long b = 1500;
    private long c = -1;

    public final Runnable a() {
        return this.f17638a;
    }

    public final long b() {
        return this.b;
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
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!session.getAddedTrackedBarcodes().isEmpty() || !session.getRemovedTrackedBarcodes().isEmpty() || this.c == -1) {
            this.c = jCurrentTimeMillis;
            return;
        }
        if (session.getTrackedBarcodes().isEmpty() || jCurrentTimeMillis - this.c < this.b) {
            return;
        }
        Runnable runnable = this.f17638a;
        if (runnable != null) {
            runnable.run();
        }
        this.c = -1L;
    }

    public final void a(Runnable runnable) {
        this.f17638a = runnable;
    }

    public final void a(long j) {
        this.b = j;
    }
}

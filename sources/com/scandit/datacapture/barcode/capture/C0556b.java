package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.capture.BarcodeCaptureListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.capture.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0556b implements BarcodeCaptureListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17439a;

    public C0556b(BarcodeCapture owner) {
        Intrinsics.h(owner, "owner");
        this.f17439a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onBarcodeScanned(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodeCapture, "barcodeCapture");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCapture barcodeCapture2 = (BarcodeCapture) this.f17439a.get();
        if (barcodeCapture2 == null || (copyOnWriteArraySet = barcodeCapture2.f) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeCaptureListener) it.next()).onBarcodeScanned(barcodeCapture, session, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onObservationStarted(BarcodeCapture barcodeCapture) {
        BarcodeCaptureListener.DefaultImpls.onObservationStarted(this, barcodeCapture);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onObservationStopped(BarcodeCapture barcodeCapture) {
        BarcodeCaptureListener.DefaultImpls.onObservationStopped(this, barcodeCapture);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onSessionUpdated(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodeCapture, "barcodeCapture");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCapture barcodeCapture2 = (BarcodeCapture) this.f17439a.get();
        if (barcodeCapture2 == null || (copyOnWriteArraySet = barcodeCapture2.f) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeCaptureListener) it.next()).onSessionUpdated(barcodeCapture, session, data);
        }
    }
}

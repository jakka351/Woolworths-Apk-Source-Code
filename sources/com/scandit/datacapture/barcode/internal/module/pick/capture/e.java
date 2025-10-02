package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSession;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class e implements BarcodePickScanningListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17754a;

    public e(BarcodePickInternal owner) {
        Intrinsics.h(owner, "owner");
        this.f17754a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onObservationStarted(BarcodePick barcodePick) {
        BarcodePickScanningListener.DefaultImpls.onObservationStarted(this, barcodePick);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onObservationStopped(BarcodePick barcodePick) {
        BarcodePickScanningListener.DefaultImpls.onObservationStopped(this, barcodePick);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onScanningSessionCompleted(BarcodePick barcodePick, BarcodePickScanningSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodePick, "barcodePick");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17754a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.g) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickScanningListener) it.next()).onScanningSessionCompleted(barcodePick, session);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onScanningSessionUpdated(BarcodePick barcodePick, BarcodePickScanningSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodePick, "barcodePick");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17754a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.g) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickScanningListener) it.next()).onScanningSessionUpdated(barcodePick, session);
        }
    }
}

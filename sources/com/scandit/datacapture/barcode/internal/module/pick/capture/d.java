package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class d implements com.scandit.datacapture.barcode.pick.capture.BarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17753a;

    public d(BarcodePickInternal owner) {
        Intrinsics.h(owner, "owner");
        this.f17753a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onObservationStarted(BarcodePick barcodePick) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodePick, "barcodePick");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17753a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onObservationStarted(barcodePick);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onObservationStopped(BarcodePick barcodePick) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodePick, "barcodePick");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17753a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onObservationStopped(barcodePick);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onSessionUpdated(BarcodePick barcodePick, com.scandit.datacapture.barcode.pick.capture.BarcodePickSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodePick, "barcodePick");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17753a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onSessionUpdated(barcodePick, session);
        }
    }
}

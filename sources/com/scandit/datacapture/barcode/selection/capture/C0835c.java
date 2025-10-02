package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0835c implements BarcodeSelectionListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18043a;

    public C0835c(BarcodeSelection owner) {
        Intrinsics.h(owner, "owner");
        this.f18043a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onObservationStarted(BarcodeSelection barcodeSelection) {
        BarcodeSelectionListener.DefaultImpls.onObservationStarted(this, barcodeSelection);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onObservationStopped(BarcodeSelection barcodeSelection) {
        BarcodeSelectionListener.DefaultImpls.onObservationStopped(this, barcodeSelection);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onSelectionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodeSelection, "barcodeSelection");
        Intrinsics.h(session, "session");
        BarcodeSelection barcodeSelection2 = (BarcodeSelection) this.f18043a.get();
        if (barcodeSelection2 == null || (copyOnWriteArraySet = barcodeSelection2.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeSelectionListener) it.next()).onSelectionUpdated(barcodeSelection, session, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onSessionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(barcodeSelection, "barcodeSelection");
        Intrinsics.h(session, "session");
        BarcodeSelection barcodeSelection2 = (BarcodeSelection) this.f18043a.get();
        if (barcodeSelection2 == null || (copyOnWriteArraySet = barcodeSelection2.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeSelectionListener) it.next()).onSessionUpdated(barcodeSelection, session, frameData);
        }
    }
}

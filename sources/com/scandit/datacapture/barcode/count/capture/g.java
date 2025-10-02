package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class g implements BarcodeCountCaptureListListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17484a;

    public g(BarcodeCount owner) {
        Intrinsics.h(owner, "owner");
        this.f17484a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onCaptureListCompleted(BarcodeCountCaptureList list, BarcodeCountCaptureListSession session) {
        CopyOnWriteArrayList<BarcodeCountCaptureListListener> listListeners$scandit_barcode_capture;
        Intrinsics.h(list, "list");
        Intrinsics.h(session, "session");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17484a.get();
        if (barcodeCount == null || (listListeners$scandit_barcode_capture = barcodeCount.getListListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it = listListeners$scandit_barcode_capture.iterator();
        while (it.hasNext()) {
            ((BarcodeCountCaptureListListener) it.next()).onCaptureListCompleted(list, session);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onCaptureListSessionUpdated(BarcodeCountCaptureList list, BarcodeCountCaptureListSession session) {
        CopyOnWriteArrayList<BarcodeCountCaptureListListener> listListeners$scandit_barcode_capture;
        Intrinsics.h(list, "list");
        Intrinsics.h(session, "session");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17484a.get();
        if (barcodeCount == null || (listListeners$scandit_barcode_capture = barcodeCount.getListListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it = listListeners$scandit_barcode_capture.iterator();
        while (it.hasNext()) {
            ((BarcodeCountCaptureListListener) it.next()).onCaptureListSessionUpdated(list, session);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onObservationStarted(BarcodeCountCaptureList list) {
        CopyOnWriteArrayList<BarcodeCountCaptureListListener> listListeners$scandit_barcode_capture;
        Intrinsics.h(list, "list");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17484a.get();
        if (barcodeCount == null || (listListeners$scandit_barcode_capture = barcodeCount.getListListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it = listListeners$scandit_barcode_capture.iterator();
        while (it.hasNext()) {
            ((BarcodeCountCaptureListListener) it.next()).onObservationStarted(list);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onObservationStopped(BarcodeCountCaptureList list) {
        CopyOnWriteArrayList<BarcodeCountCaptureListListener> listListeners$scandit_barcode_capture;
        Intrinsics.h(list, "list");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17484a.get();
        if (barcodeCount == null || (listListeners$scandit_barcode_capture = barcodeCount.getListListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it = listListeners$scandit_barcode_capture.iterator();
        while (it.hasNext()) {
            ((BarcodeCountCaptureListListener) it.next()).onObservationStopped(list);
        }
    }
}

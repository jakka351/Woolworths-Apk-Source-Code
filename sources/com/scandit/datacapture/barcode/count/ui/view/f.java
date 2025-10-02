package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class f implements BarcodeCountBasicOverlayCallback {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17579a;

    public f(BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17579a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback
    public final void cleanUpOverlayViews() {
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback
    public final void onDataCaptureViewSizeChanged() {
        WeakReference weakReference;
        BarcodeCount barcodeCount;
        NativeBarcodeCountSession session;
        BarcodeCountView barcodeCountView;
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        BarcodeCountView barcodeCountView2 = (BarcodeCountView) this.f17579a.get();
        if (barcodeCountView2 == null || (weakReference = barcodeCountView2.k) == null || (barcodeCount = (BarcodeCount) weakReference.get()) == null || (session = barcodeCount.getF17472a().getSession()) == null) {
            return;
        }
        InternalBarcodeCountSession internalBarcodeCountSession = new InternalBarcodeCountSession(new e(session));
        if (internalBarcodeCountSession.d() || (barcodeCountView = (BarcodeCountView) this.f17579a.get()) == null || (barcodeIndicatorPresenter = barcodeCountView.h) == null) {
            return;
        }
        long jC = internalBarcodeCountSession.c();
        Collection<NativeTrackedBarcode> collectionValues = internalBarcodeCountSession.a().getTrackedBarcodes().values();
        Intrinsics.g(collectionValues, "_impl().trackedBarcodes.values");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        ArrayList<NativeTrackedBarcode> unscannedTrackedBarcodes = internalBarcodeCountSession.a().getUnscannedTrackedBarcodes();
        Intrinsics.g(unscannedTrackedBarcodes, "_impl().unscannedTrackedBarcodes");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(unscannedTrackedBarcodes, 10));
        for (NativeTrackedBarcode it2 : unscannedTrackedBarcodes) {
            Intrinsics.g(it2, "it");
            arrayList2.add(new TrackedBarcode(it2));
        }
        Collection<NativeTrackedBarcode> collectionValues2 = internalBarcodeCountSession.a().getFilteredTrackedBarcodes().values();
        Intrinsics.g(collectionValues2, "_impl().filteredTrackedBarcodes.values");
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(collectionValues2, 10));
        Iterator<T> it3 = collectionValues2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new TrackedBarcode((NativeTrackedBarcode) it3.next()));
        }
        barcodeIndicatorPresenter.a(jC, arrayList, arrayList2, arrayList3);
    }
}

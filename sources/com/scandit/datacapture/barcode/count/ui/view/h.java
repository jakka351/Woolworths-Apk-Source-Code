package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.O;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class h implements O {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17581a;

    public h(BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17581a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a(Function0 onFocus) {
        BarcodeCountCameraHandler barcodeCountCameraHandler;
        Intrinsics.h(onFocus, "onFocus");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (barcodeCountCameraHandler = barcodeCountView.i) == null) {
            return;
        }
        barcodeCountCameraHandler.a(new g(onFocus));
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void b() {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.h) == null) {
            return;
        }
        barcodeIndicatorPresenter.reset();
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void c() {
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView != null) {
            barcodeCountView.g();
        }
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void d() {
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView != null) {
            barcodeCountView.disableScanningAndResetBarcodeIndicators$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a() {
        BarcodeCountViewUiListener uiListener;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (uiListener = barcodeCountView.getUiListener()) == null) {
            return;
        }
        uiListener.onSingleScanButtonTapped(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a(boolean z) {
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView != null) {
            if (z) {
                BarcodeCountView.access$enableStatusMode(barcodeCountView);
            } else {
                BarcodeCountView.access$disableStatusMode(barcodeCountView);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a(NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.h(colorScheme, "colorScheme");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.h) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(colorScheme);
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a(InternalBarcodeCountSession session) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.h(session, "session");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.h) == null) {
            return;
        }
        long jC = session.c();
        Collection<NativeTrackedBarcode> collectionValues = session.a().getTrackedBarcodes().values();
        Intrinsics.g(collectionValues, "_impl().trackedBarcodes.values");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        ArrayList<NativeTrackedBarcode> unscannedTrackedBarcodes = session.a().getUnscannedTrackedBarcodes();
        Intrinsics.g(unscannedTrackedBarcodes, "_impl().unscannedTrackedBarcodes");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(unscannedTrackedBarcodes, 10));
        for (NativeTrackedBarcode it2 : unscannedTrackedBarcodes) {
            Intrinsics.g(it2, "it");
            arrayList2.add(new TrackedBarcode(it2));
        }
        Collection<NativeTrackedBarcode> collectionValues2 = session.a().getFilteredTrackedBarcodes().values();
        Intrinsics.g(collectionValues2, "_impl().filteredTrackedBarcodes.values");
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(collectionValues2, 10));
        Iterator<T> it3 = collectionValues2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new TrackedBarcode((NativeTrackedBarcode) it3.next()));
        }
        barcodeIndicatorPresenter.a(jC, arrayList, arrayList2, arrayList3);
    }

    @Override // com.scandit.datacapture.barcode.O
    public final void a(List statusList) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.h(statusList, "statusList");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17581a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.h) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(statusList);
    }
}

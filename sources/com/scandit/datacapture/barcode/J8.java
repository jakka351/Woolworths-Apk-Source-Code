package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J8 implements InternalBarcodeFindListener, DataCaptureViewSizeListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFind f17206a;
    private final WeakReference b;

    public J8(BarcodeFind mode, BarcodeFindViewPresenter presenter) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(presenter, "presenter");
        this.f17206a = mode;
        this.b = new WeakReference(presenter);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void onSearchStarted() {
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.onSearchStarted();
        }
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
    public final void onSizeChanged(DataCaptureView view, int i, int i2, int i3) {
        BarcodeFindViewPresenter barcodeFindViewPresenter;
        Intrinsics.h(view, "view");
        NativeBarcodeFindSession session = this.f17206a.getF17661a().getSession();
        if (session == null || (barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.b.get()) == null) {
            return;
        }
        Collection<NativeTrackedBarcode> collectionValues = session.getFoundTrackedBarcodes().values();
        Intrinsics.g(collectionValues, "session.foundTrackedBarcodes.values");
        Collection<NativeTrackedBarcode> collectionValues2 = session.getTrackedBarcodes().values();
        Intrinsics.g(collectionValues2, "session.trackedBarcodes.values");
        barcodeFindViewPresenter.a(collectionValues, collectionValues2, new I8(session));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode, NativeBarcodeFindSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.b.get();
        if (barcodeFindViewPresenter != null) {
            Collection<NativeTrackedBarcode> collectionValues = session.getFoundTrackedBarcodes().values();
            Intrinsics.g(collectionValues, "session.foundTrackedBarcodes.values");
            Collection<NativeTrackedBarcode> collectionValues2 = session.getTrackedBarcodes().values();
            Intrinsics.g(collectionValues2, "session.trackedBarcodes.values");
            barcodeFindViewPresenter.a(collectionValues, collectionValues2, new H8(session));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.a(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.c();
        }
    }
}

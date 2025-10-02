package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public interface BarcodeIndicatorPresenter {
    void a(long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3);

    void a(FrameLayout frameLayout);

    void a(BarcodeCountCaptureListSession barcodeCountCaptureListSession);

    void a(NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme);

    void a(TrackedBarcode trackedBarcode);

    void a(List list);

    void a(boolean z);

    void a(boolean z, boolean z2);

    void b(boolean z, boolean z2);

    void reset();
}

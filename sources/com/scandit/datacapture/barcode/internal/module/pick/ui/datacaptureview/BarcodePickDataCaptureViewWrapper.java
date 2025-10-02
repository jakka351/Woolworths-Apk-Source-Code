package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;

/* loaded from: classes6.dex */
public interface BarcodePickDataCaptureViewWrapper {
    void a();

    void a(float f);

    void a(ViewGroup viewGroup, RelativeLayout.LayoutParams layoutParams);

    void a(DataCaptureContext dataCaptureContext);

    void a(DataCaptureViewSizeListener dataCaptureViewSizeListener);

    void a(DataCaptureOverlay dataCaptureOverlay);

    void b();

    void b(DataCaptureOverlay dataCaptureOverlay);

    Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral);
}

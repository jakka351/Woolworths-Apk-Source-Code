package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.util.Size;
import com.scandit.datacapture.barcode.O;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarViewHolder;

/* loaded from: classes6.dex */
public interface BarcodeCountUiHandler {
    void a(int i);

    void a(Size size, Size size2);

    void a(O o);

    void a(BarcodeCount barcodeCount);

    void a(BarcodeCountFeedback barcodeCountFeedback);

    void a(BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener);

    void a(BarcodeCountViewLayerManager barcodeCountViewLayerManager, BarcodeCount barcodeCount, boolean z);

    void a(BarcodeCountViewSettings barcodeCountViewSettings);

    void a(boolean z);

    void a(boolean z, boolean z2);

    boolean a();

    BarcodeCountViewInternalUiListener b();

    void b(int i);

    void b(BarcodeCountViewSettings barcodeCountViewSettings);

    void b(boolean z);

    void c();

    void d();

    boolean e();

    BarcodeCountToolbarViewHolder f();

    void g();

    int h();

    void i();
}

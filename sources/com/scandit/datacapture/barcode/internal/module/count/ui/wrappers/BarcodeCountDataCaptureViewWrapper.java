package com.scandit.datacapture.barcode.internal.module.count.ui.wrappers;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;

/* loaded from: classes6.dex */
public interface BarcodeCountDataCaptureViewWrapper {
    void a(ViewGroup viewGroup);

    void a(RelativeLayout.LayoutParams layoutParams);

    void a(BarcodeCountBasicOverlay barcodeCountBasicOverlay);

    void a(TorchSwitchControl torchSwitchControl);

    void a(TorchSwitchControl torchSwitchControl, Anchor anchor, PointWithUnit pointWithUnit);

    void b(BarcodeCountBasicOverlay barcodeCountBasicOverlay);
}

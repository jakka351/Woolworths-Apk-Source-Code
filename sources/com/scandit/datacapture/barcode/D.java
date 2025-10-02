package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D implements BarcodeCountDataCaptureViewWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f17127a;

    public D(DataCaptureView dataCaptureView) {
        Intrinsics.h(dataCaptureView, "dataCaptureView");
        this.f17127a = dataCaptureView;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void a(BarcodeCountBasicOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.f17127a.removeOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void b(BarcodeCountBasicOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.f17127a.addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void a(ViewGroup container) {
        Intrinsics.h(container, "container");
        ViewParent parent = this.f17127a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f17127a);
        }
        container.addView(this.f17127a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void a(RelativeLayout.LayoutParams layoutParams) {
        Intrinsics.h(layoutParams, "layoutParams");
        this.f17127a.setLayoutParams(layoutParams);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void a(TorchSwitchControl control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.h(control, "control");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        this.f17127a.addControl(control, anchor, offset);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountDataCaptureViewWrapper
    public final void a(TorchSwitchControl control) {
        Intrinsics.h(control, "control");
        this.f17127a.removeControl(control);
    }
}

package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.core.ui.DataCaptureViewListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements DataCaptureViewListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17548a;

    public a(BarcodeCountBasicOverlay owner) {
        Intrinsics.h(owner, "owner");
        this.f17548a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewListener
    public final void onSizeChanged(int i, int i2, int i3) {
        BarcodeCountBasicOverlayCallback callback;
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f17548a.get();
        if (barcodeCountBasicOverlay == null || (callback = barcodeCountBasicOverlay.getCallback()) == null) {
            return;
        }
        callback.onDataCaptureViewSizeChanged();
    }
}

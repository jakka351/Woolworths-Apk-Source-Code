package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.C0726m2;
import com.scandit.datacapture.barcode.T3;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodePickBasicOverlay extends ViewBasedDataCaptureOverlay implements DataCaptureOverlay {
    private final /* synthetic */ C0726m2 b;

    private BarcodePickBasicOverlay(Context context, NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlay) {
        super(context);
        this.b = new C0726m2(nativeBarcodePickBasicOverlay);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _cleanupViews() {
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getD() {
        return this.b.getD();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.h(view, "view");
    }

    public final NativeBarcodePickBasicOverlay a() {
        return this.b.a();
    }

    public final void a(BarcodePickViewSettings viewSettings) {
        Intrinsics.h(viewSettings, "viewSettings");
        this.b.a(viewSettings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickBasicOverlay(Context context, BarcodePick mode, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlayCreate = NativeBarcodePickBasicOverlay.create(mode._impl$scandit_barcode_capture(), viewSettings.getF17954a());
        Intrinsics.g(nativeBarcodePickBasicOverlayCreate, "create(mode._impl(), viewSettings._impl())");
        this(context, nativeBarcodePickBasicOverlayCreate);
    }

    public final void a(BarcodePickGuidanceHandler handler) {
        Intrinsics.h(handler, "handler");
        this.b.a().setGuidanceHandler(new T3(handler, ProxyCacheKt.getGlobalProxyCache()));
    }
}

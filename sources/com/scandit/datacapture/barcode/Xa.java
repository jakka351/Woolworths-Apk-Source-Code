package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xa implements DataCaptureOverlay {
    private final NativeSparkScanOverlay b;
    private final NativeDataCaptureOverlay c;

    public Xa(NativeSparkScanOverlay _NativeSparkScanOverlay, ProxyCache proxyCache) {
        Intrinsics.h(_NativeSparkScanOverlay, "_NativeSparkScanOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeSparkScanOverlay;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeSparkScanOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeSparkScanOverlay.asDataCaptureOverlay()");
        this.c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getD() {
        return this.c;
    }

    public final void a() {
        this.b.hideMiniPreview();
    }

    public final void b(boolean z) {
        this.b.setShouldDrawViewFinder(z);
    }

    public final void c(boolean z) {
        this.b.enableSingleScanMode(z);
    }

    public final boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    public final void setBrush(Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    public final void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public final void a(boolean z) {
        this.b.onErrorFeedbackEmitted(z);
    }

    public /* synthetic */ Xa(NativeSparkScanOverlay nativeSparkScanOverlay) {
        this(nativeSparkScanOverlay, ProxyCacheKt.getGlobalProxyCache());
    }

    public final void a(Brush brush) {
        Intrinsics.h(brush, "brush");
        this.b.setBrushForErrorBarcodes(CoreNativeTypeFactory.INSTANCE.convert(brush));
    }
}

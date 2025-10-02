package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.scandit.datacapture.barcode.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0726m2 implements DataCaptureOverlay {
    private final NativeBarcodePickBasicOverlay b;
    private final ProxyCache c;
    private final NativeDataCaptureOverlay d;

    public C0726m2(NativeBarcodePickBasicOverlay _NativeBarcodePickBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickBasicOverlay, "_NativeBarcodePickBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodePickBasicOverlay;
        this.c = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodePickBasicOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodePickBasicO…ay.asDataCaptureOverlay()");
        this.d = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getD() {
        return this.d;
    }

    public final NativeBarcodePickBasicOverlay a() {
        return this.b;
    }

    public final void a(BarcodePickViewSettings viewSettings) {
        Intrinsics.h(viewSettings, "viewSettings");
        NativeBarcodePickViewSettings f17954a = viewSettings.getF17954a();
        this.c.put(Reflection.f24268a.b(NativeBarcodePickViewSettings.class), null, f17954a, viewSettings);
        this.b.applyViewSettings(f17954a);
    }

    public /* synthetic */ C0726m2(NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlay) {
        this(nativeBarcodePickBasicOverlay, ProxyCacheKt.getGlobalProxyCache());
    }
}

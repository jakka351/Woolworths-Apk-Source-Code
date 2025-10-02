package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T3 extends NativeBarcodePickGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickGuidanceHandler f17303a;

    public T3(BarcodePickGuidanceHandler _BarcodePickGuidanceHandler, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodePickGuidanceHandler, "_BarcodePickGuidanceHandler");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17303a = _BarcodePickGuidanceHandler;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void hideLoadingPopup() {
        this.f17303a.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setInitialGuidance(boolean z, String text) {
        Intrinsics.h(text, "text");
        this.f17303a.b(z, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setMoveCloserGuidance(boolean z, String text) {
        Intrinsics.h(text, "text");
        this.f17303a.a(z, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setTapShutterToPauseGuidance(boolean z, String text) {
        Intrinsics.h(text, "text");
        this.f17303a.c(z, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void showLoadingPopup() {
        this.f17303a.b();
    }
}

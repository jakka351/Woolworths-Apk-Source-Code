package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0756o0 implements InterfaceC0740n0 {
    private final NativeBarcodeFindBasicOverlay b;
    private final NativeDataCaptureOverlay c;

    public C0756o0(NativeBarcodeFindBasicOverlay _NativeBarcodeFindBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFindBasicOverlay, "_NativeBarcodeFindBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodeFindBasicOverlay;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeFindBasicOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodeFindBasicO…ay.asDataCaptureOverlay()");
        this.c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    public final NativeDataCaptureOverlay _dataCaptureOverlayImpl() {
        return this.c;
    }

    public final NativeBarcodeFindBasicOverlay a() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void b(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForItemListUpdatedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void c(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapShutterToResumeScreenHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void d(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForPointAtBarcodesToSearchHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void e(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForAllItemsFoundSuccessfullyHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void f(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapShutterToPauseScreenHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void g(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForItemListUpdatedWhenPausedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void a(String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForMoveCloserToBarcodesHint(text);
    }

    public /* synthetic */ C0756o0(NativeBarcodeFindBasicOverlay nativeBarcodeFindBasicOverlay) {
        this(nativeBarcodeFindBasicOverlay, ProxyCacheKt.getGlobalProxyCache());
    }
}

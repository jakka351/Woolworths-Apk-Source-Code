package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T0 extends NativeBarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindGuidanceHandler f17300a;
    private final WeakReference b;

    public T0(BarcodeFindGuidanceHandler _BarcodeFindGuidanceHandler, BarcodeFindBasicOverlay _BarcodeFindBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeFindGuidanceHandler, "_BarcodeFindGuidanceHandler");
        Intrinsics.h(_BarcodeFindBasicOverlay, "_BarcodeFindBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17300a = _BarcodeFindGuidanceHandler;
        this.b = new WeakReference(_BarcodeFindBasicOverlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setAllItemsFound(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.f(z, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setInitialGuidance(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.b(z, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setItemListUpdated(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.c(z, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setMoveCloserGuidance(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.a(z, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToPause(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.e(z, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToResume(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (((BarcodeFindBasicOverlay) this.b.get()) != null) {
            this.f17300a.d(z, text);
        }
    }
}

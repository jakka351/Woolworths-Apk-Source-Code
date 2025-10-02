package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0517a5 extends NativeBarcodePickStatusListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickStatusListenerInternal f17374a;
    private final WeakReference b;

    public /* synthetic */ C0517a5(BarcodePickStatusListenerInternal barcodePickStatusListenerInternal, BarcodePick barcodePick) {
        this(barcodePickStatusListenerInternal, barcodePick, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onFreezed() {
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.c();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onObservationStarted(NativeBarcodePick barcodePick) {
        Intrinsics.h(barcodePick, "barcodePick");
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.onObservationStarted(BarcodeNativeTypeFactory.INSTANCE.convert(barcodePick));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onObservationStopped(NativeBarcodePick barcodePick) {
        Intrinsics.h(barcodePick, "barcodePick");
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.onObservationStopped(BarcodeNativeTypeFactory.INSTANCE.convert(barcodePick));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onPaused() {
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.d();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onStarted() {
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onStopped() {
        if (((BarcodePick) this.b.get()) != null) {
            this.f17374a.b();
        }
    }

    public C0517a5(BarcodePickStatusListenerInternal _BarcodePickStatusListenerInternal, BarcodePick _BarcodePick, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodePickStatusListenerInternal, "_BarcodePickStatusListenerInternal");
        Intrinsics.h(_BarcodePick, "_BarcodePick");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17374a = _BarcodePickStatusListenerInternal;
        this.b = new WeakReference(_BarcodePick);
    }
}

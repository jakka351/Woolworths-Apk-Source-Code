package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0724m0 extends ViewBasedDataCaptureOverlay implements InterfaceC0740n0, BarcodeFindBasicOverlay {
    private final /* synthetic */ C0756o0 b;

    private C0724m0(Context context, NativeBarcodeFindBasicOverlay nativeBarcodeFindBasicOverlay) {
        super(context);
        this.b = new C0756o0(nativeBarcodeFindBasicOverlay);
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

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindBasicOverlay
    public final void a(BarcodeFindGuidanceHandler handler) {
        Intrinsics.h(handler, "handler");
        this.b.a().setGuidanceHandler(new T0(handler, this, ProxyCacheKt.getGlobalProxyCache()));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void b(String text) {
        Intrinsics.h(text, "text");
        this.b.b(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void c(String text) {
        Intrinsics.h(text, "text");
        this.b.c(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void d(String text) {
        Intrinsics.h(text, "text");
        this.b.d(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void e(String text) {
        Intrinsics.h(text, "text");
        this.b.e(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void f(String text) {
        Intrinsics.h(text, "text");
        this.b.f(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void g(String text) {
        Intrinsics.h(text, "text");
        this.b.g(text);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0724m0(Context context, BarcodeFind barcodeFind) {
        Intrinsics.h(context, "context");
        Intrinsics.h(barcodeFind, "barcodeFind");
        NativeBarcodeFindBasicOverlay nativeBarcodeFindBasicOverlayCreate = NativeBarcodeFindBasicOverlay.create(barcodeFind.getF17661a());
        Intrinsics.g(nativeBarcodeFindBasicOverlayCreate, "create(barcodeFind._impl())");
        this(context, nativeBarcodeFindBasicOverlayCreate);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0740n0
    public final void a(String text) {
        Intrinsics.h(text, "text");
        this.b.a(text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0708l0
    public final void a(ViewGroup view) {
        Intrinsics.h(view, "view");
        addView(view);
    }
}

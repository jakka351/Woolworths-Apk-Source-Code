package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0628g0 {
    public static final BarcodeCountView a(Context context, DataCaptureView dataCaptureView, BarcodeCount mode, BarcodeCountViewStyle style) {
        Intrinsics.h(context, "context");
        Intrinsics.h(dataCaptureView, "dataCaptureView");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        BarcodeCountBasicOverlay barcodeCountBasicOverlayNewInstance = BarcodeCountBasicOverlay.INSTANCE.newInstance(dataCaptureView, mode, BarcodeCountViewStyleExtensionKt.toOverlayStyle(style));
        B b = new B(barcodeCountBasicOverlayNewInstance);
        BarcodeCountViewLayerManager barcodeCountViewLayerManager = new BarcodeCountViewLayerManager(context);
        D d = new D(dataCaptureView);
        C0692k0 c0692k0 = new C0692k0();
        Z9 z9 = new Z9(c0692k0, barcodeCountViewLayerManager.g(), barcodeCountViewLayerManager.a());
        C0536b8 c0536b8 = new C0536b8(c0692k0, barcodeCountViewLayerManager.g());
        S6 s6 = new S6(c0692k0, barcodeCountViewLayerManager.g());
        C0602e6 c0602e6 = new C0602e6(c0692k0, barcodeCountViewLayerManager.f());
        C0622fa c0622fa = new C0622fa(c0692k0, barcodeCountViewLayerManager.f());
        Gd gd = new Gd(c0692k0, barcodeCountViewLayerManager.f());
        C0610ee c0610ee = new C0610ee(context, c0692k0, d);
        Yd yd = new Yd(barcodeCountViewLayerManager.d(), Td.a(context, mode));
        De de = new De(barcodeCountViewLayerManager.b());
        C8 c8 = new C8(barcodeCountViewLayerManager.b());
        C0652h8 c0652h8 = new C0652h8(barcodeCountViewLayerManager.c());
        String string = context.getString(R.string.sc_loading);
        Intrinsics.g(string, "context.getString(R.string.sc_loading)");
        return new BarcodeCountView(context, mode, barcodeCountViewLayerManager, d, barcodeCountBasicOverlayNewInstance, c0692k0, new C0544c0(z9, c0536b8, s6, c0602e6, c0622fa, gd, c0610ee, yd, de, c8, c0652h8, c0692k0, barcodeCountBasicOverlayNewInstance, string), b, new C0710l2(barcodeCountBasicOverlayNewInstance, new C0706ke(dataCaptureView), barcodeCountBasicOverlayNewInstance.getStyle(), new C0580d0(b), new C0596e0(barcodeCountBasicOverlayNewInstance), new C0612f0(barcodeCountBasicOverlayNewInstance)), null, 512, null);
    }
}

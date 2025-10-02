package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountSession f17238a;

    public M7(NativeBarcodeCountSession _NativeBarcodeCountSession, ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountSession, "_NativeBarcodeCountSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17238a = _NativeBarcodeCountSession;
    }

    public final NativeBarcodeCountSession a() {
        return this.f17238a;
    }

    public final long b() {
        return this.f17238a.getFrameSeqIdAndroid();
    }

    public final boolean c() {
        return this.f17238a.hasScanningFailed();
    }

    public final Map d() {
        HashMap<Integer, NativeTrackedBarcode> _0 = this.f17238a.getTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    public final void e() {
        this.f17238a.reset();
    }

    public final String f() {
        String _0 = this.f17238a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }
}

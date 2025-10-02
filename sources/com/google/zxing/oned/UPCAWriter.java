package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class UPCAWriter implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final EAN13Writer f16180a = new EAN13Writer();

    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat != BarcodeFormat.r) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return this.f16180a.a("0".concat(String.valueOf(str)), BarcodeFormat.k, i, i2, map);
    }
}

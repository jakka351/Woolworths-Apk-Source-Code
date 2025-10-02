package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Result {

    /* renamed from: a, reason: collision with root package name */
    public final String f16131a;
    public final byte[] b;
    public ResultPoint[] c;
    public final BarcodeFormat d;
    public Map e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, resultPointArr, barcodeFormat, 0);
        System.currentTimeMillis();
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(ResultMetadataType resultMetadataType, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(ResultMetadataType.class);
        }
        this.e.put(resultMetadataType, obj);
    }

    public final String toString() {
        return this.f16131a;
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, int i) {
        this.f16131a = str;
        this.b = bArr;
        this.c = resultPointArr;
        this.d = barcodeFormat;
        this.e = null;
    }
}

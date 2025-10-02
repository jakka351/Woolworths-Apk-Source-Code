package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class BarcodeMatrix {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeRow[] f16214a;
    public int b;
    public final int c;
    public final int d;

    public BarcodeMatrix(int i, int i2) {
        this.f16214a = new BarcodeRow[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f16214a[i3] = new BarcodeRow(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public final BarcodeRow a() {
        return this.f16214a[this.b];
    }

    public final byte[][] b(int i, int i2) {
        int i3 = this.c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 * i2, this.d * i);
        int i4 = i3 * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i4 - i5) - 1;
            byte[] bArr2 = this.f16214a[i5 / i2].f16215a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                bArr3[i7] = bArr2[i7 / i];
            }
            bArr[i6] = bArr3;
        }
        return bArr;
    }
}

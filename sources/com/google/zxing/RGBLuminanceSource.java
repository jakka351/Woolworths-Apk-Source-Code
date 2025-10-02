package com.google.zxing;

/* loaded from: classes6.dex */
public final class RGBLuminanceSource extends LuminanceSource {
    @Override // com.google.zxing.LuminanceSource
    public final LuminanceSource a(int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] b() {
        throw null;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] c(int i, byte[] bArr) {
        if (i < 0 || i >= this.b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i2 = this.f16128a;
        if (bArr == null || bArr.length < i2) {
            byte[] bArr2 = new byte[i2];
        }
        throw null;
    }
}

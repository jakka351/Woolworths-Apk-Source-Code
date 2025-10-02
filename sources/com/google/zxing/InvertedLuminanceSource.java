package com.google.zxing;

/* loaded from: classes6.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    public final LuminanceSource c;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.f16128a, luminanceSource.b);
        this.c = luminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public final LuminanceSource a(int i, int i2, int i3, int i4) {
        return new InvertedLuminanceSource(this.c.a(i, i2, i3, i4));
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] b() {
        byte[] bArrB = this.c.b();
        int i = this.f16128a * this.b;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (bArrB[i2] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] c(int i, byte[] bArr) {
        byte[] bArrC = this.c.c(i, bArr);
        for (int i2 = 0; i2 < this.f16128a; i2++) {
            bArrC[i2] = (byte) (255 - (bArrC[i2] & 255));
        }
        return bArrC;
    }

    @Override // com.google.zxing.LuminanceSource
    public final boolean d() {
        return this.c.d();
    }

    @Override // com.google.zxing.LuminanceSource
    public final LuminanceSource e() {
        return new InvertedLuminanceSource(this.c.e());
    }
}

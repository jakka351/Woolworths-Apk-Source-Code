package com.google.zxing;

/* loaded from: classes6.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public PlanarYUVLuminanceSource(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // com.google.zxing.LuminanceSource
    public final LuminanceSource a(int i, int i2, int i3, int i4) {
        return new PlanarYUVLuminanceSource(this.d, this.e, this.f + i, this.g + i2, i3, i4, this.c);
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] b() {
        byte[] bArr = this.c;
        int i = this.f16128a;
        int i2 = this.b;
        int i3 = this.d;
        if (i == i3 && i2 == this.e) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        int i5 = (this.g * i3) + this.f;
        if (i == i3) {
            System.arraycopy(bArr, i5, bArr2, 0, i4);
            return bArr2;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] c(int i, byte[] bArr) {
        if (i < 0 || i >= this.b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i2 = this.f16128a;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, i2);
        return bArr;
    }
}

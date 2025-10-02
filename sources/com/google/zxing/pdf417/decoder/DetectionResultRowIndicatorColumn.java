package com.google.zxing.pdf417.decoder;

/* loaded from: classes6.dex */
final class DetectionResultRowIndicatorColumn extends DetectionResultColumn {
    public final boolean c;

    public DetectionResultRowIndicatorColumn(BoundingBox boundingBox, boolean z) {
        super(boundingBox);
        this.c = z;
    }

    public final BarcodeMetadata c() {
        BarcodeValue barcodeValue = new BarcodeValue();
        BarcodeValue barcodeValue2 = new BarcodeValue();
        BarcodeValue barcodeValue3 = new BarcodeValue();
        BarcodeValue barcodeValue4 = new BarcodeValue();
        Codeword[] codewordArr = this.b;
        for (Codeword codeword : codewordArr) {
            if (codeword != null) {
                codeword.b();
                int i = codeword.d % 30;
                int i2 = codeword.e;
                if (!this.c) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    barcodeValue2.b((i * 3) + 1);
                } else if (i3 == 1) {
                    barcodeValue4.b(i / 3);
                    barcodeValue3.b(i % 3);
                } else if (i3 == 2) {
                    barcodeValue.b(i + 1);
                }
            }
        }
        if (barcodeValue.a().length == 0 || barcodeValue2.a().length == 0 || barcodeValue3.a().length == 0 || barcodeValue4.a().length == 0 || barcodeValue.a()[0] <= 0 || barcodeValue2.a()[0] + barcodeValue3.a()[0] < 3 || barcodeValue2.a()[0] + barcodeValue3.a()[0] > 90) {
            return null;
        }
        BarcodeMetadata barcodeMetadata = new BarcodeMetadata(barcodeValue.a()[0], barcodeValue2.a()[0], barcodeValue3.a()[0], barcodeValue4.a()[0]);
        d(codewordArr, barcodeMetadata);
        return barcodeMetadata;
    }

    public final void d(Codeword[] codewordArr, BarcodeMetadata barcodeMetadata) {
        for (int i = 0; i < codewordArr.length; i++) {
            Codeword codeword = codewordArr[i];
            if (codeword != null) {
                int i2 = codeword.d % 30;
                int i3 = codeword.e;
                if (i3 > barcodeMetadata.e) {
                    codewordArr[i] = null;
                } else {
                    if (!this.c) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != barcodeMetadata.f16199a) {
                                codewordArr[i] = null;
                            }
                        } else if (i2 / 3 != barcodeMetadata.b || i2 % 3 != barcodeMetadata.d) {
                            codewordArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != barcodeMetadata.c) {
                        codewordArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // com.google.zxing.pdf417.decoder.DetectionResultColumn
    public final String toString() {
        return "IsLeft: " + this.c + '\n' + super.toString();
    }
}

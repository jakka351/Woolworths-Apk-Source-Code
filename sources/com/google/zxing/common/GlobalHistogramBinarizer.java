package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    public static final byte[] d = new byte[0];
    public byte[] b;
    public final int[] c;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.b = d;
        this.c = new int[32];
    }

    public static int d(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw NotFoundException.f;
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = (i2 - iArr[i12]) * (i3 - i12) * i15 * i15;
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer a(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix b() throws NotFoundException {
        int[] iArr;
        LuminanceSource luminanceSource = this.f16126a;
        int i = luminanceSource.f16128a;
        int i2 = luminanceSource.b;
        BitMatrix bitMatrix = new BitMatrix(i, i2);
        if (this.b.length < i) {
            this.b = new byte[i];
        }
        int i3 = 0;
        while (true) {
            iArr = this.c;
            if (i3 >= 32) {
                break;
            }
            iArr[i3] = 0;
            i3++;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] bArrC = luminanceSource.c((i2 * i4) / 5, this.b);
            int i5 = (i << 2) / 5;
            for (int i6 = i / 5; i6 < i5; i6++) {
                int i7 = (bArrC[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int iD = d(iArr);
        byte[] bArrB = luminanceSource.b();
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i8 * i;
            for (int i10 = 0; i10 < i; i10++) {
                if ((bArrB[i9 + i10] & 255) < iD) {
                    bitMatrix.f(i10, i8);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public final BitArray c(int i, BitArray bitArray) throws NotFoundException {
        int[] iArr;
        LuminanceSource luminanceSource = this.f16126a;
        int i2 = luminanceSource.f16128a;
        if (bitArray == null || bitArray.e < i2) {
            bitArray = new BitArray(i2);
        } else {
            int length = bitArray.d.length;
            for (int i3 = 0; i3 < length; i3++) {
                bitArray.d[i3] = 0;
            }
        }
        if (this.b.length < i2) {
            this.b = new byte[i2];
        }
        int i4 = 0;
        while (true) {
            iArr = this.c;
            if (i4 >= 32) {
                break;
            }
            iArr[i4] = 0;
            i4++;
        }
        byte[] bArrC = luminanceSource.c(i, this.b);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = (bArrC[i5] & 255) >> 3;
            iArr[i6] = iArr[i6] + 1;
        }
        int iD = d(iArr);
        if (i2 < 3) {
            for (int i7 = 0; i7 < i2; i7++) {
                if ((bArrC[i7] & 255) < iD) {
                    bitArray.j(i7);
                }
            }
        } else {
            int i8 = bArrC[0] & 255;
            int i9 = bArrC[1] & 255;
            int i10 = 1;
            while (i10 < i2 - 1) {
                int i11 = i10 + 1;
                int i12 = bArrC[i11] & 255;
                if ((((i9 << 2) - i8) - i12) / 2 < iD) {
                    bitArray.j(i10);
                }
                i8 = i9;
                i10 = i11;
                i9 = i12;
            }
        }
        return bitArray;
    }
}

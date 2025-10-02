package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
public final class EAN13Reader extends UPCEANReader {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public final int[] i = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    public final int k(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = bitArray.e;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int i5 = UPCEANReader.i(bitArray, iArr2, i2, UPCEANReader.h);
            sb.append((char) ((i5 % 10) + 48));
            for (int i6 : iArr2) {
                i2 += i6;
            }
            if (i5 >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i7 = 0; i7 < 10; i7++) {
            if (i3 == j[i7]) {
                sb.insert(0, (char) (i7 + 48));
                int i8 = UPCEANReader.m(bitArray, i2, true, UPCEANReader.e, new int[5])[1];
                for (int i9 = 0; i9 < 6 && i8 < i; i9++) {
                    sb.append((char) (UPCEANReader.i(bitArray, iArr2, i8, UPCEANReader.g) + 48));
                    for (int i10 : iArr2) {
                        i8 += i10;
                    }
                }
                return i8;
            }
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat o() {
        return BarcodeFormat.k;
    }
}

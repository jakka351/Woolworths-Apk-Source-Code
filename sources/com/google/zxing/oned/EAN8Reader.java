package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
public final class EAN8Reader extends UPCEANReader {
    public final int[] i = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    public final int k(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[][] iArr2;
        int[] iArr3 = this.i;
        iArr3[0] = 0;
        iArr3[1] = 0;
        iArr3[2] = 0;
        iArr3[3] = 0;
        int i = bitArray.e;
        int i2 = iArr[1];
        int i3 = 0;
        while (true) {
            iArr2 = UPCEANReader.g;
            if (i3 >= 4 || i2 >= i) {
                break;
            }
            sb.append((char) (UPCEANReader.i(bitArray, iArr3, i2, iArr2) + 48));
            for (int i4 : iArr3) {
                i2 += i4;
            }
            i3++;
        }
        int i5 = UPCEANReader.m(bitArray, i2, true, UPCEANReader.e, new int[5])[1];
        for (int i6 = 0; i6 < 4 && i5 < i; i6++) {
            sb.append((char) (UPCEANReader.i(bitArray, iArr3, i5, iArr2) + 48));
            for (int i7 : iArr3) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat o() {
        return BarcodeFormat.j;
    }
}

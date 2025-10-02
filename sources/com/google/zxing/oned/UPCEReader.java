package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
public final class UPCEReader extends UPCEANReader {
    public static final int[] j = {1, 1, 1, 1, 1, 1};
    public static final int[][] k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final int[] i = new int[4];

    public static String q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final boolean g(String str) {
        return UPCEANReader.h(q(str));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final int[] j(int i, BitArray bitArray) {
        return UPCEANReader.m(bitArray, i, true, j, new int[6]);
    }

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
        for (int i7 = 0; i7 <= 1; i7++) {
            for (int i8 = 0; i8 < 10; i8++) {
                if (i3 == k[i7][i8]) {
                    sb.insert(0, (char) (i7 + 48));
                    sb.append((char) (i8 + 48));
                    return i2;
                }
            }
        }
        throw NotFoundException.f;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat o() {
        return BarcodeFormat.s;
    }
}

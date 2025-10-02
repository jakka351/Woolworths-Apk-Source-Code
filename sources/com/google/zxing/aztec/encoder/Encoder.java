package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* loaded from: classes6.dex */
public final class Encoder {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16138a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.f(i5, i4);
                    bitMatrix.f(i5, i6);
                    bitMatrix.f(i4, i5);
                    bitMatrix.f(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.f(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.f(i8, i7);
        bitMatrix.f(i7, i8);
        int i9 = i + i2;
        bitMatrix.f(i9, i7);
        bitMatrix.f(i9, i8);
        bitMatrix.f(i9, i9 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.aztec.encoder.AztecCode b(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.Encoder.b(int, int, byte[]):com.google.zxing.aztec.encoder.AztecCode");
    }

    public static BitArray c(int i, int i2, BitArray bitArray) {
        GenericGF genericGF;
        int i3 = bitArray.e / i2;
        if (i2 == 4) {
            genericGF = GenericGF.k;
        } else if (i2 == 6) {
            genericGF = GenericGF.j;
        } else if (i2 == 8) {
            genericGF = GenericGF.n;
        } else if (i2 == 10) {
            genericGF = GenericGF.i;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            genericGF = GenericGF.h;
        }
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = bitArray.e / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= bitArray.d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        reedSolomonEncoder.a(i4 - i3, iArr);
        BitArray bitArray2 = new BitArray();
        bitArray2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            bitArray2.b(iArr[i9], i2);
        }
        return bitArray2;
    }

    public static BitArray d(int i, BitArray bitArray) {
        BitArray bitArray2 = new BitArray();
        int i2 = bitArray.e;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || bitArray.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                bitArray2.b(i8, i);
            } else if (i8 == 0) {
                bitArray2.b(i5 | 1, i);
            } else {
                bitArray2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return bitArray2;
    }
}

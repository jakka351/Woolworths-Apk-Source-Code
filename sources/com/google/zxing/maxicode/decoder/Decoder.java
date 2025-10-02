package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.text.DecimalFormat;

/* loaded from: classes6.dex */
public final class Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ReedSolomonDecoder f16170a = new ReedSolomonDecoder(GenericGF.o);

    public final void a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f16170a.a(i3 / i6, iArr);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public final DecoderResult b(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        byte[] bArr;
        String strValueOf;
        byte[] bArr2 = new byte[144];
        int i = bitMatrix.e;
        int i2 = bitMatrix.d;
        for (int i3 = 0; i3 < i; i3++) {
            int[] iArr = BitMatrixParser.f16168a[i3];
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 >= 0 && bitMatrix.b(i4, i3)) {
                    int i6 = i5 / 6;
                    bArr2[i6] = (byte) (((byte) (1 << (5 - (i5 % 6)))) | bArr2[i6]);
                }
            }
        }
        a(bArr2, 0, 10, 10, 0);
        int i7 = bArr2[0] & 15;
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            a(bArr2, 20, 84, 40, 1);
            a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i7 != 5) {
                throw FormatException.a();
            }
            a(bArr2, 20, 68, 56, 1);
            a(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb = new StringBuilder(144);
        if (i7 == 2 || i7 == 3) {
            if (i7 == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, DecodedBitStreamParser.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(DecodedBitStreamParser.a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = DecodedBitStreamParser.f16169a;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(DecodedBitStreamParser.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(DecodedBitStreamParser.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String str2 = decimalFormat.format(DecodedBitStreamParser.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb.append(DecodedBitStreamParser.b(10, 84, bArr));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb.insert(0, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i7 == 4) {
            sb.append(DecodedBitStreamParser.b(1, 93, bArr));
        } else if (i7 == 5) {
            sb.append(DecodedBitStreamParser.b(1, 77, bArr));
        }
        return new DecoderResult(bArr, sb.toString(), null, String.valueOf(i7));
    }
}

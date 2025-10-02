package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PDF417Writer implements Writer {
    public static BitMatrix b(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        BitMatrix bitMatrix = new BitMatrix(length, length2);
        int[] iArr = bitMatrix.g;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    bitMatrix.f(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return bitMatrix;
    }

    public static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) throws WriterException {
        boolean z;
        if (barcodeFormat != BarcodeFormat.n) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        PDF417 pdf417 = new PDF417();
        pdf417.b = false;
        pdf417.c = Compaction.d;
        pdf417.d = null;
        pdf417.e = 2;
        pdf417.f = 30;
        pdf417.g = 30;
        pdf417.h = 2;
        EncodeHintType encodeHintType = EncodeHintType.j;
        if (map.containsKey(encodeHintType)) {
            pdf417.b = Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue();
        }
        EncodeHintType encodeHintType2 = EncodeHintType.k;
        if (map.containsKey(encodeHintType2)) {
            pdf417.c = Compaction.valueOf(map.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.l;
        if (map.containsKey(encodeHintType3)) {
            ((Dimensions) map.get(encodeHintType3)).getClass();
            pdf417.f = 0;
            pdf417.e = 0;
            pdf417.g = 0;
            pdf417.h = 0;
        }
        EncodeHintType encodeHintType4 = EncodeHintType.i;
        int i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.d;
        int i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.e;
        if (map.containsKey(encodeHintType6)) {
            pdf417.d = Charset.forName(map.get(encodeHintType6).toString());
        }
        pdf417.b(i4, str);
        byte[][] bArrB = pdf417.f16216a.b(1, 4);
        if ((i2 > i) != (bArrB[0].length < bArrB.length)) {
            bArrB = c(bArrB);
            z = true;
        } else {
            z = false;
        }
        int length = i / bArrB[0].length;
        int length2 = i2 / bArrB.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(bArrB, i3);
        }
        byte[][] bArrB2 = pdf417.f16216a.b(length, length << 2);
        if (z) {
            bArrB2 = c(bArrB2);
        }
        return b(bArrB2, i3);
    }
}

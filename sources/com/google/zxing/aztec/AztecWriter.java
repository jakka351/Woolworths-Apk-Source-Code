package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AztecWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.e;
        if (map.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(map.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.d;
        int i3 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.m;
        int i4 = map.containsKey(encodeHintType3) ? Integer.parseInt(map.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.d) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        BitMatrix bitMatrix = Encoder.b(i3, i4, str.getBytes(charsetForName)).f16137a;
        if (bitMatrix == null) {
            throw new IllegalStateException();
        }
        int i5 = bitMatrix.d;
        int i6 = bitMatrix.e;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (i5 * iMin)) / 2;
        int i8 = (iMax2 - (i6 * iMin)) / 2;
        BitMatrix bitMatrix2 = new BitMatrix(iMax, iMax2);
        int i9 = 0;
        while (i9 < i6) {
            int i10 = i7;
            int i11 = 0;
            while (i11 < i5) {
                if (bitMatrix.b(i11, i9)) {
                    bitMatrix2.g(i10, i8, iMin, iMin);
                }
                i11++;
                i10 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return bitMatrix2;
    }
}

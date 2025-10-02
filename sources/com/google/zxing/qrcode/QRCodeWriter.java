package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.Map;

/* loaded from: classes6.dex */
public final class QRCodeWriter implements Writer {
    @Override // com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.o) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        EncodeHintType encodeHintType = EncodeHintType.d;
        ErrorCorrectionLevel errorCorrectionLevelValueOf = map.containsKey(encodeHintType) ? ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString()) : ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType2 = EncodeHintType.i;
        int i3 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 4;
        ByteMatrix byteMatrix = Encoder.a(str, errorCorrectionLevelValueOf, map).e;
        if (byteMatrix == null) {
            throw new IllegalStateException();
        }
        int i4 = byteMatrix.b;
        int i5 = byteMatrix.c;
        int i6 = i3 << 1;
        int i7 = i4 + i6;
        int i8 = i6 + i5;
        int iMax = Math.max(i, i7);
        int iMax2 = Math.max(i2, i8);
        int iMin = Math.min(iMax / i7, iMax2 / i8);
        int i9 = (iMax - (i4 * iMin)) / 2;
        int i10 = (iMax2 - (i5 * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i11 = 0;
        while (i11 < i5) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < i4) {
                if (byteMatrix.a(i12, i11) == 1) {
                    bitMatrix.g(i13, i10, iMin, iMin);
                }
                i12++;
                i13 += iMin;
            }
            i11++;
            i10 += iMin;
        }
        return bitMatrix;
    }
}

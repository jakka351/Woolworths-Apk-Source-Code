package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.j) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.p(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        OneDimensionalCodeWriter.c(str);
        boolean[] zArr = new boolean[67];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.d, true);
        for (int i = 0; i <= 3; i++) {
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.g[Character.digit(str.charAt(i), 10)], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.e, false) + iB;
        for (int i2 = 4; i2 <= 7; i2++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.g[Character.digit(str.charAt(i2), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.d, true);
        return zArr;
    }
}

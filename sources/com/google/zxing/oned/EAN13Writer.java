package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EAN13Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.k) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + UPCEANReader.p(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
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
        int i = EAN13Reader.j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.d, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iB += OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.h[iDigit], false);
        }
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, UPCEANReader.e, false) + iB;
        for (int i3 = 7; i3 <= 12; i3++) {
            iB2 += OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.g[Character.digit(str.charAt(i3), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, iB2, UPCEANReader.d, true);
        return zArr;
    }
}

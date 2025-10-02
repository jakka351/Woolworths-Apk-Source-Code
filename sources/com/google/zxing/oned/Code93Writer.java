package com.google.zxing.oned;

import YU.a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    public static void f(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
    }

    public static int g(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.g) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] d(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("bU");
            } else if (cCharAt <= 26) {
                sb.append('a');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb.append('b');
                sb.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb.append('c');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt == ':') {
                sb.append("cZ");
            } else if (cCharAt <= '?') {
                sb.append('b');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb.append("bV");
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('b');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb.append("bW");
            } else if (cCharAt <= 'z') {
                sb.append('d');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb.append('b');
                sb.append((char) (cCharAt - '+'));
            }
        }
        String string = sb.toString();
        int length2 = string.length();
        if (length2 > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length2)));
        }
        int i2 = 9;
        boolean[] zArr = new boolean[((string.length() + 4) * 9) + 1];
        f(zArr, 0, Code93Reader.e);
        for (int i3 = 0; i3 < length2; i3++) {
            f(zArr, i2, Code93Reader.d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(i3))]);
            i2 += 9;
        }
        int iG = g(20, string);
        int[] iArr = Code93Reader.d;
        f(zArr, i2, iArr[iG]);
        StringBuilder sbS = a.s(string);
        sbS.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iG));
        f(zArr, i2 + 9, iArr[g(15, sbS.toString())]);
        f(zArr, i2 + 18, Code93Reader.e);
        zArr[i2 + 27] = true;
        return zArr;
    }
}

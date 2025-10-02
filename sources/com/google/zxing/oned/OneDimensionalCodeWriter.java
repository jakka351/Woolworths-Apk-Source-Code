package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class OneDimensionalCodeWriter implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16179a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static void c(String str) {
        if (!f16179a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    @Override // com.google.zxing.Writer
    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) throws NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iE = e();
        EncodeHintType encodeHintType = EncodeHintType.i;
        if (map.containsKey(encodeHintType)) {
            iE = Integer.parseInt(map.get(encodeHintType).toString());
        }
        boolean[] zArrD = d(str);
        int length = zArrD.length;
        int i3 = iE + length;
        int iMax = Math.max(i, i3);
        int iMax2 = Math.max(1, i2);
        int i4 = iMax / i3;
        int i5 = (iMax - (length * i4)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i6 = 0;
        while (i6 < length) {
            if (zArrD[i6]) {
                bitMatrix.g(i5, 0, i4, iMax2);
            }
            i6++;
            i5 += i4;
        }
        return bitMatrix;
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }
}

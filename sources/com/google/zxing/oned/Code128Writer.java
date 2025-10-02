package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CType {
        public static final CType d;
        public static final CType e;
        public static final CType f;
        public static final CType g;
        public static final /* synthetic */ CType[] h;

        static {
            CType cType = new CType("UNCODABLE", 0);
            d = cType;
            CType cType2 = new CType("ONE_DIGIT", 1);
            e = cType2;
            CType cType3 = new CType("TWO_DIGITS", 2);
            f = cType3;
            CType cType4 = new CType("FNC_1", 3);
            g = cType4;
            h = new CType[]{cType, cType2, cType3, cType4};
        }

        public static CType valueOf(String str) {
            return (CType) Enum.valueOf(CType.class, str);
        }

        public static CType[] values() {
            return (CType[]) h.clone();
        }
    }

    public static CType f(int i, String str) {
        char cCharAt;
        int length = str.length();
        if (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == 241) {
                return CType.g;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (cCharAt = str.charAt(i2)) >= '0' && cCharAt <= '9') ? CType.f : CType.e;
            }
        }
        return CType.d;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.h) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] d(java.lang.String r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.d(java.lang.String):boolean[]");
    }
}

package com.google.zxing.qrcode.encoder;

/* loaded from: classes6.dex */
final class MaskUtil {
    public static int a(ByteMatrix byteMatrix, boolean z) {
        int i = byteMatrix.b;
        int i2 = byteMatrix.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = byteMatrix.f16235a;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }
}

package me.oriient.internal.services.websocket.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25677a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] c = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final /* synthetic */ boolean d = true;

    public static void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = (i4 & 16) == 16 ? b : (i4 & 32) == 32 ? c : f25677a;
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 != 3) {
            return;
        }
        bArr2[i3] = bArr3[i5 >>> 18];
        bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i5 & 63];
    }

    public static String a(byte[] bArr) {
        String strA;
        try {
            strA = a(bArr, bArr.length);
        } catch (IOException e) {
            if (!d) {
                throw new AssertionError(e.getMessage());
            }
            strA = null;
        }
        if (d || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i >= 0) {
            if (i <= bArr.length) {
                int i2 = ((i / 3) * 4) + (i % 3 <= 0 ? 0 : 4);
                byte[] bArr2 = new byte[i2];
                int i3 = i - 2;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    a(bArr, i4, 3, bArr2, i5, 0);
                    i4 += 3;
                    i5 += 4;
                }
                if (i4 < i) {
                    a(bArr, i4, i - i4, bArr2, i5, 0);
                    i5 += 4;
                }
                if (i5 <= i2 - 1) {
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr2, 0, bArr3, 0, i5);
                    bArr2 = bArr3;
                }
                try {
                    return new String(bArr2, "US-ASCII");
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr2);
                }
            }
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i), Integer.valueOf(bArr.length)));
        }
        throw new IllegalArgumentException(YU.a.d(i, "Cannot have length offset: "));
    }
}

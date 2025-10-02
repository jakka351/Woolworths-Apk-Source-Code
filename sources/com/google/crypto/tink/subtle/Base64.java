package com.google.crypto.tink.subtle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15140a = Charset.forName("UTF-8");

    public static abstract class Coder {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f15141a;
    }

    public static class Decoder extends Coder {
        public static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final int[] b;

        public Decoder(int i, byte[] bArr) {
            this.f15141a = bArr;
            this.b = (i & 8) == 0 ? c : d;
        }
    }

    public static class Encoder extends Coder {
        public static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        public final byte[] b;
        public int c;

        public Encoder() {
            this.f15141a = null;
            this.b = new byte[2];
            this.c = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        if (r5 != 4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Base64.a(int, java.lang.String):byte[]");
    }

    public static String b(byte[] bArr) {
        try {
            return new String(c(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2;
        byte b;
        byte b2;
        int i;
        byte b3;
        int length = bArr.length;
        Encoder encoder = new Encoder();
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        byte[] bArr3 = new byte[i2];
        encoder.f15141a = bArr3;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i5 + 3;
            bArr2 = Encoder.d;
            if (i7 > length) {
                break;
            }
            int i8 = (bArr[i5 + 2] & 255) | ((bArr[i5] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8);
            bArr3[i6] = bArr2[(i8 >> 18) & 63];
            bArr3[i6 + 1] = bArr2[(i8 >> 12) & 63];
            bArr3[i6 + 2] = bArr2[(i8 >> 6) & 63];
            bArr3[i6 + 3] = bArr2[i8 & 63];
            i6 += 4;
            i4--;
            if (i4 == 0) {
                bArr3[i6] = 10;
                i4 = 19;
                i6++;
            }
            i5 = i7;
        }
        int i9 = encoder.c;
        int i10 = i5 - i9;
        int i11 = length - 1;
        byte[] bArr4 = encoder.b;
        if (i10 == i11) {
            if (i9 > 0) {
                b3 = bArr4[0];
                i3 = 1;
            } else {
                b3 = bArr[i5];
            }
            int i12 = (b3 & 255) << 4;
            encoder.c = i9 - i3;
            bArr3[i6] = bArr2[(i12 >> 6) & 63];
            bArr3[i6 + 1] = bArr2[i12 & 63];
            bArr3[i6 + 2] = 61;
            bArr3[i6 + 3] = 61;
        } else if (i10 == length - 2) {
            if (i9 > 1) {
                b = bArr4[0];
                i3 = 1;
            } else {
                int i13 = i5 + 1;
                byte b4 = bArr[i5];
                i5 = i13;
                b = b4;
            }
            int i14 = (b & 255) << 10;
            if (i9 > 0) {
                i = i3 + 1;
                b2 = bArr4[i3];
            } else {
                int i15 = i3;
                b2 = bArr[i5];
                i = i15;
            }
            int i16 = i14 | ((b2 & 255) << 2);
            encoder.c = i9 - i;
            bArr3[i6] = bArr2[(i16 >> 12) & 63];
            bArr3[i6 + 1] = bArr2[(i16 >> 6) & 63];
            bArr3[i6 + 2] = bArr2[i16 & 63];
            bArr3[i6 + 3] = 61;
        }
        return encoder.f15141a;
    }
}

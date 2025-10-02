package io.jsonwebtoken.io;

import java.util.Arrays;

/* loaded from: classes7.dex */
final class Base64 {
    private static final char[] BASE64URL_ALPHABET;
    private static final int[] BASE64URL_IALPHABET;
    private static final char[] BASE64_ALPHABET;
    private static final int[] BASE64_IALPHABET;
    static final Base64 DEFAULT;
    private static final int IALPHABET_MAX_INDEX;
    static final Base64 URL_SAFE;
    private final char[] ALPHABET;
    private final int[] IALPHABET;
    private final boolean urlsafe;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        BASE64_ALPHABET = charArray;
        BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        int[] iArr = new int[256];
        BASE64_IALPHABET = iArr;
        int[] iArr2 = new int[256];
        BASE64URL_IALPHABET = iArr2;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i]] = i;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i]] = i;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }

    private Base64(boolean z) {
        this.urlsafe = z;
        this.ALPHABET = z ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = z ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private int ctoi(char c) {
        int i = c > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c];
        if (i >= 0) {
            return i;
        }
        throw new DecodingException("Illegal " + getName() + " character: '" + c + "'");
    }

    private char[] encodeToChar(byte[] bArr, boolean z) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i = (length / 3) * 3;
        int i2 = length - i;
        boolean z2 = true;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i4 + (z ? ((i4 - 1) / 76) << 1 : 0);
        char[] cArr = new char[this.urlsafe ? i5 - (i2 == 2 ? 1 : i2 == 1 ? 2 : 0) : i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i) {
            int i9 = i6 + 2;
            int i10 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
            i6 += 3;
            int i11 = i10 | (bArr[i9] & 255);
            char[] cArr2 = this.ALPHABET;
            cArr[i7] = cArr2[(i11 >>> 18) & 63];
            cArr[i7 + 1] = cArr2[(i11 >>> 12) & 63];
            cArr[i7 + 2] = cArr2[(i11 >>> 6) & 63];
            boolean z3 = z2;
            int i12 = i7 + 4;
            cArr[i7 + 3] = cArr2[i11 & 63];
            if (z && (i8 = i8 + 1) == 19 && i12 < i5 - 2) {
                int i13 = i7 + 5;
                cArr[i12] = '\r';
                i7 += 6;
                cArr[i13] = '\n';
                i8 = 0;
            } else {
                i7 = i12;
            }
            z2 = z3;
        }
        if (i2 > 0) {
            int i14 = ((bArr[i] & 255) << 10) | (i2 == 2 ? (bArr[i3] & 255) << 2 : 0);
            char[] cArr3 = this.ALPHABET;
            cArr[i5 - 4] = cArr3[i14 >> 12];
            cArr[i5 - 3] = cArr3[(i14 >>> 6) & 63];
            if (i2 == 2) {
                cArr[i5 - 2] = cArr3[i14 & 63];
            } else if (!this.urlsafe) {
                cArr[i5 - 2] = '=';
            }
            if (!this.urlsafe) {
                cArr[i5 - 1] = '=';
            }
        }
        return cArr;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    public final byte[] decodeFast(char[] cArr) throws DecodingException {
        int i;
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2 && this.IALPHABET[cArr[i3]] < 0) {
            i3++;
        }
        while (i2 > 0 && this.IALPHABET[cArr[i2]] < 0) {
            i2--;
        }
        boolean z = true;
        int i4 = cArr[i2] == '=' ? cArr[i2 + (-1)] == '=' ? 2 : 1 : 0;
        int i5 = (i2 - i3) + 1;
        if (length > 76) {
            i = (cArr[76] == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i6 = (((i5 - i) * 6) >> 3) - i4;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i3 + 4;
            int iCtoi = (ctoi(cArr[i3 + 1]) << 12) | (ctoi(cArr[i3]) << 18) | (ctoi(cArr[i3 + 2]) << 6) | ctoi(cArr[i3 + 3]);
            bArr[i8] = (byte) (iCtoi >> 16);
            int i11 = i8 + 2;
            boolean z2 = z;
            bArr[i8 + 1] = (byte) (iCtoi >> 8);
            i8 += 3;
            bArr[i11] = (byte) iCtoi;
            if (i <= 0 || (i9 = i9 + 1) != 19) {
                i3 = i10;
            } else {
                i3 += 6;
                i9 = 0;
            }
            z = z2;
        }
        if (i8 < i6) {
            int iCtoi2 = 0;
            int i12 = 0;
            while (i3 <= i2 - i4) {
                iCtoi2 |= ctoi(cArr[i3]) << (18 - (i12 * 6));
                i12++;
                i3++;
            }
            int i13 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (iCtoi2 >> i13);
                i13 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    public final String encodeToString(byte[] bArr, boolean z) {
        return new String(encodeToChar(bArr, z));
    }
}

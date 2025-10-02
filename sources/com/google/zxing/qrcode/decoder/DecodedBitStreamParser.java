package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes6.dex */
final class DecodedBitStreamParser {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16223a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16224a;

        static {
            int[] iArr = new int[Mode.values().length];
            f16224a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16224a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16224a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16224a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16224a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16224a[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16224a[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16224a[3] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16224a[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16224a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.google.zxing.common.BitSource r3, java.lang.StringBuilder r4, int r5, boolean r6) throws com.google.zxing.FormatException {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.b(r2)
            int r2 = r1 / 45
            char r2 = f(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = f(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.b(r2)
            char r3 = f(r3)
            r4.append(r3)
            goto L47
        L42:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.a(com.google.zxing.common.BitSource, java.lang.StringBuilder, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2 A[PHI: r27
  0x00e2: PHI (r27v6 boolean) = (r27v5 boolean), (r27v5 boolean), (r27v5 boolean), (r27v7 boolean), (r27v7 boolean), (r27v7 boolean) binds: [B:79:0x00e8, B:81:0x00ec, B:83:0x00f0, B:71:0x00d6, B:72:0x00d8, B:74:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.google.zxing.common.BitSource r22, java.lang.StringBuilder r23, int r24, com.google.zxing.common.CharacterSetECI r25, java.util.ArrayList r26, java.util.Map r27) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.b(com.google.zxing.common.BitSource, java.lang.StringBuilder, int, com.google.zxing.common.CharacterSetECI, java.util.ArrayList, java.util.Map):void");
    }

    public static void c(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > bitSource.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iB = bitSource.b(13);
            int i3 = (iB % 96) | ((iB / 96) << 8);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    public static void d(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > bitSource.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iB = bitSource.b(13);
            int i3 = (iB % BERTags.PRIVATE) | ((iB / BERTags.PRIVATE) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.a();
        }
    }

    public static void e(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (bitSource.a() < 10) {
                throw FormatException.a();
            }
            int iB = bitSource.b(10);
            if (iB >= 1000) {
                throw FormatException.a();
            }
            sb.append(f(iB / 100));
            sb.append(f((iB / 10) % 10));
            sb.append(f(iB % 10));
            i -= 3;
        }
        if (i == 2) {
            if (bitSource.a() < 7) {
                throw FormatException.a();
            }
            int iB2 = bitSource.b(7);
            if (iB2 >= 100) {
                throw FormatException.a();
            }
            sb.append(f(iB2 / 10));
            sb.append(f(iB2 % 10));
            return;
        }
        if (i == 1) {
            if (bitSource.a() < 4) {
                throw FormatException.a();
            }
            int iB3 = bitSource.b(4);
            if (iB3 >= 10) {
                throw FormatException.a();
            }
            sb.append(f(iB3));
        }
    }

    public static char f(int i) throws FormatException {
        char[] cArr = f16223a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.a();
    }
}

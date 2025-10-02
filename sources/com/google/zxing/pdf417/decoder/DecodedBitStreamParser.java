package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import java.math.BigInteger;

/* loaded from: classes6.dex */
final class DecodedBitStreamParser {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16203a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    public static final char[] b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] c;

    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16204a;

        static {
            int[] iArr = new int[Mode.values().length];
            f16204a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16204a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16204a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16204a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16204a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16204a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final Mode d;
        public static final Mode e;
        public static final Mode f;
        public static final Mode g;
        public static final Mode h;
        public static final Mode i;
        public static final /* synthetic */ Mode[] j;

        static {
            Mode mode = new Mode("ALPHA", 0);
            d = mode;
            Mode mode2 = new Mode("LOWER", 1);
            e = mode2;
            Mode mode3 = new Mode("MIXED", 2);
            f = mode3;
            Mode mode4 = new Mode("PUNCT", 3);
            g = mode4;
            Mode mode5 = new Mode("ALPHA_SHIFT", 4);
            h = mode5;
            Mode mode6 = new Mode("PUNCT_SHIFT", 5);
            i = mode6;
            j = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) j.clone();
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    public static String a(int i, int[] iArr) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0007 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(int[] r8, int r9, java.lang.StringBuilder r10) {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L43
            if (r2 != 0) goto L43
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L2e
        L1f:
            if (r6 == r4) goto L2d
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L2d
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L2d
            switch(r6) {
                case 922: goto L2d;
                case 923: goto L2d;
                case 924: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L1d
        L2d:
            r2 = r7
        L2e:
            int r4 = r3 % 15
            if (r4 == 0) goto L38
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L38
            if (r2 == 0) goto L7
        L38:
            if (r3 <= 0) goto L7
            java.lang.String r3 = a(r3, r0)
            r10.append(r3)
            r3 = r1
            goto L7
        L43:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.b(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080 A[PHI: r11 r18
  0x0080: PHI (r11v8 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode) = 
  (r11v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
  (r11v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
  (r11v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
  (r11v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
  (r11v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
  (r11v13 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
 binds: [B:82:0x00fe, B:73:0x00e3, B:62:0x00c4, B:59:0x00bb, B:51:0x00a6, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r18v1 char) = (r18v0 char), (r18v0 char), (r18v0 char), (r18v2 char), (r18v3 char), (r18v4 char) binds: [B:82:0x00fe, B:73:0x00e3, B:62:0x00c4, B:59:0x00bb, B:51:0x00a6, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int[] r19, int r20, java.lang.StringBuilder r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.c(int[], int, java.lang.StringBuilder):int");
    }
}

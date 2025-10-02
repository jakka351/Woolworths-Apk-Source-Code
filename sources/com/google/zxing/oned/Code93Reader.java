package com.google.zxing.oned;

import com.google.android.gms.wallet.WalletConstants;
import com.google.zxing.ChecksumException;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;

/* loaded from: classes6.dex */
public final class Code93Reader extends OneDReader {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] d;
    public static final int e;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f16174a = new StringBuilder(20);
    public final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 394, 360, 356, 354, 308, 282, 344, 332, 326, nlnlnnn.xxx00780078x0078, 278, 436, 434, 428, 422, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != c[iIndexOf % 47]) {
            throw ChecksumException.a();
        }
    }

    public static int h(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0181, code lost:
    
        return new com.google.zxing.Result(r2.toString(), null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((r15[1] + r15[0]) / 2.0f, r13), new com.google.zxing.ResultPoint((r9 / 2.0f) + r1, r13)}, com.google.zxing.BarcodeFormat.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0184, code lost:
    
        throw com.google.zxing.NotFoundException.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0187, code lost:
    
        throw com.google.zxing.NotFoundException.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r5 = com.google.zxing.oned.Code93Reader.c[r6];
        r4.append(r5);
        r6 = r2.length;
        r7 = 0;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r7 >= r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r6 = r14.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r5 != '*') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r4.deleteCharAt(r4.length() - 1);
        r5 = r2.length;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r7 >= r5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r6 == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r14.d(r6) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r4.length() < 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r14 = r4.length();
        g(r4, r14 - 2, 20);
        g(r4, r14 - 1, 15);
        r4.setLength(r4.length() - 2);
        r14 = r4.length();
        r2 = new java.lang.StringBuilder(r14);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r3 >= r14) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        r5 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r5 < 'a') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r5 > 'd') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r3 >= (r14 - 1)) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r3 = r3 + 1;
        r6 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        switch(r5) {
            case 97: goto L89;
            case 98: goto L56;
            case 99: goto L49;
            case 100: goto L43;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        if (r6 < 'A') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r6 > 'Z') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r6 = r6 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        r5 = (char) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (r6 < 'A') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r6 > 'O') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        r6 = r6 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r6 != 'Z') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r5 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r6 < 'A') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        if (r6 > 'E') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r6 = r6 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r6 < 'F') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        if (r6 > 'J') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
    
        r6 = r6 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
    
        if (r6 < 'K') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        if (r6 > 'O') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        r6 = r6 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if (r6 < 'P') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
    
        if (r6 > 'T') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        r6 = r6 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
    
        if (r6 != 'U') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0124, code lost:
    
        if (r6 != 'V') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0126, code lost:
    
        r5 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012b, code lost:
    
        if (r6 != 'W') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        r5 = '`';
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
    
        if (r6 < 'X') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0134, code lost:
    
        if (r6 > 'Z') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0136, code lost:
    
        r5 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013d, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013e, code lost:
    
        if (r6 < 'A') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0140, code lost:
    
        if (r6 > 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0142, code lost:
    
        r6 = r6 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0145, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014d, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0152, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0153, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0156, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0159, code lost:
    
        r13 = r13;
     */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.Result b(int r13, com.google.zxing.common.BitArray r14, java.util.Map r15) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code93Reader.b(int, com.google.zxing.common.BitArray, java.util.Map):com.google.zxing.Result");
    }
}

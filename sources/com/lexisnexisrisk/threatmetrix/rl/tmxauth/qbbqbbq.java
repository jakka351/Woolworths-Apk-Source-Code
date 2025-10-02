package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qbbqbbq {
    public static int a00610061a0061a0061 = 2;
    public static int a0061aa0061a0061 = 0;
    public static int aa0061a0061a0061 = 1;
    public static int aaaa0061a0061 = 31;
    private static final char[] w0077w007700770077w;

    @Nullable
    private static final MessageDigest ww0077007700770077w;
    private static final String www007700770077w;

    static {
        MessageDigest messageDigest;
        String strB0062b006200620062b = qqbbqbq.b0062b006200620062b(qbbqbbq.class);
        int i = aaaa0061a0061;
        if (((aa0061a0061a0061 + i) * i) % a00610061a0061a0061 != a0061aa0061a0061) {
            aaaa0061a0061 = aaa00610061a0061();
            a0061aa0061a0061 = 94;
        }
        www007700770077w = strB0062b006200620062b;
        w0077w007700770077w = qqqqbbb.q0071q00710071q0071("XXXXXXXXXX\u007f\u007f\u007f\u007f\u007f\u007f", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710725)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))).toCharArray();
        qqbbqbq.i(strB0062b006200620062b, qqqqbbb.q0071q00710071q0071("\u00121AB8>8q&\u001c\u0016\u0007v<BA@OQ", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710801)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747))));
        if (qqqqbbq.b00620062bbb0062().b006200620062bb0062()) {
            messageDigest = null;
        } else {
            qqbbqbq.i(strB0062b006200620062b, qqqqbbb.q0071007100710071q0071("'DRQEIAx+\u001f\u0017\u0007\t\tq5963@@", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694601), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710660)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014675)));
            try {
                messageDigest = MessageDigest.getInstance(qqqqbbb.q0071q00710071q0071("]-2<g\u001d\u0010", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710740)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710737))));
            } catch (NoSuchAlgorithmException e) {
                qqbbqbq.qbbbqbq.e(www007700770077w, qqqqbbb.q0071q00710071q0071("\t|tdffO\u0013\u0017\u0014\u0011\u001e\u001eH\u000e\b\u000f\u0011\t\u0007", (char) (qbbqqbb.qqq007100710071q() ^ (-321957202)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957273))), (Throwable) e);
            } catch (Exception e2) {
                throw e2;
            }
        }
        ww0077007700770077w = messageDigest;
    }

    private qbbqbbq() {
    }

    public static int a0061a00610061a0061() {
        return 1;
    }

    public static int aaa00610061a0061() {
        return 3;
    }

    public static boolean b0062006200620062b0062(@Nullable String str) {
        if (str == null) {
            return true;
        }
        if (!str.isEmpty()) {
            return false;
        }
        int i = aaaa0061a0061;
        if (((aa0061a0061a0061 + i) * i) % a00610061a0061a0061 == a0061aa0061a0061) {
            return true;
        }
        aaaa0061a0061 = aaa00610061a0061();
        a0061aa0061a0061 = 38;
        return true;
    }

    @Nullable
    public static String b0062b00620062b0062(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, boolean z) {
        String lowerCase;
        if (b0062006200620062b0062(str) || b0062006200620062b0062(str3)) {
            return null;
        }
        if (b0062006200620062b0062(str2)) {
            return str;
        }
        if (z) {
            lowerCase = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            lowerCase = str;
        }
        int iIndexOf = lowerCase.indexOf(str2);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = lowerCase.indexOf(str3, iIndexOf + 1);
        if (iIndexOf2 == -1) {
            return str.substring(iIndexOf);
        }
        int i = aaaa0061a0061;
        if (((aa0061a0061a0061 + i) * i) % a00610061a0061a0061 != 0) {
            aaaa0061a0061 = aaa00610061a0061();
            a0061aa0061a0061 = 95;
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    public static boolean bb006200620062b0062(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (((a0061a00610061a0061() + aaaa0061a0061) * aaaa0061a0061) % a00610061a0061a0061 != a0061aa0061a0061) {
            aaaa0061a0061 = 22;
            a0061aa0061a0061 = 49;
        }
        return true;
    }

    @Nonnull
    public static String bbb00620062b0062(@Nonnull byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        while (true) {
            int length = bArr.length;
            int i2 = aaaa0061a0061;
            if (((aa0061a0061a0061 + i2) * i2) % a00610061a0061a0061 != a0061aa0061a0061) {
                aaaa0061a0061 = 67;
                a0061aa0061a0061 = 93;
            }
            if (i >= length) {
                return new String(cArr);
            }
            byte b = bArr[i];
            int i3 = i * 2;
            char[] cArr2 = w0077w007700770077w;
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
            i++;
        }
    }

    @Nullable
    public static String bbbbb00620062(@Nullable byte[] bArr) {
        String strBbb00620062b0062;
        if (bArr != null && bArr.length != 0) {
            if (qqqqbbq.b00620062bbb0062().b006200620062bb0062()) {
                return qqqqbbq.b00620062bbb0062().b0062bb0062b0062(bArr);
            }
            MessageDigest messageDigest = ww0077007700770077w;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] bArrDigest = messageDigest.digest();
                    messageDigest.reset();
                    strBbb00620062b0062 = bbb00620062b0062(bArrDigest);
                }
                return strBbb00620062b0062;
            }
        }
        return null;
    }
}

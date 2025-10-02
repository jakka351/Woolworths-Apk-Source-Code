package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import YU.a;
import android.util.Log;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qqbbqbq {
    public static int a0061a0061aaa = 0;
    public static int a0061aaaaa = 1;
    public static int aa0061aaaa = 2;
    public static int ii00690069006900690069 = 63;
    private static final int w0077007700770077ww = 23;
    private static final Pattern w0077www0077w = Pattern.compile(qqqqbbb.q0071007100710071q0071("yt3.", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710716)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694633), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014674)));
    private static boolean ww0077ww0077w = false;
    private static final boolean wwwww0077w = false;

    public static class qbbbqbq {
        public static int a00610061a0061aa = 77;
        public static int a00610061aa0061a = 1;
        public static int aa006100610061aa = 2;
        public static int aa0061aa0061a;

        private qbbbqbq() {
        }

        public static int a0061a00610061aa() {
            return 1;
        }

        public static int a0061aaa0061a() {
            return 42;
        }

        public static int aaa00610061aa() {
            return 0;
        }

        @Nonnull
        private static String b006200620062b0062b(String str) {
            StringBuilder sbS = a.s(str);
            int iQ00710071007100710071q = qqqbqbb.q00710071007100710071q() ^ 1589694551;
            int i = a00610061a0061aa;
            if (((a00610061aa0061a + i) * i) % aa006100610061aa != aa0061aa0061a) {
                a00610061a0061aa = 4;
                aa0061aa0061a = a0061aaa0061a();
            }
            sbS.append(qqqqbbb.q0071q00710071q0071("J__o", (char) iQ00710071007100710071q, (char) (qbbqqbb.qqq007100710071q() ^ (-321957277))));
            return sbS.toString();
        }

        public static void b0062bb00620062b(String str, String str2, String... strArr) {
        }

        public static void bbbb00620062b(String str, String str2) {
            if (qqbbqbq.bb0062b00620062b(str, 4)) {
                Log.i(str, str2);
                int i = a00610061a0061aa;
                if (((a0061a00610061aa() + i) * i) % aa006100610061aa != 0) {
                    a00610061a0061aa = 18;
                    aa006100610061aa = 98;
                }
            }
        }

        public static void d(String str, String str2) {
        }

        public static void e(String str, String str2) {
        }

        public static void e(String str, String str2, Object obj) {
        }

        public static void e(String str, String str2, Object obj, Object obj2) {
        }

        public static void e(String str, String str2, Throwable th) {
        }
    }

    private qqbbqbq() {
    }

    public static int a00610061aaaa() {
        return 96;
    }

    public static int aa00610061aaa() {
        return 2;
    }

    public static int aaa0061aaa() {
        return 1;
    }

    public static void b00620062006200620062b(boolean z) {
        ww0077ww0077w = z;
        int i = ii00690069006900690069;
        if (((a0061aaaaa + i) * i) % aa0061aaaa != 0) {
            ii00690069006900690069 = a00610061aaaa();
            a0061aaaaa = a00610061aaaa();
        }
    }

    public static boolean b00620062b00620062b() {
        try {
            throw null;
        } catch (Exception unused) {
            ii00690069006900690069 = 71;
            return !ww0077ww0077w;
        }
    }

    @Nonnull
    public static String b0062b006200620062b(@Nonnull Class cls) {
        StringBuilder sb = new StringBuilder();
        int i = ii00690069006900690069;
        if (((aaa0061aaa() + i) * i) % aa0061aaaa != 0) {
            ii00690069006900690069 = a00610061aaaa();
            a0061aaaaa = a00610061aaaa();
        }
        sb.append(qqqqbbb.q0071007100710071q0071("F\u0010U\u000eSBJ\n", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694489), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014570), (char) (qbbqqbb.qqq007100710071q() ^ (-321957278))));
        sb.append(cls.getSimpleName());
        String string = sb.toString();
        return string.length() > 23 ? string.substring(0, 23) : string;
    }

    private static boolean bb0062006200620062b(String str, int i) {
        if (ww0077ww0077w) {
            return false;
        }
        boolean zIsLoggable = Log.isLoggable(str, i);
        int i2 = ii00690069006900690069;
        if (((a0061aaaaa + i2) * i2) % aa0061aaaa != 0) {
            ii00690069006900690069 = a00610061aaaa();
            a0061aaaaa = 38;
        }
        return zIsLoggable;
    }

    public static /* synthetic */ boolean bb0062b00620062b(String str, int i) {
        boolean zBb0062006200620062b = bb0062006200620062b(str, i);
        int i2 = ii00690069006900690069;
        if (((a0061aaaaa + i2) * i2) % aa0061aaaa != a0061a0061aaa) {
            ii00690069006900690069 = a00610061aaaa();
            a0061a0061aaa = a00610061aaaa();
        }
        return zBb0062006200620062b;
    }

    public static String bbb006200620062b(@Nullable String str, @Nullable Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = w0077www0077w.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (!matcher.find()) {
                throw new InvalidParameterException(qqqqbbb.q0071007100710071q0071("4XLWYXJGW\u0002OUL@BNzI?w8H<I@7?DBm3;=i=009d*24.!3]00-#'\u001f", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710712)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694484), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694665)));
            }
            matcher.appendReplacement(stringBuffer, obj != null ? String.valueOf(obj).replace(qqqqbbb.q0071q00710071q0071("&", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014639), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710746))), "") : qqqqbbb.q0071007100710071q0071("LTLM", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710718)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677), (char) (qbbqqbb.qqq007100710071q() ^ (-321957276))));
        }
        if (matcher.find()) {
            throw new InvalidParameterException(qqqqbbb.q0071007100710071q0071("<@\u0010s\u007f\u001b,\\r=\u00182Lqj)=\u0011\u000f3zpz'sc[dY9M 5bv\u0003%ig\f_d=i\tmip1j\u0002\u001f", (char) (qbbqqbb.qqq007100710071q() ^ (-321957226)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694562), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694670)));
        }
        String string = matcher.appendTail(stringBuffer).toString();
        int i2 = ii00690069006900690069;
        if (((a0061aaaaa + i2) * i2) % aa0061aaaa != 0) {
            ii00690069006900690069 = 36;
            a0061aaaaa = 62;
        }
        return string;
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
            int i = ii00690069006900690069;
            if (((a0061aaaaa + i) * i) % aa00610061aaa() != a0061a0061aaa) {
                ii00690069006900690069 = a00610061aaaa();
                a0061a0061aaa = a00610061aaaa();
            }
        }
    }

    public static void i(String str, String str2) {
        if (bb0062006200620062b(str, 4)) {
            int i = ii00690069006900690069;
            if (((a0061aaaaa + i) * i) % aa0061aaaa != 0) {
                ii00690069006900690069 = 53;
                a0061a0061aaa = 87;
            }
            Log.i(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        int i = 1;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                ii00690069006900690069 = 53;
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, str2, th);
                    return;
                }
                return;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (bb0062006200620062b(str, 4)) {
            int i = ii00690069006900690069;
            if (((aaa0061aaa() + i) * i) % aa0061aaaa != 0) {
                ii00690069006900690069 = a00610061aaaa();
                a0061a0061aaa = 39;
            }
            Log.i(str, str2, th);
        }
    }

    public static void e(String str, String str2, String... strArr) {
        if (((aaa0061aaa() + ii00690069006900690069) * ii00690069006900690069) % aa0061aaaa != a0061a0061aaa) {
            ii00690069006900690069 = a00610061aaaa();
            a0061a0061aaa = a00610061aaaa();
        }
        e(str, bbb006200620062b(str2, strArr));
    }

    public static void i(String str, String str2, String... strArr) {
        i(str, bbb006200620062b(str2, strArr));
    }
}

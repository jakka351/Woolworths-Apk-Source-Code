package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import android.util.Log;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class vvvmvmv {
    private static final int w00770077w007700770077 = 23;
    private static final Pattern w0077w0077007700770077;
    private static boolean ww00770077007700770077 = false;
    private static final boolean www0077007700770077 = false;
    public static int x007800780078xxx = 56;
    public static int x00780078x0078xx = 0;
    public static int xx0078x0078xx = 2;
    public static int xxxx0078xx = 1;

    public static class vmvmvmv {
        public static int x00780078xx0078x = 1;
        public static int x0078xxx0078x = 64;
        public static int xx0078xx0078x = 0;
        public static int xxx0078x0078x = 2;

        private vmvmvmv() {
        }

        public static void d(String str, String str2) {
        }

        public static void e(String str, String str2) {
        }

        @Nonnull
        private static String h0068h0068hhh(String str) {
            StringBuilder sb = new StringBuilder();
            int i = x0078xxx0078x;
            if (((x00780078xx0078x + i) * i) % xxx0078x0078x != xx0078xx0078x) {
                x0078xxx0078x = 16;
                xx0078xx0078x = x0078x0078x0078x();
            }
            sb.append(str);
            sb.append(vvvmmvm.n006E006En006Enn("Vmo\u0002", (char) (vmmmvvm.hh0068h006800680068() ^ 263258419), (char) (vmmmvvm.hh0068h006800680068() ^ 263258535)));
            return sb.toString();
        }

        public static int x0078x0078x0078x() {
            return 76;
        }

        public static void d(String str, String str2, Object obj) {
        }

        public static void e(String str, String str2, Object obj) {
        }

        public static void d(String str, String str2, Throwable th) {
        }

        public static void e(String str, String str2, Object obj, Object obj2) {
        }

        public static void e(String str, String str2, Throwable th) {
        }
    }

    static {
        Pattern patternCompile = Pattern.compile(vvvmmvm.n006En006E006Enn("CaAa", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496001)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843216)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587841))));
        if ((xxx00780078xx() * (xxx00780078xx() + xxxx0078xx)) % xx0078x0078xx != x00780078x0078xx) {
            x007800780078xxx = xxx00780078xx();
            x00780078x0078xx = xxx00780078xx();
        }
        w0077w0077007700770077 = patternCompile;
        ww00770077007700770077 = false;
    }

    private vvvmvmv() {
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static String h006800680068hhh(@Nullable String str, @Nullable Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = w0077w0077007700770077.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!matcher.find()) {
                throw new InvalidParameterException(vvvmmvm.n006E006En006Enn("Fj^ikj\\Yi\u0014ag^RT`\r[Q\nJZN[RIQVT\u007fEMO{OBBKv<DF@3EoBB?591", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843219)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587841))));
            }
            matcher.appendReplacement(stringBuffer, obj != null ? String.valueOf(obj).replace(vvvmmvm.n006E006En006Enn("\"", (char) (vmmmvvm.hh0068h006800680068() ^ 263258507), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496244))), "") : vvvmmvm.n006E006En006Enn("YaUV", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843129)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496243))));
            i++;
            int i2 = x007800780078xxx;
            if (((xxxx0078xx + i2) * i2) % xx0078x0078xx != x00780078x0078xx) {
                x007800780078xxx = xxx00780078xx();
                x00780078x0078xx = 18;
            }
        }
        if (matcher.find()) {
            throw new InvalidParameterException(vvvmmvm.n006E006En006Enn("(N@MMN>=KwCK@66Dn?3m,>0?4-3:6c'1q qfdo\u0019`fjbWg\u0014dfaY[U", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587874)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587847))));
        }
        return matcher.appendTail(stringBuffer).toString();
    }

    private static final boolean h0068hh0068hh(String str, int i) {
        return !ww00770077007700770077 && Log.isLoggable(str, i);
    }

    public static boolean hh00680068hhh() {
        if (ww00770077007700770077) {
            return false;
        }
        if ((xxx00780078xx() * (xxx00780078xx() + xxxx0078xx)) % xx0078x0078xx == x00780078x0078xx) {
            return true;
        }
        x007800780078xxx = xxx00780078xx();
        x00780078x0078xx = 51;
        return true;
    }

    public static void hh0068h0068hh(boolean z) {
        ww00770077007700770077 = z;
        int i = x007800780078xxx;
        if (((xxxx0078xx + i) * i) % xx0078x0078xx != 0) {
            x007800780078xxx = 93;
            xxxx0078xx = 11;
        }
    }

    @Nonnull
    public static String hhhh0068hh(@Nonnull Class cls) {
        String str = vvvmmvm.n006En006E006Enn("\u0011yUO+9;\u0019", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496091)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496145)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843030))) + cls.getSimpleName();
        int i = x007800780078xxx;
        if (((xxxx0078xx + i) * i) % xx0078x0078xx != x00780078x0078xx) {
            x007800780078xxx = xxx00780078xx();
            x00780078x0078xx = xxx00780078xx();
        }
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static void i(String str, String str2) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                x007800780078xxx = xxx00780078xx();
                if (h0068hh0068hh(str, 4)) {
                    Log.i(str, str2);
                    return;
                }
                return;
            }
        }
    }

    public static int x0078xx0078xx() {
        return 2;
    }

    public static int xxx00780078xx() {
        return 3;
    }

    public static void e(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            int i = x007800780078xxx;
            if (((xxxx0078xx + i) * i) % xx0078x0078xx != 0) {
                x007800780078xxx = 40;
                x00780078x0078xx = 11;
            }
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (h0068hh0068hh(str, 4)) {
            int i = x007800780078xxx;
            if (((xxxx0078xx + i) * i) % xx0078x0078xx != x00780078x0078xx) {
                x007800780078xxx = 2;
                x00780078x0078xx = xxx00780078xx();
            }
            Log.i(str, str2, th);
        }
    }

    public static void e(String str, String str2, String... strArr) {
        String strH006800680068hhh = h006800680068hhh(str2, strArr);
        int i = x007800780078xxx;
        if (((xxxx0078xx + i) * i) % xx0078x0078xx != 0) {
            x007800780078xxx = xxx00780078xx();
            x00780078x0078xx = xxx00780078xx();
        }
        e(str, strH006800680068hhh);
    }

    public static void i(String str, String str2, String... strArr) {
        String strH006800680068hhh = h006800680068hhh(str2, strArr);
        int i = x007800780078xxx;
        if (((xxxx0078xx + i) * i) % x0078xx0078xx() != x00780078x0078xx) {
            x007800780078xxx = 30;
            x00780078x0078xx = xxx00780078xx();
        }
        i(str, strH006800680068hhh);
    }
}

package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.util.Log;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class lqlqqll {
    private static final int p00700070p00700070p = 23;
    private static final boolean p0070p007000700070p = false;
    private static final String ppp007000700070p = "ThreatMetrix";
    private static final Pattern pp0070007000700070p = Pattern.compile("\\{\\}");
    private static boolean p00700070007000700070p = false;

    public static class llqqqll {
        private llqqqll() {
        }

        public static void u0075007500750075uu(String str, String str2, Object obj, Object obj2) {
        }

        public static void u007500750075uuu(String str, String str2, Throwable th) {
        }

        public static void u00750075u0075uu(String str, String str2, Object obj, Object obj2) {
        }

        public static void u00750075uu0075u(String str, String str2, Object obj, Object obj2) {
        }

        public static void u00750075uuuu(String str, String str2, Throwable th) {
        }

        public static void u0075u00750075uu(String str, String str2) {
        }

        public static void u0075u0075uuu(String str, String str2, Object obj) {
        }

        public static void u0075uu0075uu(String str, String str2) {
        }

        public static void u0075uuu0075u(String str, String str2) {
        }

        public static void u0075uuuuu(String str, String str2, Object obj) {
        }

        public static void uu007500750075uu(String str, String str2, Object obj) {
        }

        public static void uu00750075uuu(String str, String str2, Object obj, Object obj2) {
        }

        public static void uu0075u0075uu(String str, String str2, Object obj) {
        }

        public static void uu0075uu0075u(String str, String str2, Object obj) {
        }

        public static void uu0075uuuu(String str, String str2, Object obj, Object obj2) {
        }

        public static void uuu00750075uu(String str, String str2, Throwable th) {
        }

        public static void uuu0075u0075u(String str, String str2, Throwable th) {
        }

        public static void uuu0075uuu(String str, String str2) {
        }

        @Nonnull
        private static String uuuu0075uu(String str) {
            return a.g(str, ".DEV");
        }

        public static void uuuuu0075u(String str, String str2, Throwable th) {
        }

        public static void yy00790079007900790079(String str, String str2) {
        }
    }

    private lqlqqll() {
    }

    public static boolean u00750075007500750075u() {
        return false;
    }

    public static String u007500750075u0075u(@Nullable String str, @Nullable Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = pp0070007000700070p.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (!matcher.find()) {
                throw new InvalidParameterException("Incorrect number of arguments for this format string");
            }
            matcher.appendReplacement(stringBuffer, obj != null ? String.valueOf(obj).replace("$", "") : "null");
        }
        if (matcher.find()) {
            throw new InvalidParameterException("Incorrect number of arguments for this format string");
        }
        return matcher.appendTail(stringBuffer).toString();
    }

    @Nonnull
    public static String u00750075u00750075u(@Nonnull Class cls) {
        String strConcat = "c.t.tdm.".concat(cls.getSimpleName());
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static void u00750075uuu0075(String str, String str2, Throwable th) {
        if (uuuuuu0075(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static void u0075u007500750075u(String str, String str2, Throwable th) {
        if (uuuuuu0075(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    public static boolean u0075u0075u0075u() {
        return !p00700070007000700070p;
    }

    public static void u0075u0075uu0075(String str, String str2) {
        Log.w(str, "Unexpected ERROR: " + str2);
    }

    public static void u0075uu00750075u(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void u0075uuuu0075(boolean z) {
        p00700070007000700070p = z;
    }

    public static void uu0075007500750075u(String str, String str2, String... strArr) {
        if (uuuuuu0075(str, 4)) {
            Log.i(str, u007500750075u0075u(str2, strArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static boolean uu00750075u0075u() {
        ?? r1;
        lllqlql lllqlqlVarH0068hhhh0068;
        if (uuuuuu0075(ppp007000700070p, 2)) {
            r1 = 1;
            lllqlqlVarH0068hhhh0068 = lllqlql.h0068hhhh0068();
        } else {
            r1 = 0;
            lllqlqlVarH0068hhhh0068 = lllqlql.h0068hhhh0068();
        }
        lllqlqlVarH0068hhhh0068.h0068006800680068h0068(r1);
        return r1;
    }

    public static void uu00750075uu0075(String str, String str2, String... strArr) {
        Log.w(str, u007500750075u0075u(a.A("Unexpected ERROR: ", str2), strArr));
    }

    public static void uu0075u00750075u(String str, String str2, String... strArr) {
        uuuu00750075u(str, u007500750075u0075u(str2, strArr));
    }

    public static void uu0075uuu0075(String str, String str2) {
        if (uuuuuu0075(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void uuu007500750075u(String str, String str2) {
        if (uuuuuu0075(str, 4)) {
            Log.i(str, str2);
        }
    }

    public static void uuu0075uu0075(String str, String str2, String... strArr) {
        uu0075uuu0075(str, u007500750075u0075u(str2, strArr));
    }

    public static void uuuu00750075u(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    private static boolean uuuuuu0075(String str, int i) {
        return !p00700070007000700070p && Log.isLoggable(str, i);
    }
}

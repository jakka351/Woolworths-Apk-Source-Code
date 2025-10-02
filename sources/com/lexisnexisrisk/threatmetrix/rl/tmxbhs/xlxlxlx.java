package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class xlxlxlx {
    public static int f00660066fff0066 = 0;
    public static int f0066f0066ff0066 = 2;
    public static int ff00660066ff0066 = 12;
    public static int fff0066ff0066 = 1;
    private static final boolean q0071q0071007100710071 = false;
    private static final Pattern qq00710071007100710071;
    private static final int qqq0071007100710071 = 23;

    public static class xxllxlx {
        public static int f00660066f0066f0066 = 91;
        public static int ff006600660066f0066 = 2;
        public static int fff00660066f0066;

        private xxllxlx() {
        }

        public static void d(String str, String str2) {
        }

        public static void e(String str, String str2) {
        }

        public static int f0066006600660066f0066() {
            return 9;
        }

        public static int f0066f00660066f0066() {
            return 1;
        }

        @Nonnull
        private static String t007400740074tt0074(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            char cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464204);
            int iRrr007200720072r = jkkkjjj.rrr007200720072r();
            if (((f0066f00660066f0066() + f00660066f0066f0066) * f00660066f0066f0066) % ff006600660066f0066 != fff00660066f0066) {
                f00660066f0066f0066 = f0066006600660066f0066();
                fff00660066f0066 = 99;
            }
            sb.append(xlxllxl.r007200720072r0072r("yCn/", cRrr007200720072r, (char) (iRrr007200720072r ^ 1252464172), (char) (jkkkjjj.rrr007200720072r() ^ 1252464212)));
            return sb.toString();
        }

        public static void e(String str, String str2, Object obj) {
        }

        public static void e(String str, String str2, Object obj, Object obj2) {
        }
    }

    static {
        if ((ff0066fff0066() * (ff0066fff0066() + fff0066ff0066)) % f0066f0066ff0066 != f00660066fff0066) {
            ff00660066ff0066 = 11;
            f00660066fff0066 = ff0066fff0066();
        }
        qq00710071007100710071 = Pattern.compile(xlxllxl.r0072r0072r0072r("A_Cc", (char) (jjjjkjj.rrrrrr0072() ^ 2074272670), (char) (jkkkjjj.rrr007200720072r() ^ 1252464214)));
    }

    private xlxlxlx() {
    }

    public static int ff0066fff0066() {
        return 8;
    }

    @Nonnull
    public static String t0074tt0074t0074(@Nonnull Class cls) {
        StringBuilder sb = new StringBuilder();
        int iRrr007200720072r = jkkkjjj.rrr007200720072r();
        if ((ff0066fff0066() * (ff0066fff0066() + fff0066ff0066)) % f0066f0066ff0066 != f00660066fff0066) {
            f00660066fff0066 = ff0066fff0066();
        }
        sb.append(xlxllxl.r0072r0072r0072r("T g\"iZd&", (char) (iRrr007200720072r ^ 1252464172), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858859)));
        sb.append(cls.getSimpleName());
        String string = sb.toString();
        return string.length() > 23 ? string.substring(0, 23) : string;
    }

    public static String tttt0074t0074(@Nullable String str, @Nullable Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = qq00710071007100710071.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (!matcher.find()) {
                throw new InvalidParameterException(xlxllxl.r0072r0072r0072r("Quitvugdt\u001flri]_k\u0018f\\\u0015UeYf]T\\a_\u000bPXZ\u0007ZMMV\u0002GOQK>PzMMJ@D<", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105889), (char) (jkkkjjj.rrr007200720072r() ^ 1252464209)));
            }
            int i2 = ff00660066ff0066;
            if (((fff0066ff0066 + i2) * i2) % f0066f0066ff0066 != 0) {
                ff00660066ff0066 = ff0066fff0066();
                f00660066fff0066 = ff0066fff0066();
            }
            matcher.appendReplacement(stringBuffer, obj != null ? String.valueOf(obj).replace(xlxllxl.r0072r0072r0072r("3", (char) (jjjjkjj.rrrrrr0072() ^ 2074272765), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823)), "") : xlxllxl.r007200720072r0072r(";A76", (char) (jkkkjjj.rrr007200720072r() ^ 1252464340), (char) (jjjjkjj.rrrrrr0072() ^ 2074272587), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858857)));
        }
        if (matcher.find()) {
            throw new InvalidParameterException(xlxllxl.r007200720072r0072r("\u001en\u00041%(A\u0019\u0019!IyppPW\rI:l\u001e\"\u007fg][1\u001f\u000108ka\u0001L6\u0002^4A[\";\u0006{<\u00172P{KO", (char) (jjjjkjj.rrrrrr0072() ^ 2074272592), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858915), (char) (jkkkjjj.rrr007200720072r() ^ 1252464215)));
        }
        return matcher.appendTail(stringBuffer).toString();
    }
}

package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/CharsKt__CharKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CharsKt extends CharsKt__CharKt {
    public static void b(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbR = YU.a.r(i, "radix ", " was not in valid range ");
            sbR.append(new IntRange(2, 36, 1));
            throw new IllegalArgumentException(sbR.toString());
        }
    }

    public static boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static String d(char c, Locale locale) {
        Intrinsics.h(locale, "locale");
        String strValueOf = String.valueOf(c);
        Intrinsics.f(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.g(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c);
            Intrinsics.f(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase2, "toUpperCase(...)");
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = upperCase.charAt(0);
            String strSubstring = upperCase.substring(1);
            Intrinsics.g(strSubstring, "substring(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return upperCase;
    }
}

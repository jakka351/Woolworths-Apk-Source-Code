package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class RenderingUtilsKt {
    public static final String a(Name name) {
        Intrinsics.h(name, "<this>");
        String strB = name.b();
        Intrinsics.g(strB, "asString(...)");
        if (!KeywordStringsGenerated.f24526a.contains(strB)) {
            int i = 0;
            while (true) {
                if (i < strB.length()) {
                    char cCharAt = strB.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    String strB2 = name.b();
                    Intrinsics.g(strB2, "asString(...)");
                    return strB2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = name.b();
        Intrinsics.g(strB3, "asString(...)");
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Name name = (Name) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(a(name));
        }
        return sb.toString();
    }

    public static final String c(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.h(lowerRendered, "lowerRendered");
        Intrinsics.h(lowerPrefix, "lowerPrefix");
        Intrinsics.h(upperRendered, "upperRendered");
        Intrinsics.h(upperPrefix, "upperPrefix");
        Intrinsics.h(foldedPrefix, "foldedPrefix");
        if (!StringsKt.W(lowerRendered, lowerPrefix, false) || !StringsKt.W(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.g(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.g(strSubstring2, "substring(...)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!d(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean d(String lower, String upper) {
        Intrinsics.h(lower, "lower");
        Intrinsics.h(upper, "upper");
        if (lower.equals(StringsKt.Q(upper, "?", "", false))) {
            return true;
        }
        if (StringsKt.v(upper, "?", false) && Intrinsics.c(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.c(sb.toString(), upper);
    }
}

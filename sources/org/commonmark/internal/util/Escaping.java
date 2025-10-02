package org.commonmark.internal.util;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class Escaping {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f26852a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;
    public static final AnonymousClass1 d;

    /* renamed from: org.commonmark.internal.util.Escaping$1, reason: invalid class name */
    public class AnonymousClass1 implements Replacer {
    }

    /* renamed from: org.commonmark.internal.util.Escaping$2, reason: invalid class name */
    public class AnonymousClass2 implements Replacer {
    }

    public interface Replacer {
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        d = new AnonymousClass1();
    }

    public static String a(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return c.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    public static String b(String str) {
        if (!f26852a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(Html5Entities.a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}

package com.swrve.sdk;

import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class SwrveTextTemplating {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19076a = Pattern.compile("\\$\\{([^\\}]*)\\}");
    public static final Pattern b = Pattern.compile("\\|fallback=\"([^\\}]*)\"\\}");
    public static final Pattern c = Pattern.compile("\\|fallback=\\\\\"([^\\}]*)\\\\\"\\}");

    public static String a(String str, Map map) throws SwrveSDKTextTemplatingException {
        if (str == null) {
            return str;
        }
        Matcher matcher = f19076a.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(0);
            Matcher matcher2 = b.matcher(strGroup);
            String strGroup2 = null;
            while (matcher2.find()) {
                strGroup2 = matcher2.group(1);
            }
            String strGroup3 = matcher.group(1);
            if (strGroup2 != null) {
                strGroup3 = strGroup3.substring(0, strGroup3.indexOf("|fallback=\""));
            }
            if (map != null && !SwrveHelper.p((String) map.get(strGroup3))) {
                str = str.replace(strGroup, (CharSequence) map.get(strGroup3));
            } else {
                if (strGroup2 == null) {
                    throw new SwrveSDKTextTemplatingException(YU.a.A("TextTemplating: Missing property value for key ", strGroup3));
                }
                str = str.replace(strGroup, strGroup2);
            }
        }
        return str;
    }

    public static String b(String str, Map map) throws SwrveSDKTextTemplatingException {
        if (str == null) {
            return str;
        }
        Matcher matcher = f19076a.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(0);
            Matcher matcher2 = c.matcher(strGroup);
            String strGroup2 = null;
            while (matcher2.find()) {
                strGroup2 = matcher2.group(1);
            }
            String strGroup3 = matcher.group(1);
            if (strGroup2 != null) {
                strGroup3 = strGroup3.substring(0, strGroup3.indexOf("|fallback=\\\""));
            }
            if (!SwrveHelper.p((String) map.get(strGroup3))) {
                str = str.replace(strGroup, (CharSequence) map.get(strGroup3));
            } else {
                if (strGroup2 == null) {
                    throw new SwrveSDKTextTemplatingException(YU.a.A("TextTemplating: Missing property value for key ", strGroup3));
                }
                str = str.replace(strGroup, strGroup2);
            }
        }
        return str;
    }
}

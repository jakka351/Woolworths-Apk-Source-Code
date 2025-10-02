package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16580a = 2;
    public static final int b = 4095;
    public static final int c = 255;
    public static final int d = 127;
    public static final int e = 32;
    public static final int f = 15;

    public static Object a(Object obj) {
        return obj != null ? obj : JSONObject.NULL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r5) {
        /*
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 2
            r1.<init>(r2)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L6b
            char r3 = r5.charAt(r2)
            r4 = 4095(0xfff, float:5.738E-42)
            if (r3 <= r4) goto L23
            java.lang.String r4 = "\\u"
        L18:
            r1.append(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
        L1f:
            r1.append(r3)
            goto L68
        L23:
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L2a
            java.lang.String r4 = "\\u0"
            goto L18
        L2a:
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L2f
            goto L3a
        L2f:
            r4 = 32
            if (r3 >= r4) goto L4f
            switch(r3) {
                case 8: goto L4c;
                case 9: goto L49;
                case 10: goto L46;
                case 11: goto L36;
                case 12: goto L43;
                case 13: goto L40;
                default: goto L36;
            }
        L36:
            r4 = 15
            if (r3 <= r4) goto L3d
        L3a:
            java.lang.String r4 = "\\u00"
            goto L18
        L3d:
            java.lang.String r4 = "\\u000"
            goto L18
        L40:
            java.lang.String r3 = "\\r"
            goto L1f
        L43:
            java.lang.String r3 = "\\f"
            goto L1f
        L46:
            java.lang.String r3 = "\\n"
            goto L1f
        L49:
            java.lang.String r3 = "\\t"
            goto L1f
        L4c:
            java.lang.String r3 = "\\b"
            goto L1f
        L4f:
            r4 = 34
            if (r3 == r4) goto L65
            r4 = 39
            if (r3 == r4) goto L62
            r4 = 92
            if (r3 == r4) goto L5f
            r1.append(r3)
            goto L68
        L5f:
            java.lang.String r3 = "\\\\"
            goto L1f
        L62:
            java.lang.String r3 = "\\'"
            goto L1f
        L65:
            java.lang.String r3 = "\\\""
            goto L1f
        L68:
            int r2 = r2 + 1
            goto Lc
        L6b:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.l3.b(java.lang.String):java.lang.String");
    }

    public static String c(String str) {
        if (str != null) {
            str = str.replace("\n", "\\n");
        }
        return str == null ? "null" : YU.a.h("\"", str, "\"");
    }

    public static String d(String str) {
        if (str != null) {
            str = b(str);
        }
        return str == null ? "null" : YU.a.h("\"", str, "\"");
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '\\') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        return str != null ? str.replace("\"", "\\\"") : str;
    }

    public static String a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace(z ? "'" : "%27", z ? "%27" : "'");
    }
}

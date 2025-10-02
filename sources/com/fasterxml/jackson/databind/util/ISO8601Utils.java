package com.fasterxml.jackson.databind.util;

import java.util.TimeZone;

@Deprecated
/* loaded from: classes4.dex */
public class ISO8601Utils {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f14333a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:3:0x0007, B:5:0x001a, B:6:0x001c, B:8:0x0028, B:9:0x002a, B:11:0x0039, B:13:0x003f, B:19:0x0057, B:21:0x0067, B:22:0x0069, B:24:0x0075, B:25:0x0078, B:27:0x007e, B:31:0x0088, B:36:0x0098, B:38:0x00a0, B:39:0x00a4, B:41:0x00aa, B:46:0x00b7, B:49:0x00c2, B:60:0x00ed, B:62:0x00f3, B:84:0x018c, B:70:0x0105, B:71:0x0120, B:72:0x0121, B:74:0x0132, B:77:0x013b, B:79:0x015a, B:82:0x0169, B:83:0x018b, B:86:0x01bd, B:87:0x01c4, B:53:0x00d2, B:54:0x00d5, B:48:0x00be), top: B:95:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:3:0x0007, B:5:0x001a, B:6:0x001c, B:8:0x0028, B:9:0x002a, B:11:0x0039, B:13:0x003f, B:19:0x0057, B:21:0x0067, B:22:0x0069, B:24:0x0075, B:25:0x0078, B:27:0x007e, B:31:0x0088, B:36:0x0098, B:38:0x00a0, B:39:0x00a4, B:41:0x00aa, B:46:0x00b7, B:49:0x00c2, B:60:0x00ed, B:62:0x00f3, B:84:0x018c, B:70:0x0105, B:71:0x0120, B:72:0x0121, B:74:0x0132, B:77:0x013b, B:79:0x015a, B:82:0x0169, B:83:0x018b, B:86:0x01bd, B:87:0x01c4, B:53:0x00d2, B:54:0x00d5, B:48:0x00be), top: B:95:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ISO8601Utils.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}

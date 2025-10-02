package com.google.gson.internal.bind.util;

import java.util.TimeZone;

/* loaded from: classes6.dex */
public class ISO8601Utils {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f15959a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[Catch: IllegalArgumentException -> 0x00bc, NumberFormatException -> 0x00bf, IndexOutOfBoundsException -> 0x00c2, TRY_LEAVE, TryCatch #2 {IndexOutOfBoundsException -> 0x00c2, NumberFormatException -> 0x00bf, IllegalArgumentException -> 0x00bc, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:53:0x00c9, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:57:0x00d9, B:58:0x00dc, B:52:0x00c5), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd A[Catch: IllegalArgumentException -> 0x00bc, NumberFormatException -> 0x00bf, IndexOutOfBoundsException -> 0x00c2, TryCatch #2 {IndexOutOfBoundsException -> 0x00c2, NumberFormatException -> 0x00bf, IllegalArgumentException -> 0x00bc, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:53:0x00c9, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:57:0x00d9, B:58:0x00dc, B:52:0x00c5), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.b(java.lang.String, java.text.ParsePosition):java.util.Date");
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

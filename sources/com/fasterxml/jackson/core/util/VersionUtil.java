package com.fasterxml.jackson.core.util;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class VersionUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14224a = Pattern.compile("[-_./;:]");

    public static void a(String str) {
        String[] strArrSplit = f14224a.split("2.14.2");
        b(strArrSplit[0]);
        if (strArrSplit.length > 1) {
            b(strArrSplit[1]);
        }
        if (strArrSplit.length > 2) {
            b(strArrSplit[2]);
        }
        if (strArrSplit.length > 3) {
            String str2 = strArrSplit[3];
        }
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i = (i * 10) + (cCharAt - '0');
        }
        return i;
    }

    public static final void c() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}

package com.medallia.digital.mobilesdk;

import android.text.format.DateFormat;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16587a = "yyyy-MM-dd";
    private static final String b = "HH:mm:ss";

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected static final int f16588a = 1024;
        protected static final int b = 1048576;
        private static final double c = 8.0d;
        protected static final double d = 7.62939453125E-6d;
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final long f16589a = 1000;
        public static final long b = 60000;
        public static final long c = 3600000;
        public static final long d = 86400000;
    }

    public static String a(long j) {
        return a(j, "yyyy-MM-dd HH:mm:ss");
    }

    public static String b(long j) {
        return a(j, b);
    }

    private static String a(long j, String str) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return DateFormat.format(str, calendar).toString();
    }
}

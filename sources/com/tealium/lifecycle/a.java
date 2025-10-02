package com.tealium.lifecycle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f19191a;
    public final Calendar b;
    public final SimpleDateFormat c;
    public final Date d;

    /* renamed from: com.tealium.lifecycle.a$a, reason: collision with other inner class name */
    public static final class C0395a {
        public static long a(long j, long j2) {
            if (j == Long.MIN_VALUE || j2 == Long.MIN_VALUE) {
                return 0L;
            }
            if (j < 0) {
                j = 0;
            }
            if (j2 < 0) {
                j2 = 0;
            }
            return (j2 > j ? j2 - j : 0L) / 86400000;
        }
    }

    public a(b bVar) {
        this.f19191a = bVar;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.g(calendar, "getInstance()");
        this.b = calendar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        this.c = simpleDateFormat;
        this.d = new Date(Long.MIN_VALUE);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final String a(long j, String str) {
        long j2 = this.f19191a.f19192a.getLong(str, j);
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        Date date = this.d;
        date.setTime(j2);
        return this.c.format(date);
    }
}

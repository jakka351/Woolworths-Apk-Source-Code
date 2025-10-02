package me.oriient.positioningengine.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class a {
    public static final synchronized String a(long j, TimeZone timeZone) {
        String str;
        Intrinsics.h(timeZone, "timeZone");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.g(str, "format(...)");
        return str;
    }

    public static final synchronized long a(String str, TimeZone timeZone) {
        Date date;
        Intrinsics.h(str, "<this>");
        Intrinsics.h(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        date = simpleDateFormat.parse(str);
        return date != null ? date.getTime() : 0L;
    }
}

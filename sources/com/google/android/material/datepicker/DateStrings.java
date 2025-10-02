package com.google.android.material.datepicker;

import androidx.core.util.Pair;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
class DateStrings {
    public static Pair a(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new Pair(null, null);
        }
        if (l == null) {
            return new Pair(null, b(l2.longValue()));
        }
        if (l2 == null) {
            return new Pair(b(l.longValue()), null);
        }
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(l.longValue());
        Calendar calendarG2 = UtcDates.g(null);
        calendarG2.setTimeInMillis(l2.longValue());
        return calendarG.get(1) == calendarG2.get(1) ? calendarG.get(1) == calendarF.get(1) ? new Pair(c(l.longValue(), Locale.getDefault()), c(l2.longValue(), Locale.getDefault())) : new Pair(c(l.longValue(), Locale.getDefault()), d(l2.longValue(), Locale.getDefault())) : new Pair(d(l.longValue(), Locale.getDefault()), d(l2.longValue(), Locale.getDefault()));
    }

    public static String b(long j) {
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j);
        return calendarF.get(1) == calendarG.get(1) ? c(j, Locale.getDefault()) : d(j, Locale.getDefault());
    }

    public static String c(long j, Locale locale) {
        return UtcDates.b("MMMd", locale).format(new Date(j));
    }

    public static String d(long j, Locale locale) {
        return UtcDates.b("yMMMd", locale).format(new Date(j));
    }
}

package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LegacyCalendarModelImpl extends CalendarModel {
    public static final TimeZone b = TimeZone.getTimeZone("UTC");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final String a(long j, String str, Locale locale) {
        StringBuilder sbS = YU.a.s(str);
        sbS.append(locale.toLanguageTag());
        String string = sbS.toString();
        LinkedHashMap linkedHashMap = this.f1551a;
        Object obj = linkedHashMap.get(string);
        TimeZone timeZone = b;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(string, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate b(long j) {
        Calendar calendar = Calendar.getInstance(b);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final DateInputFormat c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.f(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    /* renamed from: d */
    public final int getB() {
        return 0;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth e(int i, int i2) {
        Calendar calendar = Calendar.getInstance(b);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth f(long j) {
        Calendar calendar = Calendar.getInstance(b);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth g(CalendarDate calendarDate) {
        return e(calendarDate.d, calendarDate.e);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.get(16) + calendar.get(15) + calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final List i() {
        return null;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate j(String str, String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = b;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth k(CalendarMonth calendarMonth, int i) {
        if (i <= 0) {
            return calendarMonth;
        }
        Calendar calendar = Calendar.getInstance(b);
        calendar.setTimeInMillis(calendarMonth.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final CalendarMonth l(Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = i != 0 ? i : 7;
        if (i2 < 0) {
            i2 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}

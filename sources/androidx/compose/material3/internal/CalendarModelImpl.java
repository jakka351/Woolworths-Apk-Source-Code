package androidx.compose.material3.internal;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/CalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CalendarModelImpl extends CalendarModel {
    public static final ZoneId d = ZoneId.of("UTC");
    public final int b;
    public final ArrayList c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/CalendarModelImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static String a(long j, String str, Locale locale, Map map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            Intrinsics.f(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return Instant.ofEpochMilli(j).atZone(CalendarModelImpl.d).toLocalDate().format((DateTimeFormatter) objWithDecimalStyle);
        }
    }

    public CalendarModelImpl(Locale locale) {
        this.b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.c = arrayList;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final String a(long j, String str, Locale locale) {
        return Companion.a(j, str, locale, this.f1551a);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(d).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final DateInputFormat c(Locale locale) {
        return CalendarModelKt.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(d).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth g(CalendarDate calendarDate) {
        return l(LocalDate.of(calendarDate.d, calendarDate.e, 1));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate h() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final List i() {
        return this.c;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarDate j(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public final CalendarMonth k(CalendarMonth calendarMonth, int i) {
        return i <= 0 ? calendarMonth : l(Instant.ofEpochMilli(calendarMonth.e).atZone(d).toLocalDate().plusMonths(i));
    }

    public final CalendarMonth l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.b;
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(d).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}

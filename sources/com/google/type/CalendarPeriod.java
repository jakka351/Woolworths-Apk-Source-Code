package com.google.type;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.type.CalendarPeriod$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<CalendarPeriod> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            switch (i) {
                case 0:
                    return CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                case 1:
                    return CalendarPeriod.DAY;
                case 2:
                    return CalendarPeriod.WEEK;
                case 3:
                    return CalendarPeriod.FORTNIGHT;
                case 4:
                    return CalendarPeriod.MONTH;
                case 5:
                    return CalendarPeriod.QUARTER;
                case 6:
                    return CalendarPeriod.HALF;
                case 7:
                    return CalendarPeriod.YEAR;
                default:
                    return null;
            }
        }
    }

    public static final class CalendarPeriodVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            CalendarPeriod calendarPeriod;
            switch (i) {
                case 0:
                    calendarPeriod = CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                    break;
                case 1:
                    calendarPeriod = CalendarPeriod.DAY;
                    break;
                case 2:
                    calendarPeriod = CalendarPeriod.WEEK;
                    break;
                case 3:
                    calendarPeriod = CalendarPeriod.FORTNIGHT;
                    break;
                case 4:
                    calendarPeriod = CalendarPeriod.MONTH;
                    break;
                case 5:
                    calendarPeriod = CalendarPeriod.QUARTER;
                    break;
                case 6:
                    calendarPeriod = CalendarPeriod.HALF;
                    break;
                case 7:
                    calendarPeriod = CalendarPeriod.YEAR;
                    break;
                default:
                    calendarPeriod = null;
                    break;
            }
            return calendarPeriod != null;
        }
    }

    CalendarPeriod(int i) {
        this.d = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

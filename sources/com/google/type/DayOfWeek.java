package com.google.type;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum DayOfWeek implements Internal.EnumLite {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.type.DayOfWeek$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<DayOfWeek> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            switch (i) {
                case 0:
                    return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                case 1:
                    return DayOfWeek.MONDAY;
                case 2:
                    return DayOfWeek.TUESDAY;
                case 3:
                    return DayOfWeek.WEDNESDAY;
                case 4:
                    return DayOfWeek.THURSDAY;
                case 5:
                    return DayOfWeek.FRIDAY;
                case 6:
                    return DayOfWeek.SATURDAY;
                case 7:
                    return DayOfWeek.SUNDAY;
                default:
                    return null;
            }
        }
    }

    public static final class DayOfWeekVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            DayOfWeek dayOfWeek;
            switch (i) {
                case 0:
                    dayOfWeek = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                    break;
                case 1:
                    dayOfWeek = DayOfWeek.MONDAY;
                    break;
                case 2:
                    dayOfWeek = DayOfWeek.TUESDAY;
                    break;
                case 3:
                    dayOfWeek = DayOfWeek.WEDNESDAY;
                    break;
                case 4:
                    dayOfWeek = DayOfWeek.THURSDAY;
                    break;
                case 5:
                    dayOfWeek = DayOfWeek.FRIDAY;
                    break;
                case 6:
                    dayOfWeek = DayOfWeek.SATURDAY;
                    break;
                case 7:
                    dayOfWeek = DayOfWeek.SUNDAY;
                    break;
                default:
                    dayOfWeek = null;
                    break;
            }
            return dayOfWeek != null;
        }
    }

    DayOfWeek(int i) {
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

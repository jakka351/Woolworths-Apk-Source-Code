package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DateTime extends GeneratedMessageLite<DateTime, Builder> implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    /* renamed from: com.google.type.DateTime$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16117a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16117a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16117a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16117a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16117a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16117a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16117a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16117a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DateTime, Builder> implements DateTimeOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimeOffsetCase {
        public static final /* synthetic */ TimeOffsetCase[] d = {new TimeOffsetCase("UTC_OFFSET", 0), new TimeOffsetCase("TIME_ZONE", 1), new TimeOffsetCase("TIMEOFFSET_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TimeOffsetCase EF5;

        public static TimeOffsetCase valueOf(String str) {
            return (TimeOffsetCase) Enum.valueOf(TimeOffsetCase.class, str);
        }

        public static TimeOffsetCase[] values() {
            return (TimeOffsetCase[]) d.clone();
        }
    }

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.J(DateTime.class, dateTime);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 3:
                return new DateTime();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DateTime> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DateTime.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

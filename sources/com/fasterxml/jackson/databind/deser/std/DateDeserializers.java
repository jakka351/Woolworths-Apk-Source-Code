package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class DateDeserializers {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f14257a;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.DateDeserializers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14258a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f14258a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14258a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14258a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer i = new DateDeserializer(Date.class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return new Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        public final DateBasedDeserializer o0(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }
    }

    public static class SqlDateDeserializer extends DateBasedDeserializer<java.sql.Date> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date dateQ = Q(jsonParser, deserializationContext);
            if (dateQ == null) {
                return null;
            }
            return new java.sql.Date(dateQ.getTime());
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return new java.sql.Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        public final DateBasedDeserializer o0(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }
    }

    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date dateQ = Q(jsonParser, deserializationContext);
            if (dateQ == null) {
                return null;
            }
            return new Timestamp(dateQ.getTime());
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return new Timestamp(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        public final DateBasedDeserializer o0(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f14257a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    @JacksonStdImpl
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        public final Constructor i;

        public CalendarDeserializer() {
            super(Calendar.class);
            this.i = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws ValueInstantiationException {
            Date dateQ = Q(jsonParser, deserializationContext);
            if (dateQ == null) {
                return null;
            }
            Constructor constructor = this.i;
            if (constructor == null) {
                Calendar calendar = Calendar.getInstance(deserializationContext.f.k());
                calendar.setTime(dateQ);
                return calendar;
            }
            try {
                Calendar calendar2 = (Calendar) constructor.newInstance(null);
                calendar2.setTimeInMillis(dateQ.getTime());
                TimeZone timeZoneK = deserializationContext.f.k();
                if (timeZoneK == null) {
                    return calendar2;
                }
                calendar2.setTimeZone(timeZoneK);
                return calendar2;
            } catch (Exception e) {
                deserializationContext.y(e, this.d);
                throw null;
            }
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        public final DateBasedDeserializer o0(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(int i) {
            super(GregorianCalendar.class);
            this.i = ClassUtil.k(GregorianCalendar.class, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this.i = calendarDeserializer.i;
        }
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements ContextualDeserializer {
        public final DateFormat g;
        public final String h;

        public DateBasedDeserializer(Class cls) {
            super(cls);
            this.g = null;
            this.h = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        public final Date Q(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date date;
            if (this.g == null || !jsonParser.a1(JsonToken.VALUE_STRING)) {
                return super.Q(jsonParser, deserializationContext);
            }
            String strTrim = jsonParser.k0().trim();
            if (strTrim.isEmpty()) {
                if (u(deserializationContext, strTrim).ordinal() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            synchronized (this.g) {
                try {
                    try {
                        date = this.g.parse(strTrim);
                    } catch (ParseException unused) {
                        deserializationContext.J(this.d, strTrim, "expected format \"%s\"", this.h);
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return date;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.text.DateFormat] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.text.DateFormat] */
        /* JADX WARN: Type inference failed for: r4v7, types: [com.fasterxml.jackson.databind.util.StdDateFormat] */
        /* JADX WARN: Type inference failed for: r4v8 */
        @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
        public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            DateFormat dateFormat;
            ?? stdDateFormat;
            Boolean bool;
            JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, this.d);
            DeserializationConfig deserializationConfig = deserializationContext.f;
            if (valueH0 != null) {
                String str = valueH0.d;
                Locale locale = valueH0.f;
                TimeZone timeZoneC = valueH0.c();
                Boolean bool2 = valueH0.h;
                if (str != null && str.length() > 0) {
                    if (locale == null) {
                        locale = deserializationConfig.e.i;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                    if (timeZoneC == null) {
                        timeZoneC = deserializationConfig.k();
                    }
                    simpleDateFormat.setTimeZone(timeZoneC);
                    if (bool2 != null) {
                        simpleDateFormat.setLenient(bool2.booleanValue());
                    }
                    return o0(simpleDateFormat, str);
                }
                String strO = this.h;
                if (timeZoneC != null) {
                    DateFormat dateFormat2 = deserializationConfig.e.h;
                    if (dateFormat2.getClass() == StdDateFormat.class) {
                        if (locale == null) {
                            locale = deserializationConfig.e.i;
                        }
                        StdDateFormat stdDateFormat2 = (StdDateFormat) dateFormat2;
                        TimeZone timeZone = stdDateFormat2.d;
                        StdDateFormat stdDateFormat3 = stdDateFormat2;
                        if (timeZoneC != timeZone) {
                            stdDateFormat3 = stdDateFormat2;
                            if (!timeZoneC.equals(timeZone)) {
                                stdDateFormat3 = new StdDateFormat(timeZoneC, stdDateFormat2.e, stdDateFormat2.f, stdDateFormat2.i);
                            }
                        }
                        boolean zEquals = locale.equals(stdDateFormat3.e);
                        stdDateFormat = stdDateFormat3;
                        if (!zEquals) {
                            stdDateFormat = new StdDateFormat(stdDateFormat3.d, locale, stdDateFormat3.f, stdDateFormat3.i);
                        }
                        if (bool2 != null && bool2 != (bool = stdDateFormat.f) && !bool2.equals(bool)) {
                            stdDateFormat = new StdDateFormat(stdDateFormat.d, stdDateFormat.e, bool2, stdDateFormat.i);
                        }
                    } else {
                        stdDateFormat = (DateFormat) dateFormat2.clone();
                        stdDateFormat.setTimeZone(timeZoneC);
                        if (bool2 != null) {
                            stdDateFormat.setLenient(bool2.booleanValue());
                        }
                    }
                    return o0(stdDateFormat, strO);
                }
                if (bool2 != null) {
                    DateFormat dateFormat3 = deserializationConfig.e.h;
                    if (dateFormat3.getClass() == StdDateFormat.class) {
                        StdDateFormat stdDateFormat4 = (StdDateFormat) dateFormat3;
                        Boolean bool3 = stdDateFormat4.f;
                        StdDateFormat stdDateFormat5 = stdDateFormat4;
                        if (bool2 != bool3) {
                            stdDateFormat5 = stdDateFormat4;
                            if (!bool2.equals(bool3)) {
                                stdDateFormat5 = new StdDateFormat(stdDateFormat4.d, stdDateFormat4.e, bool2, stdDateFormat4.i);
                            }
                        }
                        strO = YU.a.o(androidx.constraintlayout.core.state.a.o(100, "[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' ("), Boolean.FALSE.equals(stdDateFormat5.f) ? "strict" : "lenient", ")]");
                        dateFormat = stdDateFormat5;
                    } else {
                        DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
                        dateFormat4.setLenient(bool2.booleanValue());
                        boolean z = dateFormat4 instanceof SimpleDateFormat;
                        dateFormat = dateFormat4;
                        if (z) {
                            ((SimpleDateFormat) dateFormat4).toPattern();
                            dateFormat = dateFormat4;
                        }
                    }
                    if (strO == null) {
                        strO = "[unknown]";
                    }
                    return o0(dateFormat, strO);
                }
            }
            return this;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return Q(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.o;
        }

        public abstract DateBasedDeserializer o0(DateFormat dateFormat, String str);

        public DateBasedDeserializer(DateBasedDeserializer dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer.d);
            this.g = dateFormat;
            this.h = str;
        }
    }
}

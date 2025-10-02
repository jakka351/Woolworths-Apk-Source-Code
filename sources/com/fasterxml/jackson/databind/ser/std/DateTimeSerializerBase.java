package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    public final Boolean f;
    public final DateFormat g;
    public final AtomicReference h;

    public DateTimeSerializerBase(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f = bool;
        this.g = dateFormat;
        this.h = dateFormat == null ? null : new AtomicReference();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Class cls = this.d;
        JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls);
        SerializationConfig serializationConfig = serializerProvider.d;
        if (valueK != null) {
            String str = valueK.d;
            Locale locale = valueK.f;
            JsonFormat.Shape shape = valueK.e;
            if (shape.a()) {
                return q(Boolean.TRUE, null);
            }
            if (str != null && str.length() > 0) {
                if (locale == null) {
                    locale = serializationConfig.e.i;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(valueK.d() ? valueK.c() : serializationConfig.k());
                return q(Boolean.FALSE, simpleDateFormat);
            }
            boolean z = locale != null;
            boolean zD = valueK.d();
            boolean z2 = shape == JsonFormat.Shape.l;
            if (z || zD || z2) {
                DateFormat dateFormat = serializationConfig.e.h;
                if (dateFormat instanceof StdDateFormat) {
                    StdDateFormat stdDateFormat = (StdDateFormat) dateFormat;
                    if (locale != null && !locale.equals(stdDateFormat.e)) {
                        stdDateFormat = new StdDateFormat(stdDateFormat.d, locale, stdDateFormat.f, stdDateFormat.i);
                    }
                    if (valueK.d()) {
                        TimeZone timeZoneC = valueK.c();
                        if (timeZoneC == null) {
                            timeZoneC = StdDateFormat.m;
                        }
                        TimeZone timeZone = stdDateFormat.d;
                        if (timeZoneC != timeZone && !timeZoneC.equals(timeZone)) {
                            stdDateFormat = new StdDateFormat(timeZoneC, stdDateFormat.e, stdDateFormat.f, stdDateFormat.i);
                        }
                    }
                    return q(Boolean.FALSE, stdDateFormat);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    serializerProvider.i(cls, "Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
                    throw null;
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                SimpleDateFormat simpleDateFormat3 = z ? new SimpleDateFormat(simpleDateFormat2.toPattern(), locale) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZoneC2 = valueK.c();
                if (timeZoneC2 != null && !timeZoneC2.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZoneC2);
                }
                return q(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return false;
    }

    public final boolean o(SerializerProvider serializerProvider) {
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.g != null) {
            return false;
        }
        if (serializerProvider == null) {
            throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(this.d.getName()));
        }
        return serializerProvider.d.r(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public final void p(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        DateFormat dateFormat = this.g;
        if (dateFormat == null) {
            serializerProvider.getClass();
            if (serializerProvider.d.r(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
                jsonGenerator.i0(date.getTime());
                return;
            } else {
                jsonGenerator.J1(serializerProvider.m().format(date));
                return;
            }
        }
        AtomicReference atomicReference = this.h;
        DateFormat dateFormat2 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) dateFormat.clone();
        }
        jsonGenerator.J1(dateFormat2.format(date));
        while (!atomicReference.compareAndSet(null, dateFormat2) && atomicReference.get() == null) {
        }
    }

    public abstract DateTimeSerializerBase q(Boolean bool, DateFormat dateFormat);
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.annotation.Annotation;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class StdKeySerializers {

    /* renamed from: a, reason: collision with root package name */
    public static final StringKeySerializer f14323a = new StringKeySerializer(String.class, 0);

    public static class Default extends StdSerializer<Object> {
        public final int f;

        public Default(Class cls, int i) {
            super(cls, 0);
            this.f = i;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            String strValueOf;
            switch (this.f) {
                case 1:
                    Date date = (Date) obj;
                    serializerProvider.getClass();
                    if (!serializerProvider.d.r(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.U(serializerProvider.m().format(date));
                        break;
                    } else {
                        jsonGenerator.U(String.valueOf(date.getTime()));
                        break;
                    }
                case 2:
                    long timeInMillis = ((Calendar) obj).getTimeInMillis();
                    serializerProvider.getClass();
                    if (!serializerProvider.d.r(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.U(serializerProvider.m().format(new Date(timeInMillis)));
                        break;
                    } else {
                        jsonGenerator.U(String.valueOf(timeInMillis));
                        break;
                    }
                case 3:
                    jsonGenerator.U(((Class) obj).getName());
                    break;
                case 4:
                    if (serializerProvider.d.r(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r4 = (Enum) obj;
                        strValueOf = serializerProvider.d.r(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r4.ordinal()) : r4.name();
                    }
                    jsonGenerator.U(strValueOf);
                    break;
                case 5:
                case 6:
                    jsonGenerator.R(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.U(serializerProvider.d.e.j.e((byte[]) obj));
                    break;
                default:
                    jsonGenerator.U(obj.toString());
                    break;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        public transient PropertySerializerMap f;

        public Dynamic() {
            super(String.class, 0);
            this.f = PropertySerializerMap.a();
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Class<?> cls = obj.getClass();
            PropertySerializerMap propertySerializerMap = this.f;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            if (jsonSerializerD == null) {
                if (cls == Object.class) {
                    jsonSerializerD = new Default(cls, 8);
                    this.f = propertySerializerMap.c(cls, jsonSerializerD);
                } else {
                    jsonSerializerD = serializerProvider.r(serializerProvider.d.c(cls), null);
                    PropertySerializerMap propertySerializerMapC = propertySerializerMap.c(cls, jsonSerializerD);
                    if (propertySerializerMap != propertySerializerMapC) {
                        this.f = propertySerializerMapC;
                    }
                }
            }
            jsonSerializerD.f(obj, jsonGenerator, serializerProvider);
        }

        public Object readResolve() {
            this.f = PropertySerializerMap.a();
            return this;
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        public final EnumValues f;

        public EnumKeySerializer(Class cls, EnumValues enumValues) {
            super(cls, 0);
            this.f = enumValues;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (serializerProvider.d.r(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.U(obj.toString());
                return;
            }
            Enum r3 = (Enum) obj;
            if (serializerProvider.d.r(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.U(String.valueOf(r3.ordinal()));
            } else {
                jsonGenerator.T(this.f.e[r3.ordinal()]);
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.U((String) obj);
        }
    }

    public static StdSerializer a(SerializationConfig serializationConfig, Class cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            Annotation[] annotationArr = ClassUtil.f14330a;
            if (Enum.class.isAssignableFrom(cls)) {
                return new EnumKeySerializer(cls, EnumValues.a(serializationConfig, cls));
            }
        }
        return new Default(cls, 8);
    }

    public static StdSerializer b(Class cls) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return f14323a;
        }
        if (cls.isPrimitive()) {
            cls = ClassUtil.I(cls);
        }
        if (cls == Integer.class) {
            return new Default(cls, 5);
        }
        if (cls == Long.class) {
            return new Default(cls, 6);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(cls, 8);
        }
        if (cls == Class.class) {
            return new Default(cls, 3);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(cls, 1);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(cls, 2);
        }
        if (cls == UUID.class) {
            return new Default(cls, 8);
        }
        if (cls == byte[].class) {
            return new Default(cls, 7);
        }
        return null;
    }
}

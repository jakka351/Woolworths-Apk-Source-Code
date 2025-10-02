package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public class StdKeyDeserializers implements KeyDeserializers, Serializable {
    public static StdKeyDeserializer b(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) throws SecurityException {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor constructor = ((AnnotatedConstructor) annotatedMember).g;
            deserializationConfig.getClass();
            if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                ClassUtil.e(constructor, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(constructor);
        }
        Method method = ((AnnotatedMethod) annotatedMember).g;
        deserializationConfig.getClass();
        if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            ClassUtil.e(method, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(method);
    }

    public static KeyDeserializer c(JavaType javaType, JsonDeserializer jsonDeserializer) {
        return new StdKeyDeserializer.DelegatingKD(javaType.d, jsonDeserializer);
    }

    public static KeyDeserializer d(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static KeyDeserializer e(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public final KeyDeserializer a(JavaType javaType) {
        int i;
        Class clsI = javaType.d;
        if (clsI.isPrimitive()) {
            clsI = ClassUtil.I(clsI);
        }
        if (clsI == String.class || clsI == Object.class || clsI == CharSequence.class || clsI == Serializable.class) {
            return clsI == String.class ? StdKeyDeserializer.StringKD.g : clsI == Object.class ? StdKeyDeserializer.StringKD.h : new StdKeyDeserializer.StringKD(clsI);
        }
        if (clsI == UUID.class) {
            i = 12;
        } else if (clsI == Integer.class) {
            i = 5;
        } else if (clsI == Long.class) {
            i = 6;
        } else if (clsI == Date.class) {
            i = 10;
        } else if (clsI == Calendar.class) {
            i = 11;
        } else if (clsI == Boolean.class) {
            i = 1;
        } else if (clsI == Byte.class) {
            i = 2;
        } else if (clsI == Character.class) {
            i = 4;
        } else if (clsI == Short.class) {
            i = 3;
        } else if (clsI == Float.class) {
            i = 7;
        } else if (clsI == Double.class) {
            i = 8;
        } else if (clsI == URI.class) {
            i = 13;
        } else if (clsI == URL.class) {
            i = 14;
        } else if (clsI == Class.class) {
            i = 15;
        } else {
            if (clsI == Locale.class) {
                return new StdKeyDeserializer(9, clsI, FromStringDeserializer.t0(Locale.class));
            }
            if (clsI == Currency.class) {
                return new StdKeyDeserializer(16, clsI, FromStringDeserializer.t0(Currency.class));
            }
            if (clsI != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, clsI, null);
    }
}

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public abstract class TypeDeserializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14291a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14291a = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14291a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14291a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14291a[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14291a[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object a(JsonParser jsonParser, JavaType javaType) {
        Class cls = javaType.d;
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == null) {
            return null;
        }
        switch (jsonTokenE.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return jsonParser.k0();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(jsonParser.H());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.A());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Object b(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object c(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object d(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object e(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract TypeDeserializer f(BeanProperty beanProperty);

    public abstract Class g();

    public abstract String h();

    public abstract TypeIdResolver i();

    public abstract JsonTypeInfo.As j();

    public boolean k() {
        return g() != null;
    }
}

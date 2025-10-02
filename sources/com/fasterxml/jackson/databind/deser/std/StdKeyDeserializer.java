package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    public final int d;
    public final Class e;
    public final FromStringDeserializer f;

    public static final class DelegatingKD extends KeyDeserializer implements Serializable {
        public final Class d;
        public final JsonDeserializer e;

        public DelegatingKD(Class cls, JsonDeserializer jsonDeserializer) {
            this.d = cls;
            this.e = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object a(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
            Class cls = this.d;
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBufferK = deserializationContext.k(deserializationContext.i);
            tokenBufferK.J1(str);
            try {
                TokenBuffer.Parser parserM2 = tokenBufferK.m2(tokenBufferK.e);
                parserM2.N1();
                Object objE = this.e.e(parserM2, deserializationContext);
                if (objE != null) {
                    return objE;
                }
                deserializationContext.H(cls, str, "not a valid representation", new Object[0]);
                throw null;
            } catch (Exception e) {
                deserializationContext.H(cls, str, "not a valid representation: %s", e.getMessage());
                throw null;
            }
        }
    }

    @JacksonStdImpl
    public static final class EnumKD extends StdKeyDeserializer {
        public final EnumResolver g;
        public final AnnotatedMethod h;
        public EnumResolver i;
        public final Enum j;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.d, null);
            this.g = enumResolver;
            this.h = annotatedMethod;
            this.j = enumResolver.g;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object b(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
            EnumResolver enumResolverC;
            AnnotatedMethod annotatedMethod = this.h;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.q(str);
                } catch (Exception e) {
                    Throwable thS = ClassUtil.s(e);
                    String message = thS.getMessage();
                    ClassUtil.G(thS);
                    ClassUtil.E(thS);
                    throw new IllegalArgumentException(message, thS);
                }
            }
            if (deserializationContext.N(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                enumResolverC = this.i;
                if (enumResolverC == null) {
                    synchronized (this) {
                        enumResolverC = EnumResolver.c(deserializationContext.f, this.g.d);
                        this.i = enumResolverC;
                    }
                }
            } else {
                enumResolverC = this.g;
            }
            HashMap map = enumResolverC.f;
            Enum r2 = (Enum) map.get(str);
            if (r2 == null && enumResolverC.h) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r2 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (str.equalsIgnoreCase((String) entry.getKey())) {
                        r2 = (Enum) entry.getValue();
                        break;
                    }
                }
            }
            if (r2 == null) {
                if (this.j != null && deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    return this.j;
                }
                if (!deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    deserializationContext.H(this.e, str, "not one of the values accepted for Enum class: %s", enumResolverC.f.keySet());
                    throw null;
                }
            }
            return r2;
        }
    }

    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        public final Constructor g;

        public StringCtorKeyDeserializer(Constructor constructor) {
            super(-1, constructor.getDeclaringClass(), null);
            this.g = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object b(DeserializationContext deserializationContext, String str) {
            return this.g.newInstance(str);
        }
    }

    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        public final Method g;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass(), null);
            this.g = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public final Object b(DeserializationContext deserializationContext, String str) {
            return this.g.invoke(null, str);
        }
    }

    @JacksonStdImpl
    public static final class StringKD extends StdKeyDeserializer {
        public static final StringKD g = new StringKD(String.class);
        public static final StringKD h = new StringKD(Object.class);

        public StringKD(Class cls) {
            super(-1, cls, null);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public final Object a(DeserializationContext deserializationContext, String str) {
            return str;
        }
    }

    public StdKeyDeserializer(int i, Class cls, FromStringDeserializer fromStringDeserializer) {
        this.d = i;
        this.e = cls;
        this.f = fromStringDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object a(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
        Class cls = this.e;
        if (str != null) {
            try {
                Object objB = b(deserializationContext, str);
                if (objB != null) {
                    return objB;
                }
                Annotation[] annotationArr = ClassUtil.f14330a;
                if (!Enum.class.isAssignableFrom(cls) || !deserializationContext.f.r(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    deserializationContext.H(cls, str, "not a valid representation", new Object[0]);
                    throw null;
                }
            } catch (Exception e) {
                deserializationContext.H(cls, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), ClassUtil.i(e));
                throw null;
            }
        }
        return null;
    }

    public Object b(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
        int i = this.d;
        FromStringDeserializer fromStringDeserializer = this.f;
        Class cls = this.e;
        switch (i) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                deserializationContext.H(cls, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int iD = NumberInput.d(str);
                if (iD >= -128 && iD <= 255) {
                    return Byte.valueOf((byte) iD);
                }
                deserializationContext.H(cls, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int iD2 = NumberInput.d(str);
                if (iD2 >= -32768 && iD2 <= 32767) {
                    return Short.valueOf((short) iD2);
                }
                deserializationContext.H(cls, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                deserializationContext.H(cls, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(NumberInput.d(str));
            case 6:
                return Long.valueOf(NumberInput.f(str));
            case 7:
                String str2 = NumberInput.f14199a;
                return Float.valueOf((float) Double.parseDouble(str));
            case 8:
                String str3 = NumberInput.f14199a;
                return Double.valueOf(Double.parseDouble(str));
            case 9:
                try {
                    return fromStringDeserializer.o0(deserializationContext, str);
                } catch (IllegalArgumentException e) {
                    c(deserializationContext, str, e);
                    throw null;
                }
            case 10:
                return deserializationContext.Q(str);
            case 11:
                Date dateQ = deserializationContext.Q(str);
                Calendar calendar = Calendar.getInstance(deserializationContext.f.k());
                calendar.setTime(dateQ);
                return calendar;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    c(deserializationContext, str, e2);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    c(deserializationContext, str, e3);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    c(deserializationContext, str, e4);
                    throw null;
                }
            case 15:
                try {
                    deserializationContext.e().getClass();
                    return TypeFactory.l(str);
                } catch (Exception unused) {
                    deserializationContext.H(cls, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return fromStringDeserializer.o0(deserializationContext, str);
                } catch (IllegalArgumentException e5) {
                    c(deserializationContext, str, e5);
                    throw null;
                }
            case 17:
                try {
                    Base64Variant base64Variant = deserializationContext.f.e.j;
                    base64Variant.getClass();
                    ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(null);
                    base64Variant.b(str, byteArrayBuilder);
                    return byteArrayBuilder.e();
                } catch (IllegalArgumentException e6) {
                    c(deserializationContext, str, e6);
                    throw null;
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + cls);
        }
    }

    public final void c(DeserializationContext deserializationContext, String str, Exception exc) throws InvalidFormatException {
        deserializationContext.H(this.e, str, "problem: %s", ClassUtil.i(exc));
        throw null;
    }
}

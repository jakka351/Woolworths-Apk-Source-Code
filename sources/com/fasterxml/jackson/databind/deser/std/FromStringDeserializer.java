package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {
    public static final /* synthetic */ int g = 0;

    public static class Std extends FromStringDeserializer<Object> {
        public final int h;

        public Std(Class cls, int i) {
            super(cls);
            this.h = i;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            int i = this.h;
            if (i == 3) {
                return URI.create("");
            }
            if (i != 8) {
                return null;
            }
            return Locale.ROOT;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object o0(com.fasterxml.jackson.databind.DeserializationContext r8, java.lang.String r9) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, com.fasterxml.jackson.databind.exc.ValueInstantiationException {
            /*
                Method dump skipped, instructions count: 458
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.o0(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String):java.lang.Object");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object r0(DeserializationContext deserializationContext) {
            return j(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final boolean s0() {
            return this.h != 7;
        }
    }

    public static class StringBufferDeserializer extends FromStringDeserializer<Object> {
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String strT0 = jsonParser.T0();
            return strT0 != null ? new StringBuffer(strT0) : super.e(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return new StringBuffer();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.m;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object o0(DeserializationContext deserializationContext, String str) {
            return new StringBuffer(str);
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String strT0 = jsonParser.T0();
            return strT0 != null ? new StringBuilder(strT0) : super.e(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return new StringBuilder();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.m;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object o0(DeserializationContext deserializationContext, String str) {
            return new StringBuilder(str);
        }
    }

    public static FromStringDeserializer t0(Class cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new StringBuilderDeserializer(StringBuilder.class);
                }
                if (cls == StringBuffer.class) {
                    return new StringBufferDeserializer(StringBuffer.class);
                }
                return null;
            }
            i = 12;
        }
        return new Std(cls, i);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        String strT0 = jsonParser.T0();
        Class cls = this.d;
        if (strT0 == null) {
            JsonToken jsonTokenE = jsonParser.e();
            if (jsonTokenE == JsonToken.START_OBJECT) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (jsonTokenE == JsonToken.START_ARRAY) {
                return E(jsonParser, deserializationContext);
            }
            if (jsonTokenE != JsonToken.VALUE_EMBEDDED_OBJECT) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            Object objC = jsonParser.C();
            if (objC == null) {
                return null;
            }
            return cls.isAssignableFrom(objC.getClass()) ? objC : p0(deserializationContext, objC);
        }
        if (strT0.isEmpty()) {
            return q0(deserializationContext);
        }
        if (s0()) {
            String strTrim = strT0.trim();
            if (strTrim != strT0 && strTrim.isEmpty()) {
                return q0(deserializationContext);
            }
            strT0 = strTrim;
        }
        try {
            return o0(deserializationContext, strT0);
        } catch (IllegalArgumentException | MalformedURLException e) {
            String message = e.getMessage();
            InvalidFormatException invalidFormatExceptionB0 = deserializationContext.b0(cls, strT0, message != null ? "not a valid textual representation, problem: ".concat(message) : "not a valid textual representation");
            invalidFormatExceptionB0.initCause(e);
            throw invalidFormatExceptionB0;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType n() {
        return LogicalType.p;
    }

    public abstract Object o0(DeserializationContext deserializationContext, String str);

    public Object p0(DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
        deserializationContext.V(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.d.getName());
        throw null;
    }

    public final Object q0(DeserializationContext deserializationContext) throws MismatchedInputException {
        CoercionAction coercionActionN = deserializationContext.n(n(), this.d, CoercionInputShape.i);
        if (coercionActionN == CoercionAction.d) {
            deserializationContext.V(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", D());
            throw null;
        }
        if (coercionActionN == CoercionAction.f) {
            return null;
        }
        return coercionActionN == CoercionAction.g ? j(deserializationContext) : r0(deserializationContext);
    }

    public Object r0(DeserializationContext deserializationContext) {
        return null;
    }

    public boolean s0() {
        return true;
    }
}

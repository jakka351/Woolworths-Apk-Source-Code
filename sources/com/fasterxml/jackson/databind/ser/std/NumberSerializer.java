package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class NumberSerializer extends StdScalarSerializer<Number> implements ContextualSerializer {
    public static final NumberSerializer f = new NumberSerializer(Number.class);

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            try {
                new int[JsonFormat.Shape.values().length][8] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer f = new BigDecimalAsStringSerializer(BigDecimal.class, 0);

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final boolean d(SerializerProvider serializerProvider, Object obj) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws JsonMappingException {
            String string;
            if (jsonGenerator.h(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int iScale = bigDecimal.scale();
                if (iScale < -9999 || iScale > 9999) {
                    throw new JsonMappingException(serializerProvider.z(), String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), (Throwable) null);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            jsonGenerator.J1(string);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public final String o(Object obj) {
            throw new IllegalStateException();
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Class cls = this.d;
        JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls);
        return (valueK == null || valueK.e.ordinal() != 8) ? this : cls == BigDecimal.class ? BigDecimalAsStringSerializer.f : ToStringSerializer.f;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            jsonGenerator.m0((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.r0((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.i0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.Z(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.b0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.d0(number.intValue());
        } else {
            jsonGenerator.k0(number.toString());
        }
    }
}

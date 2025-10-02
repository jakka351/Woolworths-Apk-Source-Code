package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public class NumberSerializers {

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            try {
                new int[JsonFormat.Shape.values().length][8] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static abstract class Base<T> extends StdScalarSerializer<T> implements ContextualSerializer {
        @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
        public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
            Class cls = this.d;
            JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls);
            return (valueK == null || valueK.e.ordinal() != 8) ? this : cls == BigDecimal.class ? NumberSerializer.BigDecimalAsStringSerializer.f : ToStringSerializer.f;
        }
    }

    @JacksonStdImpl
    public static class DoubleSerializer extends Base<Object> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.Z(((Double) obj).doubleValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            Double d = (Double) obj;
            double dDoubleValue = d.doubleValue();
            String str = NumberOutput.f14200a;
            if (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue)) {
                jsonGenerator.Z(d.doubleValue());
                return;
            }
            WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_NUMBER_FLOAT, obj));
            jsonGenerator.Z(d.doubleValue());
            typeSerializer.f(jsonGenerator, writableTypeIdE);
        }
    }

    @JacksonStdImpl
    public static class FloatSerializer extends Base<Object> {
        public static final FloatSerializer f = new FloatSerializer(Float.class);

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.b0(((Float) obj).floatValue());
        }
    }

    @JacksonStdImpl
    public static class IntLikeSerializer extends Base<Object> {
        public static final IntLikeSerializer f = new IntLikeSerializer(Number.class);

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.d0(((Number) obj).intValue());
        }
    }

    @JacksonStdImpl
    public static class IntegerSerializer extends Base<Object> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.d0(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            f(obj, jsonGenerator, serializerProvider);
        }
    }

    @JacksonStdImpl
    public static class LongSerializer extends Base<Object> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.i0(((Long) obj).longValue());
        }
    }

    @JacksonStdImpl
    public static class ShortSerializer extends Base<Object> {
        public static final ShortSerializer f = new ShortSerializer(Short.class);

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.t0(((Short) obj).shortValue());
        }
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

@JacksonStdImpl
/* loaded from: classes4.dex */
public final class BooleanSerializer extends StdScalarSerializer<Object> implements ContextualSerializer {
    public final boolean f;

    public static final class AsNumber extends StdScalarSerializer<Object> implements ContextualSerializer {
        public final boolean f;

        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class);
            this.f = z;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
        public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
            JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, Boolean.class);
            return (valueK == null || valueK.e.a()) ? this : new BooleanSerializer(this.f);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.d0(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            jsonGenerator.A(Boolean.TRUE.equals(obj));
        }
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class);
        this.f = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Class cls = this.d;
        JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls);
        if (valueK != null) {
            JsonFormat.Shape shape = valueK.e;
            if (shape.a()) {
                return new AsNumber(this.f);
            }
            if (shape == JsonFormat.Shape.l) {
                return new ToStringSerializer(cls, 0);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.A(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.A(Boolean.TRUE.equals(obj));
    }
}

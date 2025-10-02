package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

/* loaded from: classes4.dex */
public final class TypeWrappedSerializer extends JsonSerializer<Object> implements ContextualSerializer {
    public final TypeSerializer d;
    public final JsonSerializer e;

    public TypeWrappedSerializer(TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        this.d = typeSerializer;
        this.e = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializer = this.e;
        JsonSerializer jsonSerializerD = jsonSerializer instanceof ContextualSerializer ? serializerProvider.D(jsonSerializer, beanProperty) : jsonSerializer;
        return jsonSerializerD == jsonSerializer ? this : new TypeWrappedSerializer(this.d, jsonSerializerD);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final Class c() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this.e.g(obj, jsonGenerator, serializerProvider, this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this.e.g(obj, jsonGenerator, serializerProvider, typeSerializer);
    }
}

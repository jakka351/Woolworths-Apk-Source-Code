package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

/* loaded from: classes4.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware {
    public final Converter f;
    public final JavaType g;
    public final JsonSerializer h;

    public StdDelegatingSerializer(Converter converter, JavaType javaType, JsonSerializer jsonSerializer) {
        super(javaType);
        this.f = converter;
        this.g = javaType;
        this.h = jsonSerializer;
    }

    public static JsonSerializer o(SerializerProvider serializerProvider, Object obj) {
        Class<?> cls = obj.getClass();
        SerializerCache serializerCache = serializerProvider.f;
        JsonSerializer jsonSerializerC = serializerProvider.k.c(cls);
        if (jsonSerializerC != null || (jsonSerializerC = serializerCache.b(cls)) != null) {
            return jsonSerializerC;
        }
        JsonSerializer jsonSerializerA = serializerCache.a(serializerProvider.d.c(cls));
        return (jsonSerializerA == null && (jsonSerializerA = serializerProvider.l(cls)) == null) ? serializerProvider.B(cls) : jsonSerializerA;
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public final void a(SerializerProvider serializerProvider) {
        JsonFormatVisitable jsonFormatVisitable = this.h;
        if (jsonFormatVisitable == null || !(jsonFormatVisitable instanceof ResolvableSerializer)) {
            return;
        }
        ((ResolvableSerializer) jsonFormatVisitable).a(serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerD;
        JavaType javaTypeC;
        Converter converter = this.f;
        JsonSerializer jsonSerializer = this.h;
        JavaType javaType = this.g;
        if (jsonSerializer == null) {
            javaTypeC = javaType == null ? converter.c(serializerProvider.e()) : javaType;
            if (javaTypeC.D()) {
                jsonSerializerD = jsonSerializer;
            } else {
                jsonSerializerD = serializerProvider.k.b(javaTypeC);
                if (jsonSerializerD == null && (jsonSerializerD = serializerProvider.f.a(javaTypeC)) == null && (jsonSerializerD = serializerProvider.k(javaTypeC)) == null) {
                    jsonSerializerD = serializerProvider.B(javaTypeC.d);
                }
            }
        } else {
            jsonSerializerD = jsonSerializer;
            javaTypeC = javaType;
        }
        if (jsonSerializerD instanceof ContextualSerializer) {
            jsonSerializerD = serializerProvider.D(jsonSerializerD, beanProperty);
        }
        if (jsonSerializerD == jsonSerializer && javaTypeC == javaType) {
            return this;
        }
        ClassUtil.H(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(converter, javaTypeC, jsonSerializerD);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        Object objA = this.f.a(obj);
        if (objA == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this.h;
        return jsonSerializer == null ? obj == null : jsonSerializer.d(serializerProvider, objA);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object objA = this.f.a(obj);
        if (objA == null) {
            serializerProvider.o(jsonGenerator);
            return;
        }
        JsonSerializer jsonSerializerO = this.h;
        if (jsonSerializerO == null) {
            jsonSerializerO = o(serializerProvider, objA);
        }
        jsonSerializerO.f(objA, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Object objA = this.f.a(obj);
        JsonSerializer jsonSerializerO = this.h;
        if (jsonSerializerO == null) {
            jsonSerializerO = o(serializerProvider, obj);
        }
        jsonSerializerO.g(objA, jsonGenerator, serializerProvider, typeSerializer);
    }
}

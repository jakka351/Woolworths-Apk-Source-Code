package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* loaded from: classes4.dex */
public abstract class JsonSerializer<T> implements JsonFormatVisitable {

    public static abstract class None extends JsonSerializer<Object> {
    }

    public Class c() {
        return null;
    }

    public boolean d(SerializerProvider serializerProvider, Object obj) {
        return obj == null;
    }

    public boolean e() {
        return this instanceof UnwrappingBeanSerializer;
    }

    public abstract void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Class<?> clsC = c();
        if (clsC == null) {
            clsC = obj.getClass();
        }
        serializerProvider.i(clsC, a.j("Type id handling not implemented for type ", clsC.getName(), " (by serializer of type ", getClass().getName(), ")"));
        throw null;
    }

    public JsonSerializer h(NameTransformer nameTransformer) {
        return this;
    }

    public boolean i() {
        return false;
    }
}

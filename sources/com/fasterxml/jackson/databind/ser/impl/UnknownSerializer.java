package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.util.NativeImageUtil;

/* loaded from: classes4.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.d.r(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            o(serializerProvider, obj);
            throw null;
        }
        super.f(obj, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (serializerProvider.d.r(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            o(serializerProvider, obj);
            throw null;
        }
        super.g(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public final void o(SerializerProvider serializerProvider, Object obj) {
        Class<?> cls = obj.getClass();
        boolean zA = NativeImageUtil.a(cls);
        Class cls2 = this.d;
        if (zA) {
            serializerProvider.i(cls2, "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized");
            throw null;
        }
        serializerProvider.i(cls2, "No serializer found for class " + cls.getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
        throw null;
    }
}

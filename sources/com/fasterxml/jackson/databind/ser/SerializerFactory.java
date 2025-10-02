package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public abstract class SerializerFactory {
    public abstract JsonSerializer a(SerializationConfig serializationConfig, JavaType javaType);

    public JsonSerializer b(SerializerProvider serializerProvider, JavaType javaType) {
        return a(serializerProvider.d, javaType);
    }

    public abstract JsonSerializer c(SerializerProvider serializerProvider, JavaType javaType);

    public abstract TypeSerializer d(SerializationConfig serializationConfig, JavaType javaType);

    public abstract SerializerFactory e(Serializers serializers);
}

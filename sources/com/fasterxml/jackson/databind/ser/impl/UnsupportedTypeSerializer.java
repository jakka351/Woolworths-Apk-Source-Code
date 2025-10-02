package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes4.dex */
public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    public final String f;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this.f = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws InvalidDefinitionException {
        serializerProvider.j(this.f);
        throw null;
    }
}

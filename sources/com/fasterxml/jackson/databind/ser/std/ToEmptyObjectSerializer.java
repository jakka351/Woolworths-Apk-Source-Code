package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class ToEmptyObjectSerializer extends StdSerializer<Object> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.y1(obj);
        jsonGenerator.H();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.f(jsonGenerator, typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_OBJECT, obj)));
    }
}

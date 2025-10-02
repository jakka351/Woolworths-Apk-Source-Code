package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class RawSerializer<T> extends StdSerializer<T> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.V0(obj.toString());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_EMBEDDED_OBJECT, obj));
        f(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}

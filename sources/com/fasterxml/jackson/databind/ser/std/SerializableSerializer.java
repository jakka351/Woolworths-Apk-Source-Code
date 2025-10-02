package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class SerializableSerializer extends StdSerializer<JsonSerializable> {
    public static final SerializableSerializer f = new SerializableSerializer(JsonSerializable.class);

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        JsonSerializable jsonSerializable = (JsonSerializable) obj;
        if (jsonSerializable instanceof JsonSerializable.Base) {
            return ((JsonSerializable.Base) jsonSerializable).isEmpty();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        ((JsonSerializable) obj).h(jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        ((JsonSerializable) obj).g(jsonGenerator, serializerProvider, typeSerializer);
    }
}

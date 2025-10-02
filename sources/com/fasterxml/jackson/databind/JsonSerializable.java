package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public interface JsonSerializable {

    public static abstract class Base implements JsonSerializable {
        @Override // com.fasterxml.jackson.databind.JsonSerializable
        public void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            h(jsonGenerator, serializerProvider);
        }

        public boolean isEmpty() {
            return false;
        }
    }

    void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer);

    void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider);
}

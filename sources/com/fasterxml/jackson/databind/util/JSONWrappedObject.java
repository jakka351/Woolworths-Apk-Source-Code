package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class JSONWrappedObject implements JsonSerializable {
    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void g(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        serializerProvider.o(jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.o(jsonGenerator);
    }
}

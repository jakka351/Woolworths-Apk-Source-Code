package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes4.dex */
public class FailingSerializer extends StdSerializer<Object> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws JsonMappingException {
        throw new JsonMappingException(serializerProvider.z(), "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)", (Throwable) null);
    }
}

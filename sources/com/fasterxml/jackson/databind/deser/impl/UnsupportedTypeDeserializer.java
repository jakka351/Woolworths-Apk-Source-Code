package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* loaded from: classes4.dex */
public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    public final JavaType g;
    public final String h;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this.g = javaType;
        this.h = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws InvalidDefinitionException {
        Object objC;
        if (jsonParser.e() == JsonToken.VALUE_EMBEDDED_OBJECT && ((objC = jsonParser.C()) == null || this.g.d.isAssignableFrom(objC.getClass()))) {
            return objC;
        }
        deserializationContext.j(this.h);
        throw null;
    }
}

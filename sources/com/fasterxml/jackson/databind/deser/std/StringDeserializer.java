package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer g = new StringDeserializer(String.class);

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return jsonParser.a1(JsonToken.VALUE_STRING) ? jsonParser.k0() : jsonParser.a1(JsonToken.START_ARRAY) ? (String) E(jsonParser, deserializationContext) : a0(jsonParser, deserializationContext, this);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return jsonParser.a1(JsonToken.VALUE_STRING) ? jsonParser.k0() : jsonParser.a1(JsonToken.START_ARRAY) ? (String) E(jsonParser, deserializationContext) : a0(jsonParser, deserializationContext, this);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.m;
    }
}

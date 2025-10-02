package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.TokenBuffer;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonToken jsonTokenN1;
        TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
        if (!jsonParser.a1(JsonToken.FIELD_NAME)) {
            tokenBufferK.u2(jsonParser);
            return tokenBufferK;
        }
        tokenBufferK.p1();
        do {
            tokenBufferK.u2(jsonParser);
            jsonTokenN1 = jsonParser.N1();
        } while (jsonTokenN1 == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (jsonTokenN1 == jsonToken) {
            tokenBufferK.H();
            return tokenBufferK;
        }
        throw DeserializationContext.c0(deserializationContext.i, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenN1);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.h;
    }
}

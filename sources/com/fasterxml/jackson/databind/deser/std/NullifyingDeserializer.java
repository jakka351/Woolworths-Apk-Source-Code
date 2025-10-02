package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/* loaded from: classes4.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer g = new NullifyingDeserializer(Object.class);

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.a1(JsonToken.FIELD_NAME)) {
            jsonParser.V1();
            return null;
        }
        while (true) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            if (jsonTokenN1 == null || jsonTokenN1 == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.V1();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        int iF = jsonParser.f();
        if (iF == 1 || iF == 3 || iF == 5) {
            return typeDeserializer.b(jsonParser, deserializationContext);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}

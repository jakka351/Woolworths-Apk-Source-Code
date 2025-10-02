package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (jsonTokenE == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean boolN = N(jsonParser, deserializationContext, AtomicBoolean.class);
        if (boolN == null) {
            return null;
        }
        return new AtomicBoolean(boolN.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return new AtomicBoolean(false);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.k;
    }
}

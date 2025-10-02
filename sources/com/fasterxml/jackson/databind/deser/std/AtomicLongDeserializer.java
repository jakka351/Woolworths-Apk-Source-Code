package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.p1()) {
            return new AtomicLong(jsonParser.R());
        }
        if (X(jsonParser, deserializationContext, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.i;
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.p1()) {
            return new AtomicInteger(jsonParser.H());
        }
        Integer numW = W(jsonParser, deserializationContext, AtomicInteger.class);
        if (numW == null) {
            return null;
        }
        return new AtomicInteger(numW.intValue());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.i;
    }
}

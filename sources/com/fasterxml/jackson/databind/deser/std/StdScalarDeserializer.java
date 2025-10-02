package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;

/* loaded from: classes4.dex */
public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        deserializationContext.x(this);
        return e(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.e(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType n() {
        return LogicalType.p;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}

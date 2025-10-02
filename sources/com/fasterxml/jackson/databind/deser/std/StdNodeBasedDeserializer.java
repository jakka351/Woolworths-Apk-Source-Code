package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/* loaded from: classes4.dex */
public abstract class StdNodeBasedDeserializer<T> extends StdDeserializer<T> implements ResolvableDeserializer {
    public JsonDeserializer g;

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void a(DeserializationContext deserializationContext) {
        this.g = deserializationContext.u(deserializationContext.l(JsonNode.class));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o0();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return o0();
    }

    public abstract Object o0();
}

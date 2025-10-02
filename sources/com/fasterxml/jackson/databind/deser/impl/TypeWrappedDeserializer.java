package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class TypeWrappedDeserializer extends JsonDeserializer<Object> implements Serializable {
    public final TypeDeserializer d;
    public final JsonDeserializer e;

    public TypeWrappedDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        this.d = typeDeserializer;
        this.e = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        return this.e.c(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this.e.g(jsonParser, deserializationContext, this.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this.e.f(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return this.e.j(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class l() {
        return this.e.l();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return this.e.n();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return this.e.o(deserializationConfig);
    }
}

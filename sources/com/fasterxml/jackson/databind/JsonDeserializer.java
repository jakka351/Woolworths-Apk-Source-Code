package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* loaded from: classes4.dex */
public abstract class JsonDeserializer<T> implements NullValueProvider {

    public static abstract class None extends JsonDeserializer<Object> {
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object c(DeserializationContext deserializationContext) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object d(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    public abstract Object e(JsonParser jsonParser, DeserializationContext deserializationContext);

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        deserializationContext.x(this);
        return e(jsonParser, deserializationContext);
    }

    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.b(jsonParser, deserializationContext);
    }

    public SettableBeanProperty h(String str) {
        StringBuilder sbU = a.u("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        sbU.append(getClass().getName());
        sbU.append(" does not support them");
        throw new IllegalArgumentException(sbU.toString());
    }

    public AccessPattern i() {
        return AccessPattern.f;
    }

    public Object j(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    public ObjectIdReader k() {
        return null;
    }

    public Class l() {
        return null;
    }

    public boolean m() {
        return this instanceof AbstractDeserializer;
    }

    public LogicalType n() {
        return null;
    }

    public Boolean o(DeserializationConfig deserializationConfig) {
        return null;
    }

    public JsonDeserializer p(NameTransformer nameTransformer) {
        return this;
    }
}

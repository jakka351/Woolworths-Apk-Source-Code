package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class NullsAsEmptyProvider implements NullValueProvider, Serializable {
    public final JsonDeserializer d;

    public NullsAsEmptyProvider(JsonDeserializer jsonDeserializer) {
        this.d = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        return this.d.j(deserializationContext);
    }
}

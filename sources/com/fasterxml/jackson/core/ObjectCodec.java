package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

/* loaded from: classes4.dex */
public abstract class ObjectCodec extends TreeCodec implements Versioned {
    public abstract Object a(JsonParser jsonParser, TypeReference typeReference);

    public abstract Object b(JsonNode jsonNode);

    public abstract void c(JsonGenerator jsonGenerator, Object obj);
}

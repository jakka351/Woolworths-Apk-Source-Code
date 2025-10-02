package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public class ErrorThrowingDeserializer extends JsonDeserializer<Object> {
    public final NoClassDefFoundError d;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.d = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw this.d;
    }
}

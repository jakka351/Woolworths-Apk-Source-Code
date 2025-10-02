package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;

/* loaded from: classes4.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    public final ReadableObjectId h;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, ReadableObjectId readableObjectId) {
        super(jsonParser, str, jsonLocation);
        this.h = readableObjectId;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String getMessage() {
        return f();
    }
}

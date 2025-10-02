package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* loaded from: classes4.dex */
public class JsonGenerationException extends StreamWriteException {
    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, null, null);
        this.e = jsonGenerator;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException
    /* renamed from: e */
    public final JsonGenerator c() {
        return this.e;
    }
}

package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes4.dex */
public abstract class StreamReadException extends JsonProcessingException {
    public transient JsonParser e;

    public StreamReadException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.l(), null);
        this.e = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonParser c() {
        return this.e;
    }
}

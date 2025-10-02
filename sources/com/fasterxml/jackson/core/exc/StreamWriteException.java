package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes4.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    public transient JsonGenerator e;

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonGenerator c() {
        return this.e;
    }
}

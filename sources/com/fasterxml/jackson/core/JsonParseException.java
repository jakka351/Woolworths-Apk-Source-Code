package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* loaded from: classes4.dex */
public class JsonParseException extends StreamReadException {
    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException
    /* renamed from: e */
    public final JsonParser c() {
        return this.e;
    }
}

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.json.JsonReadContext;

/* loaded from: classes4.dex */
public class TokenBufferReadContext extends JsonStreamContext {
    public final JsonStreamContext c;
    public final JsonLocation d;
    public String e;
    public Object f;

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext) {
        super(jsonStreamContext);
        this.c = jsonStreamContext.c();
        this.e = jsonStreamContext.a();
        this.f = jsonStreamContext.b();
        if (!(jsonStreamContext instanceof JsonReadContext)) {
            this.d = JsonLocation.j;
            return;
        }
        JsonReadContext jsonReadContext = (JsonReadContext) jsonStreamContext;
        this.d = new JsonLocation(ContentReference.h, -1L, -1L, jsonReadContext.h, jsonReadContext.i);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String a() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final Object b() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final JsonStreamContext c() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final void g(Object obj) {
        this.f = obj;
    }

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext, JsonLocation jsonLocation) {
        super(jsonStreamContext);
        this.c = jsonStreamContext.c();
        this.e = jsonStreamContext.a();
        this.f = jsonStreamContext.b();
        this.d = jsonLocation;
    }

    public TokenBufferReadContext() {
        super(0);
        this.c = null;
        this.d = JsonLocation.j;
    }

    public TokenBufferReadContext(TokenBufferReadContext tokenBufferReadContext, int i) {
        super(i);
        this.c = tokenBufferReadContext;
        this.d = tokenBufferReadContext.d;
    }
}

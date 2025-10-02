package com.fasterxml.jackson.core.json;

import YU.a;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;

/* loaded from: classes4.dex */
public final class JsonReadContext extends JsonStreamContext {
    public final JsonReadContext c;
    public final DupDetector d;
    public JsonReadContext e;
    public String f;
    public Object g;
    public int h;
    public int i;

    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i, int i2, int i3) {
        this.c = jsonReadContext;
        this.d = dupDetector;
        this.f14193a = i;
        this.h = i2;
        this.i = i3;
        this.b = -1;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String a() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final Object b() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final JsonStreamContext c() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final void g(Object obj) {
        this.g = obj;
    }

    public final JsonReadContext i(int i, int i2) {
        JsonReadContext jsonReadContext = this.e;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this.d;
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, dupDetector != null ? dupDetector.a() : null, 1, i, i2);
            this.e = jsonReadContext2;
            return jsonReadContext2;
        }
        jsonReadContext.f14193a = 1;
        jsonReadContext.b = -1;
        jsonReadContext.h = i;
        jsonReadContext.i = i2;
        jsonReadContext.f = null;
        jsonReadContext.g = null;
        DupDetector dupDetector2 = jsonReadContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonReadContext;
    }

    public final JsonReadContext j(int i, int i2) {
        JsonReadContext jsonReadContext = this.e;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this.d;
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, dupDetector != null ? dupDetector.a() : null, 2, i, i2);
            this.e = jsonReadContext2;
            return jsonReadContext2;
        }
        jsonReadContext.f14193a = 2;
        jsonReadContext.b = -1;
        jsonReadContext.h = i;
        jsonReadContext.i = i2;
        jsonReadContext.f = null;
        jsonReadContext.g = null;
        DupDetector dupDetector2 = jsonReadContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonReadContext;
    }

    public final boolean k() {
        int i = this.b + 1;
        this.b = i;
        return this.f14193a != 0 && i > 0;
    }

    public final void l(String str) throws JsonParseException {
        this.f = str;
        DupDetector dupDetector = this.d;
        if (dupDetector == null || !dupDetector.b(str)) {
            return;
        }
        Object obj = dupDetector.f14211a;
        throw new JsonParseException(obj instanceof JsonParser ? (JsonParser) obj : null, a.h("Duplicate field '", str, "'"));
    }
}

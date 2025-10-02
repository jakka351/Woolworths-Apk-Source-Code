package com.fasterxml.jackson.core.json;

import YU.a;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;

/* loaded from: classes4.dex */
public class JsonWriteContext extends JsonStreamContext {
    public final JsonWriteContext c;
    public DupDetector d;
    public JsonWriteContext e;
    public String f;
    public Object g;
    public boolean h;

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector) {
        this.f14193a = i;
        this.c = jsonWriteContext;
        this.d = dupDetector;
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

    public final JsonWriteContext i() {
        JsonWriteContext jsonWriteContext = this.e;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this.d;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector != null ? dupDetector.a() : null);
            this.e = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.f14193a = 1;
        jsonWriteContext.b = -1;
        jsonWriteContext.f = null;
        jsonWriteContext.h = false;
        jsonWriteContext.g = null;
        DupDetector dupDetector2 = jsonWriteContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonWriteContext;
    }

    public final JsonWriteContext j(Object obj) {
        JsonWriteContext jsonWriteContext = this.e;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this.d;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector != null ? dupDetector.a() : null, obj);
            this.e = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.f14193a = 1;
        jsonWriteContext.b = -1;
        jsonWriteContext.f = null;
        jsonWriteContext.h = false;
        jsonWriteContext.g = obj;
        DupDetector dupDetector2 = jsonWriteContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonWriteContext;
    }

    public final JsonWriteContext k() {
        JsonWriteContext jsonWriteContext = this.e;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this.d;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector != null ? dupDetector.a() : null);
            this.e = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.f14193a = 2;
        jsonWriteContext.b = -1;
        jsonWriteContext.f = null;
        jsonWriteContext.h = false;
        jsonWriteContext.g = null;
        DupDetector dupDetector2 = jsonWriteContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonWriteContext;
    }

    public final JsonWriteContext l(Object obj) {
        JsonWriteContext jsonWriteContext = this.e;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this.d;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector != null ? dupDetector.a() : null, obj);
            this.e = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.f14193a = 2;
        jsonWriteContext.b = -1;
        jsonWriteContext.f = null;
        jsonWriteContext.h = false;
        jsonWriteContext.g = obj;
        DupDetector dupDetector2 = jsonWriteContext.d;
        if (dupDetector2 != null) {
            dupDetector2.b = null;
            dupDetector2.c = null;
            dupDetector2.d = null;
        }
        return jsonWriteContext;
    }

    public final int m(String str) {
        if (this.f14193a != 2 || this.h) {
            return 4;
        }
        this.h = true;
        this.f = str;
        DupDetector dupDetector = this.d;
        if (dupDetector == null || !dupDetector.b(str)) {
            return this.b < 0 ? 0 : 1;
        }
        Object obj = dupDetector.f14211a;
        throw new JsonGenerationException(a.h("Duplicate field '", str, "'"), obj instanceof JsonGenerator ? (JsonGenerator) obj : null);
    }

    public final int n() {
        int i = this.f14193a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 0) {
                return 1;
            }
        } else {
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 != 0) {
                return 3;
            }
        }
        return 0;
    }

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector, Object obj) {
        this.f14193a = i;
        this.c = jsonWriteContext;
        this.d = dupDetector;
        this.b = -1;
        this.g = obj;
    }
}

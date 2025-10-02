package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonPointer;

/* loaded from: classes4.dex */
public class JsonPointerBasedFilter extends TokenFilter {
    public final JsonPointer b;

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this.b = jsonPointer;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final boolean a() {
        return this.b.d == null;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final TokenFilter b() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final TokenFilter c() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final TokenFilter d(int i) {
        JsonPointer jsonPointer = this.b;
        JsonPointer jsonPointer2 = (i != jsonPointer.h || i < 0) ? null : jsonPointer.d;
        if (jsonPointer2 == null) {
            return null;
        }
        return jsonPointer2.d == null ? TokenFilter.f14194a : new JsonPointerBasedFilter(jsonPointer2);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final TokenFilter e(String str) {
        JsonPointer jsonPointer = this.b;
        JsonPointer jsonPointer2 = jsonPointer.d;
        if (jsonPointer2 == null || !jsonPointer.g.equals(str)) {
            jsonPointer2 = null;
        }
        if (jsonPointer2 == null) {
            return null;
        }
        return jsonPointer2.d == null ? TokenFilter.f14194a : new JsonPointerBasedFilter(jsonPointer2);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public final String toString() {
        return "[JsonPointerFilter at: " + this.b + "]";
    }
}

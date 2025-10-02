package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public class TokenFilterContext extends JsonStreamContext {
    public final TokenFilterContext c;
    public TokenFilterContext d;
    public String e;
    public TokenFilter f;
    public boolean g;
    public boolean h;

    public TokenFilterContext(int i, TokenFilterContext tokenFilterContext, TokenFilter tokenFilter, boolean z) {
        this.f14193a = i;
        this.c = tokenFilterContext;
        this.f = tokenFilter;
        this.b = -1;
        this.g = z;
        this.h = false;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String a() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final Object b() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final JsonStreamContext c() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final void g(Object obj) {
    }

    public final void i(StringBuilder sb) {
        TokenFilterContext tokenFilterContext = this.c;
        if (tokenFilterContext != null) {
            tokenFilterContext.i(sb);
        }
        int i = this.f14193a;
        if (i == 2) {
            sb.append('{');
            if (this.e != null) {
                sb.append('\"');
                sb.append(this.e);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
            return;
        }
        if (i != 1) {
            sb.append(q2.c);
            return;
        }
        sb.append('[');
        int i2 = this.b;
        if (i2 < 0) {
            i2 = 0;
        }
        sb.append(i2);
        sb.append(']');
    }

    public final TokenFilter j(TokenFilter tokenFilter) {
        int i = this.f14193a;
        if (i == 2) {
            return tokenFilter;
        }
        int i2 = this.b + 1;
        this.b = i2;
        if (i == 1) {
            return tokenFilter.d(i2);
        }
        tokenFilter.getClass();
        return tokenFilter;
    }

    public final TokenFilterContext k(TokenFilter tokenFilter, boolean z) {
        TokenFilterContext tokenFilterContext = this.d;
        if (tokenFilterContext == null) {
            TokenFilterContext tokenFilterContext2 = new TokenFilterContext(1, this, tokenFilter, z);
            this.d = tokenFilterContext2;
            return tokenFilterContext2;
        }
        tokenFilterContext.f14193a = 1;
        tokenFilterContext.f = tokenFilter;
        tokenFilterContext.b = -1;
        tokenFilterContext.e = null;
        tokenFilterContext.g = z;
        tokenFilterContext.h = false;
        return tokenFilterContext;
    }

    public final TokenFilterContext l(TokenFilter tokenFilter, boolean z) {
        TokenFilterContext tokenFilterContext = this.d;
        if (tokenFilterContext == null) {
            TokenFilterContext tokenFilterContext2 = new TokenFilterContext(2, this, tokenFilter, z);
            this.d = tokenFilterContext2;
            return tokenFilterContext2;
        }
        tokenFilterContext.f14193a = 2;
        tokenFilterContext.f = tokenFilter;
        tokenFilterContext.b = -1;
        tokenFilterContext.e = null;
        tokenFilterContext.g = z;
        tokenFilterContext.h = false;
        return tokenFilterContext;
    }

    public final JsonToken m() {
        if (!this.g) {
            this.g = true;
            return this.f14193a == 2 ? JsonToken.START_OBJECT : JsonToken.START_ARRAY;
        }
        if (!this.h || this.f14193a != 2) {
            return null;
        }
        this.h = false;
        return JsonToken.FIELD_NAME;
    }

    public final TokenFilter n(String str) {
        this.e = str;
        this.h = true;
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        i(sb);
        return sb.toString();
    }
}

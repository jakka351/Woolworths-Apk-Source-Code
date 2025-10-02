package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class FilteringParserDelegate extends JsonParserDelegate {
    public JsonToken g;
    public TokenFilterContext h;
    public TokenFilterContext i;
    public TokenFilter j;
    public int k;

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final double A() {
        return this.f.A();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final Object C() {
        return this.f.C();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final float F() {
        return this.f.F();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int G0() {
        return this.f.G0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int H() {
        return this.f.H();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int H0() {
        return this.f.H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken N1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.filter.FilteringParserDelegate.N1():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final long O0() {
        return this.f.O0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final long P0() {
        return this.f.P0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) {
        return this.f.P1(base64Variant, byteBufferBackedOutputStream);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final long R() {
        return this.f.R();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType T() {
        return this.f.T();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final String T0() {
        return this.g == JsonToken.FIELD_NAME ? d() : this.f.T0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final Number U() {
        return this.f.U();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final String V0() {
        return this.g == JsonToken.FIELD_NAME ? d() : this.f.V0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonParser V1() throws JsonParseException {
        JsonToken jsonToken = this.g;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i = 1;
            while (true) {
                JsonToken jsonTokenN1 = N1();
                if (jsonTokenN1 == null) {
                    break;
                }
                if (!jsonTokenN1.h) {
                    if (jsonTokenN1.i && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean W0() {
        if (this.g == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.f.W0();
    }

    public final JsonToken W1(TokenFilterContext tokenFilterContext) throws JsonParseException {
        this.i = tokenFilterContext;
        JsonToken jsonTokenM = tokenFilterContext.m();
        if (jsonTokenM != null) {
            return jsonTokenM;
        }
        while (tokenFilterContext != this.h) {
            TokenFilterContext tokenFilterContext2 = this.i;
            TokenFilterContext tokenFilterContext3 = tokenFilterContext2.c;
            if (tokenFilterContext3 == tokenFilterContext) {
                tokenFilterContext = tokenFilterContext2;
            } else {
                while (true) {
                    if (tokenFilterContext3 == null) {
                        tokenFilterContext = null;
                        break;
                    }
                    TokenFilterContext tokenFilterContext4 = tokenFilterContext3.c;
                    if (tokenFilterContext4 == tokenFilterContext) {
                        tokenFilterContext = tokenFilterContext3;
                        break;
                    }
                    tokenFilterContext3 = tokenFilterContext4;
                }
            }
            this.i = tokenFilterContext;
            if (tokenFilterContext == null) {
                throw new JsonParseException(this, "Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenM2 = tokenFilterContext.m();
            if (jsonTokenM2 != null) {
                return jsonTokenM2;
            }
        }
        throw new JsonParseException(this, "Internal error: failed to locate expected buffered tokens");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken Y1(com.fasterxml.jackson.core.filter.TokenFilterContext r7) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.filter.FilteringParserDelegate.Y1(com.fasterxml.jackson.core.filter.TokenFilterContext):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean a1(JsonToken jsonToken) {
        return this.g == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonStreamContext b0() {
        TokenFilterContext tokenFilterContext = this.i;
        return tokenFilterContext != null ? tokenFilterContext : this.h;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean b1() {
        JsonToken jsonToken = this.g;
        return jsonToken != null && jsonToken.g == 5;
    }

    public final boolean b2() {
        int i = this.k;
        if (i != 0) {
            return false;
        }
        this.k = i + 1;
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final void c() {
        if (this.g != null) {
            this.g = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final String d() {
        TokenFilterContext tokenFilterContext = this.i;
        if (tokenFilterContext == null) {
            tokenFilterContext = this.h;
        }
        JsonToken jsonToken = this.g;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return tokenFilterContext.e;
        }
        TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
        if (tokenFilterContext2 == null) {
            return null;
        }
        return tokenFilterContext2.e;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonToken e() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int f() {
        JsonToken jsonToken = this.g;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.g;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final BigInteger g() {
        return this.f.g();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) {
        return this.f.h(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean i() {
        return this.f.i();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final short i0() {
        return this.f.i0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final byte j() {
        return this.f.j();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final String k0() {
        return this.g == JsonToken.FIELD_NAME ? d() : this.f.k0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return this.f.l();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final char[] m0() {
        return this.g == JsonToken.FIELD_NAME ? d().toCharArray() : this.f.m0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final String p() {
        TokenFilterContext tokenFilterContext = this.i;
        if (tokenFilterContext == null) {
            tokenFilterContext = this.h;
        }
        JsonToken jsonToken = this.g;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return tokenFilterContext.e;
        }
        TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
        if (tokenFilterContext2 == null) {
            return null;
        }
        return tokenFilterContext2.e;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonToken r() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int r0() {
        return this.g == JsonToken.FIELD_NAME ? d().length() : this.f.r0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int t0() {
        if (this.g == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.f.t0();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int v() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final BigDecimal x() {
        return this.f.x();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean x1() {
        return this.g == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean y1() {
        return this.g == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        return this.f.z0();
    }
}

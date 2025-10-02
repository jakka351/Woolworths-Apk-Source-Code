package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class NonBlockingJsonParserBase extends ParserBase {
    public static final String[] Y = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object C() {
        if (this.f == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.F;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void G2() {
        this.s = 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) throws IOException {
        byte[] bArrH = h(base64Variant);
        byteBufferBackedOutputStream.write(bArrH);
        return bArrH.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void R2() {
        super.R2();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String T0() {
        JsonToken jsonToken = this.f;
        return jsonToken == JsonToken.VALUE_STRING ? this.B.g() : jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String V0() {
        JsonToken jsonToken = this.f;
        return jsonToken == JsonToken.VALUE_STRING ? this.B.g() : jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final boolean W0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.VALUE_STRING) {
            TextBuffer textBuffer = this.B;
            return textBuffer.c >= 0 || textBuffer.k != null || textBuffer.j == null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.D;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return ParserBase.Q;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            f2(jsonToken, "Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            throw null;
        }
        if (this.F == null) {
            ByteArrayBuilder byteArrayBuilderN2 = N2();
            W1(k0(), byteArrayBuilderN2, base64Variant);
            this.F = byteArrayBuilderN2.e();
        }
        return this.F;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String k0() {
        int i;
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        TextBuffer textBuffer = this.B;
        if (jsonToken == jsonToken2) {
            return textBuffer.g();
        }
        if (jsonToken == null || (i = jsonToken.g) == -1) {
            return null;
        }
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? textBuffer.g() : jsonToken.d : this.z.f;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return new JsonLocation(H2(), this.t + this.r, -1L, Math.max(this.u, 0), (this.r - this.v) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] m0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        if (i != 5) {
            return (i == 6 || i == 7 || i == 8) ? this.B.m() : jsonToken.e;
        }
        if (!this.D) {
            String str = this.z.f;
            int length = str.length();
            char[] cArr = this.C;
            if (cArr == null) {
                this.C = this.p.c(length);
            } else if (cArr.length < length) {
                this.C = new char[length];
            }
            str.getChars(0, length, this.C, 0);
            this.D = true;
        }
        return this.C;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int r0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        int i = jsonToken.g;
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? this.B.q() : jsonToken.e.length : this.z.f.length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int t0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        int i = jsonToken.g;
        if (i == 6 || i == 7 || i == 8) {
            return this.B.n();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        return new JsonLocation(H2(), this.w, -1L, this.x, this.y);
    }
}

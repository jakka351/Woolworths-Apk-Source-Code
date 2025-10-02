package com.fasterxml.jackson.core.json;

import android.support.v4.media.session.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class UTF8DataInputJsonParser extends ParserBase {
    public static final int T = JsonParser.Feature.ALLOW_TRAILING_COMMA.e;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public boolean R;
    public int S;

    static {
        int i = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.e;
        int i2 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.e;
        U = JsonParser.Feature.ALLOW_MISSING_VALUES.e;
        V = JsonParser.Feature.ALLOW_SINGLE_QUOTES.e;
        W = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.e;
        X = JsonParser.Feature.ALLOW_COMMENTS.e;
        Y = JsonParser.Feature.ALLOW_YAML_COMMENTS.e;
        char[] cArr = CharTypes.f14195a;
        char[] cArr2 = CharTypes.f14195a;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int G0() throws InputCoercionException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.H0();
        }
        int i = this.G;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return P2();
            }
            if (i2 == 0) {
                V2();
            }
        }
        return this.H;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void G2() {
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int H0() throws InputCoercionException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.H0();
        }
        int i = this.G;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return P2();
            }
            if (i2 == 0) {
                V2();
            }
        }
        return this.H;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String J1() throws JsonParseException {
        this.G = 0;
        if (this.f == JsonToken.FIELD_NAME) {
            e3();
            return null;
        }
        if (this.R) {
            this.R = false;
            throw null;
        }
        int iI3 = i3();
        this.F = null;
        this.x = this.u;
        if (iI3 == 93 || iI3 == 125) {
            b3(iI3);
            return null;
        }
        if (this.z.k()) {
            if (iI3 != 44) {
                u2(iI3, "was expecting comma to separate " + this.z.h() + " entries");
                throw null;
            }
            iI3 = i3();
            if ((this.d & T) != 0 && (iI3 == 93 || iI3 == 125)) {
                b3(iI3);
                return null;
            }
        }
        if (this.z.e()) {
            g3(iI3);
            throw null;
        }
        f3(iI3);
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String K1() {
        if (this.f == JsonToken.FIELD_NAME) {
            this.D = false;
            JsonToken jsonToken = this.A;
            this.A = null;
            this.f = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                boolean z = this.R;
                TextBuffer textBuffer = this.B;
                if (!z) {
                    return textBuffer.g();
                }
                this.R = false;
                textBuffer.h();
                throw null;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this.z = this.z.i(this.x, this.y);
                return null;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                this.z = this.z.j(this.x, this.y);
                return null;
            }
        } else if (N1() == JsonToken.VALUE_STRING) {
            return k0();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final char K2() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken N1() throws JsonParseException {
        if (this.q) {
            return null;
        }
        if (this.f == JsonToken.FIELD_NAME) {
            return e3();
        }
        this.G = 0;
        if (this.R) {
            this.R = false;
            throw null;
        }
        int iI3 = this.S;
        if (iI3 < 0) {
            throw null;
        }
        this.S = -1;
        if (iI3 <= 32) {
            if (iI3 != 13 && iI3 != 10) {
                throw null;
            }
            this.u++;
            throw null;
        }
        if (iI3 == 47 || iI3 == 35) {
            j3(iI3);
        }
        if (iI3 < 0) {
            close();
            this.f = null;
            return null;
        }
        this.F = null;
        this.x = this.u;
        if (iI3 == 93 || iI3 == 125) {
            b3(iI3);
            return this.f;
        }
        if (this.z.k()) {
            if (iI3 != 44) {
                u2(iI3, "was expecting comma to separate " + this.z.h() + " entries");
                throw null;
            }
            iI3 = i3();
            if ((this.d & T) != 0 && (iI3 == 93 || iI3 == 125)) {
                b3(iI3);
                return this.f;
            }
        }
        if (!this.z.e()) {
            return f3(iI3);
        }
        g3(iI3);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) throws IOException {
        if (!this.R || this.f != JsonToken.VALUE_STRING) {
            byte[] bArrH = h(base64Variant);
            byteBufferBackedOutputStream.write(bArrH);
            return bArrH.length;
        }
        IOContext iOContext = this.p;
        byte[] bArrB = iOContext.b();
        try {
            throw null;
        } catch (Throwable th) {
            iOContext.d(bArrB);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void R2() {
        super.R2();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String T0() {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        boolean z = this.R;
        TextBuffer textBuffer = this.B;
        if (!z) {
            return textBuffer.g();
        }
        this.R = false;
        textBuffer.h();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String V0() {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        boolean z = this.R;
        TextBuffer textBuffer = this.B;
        if (!z) {
            return textBuffer.g();
        }
        this.R = false;
        textBuffer.h();
        throw null;
    }

    public final void b3(int i) throws JsonParseException {
        if (i == 93) {
            if (!this.z.d()) {
                S2('}', i);
                throw null;
            }
            JsonReadContext jsonReadContext = this.z;
            jsonReadContext.g = null;
            this.z = jsonReadContext.c;
            this.f = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this.z.e()) {
                S2(']', i);
                throw null;
            }
            JsonReadContext jsonReadContext2 = this.z;
            jsonReadContext2.g = null;
            this.z = jsonReadContext2.c;
            this.f = JsonToken.END_OBJECT;
        }
    }

    public final int c3(int i) throws JsonParseException {
        int i2 = i & 255;
        if (i2 <= 127) {
            return i2;
        }
        if ((i & BERTags.FLAGS) == 192 || (i & 240) == 224 || (i & 248) == 240) {
            throw null;
        }
        throw new JsonParseException(this, a.k(i2, new StringBuilder("Invalid UTF-8 start byte 0x")));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return ParserBase.Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (r3.z.d() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r3.z.f() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if ((r3.d & com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.U) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r3.S = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken d3(int r4) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            r0 = 39
            r1 = 0
            if (r4 == r0) goto L44
            r0 = 73
            if (r4 == r0) goto L43
            r0 = 78
            if (r4 == r0) goto L42
            r0 = 93
            if (r4 == r0) goto L1f
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L28
            goto L58
        L1e:
            throw r1
        L1f:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3.z
            boolean r0 = r0.d()
            if (r0 != 0) goto L28
            goto L58
        L28:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3.z
            boolean r0 = r0.f()
            if (r0 != 0) goto L3c
            int r0 = r3.d
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.U
            r0 = r0 & r2
            if (r0 == 0) goto L3c
            r3.S = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L3c:
            java.lang.String r0 = "expected a value"
            r3.u2(r4, r0)
            throw r1
        L42:
            throw r1
        L43:
            throw r1
        L44:
            int r0 = r3.d
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.V
            r0 = r0 & r2
            if (r0 == 0) goto L58
            com.fasterxml.jackson.core.util.TextBuffer r4 = r3.B
            char[] r0 = r4.h()
            int r0 = r0.length
            if (r0 > 0) goto L57
            r4.k()
        L57:
            throw r1
        L58:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.U2()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r4 = r3.c3(r4)
            char r4 = (char) r4
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r0 != 0) goto La1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unrecognized token '"
            r4.<init>(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = "': was expecting "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.fasterxml.jackson.core.JsonParseException r0 = new com.fasterxml.jackson.core.JsonParseException
            r0.<init>(r3, r4)
            throw r0
        La1:
            r2.append(r4)
            r4 = 0
            throw r4
        La6:
            java.lang.String r0 = r3.U2()
            java.lang.String r2 = "expected a valid value "
            java.lang.String r0 = r2.concat(r0)
            r3.u2(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.d3(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final JsonToken e3() {
        this.D = false;
        JsonToken jsonToken = this.A;
        this.A = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.z = this.z.i(this.x, this.y);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.z = this.z.j(this.x, this.y);
        }
        this.f = jsonToken;
        return jsonToken;
    }

    public final JsonToken f3(int i) throws JsonParseException {
        if (i == 34) {
            this.R = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d)) {
                h3(false);
                throw null;
            }
            JsonToken jsonTokenD3 = d3(i);
            this.f = jsonTokenD3;
            return jsonTokenD3;
        }
        if (i == 91) {
            this.z = this.z.i(this.x, this.y);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f = jsonToken2;
            return jsonToken2;
        }
        if (i == 102 || i == 110 || i == 116) {
            throw null;
        }
        if (i == 123) {
            this.z = this.z.j(this.x, this.y);
            JsonToken jsonToken3 = JsonToken.START_OBJECT;
            this.f = jsonToken3;
            return jsonToken3;
        }
        if (i == 45) {
            h3(true);
            throw null;
        }
        TextBuffer textBuffer = this.B;
        if (i != 46) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    char[] cArrH = textBuffer.h();
                    if (i == 48) {
                        throw null;
                    }
                    cArrH[0] = (char) i;
                    throw null;
                default:
                    JsonToken jsonTokenD32 = d3(i);
                    this.f = jsonTokenD32;
                    return jsonTokenD32;
            }
        }
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e.a(this.d)) {
            JsonToken jsonTokenD33 = d3(46);
            this.f = jsonTokenD33;
            return jsonTokenD33;
        }
        char[] cArrH2 = textBuffer.h();
        if (cArrH2.length <= 0) {
            cArrH2 = textBuffer.k();
        }
        cArrH2[0] = (char) 46;
        throw null;
    }

    public final String g3(int i) throws JsonParseException {
        if (i == 34) {
            throw null;
        }
        if (i == 39 && (this.d & V) != 0) {
            throw null;
        }
        if ((this.d & W) == 0) {
            u2((char) c3(i), "was expecting double-quote to start field name");
            throw null;
        }
        if (CharTypes.h[i] == 0) {
            throw null;
        }
        u2(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.F == null)) {
            throw new JsonParseException(this, "Current token (" + this.f + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (!this.R) {
            if (this.F == null) {
                ByteArrayBuilder byteArrayBuilderN2 = N2();
                W1(k0(), byteArrayBuilderN2, base64Variant);
                this.F = byteArrayBuilderN2.e();
            }
            return this.F;
        }
        try {
            N2();
            throw null;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Failed to decode VALUE_STRING as base64 (");
            sb.append(base64Variant);
            sb.append("): ");
            throw new JsonParseException(this, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.l(e, sb));
        }
    }

    public final void h3(boolean z) {
        char[] cArrH = this.B.h();
        if (z) {
            cArrH[0] = '-';
        }
        throw null;
    }

    public final int i3() throws JsonParseException {
        int i = this.S;
        if (i < 0) {
            throw null;
        }
        this.S = -1;
        if (i > 32) {
            if (i != 47 && i != 35) {
                return i;
            }
            j3(i);
            return i;
        }
        if (i != 13 && i != 10) {
            throw null;
        }
        this.u++;
        throw null;
    }

    public final void j3(int i) throws JsonParseException {
        if (i <= 32) {
            if (i != 13 && i != 10) {
                throw null;
            }
            this.u++;
            throw null;
        }
        if (i == 47) {
            if ((this.d & X) != 0) {
                throw null;
            }
            u2(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (i != 35 || (this.d & Y) == 0) {
            return;
        }
        char[] cArr = CharTypes.f14195a;
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String k0() {
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        TextBuffer textBuffer = this.B;
        if (jsonToken != jsonToken2) {
            if (jsonToken == null) {
                return null;
            }
            int i = jsonToken.g;
            return i != 5 ? (i == 6 || i == 7 || i == 8) ? textBuffer.g() : jsonToken.d : this.z.f;
        }
        if (!this.R) {
            return textBuffer.g();
        }
        this.R = false;
        textBuffer.h();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return new JsonLocation(H2(), -1L, -1L, this.u, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] m0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        if (i != 5) {
            TextBuffer textBuffer = this.B;
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return jsonToken.e;
                }
            } else if (this.R) {
                this.R = false;
                textBuffer.h();
                throw null;
            }
            return textBuffer.m();
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
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        TextBuffer textBuffer = this.B;
        if (jsonToken == jsonToken2) {
            if (!this.R) {
                return textBuffer.q();
            }
            this.R = false;
            textBuffer.h();
            throw null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.z.f.length();
        }
        if (jsonToken != null) {
            return jsonToken.j ? textBuffer.q() : jsonToken.e.length;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L17;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t0() {
        /*
            r4 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r4.f
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.g
            r2 = 6
            com.fasterxml.jackson.core.util.TextBuffer r3 = r4.B
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L18
            r2 = 8
            if (r0 == r2) goto L18
            goto L24
        L14:
            boolean r0 = r4.R
            if (r0 != 0) goto L1d
        L18:
            int r0 = r3.n()
            return r0
        L1d:
            r4.R = r1
            r3.h()
            r0 = 0
            throw r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.t0():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        return new JsonLocation(H2(), -1L, -1L, this.x, -1);
    }
}

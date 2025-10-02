package com.fasterxml.jackson.core.json;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes4.dex */
public class ReaderBasedJsonParser extends ParserBase {
    public static final int b0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.e;
    public static final int c0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.e;
    public static final int d0 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.e;
    public static final int e0 = JsonParser.Feature.ALLOW_MISSING_VALUES.e;
    public static final int f0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.e;
    public static final int g0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.e;
    public static final int h0 = JsonParser.Feature.ALLOW_COMMENTS.e;
    public static final int i0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.e;
    public static final int[] j0 = CharTypes.e;
    public Reader R;
    public char[] S;
    public final boolean T;
    public final ObjectCodec U;
    public final CharsToNameCanonicalizer V;
    public final int W;
    public boolean X;
    public long Y;
    public int Z;
    public int a0;

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i);
        this.R = reader;
        IOContext.a(iOContext.i);
        char[] cArrB = iOContext.e.b(0, 0);
        iOContext.i = cArrB;
        this.S = cArrB;
        this.r = 0;
        this.s = 0;
        this.U = objectCodec;
        this.V = charsToNameCanonicalizer;
        this.W = charsToNameCanonicalizer.c;
        this.T = true;
    }

    public final int A3(boolean z) throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !h3()) {
                k2(" within/between " + this.z.h() + " entries");
                throw null;
            }
            char[] cArr = this.S;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    C3();
                } else if (c == '#' && (this.d & i0) != 0) {
                    D3();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        u2(c, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.u++;
                this.v = i2;
            } else if (c == '\r') {
                y3();
            } else if (c != '\t') {
                B2(c);
                throw null;
            }
        }
    }

    public final int B3(int i) throws JsonParseException {
        if (i != 44) {
            u2(i, "was expecting comma to separate " + this.z.h() + " entries");
            throw null;
        }
        while (true) {
            int i2 = this.r;
            if (i2 >= this.s) {
                return x3();
            }
            char[] cArr = this.S;
            int i3 = i2 + 1;
            this.r = i3;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this.r = i2;
                return x3();
            }
            if (c < ' ') {
                if (c == '\n') {
                    this.u++;
                    this.v = i3;
                } else if (c == '\r') {
                    y3();
                } else if (c != '\t') {
                    B2(c);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        k2(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C3() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            int r0 = r7.d
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.h0
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto L8f
            int r0 = r7.r
            int r3 = r7.s
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r7.h3()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r7.k2(r4)
            throw r1
        L1d:
            char[] r0 = r7.S
            int r3 = r7.r
            int r5 = r3 + 1
            r7.r = r5
            char r0 = r0[r3]
            if (r0 != r2) goto L2d
            r7.D3()
            return
        L2d:
            r3 = 42
            if (r0 != r3) goto L89
        L31:
            int r0 = r7.r
            int r5 = r7.s
            if (r0 < r5) goto L3d
            boolean r0 = r7.h3()
            if (r0 == 0) goto L56
        L3d:
            char[] r0 = r7.S
            int r5 = r7.r
            int r6 = r5 + 1
            r7.r = r6
            char r0 = r0[r5]
            if (r0 > r3) goto L31
            if (r0 != r3) goto L67
            int r0 = r7.s
            if (r6 < r0) goto L5a
            boolean r0 = r7.h3()
            if (r0 == 0) goto L56
            goto L5a
        L56:
            r7.k2(r4)
            throw r1
        L5a:
            char[] r0 = r7.S
            int r5 = r7.r
            char r0 = r0[r5]
            if (r0 != r2) goto L31
            int r5 = r5 + 1
            r7.r = r5
            return
        L67:
            r5 = 32
            if (r0 >= r5) goto L31
            r5 = 10
            if (r0 != r5) goto L78
            int r0 = r7.u
            int r0 = r0 + 1
            r7.u = r0
            r7.v = r6
            goto L31
        L78:
            r5 = 13
            if (r0 != r5) goto L80
            r7.y3()
            goto L31
        L80:
            r5 = 9
            if (r0 != r5) goto L85
            goto L31
        L85:
            r7.B2(r0)
            throw r1
        L89:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r7.u2(r0, r2)
            throw r1
        L8f:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r7.u2(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.C3():void");
    }

    public final void D3() throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !h3()) {
                return;
            }
            char[] cArr = this.S;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.u++;
                    this.v = i2;
                    return;
                } else if (c == '\r') {
                    y3();
                    return;
                } else if (c != '\t') {
                    B2(c);
                    throw null;
                }
            }
        }
    }

    public final void E3() throws JsonParseException {
        this.X = false;
        int i = this.r;
        int i2 = this.s;
        char[] cArr = this.S;
        while (true) {
            if (i >= i2) {
                this.r = i;
                if (!h3()) {
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    k2(": was expecting closing quote for a string value");
                    throw null;
                }
                i = this.r;
                i2 = this.s;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.r = i3;
                    K2();
                    i = this.r;
                    i2 = this.s;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.r = i3;
                        return;
                    } else if (c < ' ') {
                        this.r = i3;
                        T2(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public final int F3() throws JsonParseException {
        if (this.r >= this.s && !h3()) {
            b2();
            return -1;
        }
        char[] cArr = this.S;
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this.r = i;
            return G3();
        }
        if (c != ' ') {
            if (c == '\n') {
                this.u++;
                this.v = i2;
            } else if (c == '\r') {
                y3();
            } else if (c != '\t') {
                B2(c);
                throw null;
            }
        }
        while (true) {
            int i3 = this.r;
            if (i3 >= this.s) {
                return G3();
            }
            char[] cArr2 = this.S;
            int i4 = i3 + 1;
            this.r = i4;
            char c2 = cArr2[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this.r = i3;
                return G3();
            }
            if (c2 != ' ') {
                if (c2 == '\n') {
                    this.u++;
                    this.v = i4;
                } else if (c2 == '\r') {
                    y3();
                } else if (c2 != '\t') {
                    B2(c2);
                    throw null;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void G2() throws IOException {
        if (this.R != null) {
            if (this.p.d || JsonParser.Feature.AUTO_CLOSE_SOURCE.a(this.d)) {
                this.R.close();
            }
            this.R = null;
        }
    }

    public final int G3() throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !h3()) {
                b2();
                return -1;
            }
            char[] cArr = this.S;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    C3();
                } else {
                    if (c != '#' || (this.d & i0) == 0) {
                        return c;
                    }
                    D3();
                }
            } else if (c == ' ') {
                continue;
            } else if (c == '\n') {
                this.u++;
                this.v = i2;
            } else if (c == '\r') {
                y3();
            } else if (c != '\t') {
                B2(c);
                throw null;
            }
        }
    }

    public final void H3() {
        int i = this.r;
        this.w = this.t + i;
        this.x = this.u;
        this.y = i - this.v;
    }

    public final void I3(int i) throws JsonParseException {
        int i2 = this.r;
        int i3 = i2 + 1;
        this.r = i3;
        if (i != 9) {
            if (i == 10) {
                this.u++;
                this.v = i3;
            } else if (i == 13) {
                this.r = i2;
            } else {
                if (i == 32) {
                    return;
                }
                u2(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String J1() throws JsonParseException {
        JsonToken jsonTokenT3;
        this.G = 0;
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            n3();
            return null;
        }
        if (this.X) {
            E3();
        }
        int iF3 = F3();
        if (iF3 < 0) {
            close();
            this.f = null;
            return null;
        }
        this.F = null;
        if (iF3 == 93 || iF3 == 125) {
            b3(iF3);
            return null;
        }
        if (this.z.k()) {
            iF3 = B3(iF3);
            if ((this.d & b0) != 0 && (iF3 == 93 || iF3 == 125)) {
                b3(iF3);
                return null;
            }
        }
        if (this.z.e()) {
            int i = this.r;
            this.Y = i;
            this.Z = this.u;
            this.a0 = i - this.v;
            String strQ3 = iF3 == 34 ? q3() : f3(iF3);
            this.z.l(strQ3);
            this.f = jsonToken2;
            int iZ3 = z3();
            H3();
            if (iZ3 == 34) {
                this.X = true;
                this.A = JsonToken.VALUE_STRING;
                return strQ3;
            }
            if (iZ3 == 43) {
                jsonTokenT3 = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d) ? t3(false) : g3(iZ3);
            } else if (iZ3 == 91) {
                jsonTokenT3 = JsonToken.START_ARRAY;
            } else if (iZ3 == 102) {
                j3();
                jsonTokenT3 = JsonToken.VALUE_FALSE;
            } else if (iZ3 == 110) {
                k3();
                jsonTokenT3 = JsonToken.VALUE_NULL;
            } else if (iZ3 == 116) {
                m3();
                jsonTokenT3 = JsonToken.VALUE_TRUE;
            } else if (iZ3 == 123) {
                jsonTokenT3 = JsonToken.START_OBJECT;
            } else if (iZ3 == 45) {
                jsonTokenT3 = t3(true);
            } else if (iZ3 != 46) {
                switch (iZ3) {
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
                        jsonTokenT3 = u3(iZ3);
                        break;
                    default:
                        jsonTokenT3 = g3(iZ3);
                        break;
                }
            } else {
                jsonTokenT3 = p3(false);
            }
            this.A = jsonTokenT3;
            return strQ3;
        }
        H3();
        if (iF3 == 34) {
            this.X = true;
            this.f = JsonToken.VALUE_STRING;
            return null;
        }
        if (iF3 == 91) {
            this.z = this.z.i(this.x, this.y);
            this.f = JsonToken.START_ARRAY;
            return null;
        }
        if (iF3 == 102) {
            l3(1, "false");
            this.f = JsonToken.VALUE_FALSE;
            return null;
        }
        if (iF3 == 110) {
            l3(1, "null");
            this.f = JsonToken.VALUE_NULL;
            return null;
        }
        if (iF3 == 116) {
            l3(1, "true");
            this.f = JsonToken.VALUE_TRUE;
            return null;
        }
        if (iF3 == 123) {
            this.z = this.z.j(this.x, this.y);
            this.f = JsonToken.START_OBJECT;
            return null;
        }
        switch (iF3) {
            case 44:
                if (!this.z.f() && (this.d & e0) != 0) {
                    this.r--;
                    this.f = JsonToken.VALUE_NULL;
                    return null;
                }
                break;
            case 45:
                this.f = t3(true);
                return null;
            case 46:
                this.f = p3(false);
                return null;
            default:
                switch (iF3) {
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
                        this.f = u3(iF3);
                        break;
                }
                return null;
        }
        this.f = g3(iF3);
        return null;
    }

    public final char J3(String str) {
        if (this.r >= this.s && !h3()) {
            k2(str);
            throw null;
        }
        char[] cArr = this.S;
        int i = this.r;
        this.r = i + 1;
        return cArr[i];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String K1() throws JsonParseException {
        if (this.f == JsonToken.FIELD_NAME) {
            this.D = false;
            JsonToken jsonToken = this.A;
            this.A = null;
            this.f = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.X) {
                    this.X = false;
                    d3();
                }
                return this.B.g();
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
    public final char K2() throws JsonParseException {
        if (this.r >= this.s && !h3()) {
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            k2(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.S;
        int i = this.r;
        this.r = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            O2(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.r >= this.s && !h3()) {
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                k2(" in character escape sequence");
                throw null;
            }
            char[] cArr2 = this.S;
            int i4 = this.r;
            this.r = i4 + 1;
            char c2 = cArr2[i4];
            int iA = CharTypes.a(c2);
            if (iA < 0) {
                u2(c2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | iA;
        }
        return (char) i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken N1() throws JsonParseException {
        JsonToken jsonTokenT3;
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return n3();
        }
        this.G = 0;
        if (this.X) {
            E3();
        }
        int iF3 = F3();
        if (iF3 < 0) {
            close();
            this.f = null;
            return null;
        }
        this.F = null;
        if (iF3 == 93 || iF3 == 125) {
            b3(iF3);
            return this.f;
        }
        if (this.z.k()) {
            iF3 = B3(iF3);
            if ((this.d & b0) != 0 && (iF3 == 93 || iF3 == 125)) {
                b3(iF3);
                return this.f;
            }
        }
        boolean zE = this.z.e();
        if (zE) {
            int i = this.r;
            this.Y = i;
            this.Z = this.u;
            this.a0 = i - this.v;
            this.z.l(iF3 == 34 ? q3() : f3(iF3));
            this.f = jsonToken2;
            iF3 = z3();
        }
        H3();
        if (iF3 == 34) {
            this.X = true;
            jsonTokenT3 = JsonToken.VALUE_STRING;
        } else if (iF3 == 43) {
            jsonTokenT3 = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d) ? t3(false) : g3(iF3);
        } else if (iF3 == 91) {
            if (!zE) {
                this.z = this.z.i(this.x, this.y);
            }
            jsonTokenT3 = JsonToken.START_ARRAY;
        } else if (iF3 == 102) {
            j3();
            jsonTokenT3 = JsonToken.VALUE_FALSE;
        } else if (iF3 == 110) {
            k3();
            jsonTokenT3 = JsonToken.VALUE_NULL;
        } else if (iF3 == 116) {
            m3();
            jsonTokenT3 = JsonToken.VALUE_TRUE;
        } else if (iF3 == 123) {
            if (!zE) {
                this.z = this.z.j(this.x, this.y);
            }
            jsonTokenT3 = JsonToken.START_OBJECT;
        } else {
            if (iF3 == 125) {
                u2(iF3, "expected a value");
                throw null;
            }
            if (iF3 == 45) {
                jsonTokenT3 = t3(true);
            } else if (iF3 != 46) {
                switch (iF3) {
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
                        jsonTokenT3 = u3(iF3);
                        break;
                    default:
                        jsonTokenT3 = g3(iF3);
                        break;
                }
            } else {
                jsonTokenT3 = p3(false);
            }
        }
        if (zE) {
            this.A = jsonTokenT3;
            return this.f;
        }
        this.f = jsonTokenT3;
        return jsonTokenT3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) throws IOException {
        if (!this.X || this.f != JsonToken.VALUE_STRING) {
            byte[] bArrH = h(base64Variant);
            byteBufferBackedOutputStream.write(bArrH);
            return bArrH.length;
        }
        IOContext iOContext = this.p;
        byte[] bArrB = iOContext.b();
        try {
            return v3(base64Variant, byteBufferBackedOutputStream, bArrB);
        } finally {
            iOContext.d(bArrB);
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void R2() {
        char[] cArr;
        super.R2();
        this.V.d();
        if (!this.T || (cArr = this.S) == null) {
            return;
        }
        this.S = null;
        IOContext iOContext = this.p;
        char[] cArr2 = iOContext.i;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        iOContext.i = null;
        iOContext.e.b.set(0, cArr);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String T0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        if (this.X) {
            this.X = false;
            d3();
        }
        return this.B.g();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String V0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        if (this.X) {
            this.X = false;
            d3();
        }
        return this.B.g();
    }

    public final void b3(int i) throws JsonParseException {
        if (i == 93) {
            H3();
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
            H3();
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

    public final byte[] c3(Base64Variant base64Variant) throws JsonParseException {
        ByteArrayBuilder byteArrayBuilderN2 = N2();
        while (true) {
            if (this.r >= this.s) {
                i3();
            }
            char[] cArr = this.S;
            int i = this.r;
            this.r = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int iC = base64Variant.c(c);
                char c2 = base64Variant.h;
                boolean z = base64Variant.j;
                if (iC < 0) {
                    if (c == '\"') {
                        return byteArrayBuilderN2.e();
                    }
                    iC = I2(base64Variant, c, 0);
                    if (iC < 0) {
                        continue;
                    }
                }
                if (this.r >= this.s) {
                    i3();
                }
                char[] cArr2 = this.S;
                int i2 = this.r;
                this.r = i2 + 1;
                char c3 = cArr2[i2];
                int iC2 = base64Variant.c(c3);
                if (iC2 < 0) {
                    iC2 = I2(base64Variant, c3, 1);
                }
                int i3 = (iC << 6) | iC2;
                if (this.r >= this.s) {
                    i3();
                }
                char[] cArr3 = this.S;
                int i4 = this.r;
                this.r = i4 + 1;
                char c4 = cArr3[i4];
                int iC3 = base64Variant.c(c4);
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        if (c4 == '\"') {
                            byteArrayBuilderN2.b(i3 >> 4);
                            if (!z) {
                                return byteArrayBuilderN2.e();
                            }
                            this.r--;
                            throw new JsonParseException(this, base64Variant.j());
                        }
                        iC3 = I2(base64Variant, c4, 2);
                    }
                    if (iC3 == -2) {
                        if (this.r >= this.s) {
                            i3();
                        }
                        char[] cArr4 = this.S;
                        int i5 = this.r;
                        this.r = i5 + 1;
                        char c5 = cArr4[i5];
                        if (c5 != c2 && I2(base64Variant, c5, 3) != -2) {
                            throw ParserBase.X2(base64Variant, c5, 3, "expected padding character '" + c2 + "'");
                        }
                        byteArrayBuilderN2.b(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | iC3;
                if (this.r >= this.s) {
                    i3();
                }
                char[] cArr5 = this.S;
                int i7 = this.r;
                this.r = i7 + 1;
                char c6 = cArr5[i7];
                int iC4 = base64Variant.c(c6);
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c6 == '\"') {
                            byteArrayBuilderN2.d(i6 >> 2);
                            if (!z) {
                                return byteArrayBuilderN2.e();
                            }
                            this.r--;
                            throw new JsonParseException(this, base64Variant.j());
                        }
                        iC4 = I2(base64Variant, c6, 3);
                    }
                    if (iC4 == -2) {
                        byteArrayBuilderN2.d(i6 >> 2);
                    }
                }
                byteArrayBuilderN2.c((i6 << 6) | iC4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return ParserBase.Q;
    }

    public final void d3() throws JsonParseException {
        int i = this.r;
        int i2 = this.s;
        int[] iArr = j0;
        TextBuffer textBuffer = this.B;
        if (i < i2) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.S;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    int i3 = this.r;
                    textBuffer.p(cArr, i3, i - i3);
                    this.r = i + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.S;
        int i4 = this.r;
        int i5 = i - i4;
        textBuffer.b = null;
        textBuffer.c = -1;
        textBuffer.d = 0;
        textBuffer.j = null;
        textBuffer.k = null;
        if (textBuffer.f) {
            textBuffer.d();
        } else if (textBuffer.h == null) {
            textBuffer.h = textBuffer.c(i5);
        }
        textBuffer.g = 0;
        textBuffer.i = 0;
        textBuffer.b(cArr2, i4, i5);
        this.r = i;
        char[] cArrL = textBuffer.l();
        int i6 = textBuffer.i;
        int length2 = iArr.length;
        while (true) {
            if (this.r >= this.s && !h3()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                k2(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr3 = this.S;
            int i7 = this.r;
            this.r = i7 + 1;
            char cK2 = cArr3[i7];
            if (cK2 < length2 && iArr[cK2] != 0) {
                if (cK2 == '\"') {
                    textBuffer.i = i6;
                    return;
                } else if (cK2 == '\\') {
                    cK2 = K2();
                } else if (cK2 < ' ') {
                    T2(cK2, "string value");
                }
            }
            if (i6 >= cArrL.length) {
                cArrL = textBuffer.k();
                i6 = 0;
            }
            cArrL[i6] = cK2;
            i6++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken e3(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f3(int r11) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.f3(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken g3(int r9) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.g3(int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) throws JsonParseException {
        byte[] bArr;
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.F) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            throw new JsonParseException(this, "Current token (" + this.f + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.X) {
            try {
                this.F = c3(base64Variant);
                this.X = false;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Failed to decode VALUE_STRING as base64 (");
                sb.append(base64Variant);
                sb.append("): ");
                throw new JsonParseException(this, a.l(e, sb));
            }
        } else if (this.F == null) {
            ByteArrayBuilder byteArrayBuilderN2 = N2();
            W1(k0(), byteArrayBuilderN2, base64Variant);
            this.F = byteArrayBuilderN2.e();
        }
        return this.F;
    }

    public final boolean h3() throws IOException {
        Reader reader = this.R;
        if (reader != null) {
            char[] cArr = this.S;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this.s;
                long j = i2;
                this.t += j;
                this.v -= i2;
                this.Y -= j;
                this.r = 0;
                this.s = i;
                return true;
            }
            G2();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.s);
            }
        }
        return false;
    }

    public final void i3() {
        if (h3()) {
            return;
        }
        g2();
        throw null;
    }

    public final void j3() throws JsonParseException {
        int i;
        char c;
        int i2 = this.r;
        if (i2 + 4 < this.s) {
            char[] cArr = this.S;
            if (cArr[i2] == 'a' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 's' && cArr[i2 + 3] == 'e' && ((c = cArr[(i = i2 + 4)]) < '0' || c == ']' || c == '}')) {
                this.r = i;
                return;
            }
        }
        l3(1, "false");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return this.U;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String k0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        TextBuffer textBuffer = this.B;
        if (jsonToken == jsonToken2) {
            if (this.X) {
                this.X = false;
                d3();
            }
            return textBuffer.g();
        }
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? textBuffer.g() : jsonToken.d : this.z.f;
    }

    public final void k3() throws JsonParseException {
        int i;
        char c;
        int i2 = this.r;
        if (i2 + 3 < this.s) {
            char[] cArr = this.S;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.r = i;
                return;
            }
        }
        l3(1, "null");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return new JsonLocation(H2(), -1L, this.r + this.t, this.u, (this.r - this.v) + 1);
    }

    public final void l3(int i, String str) throws JsonParseException {
        int i2;
        char c;
        int length = str.length();
        if (this.r + length < this.s) {
            while (this.S[this.r] == str.charAt(i)) {
                int i3 = this.r + 1;
                this.r = i3;
                i++;
                if (i >= length) {
                    char c2 = this.S[i3];
                    if (c2 < '0' || c2 == ']' || c2 == '}' || !Character.isJavaIdentifierPart(c2)) {
                        return;
                    }
                    w3(str.substring(0, i), U2());
                    throw null;
                }
            }
            w3(str.substring(0, i), U2());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.r >= this.s && !h3()) || this.S[this.r] != str.charAt(i)) {
                w3(str.substring(0, i), U2());
                throw null;
            }
            i2 = this.r + 1;
            this.r = i2;
            i++;
        } while (i < length2);
        if ((i2 < this.s || h3()) && (c = this.S[this.r]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            w3(str.substring(0, i), U2());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] m0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return jsonToken.e;
                }
            } else if (this.X) {
                this.X = false;
                d3();
            }
            return this.B.m();
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

    public final void m3() throws JsonParseException {
        int i;
        char c;
        int i2 = this.r;
        if (i2 + 3 < this.s) {
            char[] cArr = this.S;
            if (cArr[i2] == 'r' && cArr[i2 + 1] == 'u' && cArr[i2 + 2] == 'e' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.r = i;
                return;
            }
        }
        l3(1, "true");
    }

    public final JsonToken n3() {
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

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken o3(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final JsonToken p3(boolean z) {
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e.a(this.d)) {
            return g3(46);
        }
        int i = this.r;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return o3(46, i2, i, 0, z);
    }

    public final String q3() {
        int i = this.r;
        int i2 = this.W;
        while (true) {
            if (i >= this.s) {
                break;
            }
            char[] cArr = this.S;
            char c = cArr[i];
            int[] iArr = j0;
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.r;
                this.r = i + 1;
                return this.V.b(i3, i - i3, i2, cArr);
            }
        }
        int i4 = this.r;
        this.r = i;
        return r3(i4, i2, 34);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int r0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        int i = jsonToken.g;
        if (i == 5) {
            return this.z.f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return jsonToken.e.length;
            }
        } else if (this.X) {
            this.X = false;
            d3();
        }
        return this.B.q();
    }

    public final String r3(int i, int i2, int i3) throws JsonParseException {
        char[] cArr = this.S;
        int i4 = this.r - i;
        TextBuffer textBuffer = this.B;
        textBuffer.p(cArr, i, i4);
        char[] cArrL = textBuffer.l();
        int i5 = textBuffer.i;
        while (true) {
            if (this.r >= this.s && !h3()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                k2(" in field name");
                throw null;
            }
            char[] cArr2 = this.S;
            int i6 = this.r;
            this.r = i6 + 1;
            char cK2 = cArr2[i6];
            if (cK2 <= '\\') {
                if (cK2 == '\\') {
                    cK2 = K2();
                } else if (cK2 <= i3) {
                    if (cK2 == i3) {
                        textBuffer.i = i5;
                        char[] cArrM = textBuffer.m();
                        return this.V.b(textBuffer.n(), textBuffer.q(), i2, cArrM);
                    }
                    if (cK2 < ' ') {
                        T2(cK2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    }
                }
            }
            i2 = (i2 * 33) + cK2;
            int i7 = i5 + 1;
            cArrL[i5] = cK2;
            if (i7 >= cArrL.length) {
                cArrL = textBuffer.k();
                i5 = 0;
            } else {
                i5 = i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EDGE_INSN: B:21:0x004a->B:47:0x008e BREAK  A[LOOP:0: B:34:0x006c->B:147:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken s3(int r18, boolean r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.s3(int, boolean):com.fasterxml.jackson.core.JsonToken");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t0() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L22
            int r0 = r0.g
            r2 = 6
            if (r0 == r2) goto L12
            r2 = 7
            if (r0 == r2) goto L1b
            r2 = 8
            if (r0 == r2) goto L1b
            goto L22
        L12:
            boolean r0 = r3.X
            if (r0 == 0) goto L1b
            r3.X = r1
            r3.d3()
        L1b:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3.B
            int r0 = r0.n()
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.t0():int");
    }

    public final JsonToken t3(boolean z) throws JsonParseException {
        int i = this.r;
        int i2 = z ? i - 1 : i;
        int i3 = this.s;
        if (i >= i3) {
            return s3(i2, z);
        }
        int i4 = i + 1;
        char c = this.S[i];
        char c2 = '9';
        int i5 = 1;
        if (c > '9' || c < '0') {
            this.r = i4;
            return c == '.' ? p3(z) : e3(c, z, true);
        }
        if (c == '0') {
            return s3(i2, z);
        }
        while (i4 < i3) {
            char c3 = c2;
            int i6 = i4 + 1;
            char c4 = this.S[i4];
            if (c4 < '0' || c4 > c3) {
                if (c4 == '.' || c4 == 'e' || c4 == 'E') {
                    this.r = i6;
                    return o3(c4, i2, i6, i5, z);
                }
                this.r = i4;
                if (this.z.f()) {
                    I3(c4);
                }
                this.B.p(this.S, i2, i4 - i2);
                return a3(i5, z);
            }
            i5++;
            i4 = i6;
            c2 = c3;
        }
        return s3(i2, z);
    }

    public final JsonToken u3(int i) throws JsonParseException {
        int i2 = this.r;
        int i3 = i2 - 1;
        int i4 = this.s;
        char c = '0';
        if (i == 48) {
            return s3(i3, false);
        }
        int i5 = 1;
        while (i2 < i4) {
            char c2 = c;
            int i6 = i2 + 1;
            char c3 = this.S[i2];
            if (c3 < c2 || c3 > '9') {
                if (c3 == '.' || c3 == 'e' || c3 == 'E') {
                    this.r = i6;
                    return o3(c3, i3, i6, i5, false);
                }
                this.r = i2;
                if (this.z.f()) {
                    I3(c3);
                }
                this.B.p(this.S, i3, i2 - i3);
                return a3(i5, false);
            }
            i5++;
            i2 = i6;
            c = c2;
        }
        this.r = i3;
        return s3(i3, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        r17.X = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        if (r7 <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v3(com.fasterxml.jackson.core.Base64Variant r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.v3(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public final void w3(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.r >= this.s && !h3()) {
                break;
            }
            char c = this.S[this.r];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.r++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    public final int x3() throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !h3()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.z.h() + " entries");
            }
            char[] cArr = this.S;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    C3();
                } else {
                    if (c != '#' || (this.d & i0) == 0) {
                        return c;
                    }
                    D3();
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.u++;
                this.v = i2;
            } else if (c == '\r') {
                y3();
            } else if (c != '\t') {
                B2(c);
                throw null;
            }
        }
    }

    public final void y3() {
        if (this.r < this.s || h3()) {
            char[] cArr = this.S;
            int i = this.r;
            if (cArr[i] == '\n') {
                this.r = i + 1;
            }
        }
        this.u++;
        this.v = this.r;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        if (this.f != JsonToken.FIELD_NAME) {
            return new JsonLocation(H2(), -1L, this.w - 1, this.x, this.y);
        }
        return new JsonLocation(H2(), -1L, (this.Y - 1) + this.t, this.Z, this.a0);
    }

    public final int z3() {
        int i = this.r;
        if (i + 4 >= this.s) {
            return A3(false);
        }
        char[] cArr = this.S;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.r = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return A3(true);
                }
                this.r = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this.r = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return A3(true);
                    }
                    this.r = i + 3;
                    return c3;
                }
            }
            return A3(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.r = i4;
            c = cArr[i4];
        }
        if (c != ':') {
            return A3(false);
        }
        int i5 = this.r;
        int i6 = i5 + 1;
        this.r = i6;
        char c4 = cArr[i6];
        if (c4 > ' ') {
            if (c4 == '/' || c4 == '#') {
                return A3(true);
            }
            this.r = i5 + 2;
            return c4;
        }
        if (c4 == ' ' || c4 == '\t') {
            int i7 = i5 + 2;
            this.r = i7;
            char c5 = cArr[i7];
            if (c5 > ' ') {
                if (c5 == '/' || c5 == '#') {
                    return A3(true);
                }
                this.r = i5 + 3;
                return c5;
            }
        }
        return A3(true);
    }
}

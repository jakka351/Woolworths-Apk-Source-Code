package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;

/* loaded from: classes4.dex */
public abstract class NonBlockingUtf8JsonParserBase extends NonBlockingJsonParserBase {
    public static final int Z;
    public static final int a0;

    static {
        int i = JsonParser.Feature.ALLOW_TRAILING_COMMA.e;
        int i2 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.e;
        int i3 = JsonParser.Feature.ALLOW_MISSING_VALUES.e;
        int i4 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.e;
        int i5 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.e;
        Z = JsonParser.Feature.ALLOW_COMMENTS.e;
        a0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.e;
        int[] iArr = CharTypes.f;
        int[] iArr2 = CharTypes.e;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final char K2() {
        VersionUtil.c();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken N1() throws JsonParseException {
        int i = this.r;
        if (i >= this.s) {
            if (this.q) {
                return null;
            }
            return JsonToken.NOT_AVAILABLE;
        }
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        if (jsonToken != jsonToken2) {
            this.G = 0;
            this.w = this.t + i;
            this.F = null;
            g3();
            throw null;
        }
        int i2 = this.W;
        if (i2 == 1) {
            int i3 = this.S;
            if (this.r < this.s) {
                g3();
                throw null;
            }
            this.S = i3;
            this.W = 1;
            JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
            this.f = jsonToken3;
            return jsonToken3;
        }
        if (i2 == 4) {
            g3();
            throw null;
        }
        if (i2 == 5) {
            g3();
            throw null;
        }
        switch (i2) {
            case 7:
                int i4 = this.R;
                int i5 = this.S;
                int i6 = this.T;
                if (this.r < this.s) {
                    g3();
                    throw null;
                }
                this.R = i4;
                this.S = i5;
                this.T = i6;
                this.W = 7;
                JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                this.f = jsonToken4;
                return jsonToken4;
            case 8:
                b3(this.U, this.V);
                this.W = 8;
                return jsonToken2;
            case 9:
                int i7 = this.R;
                int i8 = this.S;
                int i9 = this.T;
                if (this.r < this.s) {
                    g3();
                    throw null;
                }
                this.R = i7;
                this.S = i8;
                this.T = i9;
                this.W = 9;
                JsonToken jsonToken5 = JsonToken.NOT_AVAILABLE;
                this.f = jsonToken5;
                return jsonToken5;
            case 10:
                int i10 = this.R;
                int i11 = this.S;
                int i12 = this.T;
                char[] cArr = CharTypes.f14195a;
                if (this.r < this.s) {
                    e3();
                    throw null;
                }
                this.R = i10;
                this.S = i11;
                this.T = i12;
                this.W = 10;
                JsonToken jsonToken6 = JsonToken.NOT_AVAILABLE;
                this.f = jsonToken6;
                return jsonToken6;
            default:
                switch (i2) {
                    case 12:
                        g3();
                        throw null;
                    case 13:
                        g3();
                        throw null;
                    case 14:
                        g3();
                        throw null;
                    case 15:
                        g3();
                        throw null;
                    case 16:
                        return d3("null", this.S, JsonToken.VALUE_NULL);
                    case 17:
                        return d3("true", this.S, JsonToken.VALUE_TRUE);
                    case 18:
                        return d3("false", this.S, JsonToken.VALUE_FALSE);
                    case 19:
                        int i13 = this.X;
                        int i14 = this.S;
                        NonBlockingJsonParserBase.Y[i13].length();
                        if (this.r < this.s) {
                            e3();
                            throw null;
                        }
                        this.X = i13;
                        this.S = i14;
                        this.W = 19;
                        JsonToken jsonToken7 = JsonToken.NOT_AVAILABLE;
                        this.f = jsonToken7;
                        return jsonToken7;
                    default:
                        TextBuffer textBuffer = this.B;
                        switch (i2) {
                            case 22:
                                g3();
                                throw null;
                            case 23:
                                g3();
                                throw null;
                            case 24:
                                if (this.r < this.s) {
                                    g3();
                                    throw null;
                                }
                                this.W = 24;
                                JsonToken jsonToken8 = JsonToken.NOT_AVAILABLE;
                                this.f = jsonToken8;
                                return jsonToken8;
                            case 25:
                                if (this.r < this.s) {
                                    g3();
                                    throw null;
                                }
                                this.W = 25;
                                JsonToken jsonToken9 = JsonToken.NOT_AVAILABLE;
                                this.f = jsonToken9;
                                return jsonToken9;
                            case 26:
                                char[] cArr2 = textBuffer.h;
                                int i15 = textBuffer.i;
                                if (this.r < this.s) {
                                    e3();
                                    throw null;
                                }
                                this.W = 26;
                                textBuffer.i = i15;
                                JsonToken jsonToken10 = JsonToken.NOT_AVAILABLE;
                                this.f = jsonToken10;
                                return jsonToken10;
                            default:
                                switch (i2) {
                                    case 30:
                                        f3();
                                        throw null;
                                    case 31:
                                        g3();
                                        throw null;
                                    case 32:
                                        g3();
                                        throw null;
                                    default:
                                        switch (i2) {
                                            case 40:
                                                char[] cArrK = textBuffer.h;
                                                int i16 = textBuffer.i;
                                                int i17 = this.r;
                                                while (i17 < this.s) {
                                                    if (i16 >= cArrK.length) {
                                                        cArrK = textBuffer.k();
                                                        i16 = 0;
                                                    }
                                                    if (i17 < Math.min(this.s, (cArrK.length - i16) + i17)) {
                                                        e3();
                                                        throw null;
                                                    }
                                                }
                                                this.r = i17;
                                                this.W = 40;
                                                textBuffer.i = i16;
                                                JsonToken jsonToken11 = JsonToken.NOT_AVAILABLE;
                                                this.f = jsonToken11;
                                                return jsonToken11;
                                            case 41:
                                                b3(this.U, this.V);
                                                return jsonToken2;
                                            case 42:
                                                f3();
                                                throw null;
                                            case 43:
                                                f3();
                                                throw null;
                                            case 44:
                                                f3();
                                                throw null;
                                            case 45:
                                                char[] cArrK2 = textBuffer.h;
                                                int i18 = textBuffer.i;
                                                int i19 = this.r;
                                                while (i19 < this.s) {
                                                    if (i18 >= cArrK2.length) {
                                                        cArrK2 = textBuffer.k();
                                                        i18 = 0;
                                                    }
                                                    if (i19 < Math.min(this.s, (cArrK2.length - i18) + i19)) {
                                                        e3();
                                                        throw null;
                                                    }
                                                }
                                                this.r = i19;
                                                this.W = 45;
                                                textBuffer.i = i18;
                                                JsonToken jsonToken12 = JsonToken.NOT_AVAILABLE;
                                                this.f = jsonToken12;
                                                return jsonToken12;
                                            default:
                                                switch (i2) {
                                                    case 50:
                                                        if (this.r < this.s) {
                                                            f3();
                                                            throw null;
                                                        }
                                                        JsonToken jsonToken13 = JsonToken.NOT_AVAILABLE;
                                                        this.f = jsonToken13;
                                                        return jsonToken13;
                                                    case 51:
                                                        int i20 = this.S;
                                                        if ((this.d & Z) == 0) {
                                                            u2(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
                                                            throw null;
                                                        }
                                                        if (this.r < this.s) {
                                                            f3();
                                                            throw null;
                                                        }
                                                        this.S = i20;
                                                        this.W = 51;
                                                        JsonToken jsonToken14 = JsonToken.NOT_AVAILABLE;
                                                        this.f = jsonToken14;
                                                        return jsonToken14;
                                                    case 52:
                                                        return c3(this.S, true);
                                                    case 53:
                                                        return c3(this.S, false);
                                                    case 54:
                                                        int i21 = this.S;
                                                        if (this.r < this.s) {
                                                            g3();
                                                            throw null;
                                                        }
                                                        this.W = 54;
                                                        this.S = i21;
                                                        JsonToken jsonToken15 = JsonToken.NOT_AVAILABLE;
                                                        this.f = jsonToken15;
                                                        return jsonToken15;
                                                    case 55:
                                                        int i22 = this.S;
                                                        if ((this.d & a0) == 0) {
                                                            u2(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
                                                            throw null;
                                                        }
                                                        if (this.r < this.s) {
                                                            g3();
                                                            throw null;
                                                        }
                                                        this.W = 55;
                                                        this.S = i22;
                                                        JsonToken jsonToken16 = JsonToken.NOT_AVAILABLE;
                                                        this.f = jsonToken16;
                                                        return jsonToken16;
                                                    default:
                                                        VersionUtil.c();
                                                        throw null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final int b3(int i, int i2) {
        if (this.r < this.s) {
            f3();
            throw null;
        }
        this.U = i;
        this.V = i2;
        return -1;
    }

    public final JsonToken c3(int i, boolean z) {
        if (this.r < this.s) {
            g3();
            throw null;
        }
        this.W = z ? 52 : 53;
        this.S = i;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this.f = jsonToken;
        return jsonToken;
    }

    public final JsonToken d3(String str, int i, JsonToken jsonToken) {
        if (this.r < this.s) {
            e3();
            throw null;
        }
        this.S = i;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.f = jsonToken2;
        return jsonToken2;
    }

    public abstract byte e3();

    public abstract byte f3();

    public abstract int g3();
}

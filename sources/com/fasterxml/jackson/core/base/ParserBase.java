package com.fasterxml.jackson.core.base;

import androidx.camera.core.impl.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.BigDecimalParser;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.io.doubleparser.FastFloatParser;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class ParserBase extends ParserMinimalBase {
    public static final JacksonFeatureSet Q = JsonParser.e;
    public JsonToken A;
    public final TextBuffer B;
    public char[] C;
    public boolean D;
    public ByteArrayBuilder E;
    public byte[] F;
    public int G;
    public int H;
    public long I;
    public float J;
    public double K;
    public BigInteger L;
    public BigDecimal M;
    public String N;
    public boolean O;
    public int P;
    public final IOContext p;
    public boolean q;
    public int r;
    public int s;
    public long t;
    public int u;
    public int v;
    public long w;
    public int x;
    public int y;
    public JsonReadContext z;

    public ParserBase(IOContext iOContext, int i) {
        super(i);
        this.u = 1;
        this.x = 1;
        this.G = 0;
        this.p = iOContext;
        this.B = new TextBuffer(iOContext.e);
        this.z = new JsonReadContext(null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.a(i) ? new DupDetector(this) : null, 0, 1, 0);
    }

    public static int[] W2(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public static IllegalArgumentException X2(Base64Variant base64Variant, int i, int i2, String str) {
        String strO;
        if (i <= 32) {
            strO = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (i == base64Variant.h) {
            strO = "Unexpected padding character ('" + base64Variant.h + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            strO = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            strO = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            strO = b.o(strO, ": ", str);
        }
        return new IllegalArgumentException(strO);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final double A() throws JsonParseException, InputCoercionException {
        int i = this.G;
        if ((i & 8) == 0) {
            if (i == 0) {
                Q2(8);
            }
            int i2 = this.G;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.K = L2().doubleValue();
                } else if ((i2 & 4) != 0) {
                    this.K = M2().doubleValue();
                } else if ((i2 & 2) != 0) {
                    this.K = this.I;
                } else if ((i2 & 1) != 0) {
                    this.K = this.H;
                } else {
                    if ((i2 & 32) == 0) {
                        VersionUtil.c();
                        throw null;
                    }
                    this.K = this.J;
                }
                this.G |= 8;
            }
        }
        return this.K;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean C1() {
        if (this.f != JsonToken.VALUE_NUMBER_FLOAT || (this.G & 8) == 0) {
            return false;
        }
        double d = this.K;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final float F() throws JsonParseException, InputCoercionException {
        int i = this.G;
        if ((i & 32) == 0) {
            if (i == 0) {
                Q2(32);
            }
            int i2 = this.G;
            if ((i2 & 32) == 0) {
                if ((i2 & 16) != 0) {
                    this.J = L2().floatValue();
                } else if ((i2 & 4) != 0) {
                    this.J = M2().floatValue();
                } else if ((i2 & 2) != 0) {
                    this.J = this.I;
                } else if ((i2 & 1) != 0) {
                    this.J = this.H;
                } else {
                    if ((i2 & 8) == 0) {
                        VersionUtil.c();
                        throw null;
                    }
                    this.J = (float) this.K;
                }
                this.G |= 32;
            }
        }
        return this.J;
    }

    public abstract void G2();

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int H() throws InputCoercionException {
        int i = this.G;
        if ((i & 1) == 0) {
            if (i == 0) {
                return P2();
            }
            if ((i & 1) == 0) {
                V2();
            }
        }
        return this.H;
    }

    public final ContentReference H2() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.a(this.d) ? this.p.f14197a : ContentReference.h;
    }

    public final int I2(Base64Variant base64Variant, char c, int i) {
        if (c != '\\') {
            throw X2(base64Variant, c, i, null);
        }
        char cK2 = K2();
        if (cK2 <= ' ' && i == 0) {
            return -1;
        }
        int iC = base64Variant.c(cK2);
        if (iC >= 0 || (iC == -2 && i >= 2)) {
            return iC;
        }
        throw X2(base64Variant, cK2, i, null);
    }

    public final int J2(Base64Variant base64Variant, int i, int i2) {
        if (i != 92) {
            throw X2(base64Variant, i, i2, null);
        }
        char cK2 = K2();
        if (cK2 <= ' ' && i2 == 0) {
            return -1;
        }
        int iD = base64Variant.d(cK2);
        if (iD >= 0 || iD == -2) {
            return iD;
        }
        throw X2(base64Variant, cK2, i2, null);
    }

    public char K2() {
        throw new UnsupportedOperationException();
    }

    public final BigDecimal L2() {
        BigDecimal bigDecimal = this.M;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.N;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        String str2 = NumberInput.f14199a;
        BigDecimal bigDecimalA = BigDecimalParser.a(str);
        this.M = bigDecimalA;
        this.N = null;
        return bigDecimalA;
    }

    public final BigInteger M2() {
        BigInteger bigInteger = this.L;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.N;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        BigInteger bigIntegerB = NumberInput.b(str);
        this.L = bigIntegerB;
        this.N = null;
        return bigIntegerB;
    }

    public final ByteArrayBuilder N2() {
        ByteArrayBuilder byteArrayBuilder = this.E;
        if (byteArrayBuilder == null) {
            this.E = new ByteArrayBuilder(null);
        } else {
            byteArrayBuilder.reset();
        }
        return this.E;
    }

    public final void O2(char c) throws JsonParseException {
        if (JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.a(this.d)) {
            return;
        }
        if (c == '\'' && JsonParser.Feature.ALLOW_SINGLE_QUOTES.a(this.d)) {
            return;
        }
        throw new JsonParseException(this, "Unrecognized character escape " + ParserMinimalBase.Y1(c));
    }

    public final int P2() throws JsonParseException, InputCoercionException {
        if (this.q) {
            throw new JsonParseException(this, "Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f != JsonToken.VALUE_NUMBER_INT || this.P > 9) {
            Q2(1);
            if ((this.G & 1) == 0) {
                V2();
            }
            return this.H;
        }
        int iF = this.B.f(this.O);
        this.H = iF;
        this.G = 1;
        return iF;
    }

    public final void Q2(int i) throws JsonParseException, InputCoercionException {
        long jG;
        long jG2;
        char[] cArr;
        if (this.q) {
            throw new JsonParseException(this, "Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        TextBuffer textBuffer = this.B;
        if (jsonToken != jsonToken2) {
            if (jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
                f2(jsonToken, "Current token (%s) not numeric, can not use numeric value accessors");
                throw null;
            }
            try {
                if (i == 16) {
                    this.M = null;
                    this.N = textBuffer.g();
                    this.G = 16;
                    return;
                } else {
                    if (i != 32) {
                        this.K = NumberInput.c(textBuffer.g(), JsonParser.Feature.USE_FAST_DOUBLE_PARSER.a(this.d));
                        this.G = 8;
                        return;
                    }
                    boolean zA = JsonParser.Feature.USE_FAST_DOUBLE_PARSER.a(this.d);
                    String strG = textBuffer.g();
                    String str = NumberInput.f14199a;
                    this.J = zA ? FastFloatParser.a(strG) : Float.parseFloat(strG);
                    this.G = 32;
                    return;
                }
            } catch (NumberFormatException e) {
                JsonParseException jsonParseException = new JsonParseException("Malformed numeric value (" + ParserMinimalBase.e2(textBuffer.g()) + ")", l(), e);
                jsonParseException.e = this;
                throw jsonParseException;
            }
        }
        int i2 = this.P;
        if (i2 <= 9) {
            this.H = textBuffer.f(this.O);
            this.G = 1;
            return;
        }
        int i3 = 0;
        if (i2 <= 18) {
            boolean z = this.O;
            int i4 = textBuffer.c;
            if (i4 < 0 || (cArr = textBuffer.b) == null) {
                if (z) {
                    jG2 = NumberInput.g(textBuffer.h, 1, textBuffer.i - 1);
                    jG = -jG2;
                } else {
                    jG = NumberInput.g(textBuffer.h, 0, textBuffer.i);
                }
            } else if (z) {
                jG2 = NumberInput.g(cArr, i4 + 1, textBuffer.d - 1);
                jG = -jG2;
            } else {
                jG = NumberInput.g(cArr, i4, textBuffer.d);
            }
            if (i2 == 10) {
                if (this.O) {
                    if (jG >= -2147483648L) {
                        this.H = (int) jG;
                        this.G = 1;
                        return;
                    }
                } else if (jG <= 2147483647L) {
                    this.H = (int) jG;
                    this.G = 1;
                    return;
                }
            }
            this.I = jG;
            this.G = 2;
            return;
        }
        String strG2 = textBuffer.g();
        try {
            int i5 = this.P;
            char[] cArrM = textBuffer.m();
            int iN = textBuffer.n();
            boolean z2 = this.O;
            if (z2) {
                iN++;
            }
            String str2 = z2 ? NumberInput.f14199a : NumberInput.b;
            int length = str2.length();
            if (i5 >= length) {
                if (i5 <= length) {
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int iCharAt = cArrM[iN + i3] - str2.charAt(i3);
                        if (iCharAt == 0) {
                            i3++;
                        } else if (iCharAt < 0) {
                        }
                    }
                }
                if (i != 1 && i != 2) {
                    if (i != 8 && i != 32) {
                        this.L = null;
                        this.N = strG2;
                        this.G = 4;
                        return;
                    }
                    this.K = NumberInput.c(strG2, JsonParser.Feature.USE_FAST_DOUBLE_PARSER.a(this.d));
                    this.G = 8;
                    return;
                }
                if (i == 1) {
                    throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", ParserMinimalBase.d2(strG2), Integer.MIN_VALUE, Integer.MAX_VALUE));
                }
                F2(strG2);
                throw null;
            }
            this.I = Long.parseLong(strG2);
            this.G = 2;
        } catch (NumberFormatException e2) {
            JsonParseException jsonParseException2 = new JsonParseException("Malformed numeric value (" + ParserMinimalBase.e2(strG2) + ")", l(), e2);
            jsonParseException2.e = this;
            throw jsonParseException2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long R() throws JsonParseException, InputCoercionException {
        int i = this.G;
        if ((i & 2) == 0) {
            if (i == 0) {
                Q2(2);
            }
            int i2 = this.G;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.I = this.H;
                } else if ((i2 & 4) != 0) {
                    BigInteger bigIntegerM2 = M2();
                    if (ParserMinimalBase.j.compareTo(bigIntegerM2) > 0 || ParserMinimalBase.k.compareTo(bigIntegerM2) < 0) {
                        E2();
                        throw null;
                    }
                    this.I = bigIntegerM2.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.K;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        E2();
                        throw null;
                    }
                    this.I = (long) d;
                } else {
                    if ((i2 & 16) == 0) {
                        VersionUtil.c();
                        throw null;
                    }
                    BigDecimal bigDecimalL2 = L2();
                    if (ParserMinimalBase.l.compareTo(bigDecimalL2) > 0 || ParserMinimalBase.m.compareTo(bigDecimalL2) < 0) {
                        E2();
                        throw null;
                    }
                    this.I = bigDecimalL2.longValue();
                }
                this.G |= 2;
            }
        }
        return this.I;
    }

    public void R2() {
        this.B.o();
        char[] cArr = this.C;
        if (cArr != null) {
            this.C = null;
            IOContext iOContext = this.p;
            char[] cArr2 = iOContext.k;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            iOContext.k = null;
            iOContext.e.b.set(3, cArr);
        }
    }

    public final void S2(char c, int i) throws JsonParseException {
        JsonReadContext jsonReadContext = this.z;
        throw new JsonParseException(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), jsonReadContext.h(), new JsonLocation(H2(), -1L, -1L, jsonReadContext.h, jsonReadContext.i)));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType T() throws JsonParseException, InputCoercionException {
        if (this.G == 0) {
            Q2(0);
        }
        if (this.f == JsonToken.VALUE_NUMBER_INT) {
            int i = this.G;
            return (i & 1) != 0 ? JsonParser.NumberType.d : (i & 2) != 0 ? JsonParser.NumberType.e : JsonParser.NumberType.f;
        }
        int i2 = this.G;
        return (i2 & 16) != 0 ? JsonParser.NumberType.i : (i2 & 32) != 0 ? JsonParser.NumberType.g : JsonParser.NumberType.h;
    }

    public final void T2(int i, String str) throws JsonParseException {
        if (!JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.d) || i > 32) {
            throw new JsonParseException(this, "Illegal unquoted character (" + ParserMinimalBase.Y1((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number U() throws JsonParseException, InputCoercionException {
        if (this.G == 0) {
            Q2(0);
        }
        if (this.f == JsonToken.VALUE_NUMBER_INT) {
            int i = this.G;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.H);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.I);
            }
            if ((i & 4) != 0) {
                return M2();
            }
            VersionUtil.c();
            throw null;
        }
        int i2 = this.G;
        if ((i2 & 16) != 0) {
            return L2();
        }
        if ((i2 & 32) != 0) {
            return Float.valueOf(this.J);
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(this.K);
        }
        VersionUtil.c();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final void U1(Object obj) {
        this.z.g = obj;
    }

    public final String U2() {
        return JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.a(this.d) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void V2() throws InputCoercionException {
        int i = this.G;
        if ((i & 2) != 0) {
            long j = this.I;
            int i2 = (int) j;
            if (i2 != j) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", ParserMinimalBase.d2(k0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.H = i2;
        } else if ((i & 4) != 0) {
            BigInteger bigIntegerM2 = M2();
            if (ParserMinimalBase.h.compareTo(bigIntegerM2) > 0 || ParserMinimalBase.i.compareTo(bigIntegerM2) < 0) {
                D2();
                throw null;
            }
            this.H = bigIntegerM2.intValue();
        } else if ((i & 8) != 0) {
            double d = this.K;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                D2();
                throw null;
            }
            this.H = (int) d;
        } else {
            if ((i & 16) == 0) {
                VersionUtil.c();
                throw null;
            }
            BigDecimal bigDecimalL2 = L2();
            if (ParserMinimalBase.n.compareTo(bigDecimalL2) > 0 || ParserMinimalBase.o.compareTo(bigDecimalL2) < 0) {
                D2();
                throw null;
            }
            this.H = bigDecimalL2.intValue();
        }
        this.G |= 1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean W0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.D;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number Y() throws JsonParseException, InputCoercionException {
        if (this.f == JsonToken.VALUE_NUMBER_INT) {
            if (this.G == 0) {
                Q2(0);
            }
            int i = this.G;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.H);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.I);
            }
            if ((i & 4) != 0) {
                return M2();
            }
            VersionUtil.c();
            throw null;
        }
        if (this.G == 0) {
            Q2(16);
        }
        int i2 = this.G;
        if ((i2 & 16) != 0) {
            return L2();
        }
        if ((i2 & 32) != 0) {
            return Float.valueOf(this.J);
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(this.K);
        }
        VersionUtil.c();
        throw null;
    }

    public final JsonToken Y2(double d, String str) {
        TextBuffer textBuffer = this.B;
        textBuffer.b = null;
        textBuffer.c = -1;
        textBuffer.d = 0;
        textBuffer.j = str;
        textBuffer.k = null;
        if (textBuffer.f) {
            textBuffer.d();
        }
        textBuffer.i = 0;
        this.K = d;
        this.G = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken Z2(int i, int i2, int i3, boolean z) {
        this.O = z;
        this.P = i;
        this.G = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken a3(int i, boolean z) {
        this.O = z;
        this.P = i;
        this.G = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonStreamContext b0() {
        return this.z;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public final void b2() {
        if (this.z.f()) {
            return;
        }
        String str = this.z.d() ? "Array" : "Object";
        JsonReadContext jsonReadContext = this.z;
        ContentReference contentReferenceH2 = H2();
        jsonReadContext.getClass();
        k2(String.format(": expected close marker for %s (start marker at %s)", str, new JsonLocation(contentReferenceH2, -1L, -1L, jsonReadContext.h, jsonReadContext.i)));
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.q) {
            return;
        }
        this.r = Math.max(this.r, this.s);
        this.q = true;
        try {
            G2();
        } finally {
            R2();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigInteger g() throws JsonParseException, InputCoercionException {
        int i = this.G;
        if ((i & 4) == 0) {
            if (i == 0) {
                Q2(4);
            }
            int i2 = this.G;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.L = L2().toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.L = BigInteger.valueOf(this.I);
                } else if ((i2 & 1) != 0) {
                    this.L = BigInteger.valueOf(this.H);
                } else {
                    if ((i2 & 8) == 0) {
                        VersionUtil.c();
                        throw null;
                    }
                    this.L = BigDecimal.valueOf(this.K).toBigInteger();
                }
                this.G |= 4;
            }
        }
        return M2();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] h(Base64Variant base64Variant) throws JsonParseException {
        if (this.F == null) {
            if (this.f != JsonToken.VALUE_STRING) {
                throw new JsonParseException(this, "Current token (" + this.f + ") not VALUE_STRING, can not access as binary");
            }
            ByteArrayBuilder byteArrayBuilderN2 = N2();
            W1(k0(), byteArrayBuilderN2, base64Variant);
            this.F = byteArrayBuilderN2.e();
        }
        return this.F;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation l() {
        return new JsonLocation(H2(), -1L, this.r + this.t, this.u, (this.r - this.v) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String p() {
        JsonReadContext jsonReadContext;
        JsonToken jsonToken = this.f;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (jsonReadContext = this.z.c) != null) ? jsonReadContext.f : this.z.f;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigDecimal x() throws JsonParseException, InputCoercionException {
        int i = this.G;
        if ((i & 16) == 0) {
            if (i == 0) {
                Q2(16);
            }
            int i2 = this.G;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String strK0 = k0();
                    String str = NumberInput.f14199a;
                    this.M = BigDecimalParser.a(strK0);
                } else if ((i2 & 4) != 0) {
                    this.M = new BigDecimal(M2());
                } else if ((i2 & 2) != 0) {
                    this.M = BigDecimal.valueOf(this.I);
                } else {
                    if ((i2 & 1) == 0) {
                        VersionUtil.c();
                        throw null;
                    }
                    this.M = BigDecimal.valueOf(this.H);
                }
                this.G |= 16;
            }
        }
        return L2();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation z0() {
        ContentReference contentReferenceH2 = H2();
        long j = this.w;
        int i = this.x;
        int i2 = this.y;
        if (i2 >= 0) {
            i2++;
        }
        return new JsonLocation(contentReferenceH2, -1L, j, i, i2);
    }
}

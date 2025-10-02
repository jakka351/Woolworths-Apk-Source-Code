package com.fasterxml.jackson.core.base;

import YU.a;
import androidx.camera.core.impl.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class ParserMinimalBase extends JsonParser {
    public static final byte[] g = new byte[0];
    public static final BigInteger h;
    public static final BigInteger i;
    public static final BigInteger j;
    public static final BigInteger k;
    public static final BigDecimal l;
    public static final BigDecimal m;
    public static final BigDecimal n;
    public static final BigDecimal o;
    public JsonToken f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        h = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        i = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        j = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        k = bigIntegerValueOf4;
        l = new BigDecimal(bigIntegerValueOf3);
        m = new BigDecimal(bigIntegerValueOf4);
        n = new BigDecimal(bigIntegerValueOf);
        o = new BigDecimal(bigIntegerValueOf2);
    }

    public ParserMinimalBase(int i2) {
        this.d = i2;
    }

    public static final String Y1(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return a.e(i2, "(CTRL-CHAR, code ", ")");
        }
        if (i2 <= 255) {
            return "'" + c + "' (code " + i2 + ")";
        }
        return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    public static String d2(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String e2(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void B2(int i2) throws JsonParseException {
        throw new JsonParseException(this, "Illegal character (" + Y1((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void C2() throws JsonParseException {
        throw new JsonParseException(this, "Invalid numeric value: Leading zeroes not allowed");
    }

    public final void D2() {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", d2(k0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public final void E2() {
        F2(k0());
        throw null;
    }

    public final void F2(String str) {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", d2(str), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int G0() {
        JsonToken jsonToken = this.f;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? H() : H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int H0() {
        /*
            r6 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.f
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            if (r0 == r1) goto L7f
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            if (r0 != r1) goto Lc
            goto L7f
        Lc:
            r1 = 0
            if (r0 == 0) goto L7e
            int r0 = r0.g
            r2 = 6
            r3 = 1
            if (r0 == r2) goto L2e
            r2 = 9
            if (r0 == r2) goto L2d
            r2 = 12
            if (r0 == r2) goto L1e
            goto L7e
        L1e:
            java.lang.Object r0 = r6.C()
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L7e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L2d:
            return r3
        L2e:
            java.lang.String r0 = r6.k0()
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3b
            return r1
        L3b:
            java.lang.String r2 = com.fasterxml.jackson.core.io.NumberInput.f14199a
            if (r0 != 0) goto L40
            goto L7e
        L40:
            java.lang.String r0 = r0.trim()
            int r2 = r0.length()
            if (r2 != 0) goto L4b
            goto L7e
        L4b:
            char r4 = r0.charAt(r1)
            r5 = 43
            if (r4 != r5) goto L5d
            java.lang.String r0 = r0.substring(r3)
            int r2 = r0.length()
        L5b:
            r3 = r1
            goto L61
        L5d:
            r5 = 45
            if (r4 != r5) goto L5b
        L61:
            if (r3 >= r2) goto L79
            char r4 = r0.charAt(r3)
            r5 = 57
            if (r4 > r5) goto L73
            r5 = 48
            if (r4 >= r5) goto L70
            goto L73
        L70:
            int r3 = r3 + 1
            goto L61
        L73:
            double r0 = com.fasterxml.jackson.core.io.doubleparser.FastDoubleParser.a(r0)     // Catch: java.lang.NumberFormatException -> L7e
            int r0 = (int) r0     // Catch: java.lang.NumberFormatException -> L7e
            return r0
        L79:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7e
            return r0
        L7e:
            return r1
        L7f:
            int r0 = r6.H()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.base.ParserMinimalBase.H0():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long O0() {
        JsonToken jsonToken = this.f;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? R() : P0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long P0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return R();
        }
        if (jsonToken != null) {
            int i2 = jsonToken.g;
            if (i2 == 6) {
                String strK0 = k0();
                if ("null".equals(strK0)) {
                    return 0L;
                }
                return NumberInput.a(strK0);
            }
            if (i2 == 9) {
                return 1L;
            }
            if (i2 == 12) {
                Object objC = C();
                if (objC instanceof Number) {
                    return ((Number) objC).longValue();
                }
            }
        }
        return 0L;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String T0() {
        return V0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String V0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return k0();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return p();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.k) {
            return null;
        }
        return k0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser V1() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i2 = 1;
            while (true) {
                JsonToken jsonTokenN1 = N1();
                if (jsonTokenN1 == null) {
                    b2();
                    return this;
                }
                if (jsonTokenN1.h) {
                    i2++;
                } else if (jsonTokenN1.i) {
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                } else if (jsonTokenN1 == JsonToken.NOT_AVAILABLE) {
                    f2(getClass().getName(), "Not enough content available for `skipChildren()`: non-blocking parser? (%s)");
                    throw null;
                }
            }
        }
        return this;
    }

    public final void W1(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
        try {
            base64Variant.b(str, byteArrayBuilder);
        } catch (IllegalArgumentException e) {
            throw new JsonParseException(this, e.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean a1(JsonToken jsonToken) {
        return this.f == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean b1() {
        JsonToken jsonToken = this.f;
        return jsonToken != null && jsonToken.g == 5;
    }

    public abstract void b2();

    @Override // com.fasterxml.jackson.core.JsonParser
    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken e() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int f() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.g;
    }

    public final void f2(Object obj, String str) {
        throw new JsonParseException(this, String.format(str, obj));
    }

    public final void g2() {
        k2(" in " + this.f);
        throw null;
    }

    public final void k2(String str) {
        throw new JsonEOFException(this, a.A("Unexpected end-of-input", str));
    }

    public final void m2(JsonToken jsonToken) {
        k2(jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String p() {
        return d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean p1() {
        return this.f == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken r() {
        return this.f;
    }

    public final void u2(int i2, String str) throws JsonParseException {
        if (i2 < 0) {
            g2();
            throw null;
        }
        String strH = a.h("Unexpected character (", Y1(i2), ")");
        if (str != null) {
            strH = b.o(strH, ": ", str);
        }
        throw new JsonParseException(this, strH);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int v() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.g;
    }

    public final void w2(int i2, String str) throws JsonParseException {
        throw new JsonParseException(this, b.o(a.h("Unexpected character (", Y1(i2), ") in numeric value"), ": ", str));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean x1() {
        return this.f == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean y1() {
        return this.f == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation z0() {
        return l();
    }
}

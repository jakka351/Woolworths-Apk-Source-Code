package com.fasterxml.jackson.databind.util;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class TokenBuffer extends JsonGenerator {
    public static final int s = JsonGenerator.Feature.a();
    public ObjectCodec e;
    public JsonStreamContext f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Segment l;
    public Segment m;
    public int n;
    public Object o;
    public Object p;
    public boolean q;
    public JsonWriteContext r;

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14339a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f14339a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14339a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14339a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14339a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14339a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14339a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14339a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14339a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14339a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14339a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14339a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14339a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class Parser extends ParserMinimalBase {
        public final ObjectCodec p;
        public final boolean q;
        public final boolean r;
        public Segment s;
        public TokenBufferReadContext u;
        public boolean v;
        public transient ByteArrayBuilder w;
        public JsonLocation x = null;
        public int t = -1;

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            this.s = segment;
            this.p = objectCodec;
            this.u = jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext);
            this.q = z;
            this.r = z2;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final double A() {
            return U().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object B0() {
            Segment segment = this.s;
            int i = this.t;
            TreeMap treeMap = segment.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object C() {
            if (this.f == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return G2();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean C1() {
            if (this.f == JsonToken.VALUE_NUMBER_FLOAT) {
                Object objG2 = G2();
                if (objG2 instanceof Double) {
                    Double d = (Double) objG2;
                    return d.isNaN() || d.isInfinite();
                }
                if (objG2 instanceof Float) {
                    Float f = (Float) objG2;
                    return f.isNaN() || f.isInfinite();
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final float F() {
            return U().floatValue();
        }

        public final Object G2() {
            Segment segment = this.s;
            return segment.c[this.t];
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int H() {
            Number numberU = this.f == JsonToken.VALUE_NUMBER_INT ? (Number) G2() : U();
            if ((numberU instanceof Integer) || (numberU instanceof Short) || (numberU instanceof Byte)) {
                return numberU.intValue();
            }
            if (numberU instanceof Long) {
                long jLongValue = numberU.longValue();
                int i = (int) jLongValue;
                if (i == jLongValue) {
                    return i;
                }
                D2();
                throw null;
            }
            if (numberU instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberU;
                if (ParserMinimalBase.h.compareTo(bigInteger) > 0 || ParserMinimalBase.i.compareTo(bigInteger) < 0) {
                    D2();
                    throw null;
                }
            } else {
                if ((numberU instanceof Double) || (numberU instanceof Float)) {
                    double dDoubleValue = numberU.doubleValue();
                    if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                        return (int) dDoubleValue;
                    }
                    D2();
                    throw null;
                }
                if (!(numberU instanceof BigDecimal)) {
                    VersionUtil.c();
                    throw null;
                }
                BigDecimal bigDecimal = (BigDecimal) numberU;
                if (ParserMinimalBase.n.compareTo(bigDecimal) > 0 || ParserMinimalBase.o.compareTo(bigDecimal) < 0) {
                    D2();
                    throw null;
                }
            }
            return numberU.intValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String J1() {
            Segment segment;
            if (this.v || (segment = this.s) == null) {
                return null;
            }
            int i = this.t + 1;
            if (i < 16) {
                JsonToken jsonTokenD = segment.d(i);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenD == jsonToken) {
                    this.t = i;
                    this.f = jsonToken;
                    String str = this.s.c[i];
                    String string = str instanceof String ? str : str.toString();
                    this.u.e = string;
                    return string;
                }
            }
            if (N1() == JsonToken.FIELD_NAME) {
                return d();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonToken N1() {
            Segment segment;
            if (this.v || (segment = this.s) == null) {
                return null;
            }
            int i = this.t + 1;
            this.t = i;
            if (i >= 16) {
                this.t = 0;
                Segment segment2 = segment.f14340a;
                this.s = segment2;
                if (segment2 == null) {
                    return null;
                }
            }
            JsonToken jsonTokenD = this.s.d(this.t);
            this.f = jsonTokenD;
            if (jsonTokenD == JsonToken.FIELD_NAME) {
                Object objG2 = G2();
                this.u.e = objG2 instanceof String ? (String) objG2 : objG2.toString();
            } else if (jsonTokenD == JsonToken.START_OBJECT) {
                TokenBufferReadContext tokenBufferReadContext = this.u;
                tokenBufferReadContext.b++;
                this.u = new TokenBufferReadContext(tokenBufferReadContext, 2);
            } else if (jsonTokenD == JsonToken.START_ARRAY) {
                TokenBufferReadContext tokenBufferReadContext2 = this.u;
                tokenBufferReadContext2.b++;
                this.u = new TokenBufferReadContext(tokenBufferReadContext2, 1);
            } else if (jsonTokenD == JsonToken.END_OBJECT || jsonTokenD == JsonToken.END_ARRAY) {
                TokenBufferReadContext tokenBufferReadContext3 = this.u;
                JsonStreamContext jsonStreamContext = tokenBufferReadContext3.c;
                this.u = jsonStreamContext instanceof TokenBufferReadContext ? (TokenBufferReadContext) jsonStreamContext : jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, tokenBufferReadContext3.d);
            } else {
                this.u.b++;
            }
            return this.f;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) throws JsonParseException {
            byte[] bArrH = h(base64Variant);
            if (bArrH == null) {
                return 0;
            }
            byteBufferBackedOutputStream.write(bArrH, 0, bArrH.length);
            return bArrH.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final long R() {
            Number numberU = this.f == JsonToken.VALUE_NUMBER_INT ? (Number) G2() : U();
            if ((numberU instanceof Long) || (numberU instanceof Integer) || (numberU instanceof Short) || (numberU instanceof Byte)) {
                return numberU.longValue();
            }
            if (numberU instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberU;
                if (ParserMinimalBase.j.compareTo(bigInteger) > 0 || ParserMinimalBase.k.compareTo(bigInteger) < 0) {
                    E2();
                    throw null;
                }
            } else {
                if ((numberU instanceof Double) || (numberU instanceof Float)) {
                    double dDoubleValue = numberU.doubleValue();
                    if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
                        return (long) dDoubleValue;
                    }
                    E2();
                    throw null;
                }
                if (!(numberU instanceof BigDecimal)) {
                    VersionUtil.c();
                    throw null;
                }
                BigDecimal bigDecimal = (BigDecimal) numberU;
                if (ParserMinimalBase.l.compareTo(bigDecimal) > 0 || ParserMinimalBase.m.compareTo(bigDecimal) < 0) {
                    E2();
                    throw null;
                }
            }
            return numberU.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonParser.NumberType T() throws JsonParseException {
            Number numberU = U();
            boolean z = numberU instanceof Integer;
            JsonParser.NumberType numberType = JsonParser.NumberType.d;
            if (z) {
                return numberType;
            }
            if (numberU instanceof Long) {
                return JsonParser.NumberType.e;
            }
            if (numberU instanceof Double) {
                return JsonParser.NumberType.h;
            }
            if (numberU instanceof BigDecimal) {
                return JsonParser.NumberType.i;
            }
            if (numberU instanceof BigInteger) {
                return JsonParser.NumberType.f;
            }
            if (numberU instanceof Float) {
                return JsonParser.NumberType.g;
            }
            if (numberU instanceof Short) {
                return numberType;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number U() throws JsonParseException {
            JsonToken jsonToken = this.f;
            if (jsonToken == null || !jsonToken.j) {
                throw new JsonParseException(this, "Current token (" + this.f + ") not numeric, cannot use numeric value accessors");
            }
            Object objG2 = G2();
            if (objG2 instanceof Number) {
                return (Number) objG2;
            }
            if (objG2 instanceof String) {
                String str = (String) objG2;
                return str.indexOf(46) >= 0 ? Double.valueOf(NumberInput.c(str, m1(StreamReadFeature.USE_FAST_DOUBLE_PARSER))) : Long.valueOf(NumberInput.f(str));
            }
            if (objG2 == null) {
                return null;
            }
            throw new IllegalStateException(a.g(objG2, "Internal error: entry should be a Number, but is of type "));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean W0() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Object Z() {
            return this.s.c(this.t);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean a() {
            return this.r;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final boolean b() {
            return this.q;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonStreamContext b0() {
            return this.u;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public final void b2() {
            VersionUtil.c();
            throw null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.v) {
                return;
            }
            this.v = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String d() {
            JsonToken jsonToken = this.f;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this.u.c.a() : this.u.e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JacksonFeatureSet d0() {
            return JsonParser.e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final BigInteger g() throws JsonParseException {
            Number numberU = U();
            return numberU instanceof BigInteger ? (BigInteger) numberU : T() == JsonParser.NumberType.i ? ((BigDecimal) numberU).toBigInteger() : BigInteger.valueOf(numberU.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final byte[] h(Base64Variant base64Variant) throws JsonParseException {
            if (this.f == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objG2 = G2();
                if (objG2 instanceof byte[]) {
                    return (byte[]) objG2;
                }
            }
            if (this.f != JsonToken.VALUE_STRING) {
                throw new JsonParseException(this, "Current token (" + this.f + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strK0 = k0();
            if (strK0 == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this.w;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder((BufferRecycler) null, 100);
                this.w = byteArrayBuilder;
            } else {
                byteArrayBuilder.reset();
            }
            W1(strK0, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.e();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final ObjectCodec k() {
            return this.p;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final String k0() {
            JsonToken jsonToken = this.f;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object objG2 = G2();
                if (objG2 instanceof String) {
                    return (String) objG2;
                }
                Annotation[] annotationArr = ClassUtil.f14330a;
                if (objG2 == null) {
                    return null;
                }
                return objG2.toString();
            }
            if (jsonToken == null) {
                return null;
            }
            int iOrdinal = jsonToken.ordinal();
            if (iOrdinal != 8 && iOrdinal != 9) {
                return this.f.d;
            }
            Object objG22 = G2();
            Annotation[] annotationArr2 = ClassUtil.f14330a;
            if (objG22 == null) {
                return null;
            }
            return objG22.toString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final JsonLocation l() {
            JsonLocation jsonLocation = this.x;
            return jsonLocation == null ? JsonLocation.j : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final char[] m0() {
            String strK0 = k0();
            if (strK0 == null) {
                return null;
            }
            return strK0.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int r0() {
            String strK0 = k0();
            if (strK0 == null) {
                return 0;
            }
            return strK0.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final int t0() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final BigDecimal x() throws JsonParseException {
            Number numberU = U();
            if (numberU instanceof BigDecimal) {
                return (BigDecimal) numberU;
            }
            int iOrdinal = T().ordinal();
            return (iOrdinal == 0 || iOrdinal == 1) ? BigDecimal.valueOf(numberU.longValue()) : iOrdinal != 2 ? BigDecimal.valueOf(numberU.doubleValue()) : new BigDecimal((BigInteger) numberU);
        }
    }

    public static final class Segment {
        public static final JsonToken[] e;

        /* renamed from: a, reason: collision with root package name */
        public Segment f14340a;
        public long b;
        public final Object[] c = new Object[16];
        public TreeMap d;

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            e = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        public final Segment a(int i, JsonToken jsonToken) {
            if (i >= 16) {
                Segment segment = new Segment();
                this.f14340a = segment;
                segment.b = jsonToken.ordinal() | segment.b;
                return this.f14340a;
            }
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.b |= jOrdinal;
            return null;
        }

        public final void b(int i, Object obj, Object obj2) {
            if (this.d == null) {
                this.d = new TreeMap();
            }
            if (obj != null) {
                this.d.put(Integer.valueOf(i + i + 1), obj);
            }
            if (obj2 != null) {
                this.d.put(Integer.valueOf(i + i), obj2);
            }
        }

        public final Object c(int i) {
            TreeMap treeMap = this.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i + 1));
        }

        public final JsonToken d(int i) {
            long j = this.b;
            if (i > 0) {
                j >>= i << 2;
            }
            return e[((int) j) & 15];
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A(boolean z) {
        Y1(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void C(Object obj) {
        b2(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void C1(SerializableString serializableString) {
        if (serializableString == null) {
            Y();
        } else {
            b2(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void F() {
        Segment segmentA = this.m.a(this.n, JsonToken.END_ARRAY);
        if (segmentA == null) {
            this.n++;
        } else {
            this.m = segmentA;
            this.n = 1;
        }
        JsonWriteContext jsonWriteContext = this.r.c;
        if (jsonWriteContext != null) {
            this.r = jsonWriteContext;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G0(char c) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() {
        Segment segmentA = this.m.a(this.n, JsonToken.END_OBJECT);
        if (segmentA == null) {
            this.n++;
        } else {
            this.m = segmentA;
            this.n = 1;
        }
        JsonWriteContext jsonWriteContext = this.r.c;
        if (jsonWriteContext != null) {
            this.r = jsonWriteContext;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H0(SerializableString serializableString) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J1(String str) {
        if (str == null) {
            Y();
        } else {
            b2(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void K1(char[] cArr, int i, int i2) {
        J1(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N1(Object obj) {
        this.o = obj;
        this.q = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O0(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P0(char[] cArr, int i) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void T(SerializableString serializableString) {
        this.r.m(serializableString.getValue());
        U1(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(String str) {
        this.r.m(str);
        U1(str);
    }

    public final void U1(Object obj) {
        Segment segment = null;
        if (this.q) {
            Segment segment2 = this.m;
            int i = this.n;
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            Object obj2 = this.p;
            Object obj3 = this.o;
            if (i < 16) {
                segment2.c[i] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                segment2.b = jOrdinal | segment2.b;
                segment2.b(i, obj2, obj3);
            } else {
                segment2.getClass();
                Segment segment3 = new Segment();
                segment2.f14340a = segment3;
                segment3.c[0] = obj;
                segment3.b = jsonToken.ordinal() | segment3.b;
                segment3.b(0, obj2, obj3);
                segment = segment2.f14340a;
            }
        } else {
            Segment segment4 = this.m;
            int i2 = this.n;
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (i2 < 16) {
                segment4.c[i2] = obj;
                long jOrdinal2 = jsonToken2.ordinal();
                if (i2 > 0) {
                    jOrdinal2 <<= i2 << 2;
                }
                segment4.b |= jOrdinal2;
            } else {
                segment4.getClass();
                Segment segment5 = new Segment();
                segment4.f14340a = segment5;
                segment5.c[0] = obj;
                segment5.b = jsonToken2.ordinal() | segment5.b;
                segment = segment4.f14340a;
            }
        }
        if (segment == null) {
            this.n++;
        } else {
            this.m = segment;
            this.n = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V0(String str) {
        JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        RawValue rawValue = new RawValue();
        rawValue.d = str;
        b2(jsonToken, rawValue);
    }

    public final void V1(StringBuilder sb) {
        Object objC = this.m.c(this.n - 1);
        if (objC != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(objC));
            sb.append(']');
        }
        Segment segment = this.m;
        int i = this.n - 1;
        TreeMap treeMap = segment.d;
        Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i + i));
        if (obj != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(obj));
            sb.append(']');
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void W0() {
        this.r.n();
        W1(JsonToken.START_ARRAY);
        this.r = this.r.i();
    }

    public final void W1(JsonToken jsonToken) {
        Segment segmentA;
        if (this.q) {
            Segment segment = this.m;
            int i = this.n;
            Object obj = this.p;
            Object obj2 = this.o;
            segment.getClass();
            if (i < 16) {
                long jOrdinal = jsonToken.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                segment.b = jOrdinal | segment.b;
                segment.b(i, obj, obj2);
                segmentA = null;
            } else {
                Segment segment2 = new Segment();
                segment.f14340a = segment2;
                segment2.b = jsonToken.ordinal() | segment2.b;
                segment2.b(0, obj, obj2);
                segmentA = segment.f14340a;
            }
        } else {
            segmentA = this.m.a(this.n, jsonToken);
        }
        if (segmentA == null) {
            this.n++;
        } else {
            this.m = segmentA;
            this.n = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Y() {
        Y1(JsonToken.VALUE_NULL);
    }

    public final void Y1(JsonToken jsonToken) {
        Segment segmentA;
        this.r.n();
        if (this.q) {
            Segment segment = this.m;
            int i = this.n;
            Object obj = this.p;
            Object obj2 = this.o;
            segment.getClass();
            if (i < 16) {
                long jOrdinal = jsonToken.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                segment.b = jOrdinal | segment.b;
                segment.b(i, obj, obj2);
                segmentA = null;
            } else {
                Segment segment2 = new Segment();
                segment.f14340a = segment2;
                segment2.b = jsonToken.ordinal() | segment2.b;
                segment2.b(0, obj, obj2);
                segmentA = segment.f14340a;
            }
        } else {
            segmentA = this.m.a(this.n, jsonToken);
        }
        if (segmentA == null) {
            this.n++;
        } else {
            this.m = segmentA;
            this.n = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Z(double d) {
        b2(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a1(int i, Object obj) {
        this.r.n();
        W1(JsonToken.START_ARRAY);
        this.r = this.r.j(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b0(float f) {
        b2(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b1(Object obj) {
        this.r.n();
        W1(JsonToken.START_ARRAY);
        this.r = this.r.j(obj);
    }

    public final void b2(JsonToken jsonToken, Object obj) {
        this.r.n();
        Segment segment = null;
        if (this.q) {
            Segment segment2 = this.m;
            int i = this.n;
            Object obj2 = this.p;
            Object obj3 = this.o;
            if (i < 16) {
                segment2.c[i] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i > 0) {
                    jOrdinal <<= i << 2;
                }
                segment2.b = jOrdinal | segment2.b;
                segment2.b(i, obj2, obj3);
            } else {
                segment2.getClass();
                Segment segment3 = new Segment();
                segment2.f14340a = segment3;
                segment3.c[0] = obj;
                segment3.b = jsonToken.ordinal() | segment3.b;
                segment3.b(0, obj2, obj3);
                segment = segment2.f14340a;
            }
        } else {
            Segment segment4 = this.m;
            int i2 = this.n;
            if (i2 < 16) {
                segment4.c[i2] = obj;
                long jOrdinal2 = jsonToken.ordinal();
                if (i2 > 0) {
                    jOrdinal2 <<= i2 << 2;
                }
                segment4.b = jOrdinal2 | segment4.b;
            } else {
                segment4.getClass();
                Segment segment5 = new Segment();
                segment4.f14340a = segment5;
                segment5.c[0] = obj;
                segment5.b = jsonToken.ordinal() | segment5.b;
                segment = segment4.f14340a;
            }
        }
        if (segment == null) {
            this.n++;
        } else {
            this.m = segment;
            this.n = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean d() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void d0(int i) {
        b2(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public final void d2(JsonParser jsonParser) {
        Object objB0 = jsonParser.B0();
        this.o = objB0;
        if (objB0 != null) {
            this.q = true;
        }
        Object objZ = jsonParser.Z();
        this.p = objZ;
        if (objZ != null) {
            this.q = true;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean e() {
        return this.h;
    }

    public final void e2(JsonParser jsonParser) {
        int i = 1;
        while (true) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            if (jsonTokenN1 == null) {
                return;
            }
            int iOrdinal = jsonTokenN1.ordinal();
            if (iOrdinal == 1) {
                if (this.j) {
                    d2(jsonParser);
                }
                p1();
            } else if (iOrdinal == 2) {
                H();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (iOrdinal == 3) {
                if (this.j) {
                    d2(jsonParser);
                }
                W0();
            } else if (iOrdinal == 4) {
                F();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (iOrdinal != 5) {
                f2(jsonParser, jsonTokenN1);
            } else {
                if (this.j) {
                    d2(jsonParser);
                }
                U(jsonParser.d());
            }
            i++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonStreamContext f() {
        return this.r;
    }

    public final void f2(JsonParser jsonParser, JsonToken jsonToken) {
        if (this.j) {
            d2(jsonParser);
        }
        switch (jsonToken.ordinal()) {
            case 6:
                writeObject(jsonParser.C());
                return;
            case 7:
                if (jsonParser.W0()) {
                    K1(jsonParser.m0(), jsonParser.t0(), jsonParser.r0());
                    return;
                } else {
                    J1(jsonParser.k0());
                    return;
                }
            case 8:
                int iOrdinal = jsonParser.T().ordinal();
                if (iOrdinal == 0) {
                    d0(jsonParser.H());
                    return;
                } else if (iOrdinal != 2) {
                    i0(jsonParser.R());
                    return;
                } else {
                    r0(jsonParser.g());
                    return;
                }
            case 9:
                if (this.k) {
                    m0(jsonParser.x());
                    return;
                } else {
                    b2(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.Y());
                    return;
                }
            case 10:
                A(true);
                return;
            case 11:
                A(false);
                return;
            case 12:
                Y();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() {
    }

    public final void g2(TokenBuffer tokenBuffer) {
        if (!this.h) {
            this.h = tokenBuffer.h;
        }
        if (!this.i) {
            this.i = tokenBuffer.i;
        }
        this.j = this.h || this.i;
        Parser parserM2 = tokenBuffer.m2(tokenBuffer.e);
        while (parserM2.N1() != null) {
            u2(parserM2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean h(JsonGenerator.Feature feature) {
        return (feature.e & this.g) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(long j) {
        b2(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k0(String str) {
        b2(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public final Parser k2(JsonParser jsonParser) {
        Parser parser = new Parser(this.l, jsonParser.k(), this.h, this.i, this.f);
        parser.x = jsonParser.z0();
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            Y();
        } else {
            b2(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public final Parser m2(ObjectCodec objectCodec) {
        return new Parser(this.l, objectCodec, this.h, this.i, this.f);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p1() {
        this.r.n();
        W1(JsonToken.START_OBJECT);
        this.r = this.r.k();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r0(BigInteger bigInteger) {
        if (bigInteger == null) {
            Y();
        } else {
            b2(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void t0(short s2) {
        b2(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s2));
    }

    public final String toString() {
        StringBuilder sbS = YU.a.s("[TokenBuffer: ");
        Parser parserM2 = m2(this.e);
        int i = 0;
        boolean z = this.h || this.i;
        while (true) {
            try {
                JsonToken jsonTokenN1 = parserM2.N1();
                if (jsonTokenN1 == null) {
                    break;
                }
                if (z) {
                    V1(sbS);
                }
                if (i < 100) {
                    if (i > 0) {
                        sbS.append(", ");
                    }
                    sbS.append(jsonTokenN1.toString());
                    if (jsonTokenN1 == JsonToken.FIELD_NAME) {
                        sbS.append('(');
                        sbS.append(parserM2.d());
                        sbS.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sbS.append(" ... (truncated ");
            sbS.append(i - 100);
            sbS.append(" entries)");
        }
        sbS.append(']');
        return sbS.toString();
    }

    public final void u2(JsonParser jsonParser) {
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == JsonToken.FIELD_NAME) {
            if (this.j) {
                d2(jsonParser);
            }
            U(jsonParser.d());
            jsonTokenE = jsonParser.N1();
        } else if (jsonTokenE == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int iOrdinal = jsonTokenE.ordinal();
        if (iOrdinal == 1) {
            if (this.j) {
                d2(jsonParser);
            }
            p1();
            e2(jsonParser);
            return;
        }
        if (iOrdinal == 2) {
            H();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                f2(jsonParser, jsonTokenE);
                return;
            } else {
                F();
                return;
            }
        }
        if (this.j) {
            d2(jsonParser);
        }
        W0();
        e2(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final int v(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        if (obj == null) {
            Y();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            b2(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this.e;
        if (objectCodec == null) {
            b2(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.c(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x1(Object obj) {
        this.r.n();
        W1(JsonToken.START_OBJECT);
        this.r = this.r.l(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y1(Object obj) {
        this.r.n();
        W1(JsonToken.START_OBJECT);
        this.r = this.r.l(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void z0(Object obj) {
        this.p = obj;
        this.q = true;
    }
}

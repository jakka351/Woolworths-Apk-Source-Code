package com.fasterxml.jackson.core;

import YU.a;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class JsonParser implements Closeable, Versioned {
    public static final JacksonFeatureSet e = JacksonFeatureSet.a(StreamReadCapability.values());
    public int d = JsonFactory.m;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false);

        public final boolean d;
        public final int e = 1 << ordinal();

        Feature(boolean z) {
            this.d = z;
        }

        public final boolean a(int i) {
            return (i & this.e) != 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NumberType {
        public static final NumberType d;
        public static final NumberType e;
        public static final NumberType f;
        public static final NumberType g;
        public static final NumberType h;
        public static final NumberType i;
        public static final /* synthetic */ NumberType[] j;

        static {
            NumberType numberType = new NumberType("INT", 0);
            d = numberType;
            NumberType numberType2 = new NumberType("LONG", 1);
            e = numberType2;
            NumberType numberType3 = new NumberType("BIG_INTEGER", 2);
            f = numberType3;
            NumberType numberType4 = new NumberType("FLOAT", 3);
            g = numberType4;
            NumberType numberType5 = new NumberType("DOUBLE", 4);
            h = numberType5;
            NumberType numberType6 = new NumberType("BIG_DECIMAL", 5);
            i = numberType6;
            j = new NumberType[]{numberType, numberType2, numberType3, numberType4, numberType5, numberType6};
        }

        public static NumberType valueOf(String str) {
            return (NumberType) Enum.valueOf(NumberType.class, str);
        }

        public static NumberType[] values() {
            return (NumberType[]) j.clone();
        }
    }

    public abstract double A();

    public Object B0() {
        return null;
    }

    public Object C() {
        return null;
    }

    public boolean C1() {
        return false;
    }

    public abstract float F();

    public int G0() {
        return H0();
    }

    public abstract int H();

    public int H0() {
        return 0;
    }

    public String J1() {
        if (N1() == JsonToken.FIELD_NAME) {
            return p();
        }
        return null;
    }

    public String K1() {
        if (N1() == JsonToken.VALUE_STRING) {
            return k0();
        }
        return null;
    }

    public abstract JsonToken N1();

    public long O0() {
        return P0();
    }

    public long P0() {
        return 0L;
    }

    public int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) {
        throw new UnsupportedOperationException("Operation not supported by parser of type ".concat(getClass().getName()));
    }

    public abstract long R();

    public boolean R1() {
        return false;
    }

    public abstract NumberType T();

    public String T0() {
        return V0();
    }

    public abstract Number U();

    public void U1(Object obj) {
        JsonStreamContext jsonStreamContextB0 = b0();
        if (jsonStreamContextB0 != null) {
            jsonStreamContextB0.g(obj);
        }
    }

    public abstract String V0();

    public abstract JsonParser V1();

    public abstract boolean W0();

    public Number Y() {
        return U();
    }

    public Object Z() {
        return null;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean a1(JsonToken jsonToken);

    public boolean b() {
        return false;
    }

    public abstract JsonStreamContext b0();

    public abstract boolean b1();

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public String d() {
        return p();
    }

    public JacksonFeatureSet d0() {
        return e;
    }

    public JsonToken e() {
        return r();
    }

    public int f() {
        return v();
    }

    public abstract BigInteger g();

    public abstract byte[] h(Base64Variant base64Variant);

    public boolean i() throws JsonParseException {
        JsonToken jsonTokenE = e();
        if (jsonTokenE == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (jsonTokenE == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, "Current token (" + jsonTokenE + ") not of boolean type");
    }

    public short i0() throws InputCoercionException {
        int iH = H();
        if (iH >= -32768 && iH <= 32767) {
            return (short) iH;
        }
        String strH = a.h("Numeric value (", k0(), ") out of range of Java short");
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        throw new InputCoercionException(this, strH);
    }

    public byte j() throws InputCoercionException {
        int iH = H();
        if (iH >= -128 && iH <= 255) {
            return (byte) iH;
        }
        String strH = a.h("Numeric value (", k0(), ") out of range of Java byte");
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        throw new InputCoercionException(this, strH);
    }

    public abstract ObjectCodec k();

    public abstract String k0();

    public abstract JsonLocation l();

    public abstract char[] m0();

    public final boolean m1(StreamReadFeature streamReadFeature) {
        return streamReadFeature.f.a(this.d);
    }

    public abstract String p();

    public boolean p1() {
        return e() == JsonToken.VALUE_NUMBER_INT;
    }

    public abstract JsonToken r();

    public abstract int r0();

    public abstract int t0();

    public abstract int v();

    public abstract BigDecimal x();

    public boolean x1() {
        return e() == JsonToken.START_ARRAY;
    }

    public boolean y1() {
        return e() == JsonToken.START_OBJECT;
    }

    public abstract JsonLocation z0();
}

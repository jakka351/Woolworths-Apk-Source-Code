package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.io.BigDecimalParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.io.doubleparser.FastFloatParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class NumberDeserializers {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f14262a = new HashSet();

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14263a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f14263a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14263a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14263a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer g = new BigDecimalDeserializer(BigDecimal.class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (BigDecimal) E(jsonParser, deserializationContext);
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF != 6) {
                if (iF == 7) {
                    CoercionAction coercionActionX = x(jsonParser, deserializationContext, cls);
                    if (coercionActionX != coercionAction2) {
                        if (coercionActionX == coercionAction) {
                            return BigDecimal.ZERO;
                        }
                    }
                } else if (iF != 8) {
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                }
                return jsonParser.x();
            }
            String strK0 = jsonParser.k0();
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU != coercionAction2) {
                if (coercionActionU == coercionAction) {
                    return BigDecimal.ZERO;
                }
                String strTrim = strK0.trim();
                if (!"null".equals(strTrim)) {
                    try {
                        String str = NumberInput.f14199a;
                        return BigDecimalParser.a(strTrim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.J(cls, strTrim, "not a valid representation", new Object[0]);
                        throw null;
                    }
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.j;
        }
    }

    @JacksonStdImpl
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer g = new BigIntegerDeserializer(BigInteger.class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (jsonParser.p1()) {
                return jsonParser.g();
            }
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (BigInteger) E(jsonParser, deserializationContext);
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                CoercionAction coercionActionU = u(deserializationContext, strK0);
                if (coercionActionU != coercionAction2) {
                    if (coercionActionU == coercionAction) {
                        return BigInteger.ZERO;
                    }
                    String strTrim = strK0.trim();
                    if (!"null".equals(strTrim)) {
                        try {
                            return NumberInput.b(strTrim);
                        } catch (IllegalArgumentException unused) {
                            deserializationContext.J(cls, strTrim, "not a valid representation", new Object[0]);
                            throw null;
                        }
                    }
                }
            } else {
                if (iF != 8) {
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                }
                CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                if (coercionActionT != coercionAction2) {
                    return coercionActionT == coercionAction ? BigInteger.ZERO : jsonParser.x().toBigInteger();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.i;
        }
    }

    @JacksonStdImpl
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        public static final BooleanDeserializer k = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        public static final BooleanDeserializer l = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class cls, Boolean bool) {
            super(cls, LogicalType.k, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken jsonTokenE = jsonParser.e();
            return jsonTokenE == JsonToken.VALUE_TRUE ? Boolean.TRUE : jsonTokenE == JsonToken.VALUE_FALSE ? Boolean.FALSE : this.j ? Boolean.valueOf(O(jsonParser, deserializationContext)) : N(jsonParser, deserializationContext, this.d);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            JsonToken jsonTokenE = jsonParser.e();
            return jsonTokenE == JsonToken.VALUE_TRUE ? Boolean.TRUE : jsonTokenE == JsonToken.VALUE_FALSE ? Boolean.FALSE : this.j ? Boolean.valueOf(O(jsonParser, deserializationContext)) : N(jsonParser, deserializationContext, this.d);
        }
    }

    @JacksonStdImpl
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        public static final ByteDeserializer k = new ByteDeserializer(Byte.TYPE, (byte) 0);
        public static final ByteDeserializer l = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class cls, Byte b) {
            super(cls, LogicalType.i, b, (byte) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (jsonParser.p1()) {
                return Byte.valueOf(jsonParser.j());
            }
            if (this.j) {
                return Byte.valueOf(P(jsonParser, deserializationContext));
            }
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (Byte) E(jsonParser, deserializationContext);
            }
            if (iF == 11) {
                return (Byte) c(deserializationContext);
            }
            Object obj = this.i;
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF != 6) {
                if (iF == 7) {
                    return Byte.valueOf(jsonParser.j());
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                    return coercionActionT == coercionAction2 ? (Byte) c(deserializationContext) : coercionActionT == coercionAction ? (Byte) obj : Byte.valueOf(jsonParser.j());
                }
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            }
            String strK0 = jsonParser.k0();
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU == coercionAction2) {
                return (Byte) c(deserializationContext);
            }
            if (coercionActionU == coercionAction) {
                return (Byte) obj;
            }
            String strTrim = strK0.trim();
            if (y(deserializationContext, strTrim)) {
                return (Byte) c(deserializationContext);
            }
            try {
                int iD = NumberInput.d(strTrim);
                if (iD >= -128 && iD <= 255) {
                    return Byte.valueOf((byte) iD);
                }
                deserializationContext.J(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            } catch (IllegalArgumentException unused) {
                deserializationContext.J(cls, strTrim, "not a valid Byte value", new Object[0]);
                throw null;
            }
        }
    }

    @JacksonStdImpl
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        public static final CharacterDeserializer k = new CharacterDeserializer(Character.TYPE, 0);
        public static final CharacterDeserializer l = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class cls, Character ch) {
            super(cls, LogicalType.i, ch, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (Character) E(jsonParser, deserializationContext);
            }
            if (iF == 11) {
                if (this.j) {
                    d0(deserializationContext);
                }
                return (Character) c(deserializationContext);
            }
            Object obj = this.i;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                if (strK0.length() == 1) {
                    return Character.valueOf(strK0.charAt(0));
                }
                CoercionAction coercionActionU = u(deserializationContext, strK0);
                if (coercionActionU == CoercionAction.f) {
                    return (Character) c(deserializationContext);
                }
                if (coercionActionU == CoercionAction.g) {
                    return (Character) obj;
                }
                String strTrim = strK0.trim();
                if (y(deserializationContext, strTrim)) {
                    return (Character) c(deserializationContext);
                }
                deserializationContext.J(cls, strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
                throw null;
            }
            if (iF != 7) {
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            }
            CoercionAction coercionActionN = deserializationContext.n(this.g, cls, CoercionInputShape.d);
            int iOrdinal = coercionActionN.ordinal();
            if (iOrdinal == 0) {
                q(deserializationContext, coercionActionN, jsonParser.U(), "Integer value (" + jsonParser.k0() + ")");
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Character) obj;
                }
                int iH = jsonParser.H();
                if (iH >= 0 && iH <= 65535) {
                    return Character.valueOf((char) iH);
                }
                deserializationContext.I(cls, Integer.valueOf(iH), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                throw null;
            }
            return (Character) c(deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        public static final DoubleDeserializer k = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        public static final DoubleDeserializer l = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class cls, Double d) {
            super(cls, LogicalType.j, d, Double.valueOf(0.0d));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.a1(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.A()) : this.j ? Double.valueOf(S(jsonParser, deserializationContext)) : o0(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            return jsonParser.a1(JsonToken.VALUE_NUMBER_FLOAT) ? Double.valueOf(jsonParser.A()) : this.j ? Double.valueOf(S(jsonParser, deserializationContext)) : o0(jsonParser, deserializationContext);
        }

        public final Double o0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (Double) E(jsonParser, deserializationContext);
            }
            if (iF == 11) {
                return (Double) c(deserializationContext);
            }
            Object obj = this.i;
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF != 6) {
                if (iF == 7) {
                    CoercionAction coercionActionX = x(jsonParser, deserializationContext, cls);
                    if (coercionActionX == coercionAction2) {
                        return (Double) c(deserializationContext);
                    }
                    if (coercionActionX == coercionAction) {
                        return (Double) obj;
                    }
                } else if (iF != 8) {
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                }
                return Double.valueOf(jsonParser.A());
            }
            String strK0 = jsonParser.k0();
            Double dR = StdDeserializer.r(strK0);
            if (dR != null) {
                return dR;
            }
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU == coercionAction2) {
                return (Double) c(deserializationContext);
            }
            if (coercionActionU == coercionAction) {
                return (Double) obj;
            }
            String strTrim = strK0.trim();
            if (y(deserializationContext, strTrim)) {
                return (Double) c(deserializationContext);
            }
            try {
                return Double.valueOf(NumberInput.c(strTrim, jsonParser.m1(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                deserializationContext.J(cls, strTrim, "not a valid `Double` value", new Object[0]);
                throw null;
            }
        }
    }

    @JacksonStdImpl
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        public static final FloatDeserializer k = new FloatDeserializer(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        public static final FloatDeserializer l = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class cls, Float f) {
            super(cls, LogicalType.j, f, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (jsonParser.a1(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.F());
            }
            if (this.j) {
                return Float.valueOf(T(jsonParser, deserializationContext));
            }
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (Float) E(jsonParser, deserializationContext);
            }
            if (iF == 11) {
                return (Float) c(deserializationContext);
            }
            Object obj = this.i;
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF != 6) {
                if (iF == 7) {
                    CoercionAction coercionActionX = x(jsonParser, deserializationContext, cls);
                    if (coercionActionX == coercionAction2) {
                        return (Float) c(deserializationContext);
                    }
                    if (coercionActionX == coercionAction) {
                        return (Float) obj;
                    }
                } else if (iF != 8) {
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                }
                return Float.valueOf(jsonParser.F());
            }
            String strK0 = jsonParser.k0();
            Float fS = StdDeserializer.s(strK0);
            if (fS != null) {
                return fS;
            }
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU == coercionAction2) {
                return (Float) c(deserializationContext);
            }
            if (coercionActionU == coercionAction) {
                return (Float) obj;
            }
            String strTrim = strK0.trim();
            if (y(deserializationContext, strTrim)) {
                return (Float) c(deserializationContext);
            }
            try {
                boolean zM1 = jsonParser.m1(StreamReadFeature.USE_FAST_DOUBLE_PARSER);
                String str = NumberInput.f14199a;
                return Float.valueOf(zM1 ? FastFloatParser.a(strTrim) : Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                deserializationContext.J(cls, strTrim, "not a valid `Float` value", new Object[0]);
                throw null;
            }
        }
    }

    @JacksonStdImpl
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        public static final IntegerDeserializer k = new IntegerDeserializer(Integer.TYPE, 0);
        public static final IntegerDeserializer l = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class cls, Integer num) {
            super(cls, LogicalType.i, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.p1() ? Integer.valueOf(jsonParser.H()) : this.j ? Integer.valueOf(U(jsonParser, deserializationContext)) : W(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            return jsonParser.p1() ? Integer.valueOf(jsonParser.H()) : this.j ? Integer.valueOf(U(jsonParser, deserializationContext)) : W(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final boolean m() {
            return true;
        }
    }

    @JacksonStdImpl
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        public static final LongDeserializer k = new LongDeserializer(Long.TYPE, 0L);
        public static final LongDeserializer l = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class cls, Long l2) {
            super(cls, LogicalType.i, l2, 0L);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.p1() ? Long.valueOf(jsonParser.R()) : this.j ? Long.valueOf(Y(jsonParser, deserializationContext)) : X(jsonParser, deserializationContext, Long.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final boolean m() {
            return true;
        }
    }

    @JacksonStdImpl
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer g = new NumberDeserializer(Number.class);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            int iF = jsonParser.f();
            Class cls = this.d;
            int i = 1;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return E(jsonParser, deserializationContext);
            }
            if (iF != 6) {
                if (iF == 7) {
                    return deserializationContext.K(StdDeserializer.f) ? StdDeserializer.C(jsonParser, deserializationContext) : jsonParser.U();
                }
                if (iF == 8) {
                    return (!deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.C1()) ? jsonParser.U() : jsonParser.x();
                }
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            }
            String strK0 = jsonParser.k0();
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU != CoercionAction.f && coercionActionU != CoercionAction.g) {
                String strTrim = strK0.trim();
                if (!"null".equals(strTrim)) {
                    if (StdDeserializer.L(strTrim)) {
                        return Double.valueOf(Double.POSITIVE_INFINITY);
                    }
                    if (StdDeserializer.K(strTrim)) {
                        return Double.valueOf(Double.NEGATIVE_INFINITY);
                    }
                    if ("NaN".equals(strTrim)) {
                        return Double.valueOf(Double.NaN);
                    }
                    try {
                        int length = strTrim.length();
                        if (length > 0) {
                            char cCharAt = strTrim.charAt(0);
                            if (cCharAt != '-' && cCharAt != '+') {
                                i = 0;
                            } else if (length == 1) {
                            }
                            while (i < length) {
                                char cCharAt2 = strTrim.charAt(i);
                                if (cCharAt2 <= '9' && cCharAt2 >= '0') {
                                    i++;
                                }
                            }
                            if (deserializationContext.N(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                                return NumberInput.b(strTrim);
                            }
                            long jF = NumberInput.f(strTrim);
                            return (deserializationContext.N(DeserializationFeature.USE_LONG_FOR_INTS) || jF > 2147483647L || jF < -2147483648L) ? Long.valueOf(jF) : Integer.valueOf((int) jF);
                        }
                        if (!deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return Double.valueOf(NumberInput.c(strTrim, jsonParser.m1(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                        }
                        String str = NumberInput.f14199a;
                        return BigDecimalParser.a(strTrim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.J(cls, strTrim, "not a valid number", new Object[0]);
                        throw null;
                    }
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            int iF = jsonParser.f();
            return (iF == 6 || iF == 7 || iF == 8) ? e(jsonParser, deserializationContext) : typeDeserializer.e(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.i;
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        public final LogicalType g;
        public final Object h;
        public final Object i;
        public final boolean j;

        public PrimitiveOrWrapperDeserializer(Class cls, LogicalType logicalType, Object obj, Object obj2) {
            super(cls);
            this.g = logicalType;
            this.h = obj;
            this.i = obj2;
            this.j = cls.isPrimitive();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public final Object c(DeserializationContext deserializationContext) throws MismatchedInputException {
            if (!this.j || !deserializationContext.N(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                return this.h;
            }
            deserializationContext.V(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", ClassUtil.f(this.d));
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object j(DeserializationContext deserializationContext) {
            return this.i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return this.g;
        }
    }

    @JacksonStdImpl
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        public static final ShortDeserializer k = new ShortDeserializer(Short.TYPE, 0);
        public static final ShortDeserializer l = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class cls, Short sh) {
            super(cls, LogicalType.i, sh, (short) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            if (jsonParser.p1()) {
                return Short.valueOf(jsonParser.i0());
            }
            if (this.j) {
                return Short.valueOf(Z(jsonParser, deserializationContext));
            }
            int iF = jsonParser.f();
            Class cls = this.d;
            if (iF == 1) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (iF == 3) {
                return (Short) E(jsonParser, deserializationContext);
            }
            if (iF == 11) {
                return (Short) c(deserializationContext);
            }
            Object obj = this.i;
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF != 6) {
                if (iF == 7) {
                    return Short.valueOf(jsonParser.i0());
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                    return coercionActionT == coercionAction2 ? (Short) c(deserializationContext) : coercionActionT == coercionAction ? (Short) obj : Short.valueOf(jsonParser.i0());
                }
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            }
            String strK0 = jsonParser.k0();
            CoercionAction coercionActionU = u(deserializationContext, strK0);
            if (coercionActionU == coercionAction2) {
                return (Short) c(deserializationContext);
            }
            if (coercionActionU == coercionAction) {
                return (Short) obj;
            }
            String strTrim = strK0.trim();
            if (y(deserializationContext, strTrim)) {
                return (Short) c(deserializationContext);
            }
            try {
                int iD = NumberInput.d(strTrim);
                if (iD >= -32768 && iD <= 32767) {
                    return Short.valueOf((short) iD);
                }
                deserializationContext.J(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            } catch (IllegalArgumentException unused) {
                deserializationContext.J(cls, strTrim, "not a valid Short value", new Object[0]);
                throw null;
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            f14262a.add(clsArr[i].getName());
        }
    }
}

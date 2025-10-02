package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable, ValueInstantiator.Gettable {
    public static final int f = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.e | DeserializationFeature.USE_LONG_FOR_INTS.e;
    public final Class d;
    public final JavaType e;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.StdDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14264a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f14264a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14264a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14264a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14264a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        int i = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.e;
        int i2 = DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.e;
    }

    public StdDeserializer(JavaType javaType) {
        this.d = javaType == null ? Object.class : javaType.d;
        this.e = javaType;
    }

    public static Number C(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.N(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.g() : deserializationContext.N(DeserializationFeature.USE_LONG_FOR_INTS) ? Long.valueOf(jsonParser.R()) : jsonParser.U();
    }

    public static NullValueProvider H(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, JsonDeserializer jsonDeserializer) throws InvalidDefinitionException {
        if (nulls == Nulls.e) {
            if (beanProperty == null) {
                return new NullsFailProvider(null, deserializationContext.l(jsonDeserializer == null ? Object.class : jsonDeserializer.l()));
            }
            return new NullsFailProvider(beanProperty.b(), beanProperty.getType());
        }
        if (nulls == Nulls.f) {
            if (jsonDeserializer != null) {
                if (jsonDeserializer instanceof BeanDeserializerBase) {
                    BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
                    if (!beanDeserializerBase.i.j()) {
                        deserializationContext.j(String.format("Cannot create empty instance of %s, no default Creator", beanProperty == null ? beanDeserializerBase.g : beanProperty.getType()));
                        throw null;
                    }
                }
                AccessPattern accessPatternI = jsonDeserializer.i();
                if (accessPatternI != AccessPattern.d) {
                    if (accessPatternI != AccessPattern.e) {
                        return new NullsAsEmptyProvider(jsonDeserializer);
                    }
                    Object objJ = jsonDeserializer.j(deserializationContext);
                    if (objJ != null) {
                        return new NullsConstantProvider(objJ);
                    }
                }
                return NullsConstantProvider.f;
            }
        } else if (nulls == Nulls.d) {
            return NullsConstantProvider.e;
        }
        return null;
    }

    public static final boolean I(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean J(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 'f' ? "false".equals(str) : cCharAt == 'F' && ("FALSE".equals(str) || "False".equals(str));
    }

    public static boolean K(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public static boolean L(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public static boolean M(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 't' ? "true".equals(str) : cCharAt == 'T' && ("TRUE".equals(str) || "True".equals(str));
    }

    public static int V(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
        Class cls = Integer.TYPE;
        try {
            if (str.length() <= 9) {
                return NumberInput.d(str);
            }
            long jF = NumberInput.f(str);
            if (!(jF < -2147483648L || jF > 2147483647L)) {
                return (int) jF;
            }
            deserializationContext.J(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
            throw null;
        } catch (IllegalArgumentException unused) {
            deserializationContext.J(cls, str, "not a valid `int` value", new Object[0]);
            throw null;
        }
    }

    public static NullValueProvider f0(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer jsonDeserializer) throws InvalidDefinitionException {
        Nulls nulls = beanProperty != null ? beanProperty.getMetadata().j : deserializationContext.f.j.e.e;
        if (nulls == Nulls.d) {
            return NullsConstantProvider.e;
        }
        if (nulls != Nulls.e) {
            NullValueProvider nullValueProviderH = H(deserializationContext, beanProperty, nulls, jsonDeserializer);
            return nullValueProviderH != null ? nullValueProviderH : jsonDeserializer;
        }
        if (beanProperty != null) {
            return new NullsFailProvider(beanProperty.b(), beanProperty.getType().k());
        }
        JavaType javaTypeL = deserializationContext.l(jsonDeserializer.l());
        if (javaTypeL.z()) {
            javaTypeL = javaTypeL.k();
        }
        return new NullsFailProvider(null, javaTypeL);
    }

    public static JsonDeserializer g0(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer jsonDeserializer) {
        AnnotatedMember annotatedMemberA;
        Object objH;
        AnnotationIntrospector annotationIntrospectorD = deserializationContext.f.d();
        if (beanProperty == null || (annotatedMemberA = beanProperty.a()) == null || (objH = annotationIntrospectorD.h(annotatedMemberA)) == null) {
            return jsonDeserializer;
        }
        beanProperty.a();
        Converter converterC = deserializationContext.c(objH);
        JavaType javaTypeB = converterC.b(deserializationContext.e());
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.p(javaTypeB, beanProperty);
        }
        return new StdDelegatingDeserializer(converterC, javaTypeB, jsonDeserializer);
    }

    public static JsonFormat.Value h0(DeserializationContext deserializationContext, BeanProperty beanProperty, Class cls) {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        return beanProperty != null ? beanProperty.c(deserializationConfig, cls) : deserializationConfig.h(cls);
    }

    public static Double r(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (K(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (L(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public static Float s(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (K(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (L(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    public final Boolean B(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws InvalidFormatException {
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.k, cls, CoercionInputShape.d);
        int iOrdinal = coercionActionN.ordinal();
        if (iOrdinal == 0) {
            q(deserializationContext, coercionActionN, jsonParser.U(), "Integer value (" + jsonParser.k0() + ")");
            return Boolean.FALSE;
        }
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return Boolean.FALSE;
        }
        if (jsonParser.T() == JsonParser.NumberType.d) {
            return Boolean.valueOf(jsonParser.H() != 0);
        }
        return Boolean.valueOf(!"0".equals(jsonParser.k0()));
    }

    public final String D() {
        String strO;
        JavaType javaTypeJ0 = j0();
        boolean z = true;
        if (javaTypeJ0 == null || javaTypeJ0.d.isPrimitive()) {
            Class clsL = l();
            if (!clsL.isArray() && !Collection.class.isAssignableFrom(clsL) && !Map.class.isAssignableFrom(clsL)) {
                z = false;
            }
            strO = ClassUtil.o(clsL);
        } else {
            if (!javaTypeJ0.z() && !javaTypeJ0.b()) {
                z = false;
            }
            strO = ClassUtil.t(javaTypeJ0);
        }
        return z ? YU.a.A("element of ", strO) : YU.a.g(strO, " value");
    }

    public Object E(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        CoercionAction coercionActionN = deserializationContext.n(n(), l(), CoercionInputShape.h);
        boolean zN = deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zN || coercionActionN != CoercionAction.d) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenN1 == jsonToken) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return c(deserializationContext);
                }
                if (iOrdinal == 3) {
                    return j(deserializationContext);
                }
            } else if (zN) {
                if (jsonParser.a1(JsonToken.START_ARRAY)) {
                    n0(jsonParser, deserializationContext);
                    throw null;
                }
                Object objE = e(jsonParser, deserializationContext);
                if (jsonParser.N1() == jsonToken) {
                    return objE;
                }
                m0(deserializationContext);
                throw null;
            }
        }
        deserializationContext.F(l0(deserializationContext), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        throw null;
    }

    public final Object F(DeserializationContext deserializationContext, CoercionAction coercionAction) throws InvalidFormatException {
        int iOrdinal = coercionAction.ordinal();
        if (iOrdinal == 0) {
            q(deserializationContext, coercionAction, "", "empty String (\"\")");
            return null;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return j(deserializationContext);
    }

    public final Object G(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        ValueInstantiator valueInstantiatorI0 = i0();
        Class clsL = l();
        String strT0 = jsonParser.T0();
        if (valueInstantiatorI0 != null && valueInstantiatorI0.h()) {
            return valueInstantiatorI0.w(deserializationContext, strT0);
        }
        if (strT0.isEmpty()) {
            return F(deserializationContext, deserializationContext.n(n(), clsL, CoercionInputShape.i));
        }
        if (I(strT0)) {
            return F(deserializationContext, deserializationContext.o(n(), clsL));
        }
        if (valueInstantiatorI0 != null) {
            strT0 = strT0.trim();
            boolean zE = valueInstantiatorI0.e();
            LogicalType logicalType = LogicalType.i;
            CoercionAction coercionAction = CoercionAction.e;
            CoercionInputShape coercionInputShape = CoercionInputShape.g;
            if (zE && deserializationContext.n(logicalType, Integer.class, coercionInputShape) == coercionAction) {
                return valueInstantiatorI0.r(deserializationContext, V(deserializationContext, strT0));
            }
            if (valueInstantiatorI0.f() && deserializationContext.n(logicalType, Long.class, coercionInputShape) == coercionAction) {
                try {
                    return valueInstantiatorI0.s(deserializationContext, NumberInput.f(strT0));
                } catch (IllegalArgumentException unused) {
                    deserializationContext.J(Long.TYPE, strT0, "not a valid `long` value", new Object[0]);
                    throw null;
                }
            }
            if (valueInstantiatorI0.c() && deserializationContext.n(LogicalType.k, Boolean.class, coercionInputShape) == coercionAction) {
                String strTrim = strT0.trim();
                if ("true".equals(strTrim)) {
                    return valueInstantiatorI0.p(deserializationContext, true);
                }
                if ("false".equals(strTrim)) {
                    return valueInstantiatorI0.p(deserializationContext, false);
                }
            }
        }
        JsonParser jsonParser2 = deserializationContext.i;
        deserializationContext.z(clsL, valueInstantiatorI0, "no String-argument constructor/factory method to deserialize from String value ('%s')", strT0);
        throw null;
    }

    public final Boolean N(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws MismatchedInputException {
        int iF = jsonParser.f();
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF == 3) {
            return (Boolean) E(jsonParser, deserializationContext);
        }
        if (iF == 6) {
            String strK0 = jsonParser.k0();
            CoercionAction coercionActionW = w(deserializationContext, strK0, LogicalType.k, cls);
            if (coercionActionW != CoercionAction.f) {
                if (coercionActionW == CoercionAction.g) {
                    return Boolean.FALSE;
                }
                String strTrim = strK0.trim();
                int length = strTrim.length();
                if (length == 4) {
                    if (M(strTrim)) {
                        return Boolean.TRUE;
                    }
                } else if (length == 5 && J(strTrim)) {
                    return Boolean.FALSE;
                }
                if (!y(deserializationContext, strTrim)) {
                    deserializationContext.J(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
                    throw null;
                }
            }
        } else {
            if (iF == 7) {
                return B(jsonParser, deserializationContext, cls);
            }
            switch (iF) {
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    break;
                default:
                    deserializationContext.E(jsonParser, cls);
                    throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (M(r7) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        if (J(r7) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r6 = this;
            int r0 = r7.f()
            r1 = 0
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 1
            if (r0 == r3) goto L8f
            r4 = 3
            if (r0 == r4) goto L6f
            r4 = 6
            r5 = 0
            if (r0 == r4) goto L28
            r4 = 7
            if (r0 == r4) goto L1d
            switch(r0) {
                case 9: goto L50;
                case 10: goto L5a;
                case 11: goto L19;
                default: goto L17;
            }
        L17:
            goto L8b
        L19:
            r6.d0(r8)
            return r5
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r7 = r6.B(r7, r8, r2)
            boolean r7 = r0.equals(r7)
            return r7
        L28:
            java.lang.String r7 = r7.k0()
            com.fasterxml.jackson.databind.type.LogicalType r0 = com.fasterxml.jackson.databind.type.LogicalType.k
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = r6.w(r8, r7, r0, r2)
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.f
            if (r0 != r4) goto L3a
            r6.d0(r8)
            return r5
        L3a:
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.g
            if (r0 != r4) goto L3f
            goto L5a
        L3f:
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            r4 = 4
            if (r0 != r4) goto L51
            boolean r0 = M(r7)
            if (r0 == 0) goto L5b
        L50:
            return r3
        L51:
            r3 = 5
            if (r0 != r3) goto L5b
            boolean r0 = J(r7)
            if (r0 == 0) goto L5b
        L5a:
            return r5
        L5b:
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L67
            r6.e0(r8, r7)
            return r5
        L67:
            java.lang.String r0 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r8.J(r2, r7, r0, r3)
            throw r1
        L6f:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r8.N(r0)
            if (r0 == 0) goto L8b
            com.fasterxml.jackson.core.JsonToken r0 = r7.N1()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 == r2) goto L87
            boolean r0 = r6.O(r7, r8)
            r6.c0(r7, r8)
            return r0
        L87:
            r6.n0(r7, r8)
            throw r1
        L8b:
            r8.E(r7, r2)
            throw r1
        L8f:
            r8.E(r7, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.O(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):boolean");
    }

    public final byte P(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        Class cls = this.d;
        int iF = jsonParser.f();
        Class cls2 = Byte.TYPE;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls2);
            throw null;
        }
        if (iF != 3) {
            if (iF == 11) {
                d0(deserializationContext);
                return (byte) 0;
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                CoercionAction coercionActionW = w(deserializationContext, strK0, LogicalType.i, cls2);
                if (coercionActionW == coercionAction2) {
                    d0(deserializationContext);
                    return (byte) 0;
                }
                if (coercionActionW != coercionAction) {
                    String strTrim = strK0.trim();
                    if ("null".equals(strTrim)) {
                        e0(deserializationContext, strTrim);
                        return (byte) 0;
                    }
                    try {
                        int iD = NumberInput.d(strTrim);
                        if (iD >= -128 && iD <= 255) {
                            return (byte) iD;
                        }
                        deserializationContext.J(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.J(cls, strTrim, "not a valid `byte` value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (iF == 7) {
                    return jsonParser.j();
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls2);
                    if (coercionActionT != coercionAction2 && coercionActionT != coercionAction) {
                        return jsonParser.j();
                    }
                }
            }
            return (byte) 0;
        }
        if (deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (jsonParser.N1() == JsonToken.START_ARRAY) {
                n0(jsonParser, deserializationContext);
                throw null;
            }
            byte bP = P(jsonParser, deserializationContext);
            c0(jsonParser, deserializationContext);
            return bP;
        }
        deserializationContext.D(jsonParser, deserializationContext.l(cls2));
        throw null;
    }

    public Date Q(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        int iF = jsonParser.f();
        Class cls = this.d;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF != 3) {
            if (iF == 11) {
                return (Date) c(deserializationContext);
            }
            if (iF == 6) {
                return R(deserializationContext, jsonParser.k0().trim());
            }
            if (iF != 7) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            try {
                return new Date(jsonParser.R());
            } catch (StreamReadException unused) {
                deserializationContext.I(cls, jsonParser.U(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0]);
                throw null;
            }
        }
        CoercionAction coercionActionN = deserializationContext.n(n(), l(), CoercionInputShape.h);
        boolean zN = deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zN || coercionActionN != CoercionAction.d) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            if (jsonTokenN1 == JsonToken.END_ARRAY) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return (Date) c(deserializationContext);
                }
                if (iOrdinal == 3) {
                    return (Date) j(deserializationContext);
                }
            } else if (zN) {
                if (jsonTokenN1 == JsonToken.START_ARRAY) {
                    n0(jsonParser, deserializationContext);
                    throw null;
                }
                Date dateQ = Q(jsonParser, deserializationContext);
                c0(jsonParser, deserializationContext);
                return dateQ;
            }
        }
        deserializationContext.F(deserializationContext.l(cls), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        throw null;
    }

    public final Date R(DeserializationContext deserializationContext, String str) throws InvalidFormatException {
        try {
            if (str.isEmpty()) {
                if (u(deserializationContext, str).ordinal() == 3) {
                    return new Date(0L);
                }
            } else if (!"null".equals(str)) {
                return deserializationContext.Q(str);
            }
            return null;
        } catch (IllegalArgumentException e) {
            deserializationContext.J(this.d, str, "not a valid representation (error: %s)", ClassUtil.i(e));
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 == 8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r10 == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double S(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r8 = this;
            int r0 = r9.f()
            r1 = 1
            r2 = 0
            java.lang.Class r3 = java.lang.Double.TYPE
            if (r0 == r1) goto L97
            r1 = 3
            if (r0 == r1) goto L77
            r1 = 11
            r4 = 0
            if (r0 == r1) goto L73
            r1 = 6
            com.fasterxml.jackson.databind.cfg.CoercionAction r6 = com.fasterxml.jackson.databind.cfg.CoercionAction.g
            com.fasterxml.jackson.databind.cfg.CoercionAction r7 = com.fasterxml.jackson.databind.cfg.CoercionAction.f
            if (r0 == r1) goto L31
            r1 = 7
            if (r0 == r1) goto L22
            r1 = 8
            if (r0 != r1) goto L93
            goto L2c
        L22:
            com.fasterxml.jackson.databind.cfg.CoercionAction r10 = r8.x(r9, r10, r3)
            if (r10 != r7) goto L29
            goto L4e
        L29:
            if (r10 != r6) goto L2c
            goto L4e
        L2c:
            double r9 = r9.A()
            return r9
        L31:
            java.lang.String r0 = r9.k0()
            java.lang.Double r1 = r(r0)
            if (r1 == 0) goto L40
            double r9 = r1.doubleValue()
            return r9
        L40:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.i
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = r8.w(r10, r0, r1, r3)
            if (r1 != r7) goto L4c
            r8.d0(r10)
            return r4
        L4c:
            if (r1 != r6) goto L4f
        L4e:
            return r4
        L4f:
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5f
            r8.e0(r10, r0)
            return r4
        L5f:
            com.fasterxml.jackson.core.StreamReadFeature r1 = com.fasterxml.jackson.core.StreamReadFeature.USE_FAST_DOUBLE_PARSER     // Catch: java.lang.IllegalArgumentException -> L6a
            boolean r9 = r9.m1(r1)     // Catch: java.lang.IllegalArgumentException -> L6a
            double r9 = com.fasterxml.jackson.core.io.NumberInput.c(r0, r9)     // Catch: java.lang.IllegalArgumentException -> L6a
            return r9
        L6a:
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r1 = "not a valid `double` value (as String to convert)"
            r10.J(r3, r0, r1, r9)
            throw r2
        L73:
            r8.d0(r10)
            return r4
        L77:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r10.N(r0)
            if (r0 == 0) goto L93
            com.fasterxml.jackson.core.JsonToken r0 = r9.N1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 == r1) goto L8f
            double r0 = r8.S(r9, r10)
            r8.c0(r9, r10)
            return r0
        L8f:
            r8.n0(r9, r10)
            throw r2
        L93:
            r10.E(r9, r3)
            throw r2
        L97:
            r10.E(r9, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.S(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 == 8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r9 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float T(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r7 = this;
            int r0 = r8.f()
            r1 = 1
            r2 = 0
            java.lang.Class r3 = java.lang.Float.TYPE
            if (r0 == r1) goto L9f
            r1 = 3
            if (r0 == r1) goto L7f
            r1 = 11
            r4 = 0
            if (r0 == r1) goto L7b
            r1 = 6
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.g
            com.fasterxml.jackson.databind.cfg.CoercionAction r6 = com.fasterxml.jackson.databind.cfg.CoercionAction.f
            if (r0 == r1) goto L30
            r1 = 7
            if (r0 == r1) goto L21
            r1 = 8
            if (r0 != r1) goto L9b
            goto L2b
        L21:
            com.fasterxml.jackson.databind.cfg.CoercionAction r9 = r7.x(r8, r9, r3)
            if (r9 != r6) goto L28
            goto L4d
        L28:
            if (r9 != r5) goto L2b
            goto L4d
        L2b:
            float r8 = r8.F()
            return r8
        L30:
            java.lang.String r0 = r8.k0()
            java.lang.Float r1 = s(r0)
            if (r1 == 0) goto L3f
            float r8 = r1.floatValue()
            return r8
        L3f:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.i
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = r7.w(r9, r0, r1, r3)
            if (r1 != r6) goto L4b
            r7.d0(r9)
            return r4
        L4b:
            if (r1 != r5) goto L4e
        L4d:
            return r4
        L4e:
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5e
            r7.e0(r9, r0)
            return r4
        L5e:
            com.fasterxml.jackson.core.StreamReadFeature r1 = com.fasterxml.jackson.core.StreamReadFeature.USE_FAST_DOUBLE_PARSER     // Catch: java.lang.IllegalArgumentException -> L72
            boolean r8 = r8.m1(r1)     // Catch: java.lang.IllegalArgumentException -> L72
            java.lang.String r1 = com.fasterxml.jackson.core.io.NumberInput.f14199a     // Catch: java.lang.IllegalArgumentException -> L72
            if (r8 == 0) goto L6d
            float r8 = com.fasterxml.jackson.core.io.doubleparser.FastFloatParser.a(r0)     // Catch: java.lang.IllegalArgumentException -> L72
            return r8
        L6d:
            float r8 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.IllegalArgumentException -> L72
            return r8
        L72:
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r1 = "not a valid `float` value"
            r9.J(r3, r0, r1, r8)
            throw r2
        L7b:
            r7.d0(r9)
            return r4
        L7f:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r9.N(r0)
            if (r0 == 0) goto L9b
            com.fasterxml.jackson.core.JsonToken r0 = r8.N1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 == r1) goto L97
            float r0 = r7.T(r8, r9)
            r7.c0(r8, r9)
            return r0
        L97:
            r7.n0(r8, r9)
            throw r2
        L9b:
            r9.E(r8, r3)
            throw r2
        L9f:
            r9.E(r8, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.T(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):float");
    }

    public final int U(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        int iF = jsonParser.f();
        Class cls = Integer.TYPE;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF != 3) {
            if (iF == 11) {
                d0(deserializationContext);
                return 0;
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                CoercionAction coercionActionW = w(deserializationContext, strK0, LogicalType.i, cls);
                if (coercionActionW == coercionAction2) {
                    d0(deserializationContext);
                    return 0;
                }
                if (coercionActionW != coercionAction) {
                    String strTrim = strK0.trim();
                    if (!"null".equals(strTrim)) {
                        return V(deserializationContext, strTrim);
                    }
                    e0(deserializationContext, strTrim);
                    return 0;
                }
            } else {
                if (iF == 7) {
                    return jsonParser.H();
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                    if (coercionActionT != coercionAction2 && coercionActionT != coercionAction) {
                        return jsonParser.G0();
                    }
                }
            }
            return 0;
        }
        if (deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (jsonParser.N1() == JsonToken.START_ARRAY) {
                n0(jsonParser, deserializationContext);
                throw null;
            }
            int iU = U(jsonParser, deserializationContext);
            c0(jsonParser, deserializationContext);
            return iU;
        }
        deserializationContext.E(jsonParser, cls);
        throw null;
    }

    public final Integer W(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws MismatchedInputException {
        int iF = jsonParser.f();
        boolean z = true;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF == 3) {
            return (Integer) E(jsonParser, deserializationContext);
        }
        if (iF == 11) {
            return (Integer) c(deserializationContext);
        }
        CoercionAction coercionAction = CoercionAction.g;
        CoercionAction coercionAction2 = CoercionAction.f;
        if (iF != 6) {
            if (iF == 7) {
                return Integer.valueOf(jsonParser.H());
            }
            if (iF == 8) {
                CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                return coercionActionT == coercionAction2 ? (Integer) c(deserializationContext) : coercionActionT == coercionAction ? (Integer) j(deserializationContext) : Integer.valueOf(jsonParser.G0());
            }
            deserializationContext.D(jsonParser, l0(deserializationContext));
            throw null;
        }
        String strK0 = jsonParser.k0();
        CoercionAction coercionActionU = u(deserializationContext, strK0);
        if (coercionActionU == coercionAction2) {
            return (Integer) c(deserializationContext);
        }
        if (coercionActionU == coercionAction) {
            return (Integer) j(deserializationContext);
        }
        String strTrim = strK0.trim();
        if (y(deserializationContext, strTrim)) {
            return (Integer) c(deserializationContext);
        }
        try {
            if (strTrim.length() <= 9) {
                return Integer.valueOf(NumberInput.d(strTrim));
            }
            long jF = NumberInput.f(strTrim);
            if (jF >= -2147483648L && jF <= 2147483647L) {
                z = false;
            }
            if (!z) {
                return Integer.valueOf((int) jF);
            }
            deserializationContext.J(Integer.class, strTrim, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", strTrim, Integer.MIN_VALUE, Integer.MAX_VALUE);
            throw null;
        } catch (IllegalArgumentException unused) {
            deserializationContext.J(Integer.class, strTrim, "not a valid `java.lang.Integer` value", new Object[0]);
            throw null;
        }
    }

    public final Long X(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws MismatchedInputException {
        int iF = jsonParser.f();
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF == 3) {
            return (Long) E(jsonParser, deserializationContext);
        }
        if (iF == 11) {
            return (Long) c(deserializationContext);
        }
        CoercionAction coercionAction = CoercionAction.g;
        CoercionAction coercionAction2 = CoercionAction.f;
        if (iF != 6) {
            if (iF == 7) {
                return Long.valueOf(jsonParser.R());
            }
            if (iF == 8) {
                CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                return coercionActionT == coercionAction2 ? (Long) c(deserializationContext) : coercionActionT == coercionAction ? (Long) j(deserializationContext) : Long.valueOf(jsonParser.O0());
            }
            deserializationContext.D(jsonParser, l0(deserializationContext));
            throw null;
        }
        String strK0 = jsonParser.k0();
        CoercionAction coercionActionU = u(deserializationContext, strK0);
        if (coercionActionU == coercionAction2) {
            return (Long) c(deserializationContext);
        }
        if (coercionActionU == coercionAction) {
            return (Long) j(deserializationContext);
        }
        String strTrim = strK0.trim();
        if (y(deserializationContext, strTrim)) {
            return (Long) c(deserializationContext);
        }
        try {
            return Long.valueOf(NumberInput.f(strTrim));
        } catch (IllegalArgumentException unused) {
            deserializationContext.J(Long.class, strTrim, "not a valid `java.lang.Long` value", new Object[0]);
            throw null;
        }
    }

    public final long Y(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        int iF = jsonParser.f();
        Class cls = Long.TYPE;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF != 3) {
            if (iF == 11) {
                d0(deserializationContext);
                return 0L;
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                CoercionAction coercionActionW = w(deserializationContext, strK0, LogicalType.i, cls);
                if (coercionActionW == coercionAction2) {
                    d0(deserializationContext);
                    return 0L;
                }
                if (coercionActionW != coercionAction) {
                    String strTrim = strK0.trim();
                    if ("null".equals(strTrim)) {
                        e0(deserializationContext, strTrim);
                        return 0L;
                    }
                    try {
                        return NumberInput.f(strTrim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.J(cls, strTrim, "not a valid `long` value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (iF == 7) {
                    return jsonParser.R();
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                    if (coercionActionT != coercionAction2 && coercionActionT != coercionAction) {
                        return jsonParser.O0();
                    }
                }
            }
            return 0L;
        }
        if (deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (jsonParser.N1() == JsonToken.START_ARRAY) {
                n0(jsonParser, deserializationContext);
                throw null;
            }
            long jY = Y(jsonParser, deserializationContext);
            c0(jsonParser, deserializationContext);
            return jY;
        }
        deserializationContext.E(jsonParser, cls);
        throw null;
    }

    public final short Z(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        int iF = jsonParser.f();
        Class cls = Short.TYPE;
        if (iF == 1) {
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (iF != 3) {
            if (iF == 11) {
                d0(deserializationContext);
                return (short) 0;
            }
            CoercionAction coercionAction = CoercionAction.g;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (iF == 6) {
                String strK0 = jsonParser.k0();
                CoercionAction coercionActionW = w(deserializationContext, strK0, LogicalType.i, cls);
                if (coercionActionW == coercionAction2) {
                    d0(deserializationContext);
                    return (short) 0;
                }
                if (coercionActionW != coercionAction) {
                    String strTrim = strK0.trim();
                    if ("null".equals(strTrim)) {
                        e0(deserializationContext, strTrim);
                        return (short) 0;
                    }
                    try {
                        int iD = NumberInput.d(strTrim);
                        if (iD >= -32768 && iD <= 32767) {
                            return (short) iD;
                        }
                        deserializationContext.J(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.J(cls, strTrim, "not a valid `short` value", new Object[0]);
                        throw null;
                    }
                }
            } else {
                if (iF == 7) {
                    return jsonParser.i0();
                }
                if (iF == 8) {
                    CoercionAction coercionActionT = t(jsonParser, deserializationContext, cls);
                    if (coercionActionT != coercionAction2 && coercionActionT != coercionAction) {
                        return jsonParser.i0();
                    }
                }
            }
            return (short) 0;
        }
        if (deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (jsonParser.N1() == JsonToken.START_ARRAY) {
                n0(jsonParser, deserializationContext);
                throw null;
            }
            short sZ = Z(jsonParser, deserializationContext);
            c0(jsonParser, deserializationContext);
            return sZ;
        }
        deserializationContext.D(jsonParser, deserializationContext.l(cls));
        throw null;
    }

    public final String a0(JsonParser jsonParser, DeserializationContext deserializationContext, NullValueProvider nullValueProvider) throws MismatchedInputException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        CoercionAction coercionActionZ;
        String strT0;
        int iF = jsonParser.f();
        if (iF == 1) {
            deserializationContext.E(jsonParser, this.d);
            throw null;
        }
        if (iF == 12) {
            Object objC = jsonParser.C();
            if (objC instanceof byte[]) {
                return deserializationContext.f.e.j.e((byte[]) objC);
            }
            if (objC == null) {
                return null;
            }
            return objC.toString();
        }
        switch (iF) {
            case 6:
                return jsonParser.k0();
            case 7:
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                coercionActionZ = z(jsonParser2, deserializationContext2, this.d, jsonParser2.U(), CoercionInputShape.d);
                break;
            case 8:
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                coercionActionZ = z(jsonParser2, deserializationContext2, this.d, jsonParser2.U(), CoercionInputShape.e);
                break;
            case 9:
            case 10:
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                coercionActionZ = z(jsonParser2, deserializationContext2, this.d, Boolean.valueOf(jsonParser.i()), CoercionInputShape.f);
                break;
            default:
                coercionActionZ = CoercionAction.e;
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                break;
        }
        if (coercionActionZ == CoercionAction.f) {
            return (String) nullValueProvider.c(deserializationContext2);
        }
        if (coercionActionZ == CoercionAction.g) {
            return "";
        }
        if (jsonParser2.e().k && (strT0 = jsonParser2.T0()) != null) {
            return strT0;
        }
        deserializationContext2.D(jsonParser2, l0(deserializationContext2));
        throw null;
    }

    public final void b0(DeserializationContext deserializationContext, boolean z, Enum r5, String str) throws MismatchedInputException {
        deserializationContext.V(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, D(), z ? "enable" : "disable", r5.getDeclaringClass().getSimpleName(), r5.name());
        throw null;
    }

    public final void c0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.N1() == JsonToken.END_ARRAY) {
            return;
        }
        m0(deserializationContext);
        throw null;
    }

    public final void d0(DeserializationContext deserializationContext) throws MismatchedInputException {
        if (deserializationContext.N(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.V(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", D());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        boolean z;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.f.m(mapperFeature)) {
            DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.N(deserializationFeature2)) {
                return;
            }
            z = false;
            deserializationFeature = deserializationFeature2;
        } else {
            z = true;
            deserializationFeature = mapperFeature;
        }
        b0(deserializationContext, z, deserializationFeature, str.isEmpty() ? "empty String (\"\")" : YU.a.h("String \"", str, "\""));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.b(jsonParser, deserializationContext);
    }

    public ValueInstantiator i0() {
        return null;
    }

    public JavaType j0() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class l() {
        return this.d;
    }

    public final JavaType l0(DeserializationContext deserializationContext) {
        JavaType javaType = this.e;
        return javaType != null ? javaType : deserializationContext.l(this.d);
    }

    public final void m0(DeserializationContext deserializationContext) throws MismatchedInputException {
        deserializationContext.Z(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", l().getName());
        throw null;
    }

    public final void n0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        deserializationContext.F(l0(deserializationContext), jsonParser.e(), jsonParser, "Cannot deserialize instance of " + ClassUtil.B(this.d) + " out of " + JsonToken.START_ARRAY + " token: nested Arrays not allowed with DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS", new Object[0]);
        throw null;
    }

    public final void q(DeserializationContext deserializationContext, CoercionAction coercionAction, Object obj, String str) throws InvalidFormatException {
        if (coercionAction != CoercionAction.d) {
            return;
        }
        Object[] objArr = {str, D()};
        deserializationContext.getClass();
        throw new InvalidFormatException(deserializationContext.i, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", objArr), obj);
    }

    public final CoercionAction t(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws InvalidFormatException {
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.i, cls, CoercionInputShape.e);
        if (coercionActionN == CoercionAction.d) {
            q(deserializationContext, coercionActionN, jsonParser.U(), "Floating-point value (" + jsonParser.k0() + ")");
        }
        return coercionActionN;
    }

    public final CoercionAction u(DeserializationContext deserializationContext, String str) {
        return w(deserializationContext, str, n(), l());
    }

    public final CoercionAction w(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class cls) throws MismatchedInputException {
        if (str.isEmpty()) {
            CoercionAction coercionActionN = deserializationContext.n(logicalType, cls, CoercionInputShape.i);
            q(deserializationContext, coercionActionN, str, "empty String (\"\")");
            return coercionActionN;
        }
        if (I(str)) {
            CoercionAction coercionActionO = deserializationContext.o(logicalType, cls);
            q(deserializationContext, coercionActionO, str, "blank String (all whitespace)");
            return coercionActionO;
        }
        if (deserializationContext.M(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.e;
        }
        CoercionAction coercionActionN2 = deserializationContext.n(logicalType, cls, CoercionInputShape.g);
        if (coercionActionN2 != CoercionAction.d) {
            return coercionActionN2;
        }
        deserializationContext.V(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, D());
        throw null;
    }

    public final CoercionAction x(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) throws InvalidFormatException {
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.j, cls, CoercionInputShape.d);
        if (coercionActionN == CoercionAction.d) {
            q(deserializationContext, coercionActionN, jsonParser.U(), "Integer value (" + jsonParser.k0() + ")");
        }
        return coercionActionN;
    }

    public final boolean y(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        if (!"null".equals(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.f.m(mapperFeature)) {
            return true;
        }
        b0(deserializationContext, true, mapperFeature, "String \"null\"");
        throw null;
    }

    public final CoercionAction z(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls, Serializable serializable, CoercionInputShape coercionInputShape) throws InvalidFormatException {
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.m, cls, coercionInputShape);
        if (coercionActionN == CoercionAction.d) {
            q(deserializationContext, coercionActionN, serializable, coercionInputShape.name() + " value (" + jsonParser.k0() + ")");
        }
        return coercionActionN;
    }

    public StdDeserializer(StdDeserializer stdDeserializer) {
        this.d = stdDeserializer.d;
        this.e = stdDeserializer.e;
    }

    public StdDeserializer(Class cls) {
        this.d = cls;
        this.e = null;
    }
}

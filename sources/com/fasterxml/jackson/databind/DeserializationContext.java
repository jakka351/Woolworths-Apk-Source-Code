package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes4.dex */
public abstract class DeserializationContext extends DatabindContext implements Serializable {
    public final DeserializerCache d;
    public final DeserializerFactory e;
    public final DeserializationConfig f;
    public final int g;
    public final JacksonFeatureSet h;
    public final transient JsonParser i;
    public transient ArrayBuilders j;
    public transient ObjectBuffer k;
    public transient DateFormat l;
    public LinkedNode m;

    /* renamed from: com.fasterxml.jackson.databind.DeserializationContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14227a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14227a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14227a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14227a[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14227a[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14227a[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14227a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14227a[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14227a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14227a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14227a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14227a[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14227a[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14227a[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public DeserializationContext() {
        this.e = BeanDeserializerFactory.f;
        this.d = new DeserializerCache();
        this.g = 0;
        this.h = null;
        this.f = null;
    }

    public static void X(Class cls, JsonParser jsonParser, JsonToken jsonToken) throws MismatchedInputException {
        throw new MismatchedInputException(jsonParser, "Trailing token (of type " + jsonToken + ") found after value (bound as " + ClassUtil.B(cls) + "): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`");
    }

    public static MismatchedInputException c0(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return new MismatchedInputException(jsonParser, DatabindContext.a("Unexpected token (" + jsonParser.e() + "), expected " + jsonToken, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer B(JsonDeserializer jsonDeserializer, BeanProperty beanProperty, JavaType javaType) {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this.m = new LinkedNode(javaType, this.m);
        try {
            return ((ContextualDeserializer) jsonDeserializer).b(this, beanProperty);
        } finally {
            this.m = this.m.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer C(JsonDeserializer jsonDeserializer, BeanProperty beanProperty, JavaType javaType) {
        if (!(jsonDeserializer instanceof ContextualDeserializer)) {
            return jsonDeserializer;
        }
        this.m = new LinkedNode(javaType, this.m);
        try {
            return ((ContextualDeserializer) jsonDeserializer).b(this, beanProperty);
        } finally {
            this.m = this.m.b;
        }
    }

    public final void D(JsonParser jsonParser, JavaType javaType) throws MismatchedInputException {
        F(javaType, jsonParser.e(), jsonParser, null, new Object[0]);
        throw null;
    }

    public final void E(JsonParser jsonParser, Class cls) throws MismatchedInputException {
        F(l(cls), jsonParser.e(), jsonParser, null, new Object[0]);
        throw null;
    }

    public final void F(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws MismatchedInputException {
        String str2;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
            javaType.getClass();
        }
        if (str == null) {
            String strT = ClassUtil.t(javaType);
            if (jsonToken == null) {
                str = a.A("Unexpected end-of-input when trying read value of type ", strT);
            } else {
                switch (jsonToken.ordinal()) {
                    case 1:
                    case 2:
                    case 5:
                        str2 = "Object value";
                        break;
                    case 3:
                    case 4:
                        str2 = "Array value";
                        break;
                    case 6:
                        str2 = "Embedded Object";
                        break;
                    case 7:
                        str2 = "String value";
                        break;
                    case 8:
                        str2 = "Integer value";
                        break;
                    case 9:
                        str2 = "Floating-point value";
                        break;
                    case 10:
                    case 11:
                        str2 = "Boolean value";
                        break;
                    case 12:
                        str2 = "Null value";
                        break;
                    default:
                        str2 = "[Unavailable value]";
                        break;
                }
                StringBuilder sbV = a.v("Cannot deserialize value of type ", strT, " from ", str2, " (token `JsonToken.");
                sbV.append(jsonToken);
                sbV.append("`)");
                str = sbV.toString();
            }
        }
        if (jsonToken != null && jsonToken.k) {
            jsonParser.k0();
        }
        W(str, new Object[0]);
        throw null;
    }

    public final void G(JavaType javaType, String str, String str2) throws InvalidTypeIdException {
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        if (N(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw f(javaType, str, str2);
        }
    }

    public final void H(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        StringBuilder sbV = a.v("Cannot deserialize Map key of type ", ClassUtil.B(cls), " from String ", DatabindContext.b(str), ": ");
        sbV.append(str2);
        throw new InvalidFormatException(this.i, sbV.toString(), str);
    }

    public final void I(Class cls, Number number, String str, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        StringBuilder sbV = a.v("Cannot deserialize value of type ", ClassUtil.B(cls), " from number ", String.valueOf(number), ": ");
        sbV.append(str);
        throw new InvalidFormatException(this.i, sbV.toString(), number);
    }

    public final void J(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        throw b0(cls, str, str2);
    }

    public final boolean K(int i) {
        return (i & this.g) != 0;
    }

    public final ValueInstantiationException L(Throwable th, Class cls) {
        String strI;
        if (th == null) {
            strI = "N/A";
        } else {
            strI = ClassUtil.i(th);
            if (strI == null) {
                strI = ClassUtil.B(th.getClass());
            }
        }
        String strI2 = a.i("Cannot construct instance of ", ClassUtil.B(cls), ", problem: ", strI);
        l(cls);
        return new ValueInstantiationException(this.i, strI2, th);
    }

    public final boolean M(StreamReadCapability streamReadCapability) {
        JacksonFeatureSet jacksonFeatureSet = this.h;
        jacksonFeatureSet.getClass();
        return (streamReadCapability.a() & jacksonFeatureSet.f14220a) != 0;
    }

    public final boolean N(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.e & this.g) != 0;
    }

    public abstract KeyDeserializer O(Annotated annotated, Object obj);

    public final ObjectBuffer P() {
        ObjectBuffer objectBuffer = this.k;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this.k = null;
        return objectBuffer;
    }

    public final Date Q(String str) {
        try {
            DateFormat dateFormat = this.l;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.f.e.h.clone();
                this.l = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(a.i("Failed to parse Date value '", str, "': ", ClassUtil.i(e)));
        }
    }

    public final Object R(JsonParser jsonParser, Class cls) throws InvalidDefinitionException {
        JavaType javaTypeK = e().k(cls);
        JsonDeserializer jsonDeserializerU = u(javaTypeK);
        if (jsonDeserializerU != null) {
            return jsonDeserializerU.e(jsonParser, this);
        }
        j("Could not find JsonDeserializer for type " + ClassUtil.t(javaTypeK));
        throw null;
    }

    public final void S(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        Annotation[] annotationArr = ClassUtil.f14330a;
        StringBuilder sbV = a.v("Invalid definition for property ", ClassUtil.c(beanPropertyDefinition.getName()), " (of type ", ClassUtil.B(beanDescription.f14226a.d), "): ");
        sbV.append(str);
        throw new InvalidDefinitionException(this.i, sbV.toString());
    }

    public final void T(BeanDescription beanDescription, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(this.i, a.i("Invalid type definition for type ", ClassUtil.B(beanDescription.f14226a.d), ": ", str));
    }

    public final void U(BeanProperty beanProperty, String str, Object... objArr) throws MismatchedInputException {
        AnnotatedMember annotatedMemberA;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (beanProperty != null) {
            beanProperty.getType();
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.i, str, null);
        if (beanProperty == null || (annotatedMemberA = beanProperty.a()) == null) {
            throw mismatchedInputException;
        }
        mismatchedInputException.e(annotatedMemberA.h(), beanProperty.getName());
        throw mismatchedInputException;
    }

    public final void V(JsonDeserializer jsonDeserializer, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        jsonDeserializer.l();
        throw new MismatchedInputException(this.i, str);
    }

    public final void W(String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new MismatchedInputException(this.i, str, null);
    }

    public final void Y(JsonToken jsonToken, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        JsonParser jsonParser = this.i;
        throw new MismatchedInputException(jsonParser, DatabindContext.a("Unexpected token (" + jsonParser.e() + "), expected " + jsonToken, str), null);
    }

    public final void Z(JsonDeserializer jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        jsonDeserializer.l();
        throw c0(this.i, jsonToken, str);
    }

    public final void a0(ObjectBuffer objectBuffer) {
        ObjectBuffer objectBuffer2 = this.k;
        if (objectBuffer2 != null) {
            Object[] objArr = objectBuffer.d;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = objectBuffer2.d;
            if (length < (objArr2 != null ? objArr2.length : 0)) {
                return;
            }
        }
        this.k = objectBuffer;
    }

    public final InvalidFormatException b0(Class cls, String str, String str2) {
        StringBuilder sbV = a.v("Cannot deserialize value of type ", ClassUtil.B(cls), " from String ", DatabindContext.b(str), ": ");
        sbV.append(str2);
        return new InvalidFormatException(this.i, sbV.toString(), str);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final MapperConfig d() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory e() {
        return this.f.e.d;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final InvalidTypeIdException f(JavaType javaType, String str, String str2) {
        return new InvalidTypeIdException(this.i, DatabindContext.a(a.i("Could not resolve type id '", str, "' as a subtype of ", ClassUtil.t(javaType)), str2), null);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final Object j(String str) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(this.i, str);
    }

    public final TokenBuffer k(JsonParser jsonParser) {
        TokenBuffer tokenBuffer = new TokenBuffer();
        tokenBuffer.q = false;
        tokenBuffer.e = jsonParser.k();
        tokenBuffer.f = jsonParser.b0();
        tokenBuffer.g = TokenBuffer.s;
        tokenBuffer.r = new JsonWriteContext(0, null, null);
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        tokenBuffer.m = segment;
        tokenBuffer.l = segment;
        tokenBuffer.n = 0;
        tokenBuffer.h = jsonParser.b();
        boolean zA = jsonParser.a();
        tokenBuffer.i = zA;
        tokenBuffer.j = tokenBuffer.h || zA;
        tokenBuffer.k = N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        return tokenBuffer;
    }

    public final JavaType l(Class cls) {
        if (cls == null) {
            return null;
        }
        return this.f.c(cls);
    }

    public abstract JsonDeserializer m(Annotated annotated, Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r6.r(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r6.r(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0079, code lost:
    
        if (r5 == com.fasterxml.jackson.databind.type.LogicalType.p) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        return com.fasterxml.jackson.databind.cfg.CoercionAction.e;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.cfg.CoercionAction n(com.fasterxml.jackson.databind.type.LogicalType r5, java.lang.Class r6, com.fasterxml.jackson.databind.cfg.CoercionInputShape r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r6 = r4.f
            com.fasterxml.jackson.databind.cfg.CoercionConfigs r0 = r6.o
            r0.getClass()
            com.fasterxml.jackson.databind.cfg.MutableCoercionConfig r1 = r0.e
            com.fasterxml.jackson.databind.cfg.CoercionAction[] r1 = r1.d
            int r2 = r7.ordinal()
            r1 = r1[r2]
            if (r1 == 0) goto L14
            return r1
        L14:
            int r1 = r7.ordinal()
            r2 = 2
            com.fasterxml.jackson.databind.type.LogicalType r3 = com.fasterxml.jackson.databind.type.LogicalType.i
            if (r1 == r2) goto L38
            r2 = 3
            if (r1 == r2) goto L2d
            r2 = 7
            if (r1 == r2) goto L24
            goto L45
        L24:
            com.fasterxml.jackson.databind.DeserializationFeature r5 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
            boolean r5 = r6.r(r5)
            if (r5 == 0) goto L7e
            goto L81
        L2d:
            if (r5 != r3) goto L45
            com.fasterxml.jackson.databind.DeserializationFeature r5 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT
            boolean r5 = r6.r(r5)
            if (r5 == 0) goto L7e
            goto L7b
        L38:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.l
            if (r5 != r1) goto L45
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS
            boolean r1 = r6.r(r1)
            if (r1 == 0) goto L45
            goto L7e
        L45:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.j
            if (r5 == r1) goto L56
            if (r5 == r3) goto L56
            com.fasterxml.jackson.databind.type.LogicalType r2 = com.fasterxml.jackson.databind.type.LogicalType.k
            if (r5 == r2) goto L56
            com.fasterxml.jackson.databind.type.LogicalType r2 = com.fasterxml.jackson.databind.type.LogicalType.o
            if (r5 != r2) goto L54
            goto L56
        L54:
            r2 = 0
            goto L57
        L56:
            r2 = 1
        L57:
            if (r2 == 0) goto L68
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_COERCION_OF_SCALARS
            boolean r3 = r6.m(r3)
            if (r3 != 0) goto L68
            if (r5 != r1) goto L7e
            com.fasterxml.jackson.databind.cfg.CoercionInputShape r1 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.d
            if (r7 == r1) goto L68
            goto L7e
        L68:
            com.fasterxml.jackson.databind.cfg.CoercionInputShape r1 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.i
            if (r7 != r1) goto L84
            if (r2 != 0) goto L81
            com.fasterxml.jackson.databind.DeserializationFeature r7 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
            boolean r6 = r6.r(r7)
            if (r6 == 0) goto L77
            goto L81
        L77:
            com.fasterxml.jackson.databind.type.LogicalType r6 = com.fasterxml.jackson.databind.type.LogicalType.p
            if (r5 != r6) goto L7e
        L7b:
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.e
            return r5
        L7e:
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.d
            return r5
        L81:
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.f
            return r5
        L84:
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = r0.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.DeserializationContext.n(com.fasterxml.jackson.databind.type.LogicalType, java.lang.Class, com.fasterxml.jackson.databind.cfg.CoercionInputShape):com.fasterxml.jackson.databind.cfg.CoercionAction");
    }

    public final CoercionAction o(LogicalType logicalType, Class cls) {
        DeserializationConfig deserializationConfig = this.f;
        MutableCoercionConfig mutableCoercionConfig = deserializationConfig.o.e;
        mutableCoercionConfig.getClass();
        CoercionAction coercionAction = mutableCoercionConfig.d[9];
        if (!Boolean.FALSE.equals(null)) {
            if (coercionAction != null) {
                return coercionAction;
            }
            LogicalType logicalType2 = LogicalType.j;
            CoercionAction coercionAction2 = CoercionAction.f;
            if (logicalType == logicalType2 || logicalType == LogicalType.i || logicalType == LogicalType.k || logicalType == LogicalType.o || deserializationConfig.r(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return coercionAction2;
            }
        }
        return CoercionAction.d;
    }

    public final JsonDeserializer p(JavaType javaType, BeanProperty beanProperty) {
        return C(this.d.e(this, this.e, javaType), beanProperty, javaType);
    }

    public final Object q(Object obj, BeanProperty beanProperty, Object obj2) {
        Annotation[] annotationArr = ClassUtil.f14330a;
        i(obj == null ? null : obj.getClass(), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KeyDeserializer r(JavaType javaType, BeanProperty beanProperty) throws InvalidDefinitionException {
        try {
            DeserializerCache deserializerCache = this.d;
            DeserializerFactory deserializerFactory = this.e;
            deserializerCache.getClass();
            KeyDeserializer keyDeserializerG = deserializerFactory.g(this, javaType);
            if (keyDeserializerG != 0) {
                if (keyDeserializerG instanceof ResolvableDeserializer) {
                    ((ResolvableDeserializer) keyDeserializerG).a(this);
                }
                return keyDeserializerG instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) keyDeserializerG).a() : keyDeserializerG;
            }
            j("Cannot find a (Map) Key deserializer for type " + javaType);
            throw null;
        } catch (IllegalArgumentException e) {
            j(ClassUtil.i(e));
            throw null;
        }
    }

    public final JsonDeserializer s(JavaType javaType) {
        return this.d.e(this, this.e, javaType);
    }

    public abstract ReadableObjectId t(Object obj, ObjectIdGenerator objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer u(JavaType javaType) {
        DeserializerCache deserializerCache = this.d;
        DeserializerFactory deserializerFactory = this.e;
        JsonDeserializer jsonDeserializerC = C(deserializerCache.e(this, deserializerFactory, javaType), null, javaType);
        TypeDeserializer typeDeserializerL = deserializerFactory.l(this.f, javaType);
        return typeDeserializerL != null ? new TypeWrappedDeserializer(typeDeserializerL.f(null), jsonDeserializerC) : jsonDeserializerC;
    }

    public final ArrayBuilders w() {
        if (this.j == null) {
            ArrayBuilders arrayBuilders = new ArrayBuilders();
            arrayBuilders.f14328a = null;
            arrayBuilders.b = null;
            arrayBuilders.c = null;
            arrayBuilders.d = null;
            arrayBuilders.e = null;
            arrayBuilders.f = null;
            arrayBuilders.g = null;
            this.j = arrayBuilders;
        }
        return this.j;
    }

    public final void x(JsonDeserializer jsonDeserializer) throws InvalidDefinitionException {
        if (this.f.m(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        throw new InvalidDefinitionException(this.i, a.h("Invalid configuration: values of type ", ClassUtil.t(l(jsonDeserializer.l())), " cannot be merged"));
    }

    public final void y(Throwable th, Class cls) throws ValueInstantiationException {
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        ClassUtil.F(th);
        if (!N(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.G(th);
        }
        throw L(th, cls);
    }

    public final Object z(Class cls, ValueInstantiator valueInstantiator, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        if (valueInstantiator == null) {
            i(cls, a.i("Cannot construct instance of ", ClassUtil.B(cls), ": ", str));
            throw null;
        }
        if (valueInstantiator.l()) {
            throw new MismatchedInputException(this.i, a.i("Cannot construct instance of ", ClassUtil.B(cls), " (although at least one Creator exists): ", str));
        }
        i(cls, a.i("Cannot construct instance of ", ClassUtil.B(cls), " (no Creators, like default constructor, exist): ", str));
        throw null;
    }

    public DeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig) {
        this.d = defaultDeserializationContext.d;
        this.e = defaultDeserializationContext.e;
        this.h = null;
        this.f = deserializationConfig;
        this.g = deserializationConfig.p;
        this.i = null;
    }

    public DeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser) {
        this.d = defaultDeserializationContext.d;
        this.e = defaultDeserializationContext.e;
        this.h = jsonParser == null ? null : jsonParser.d0();
        this.f = deserializationConfig;
        this.g = deserializationConfig.p;
        this.i = jsonParser;
    }

    public DeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializerFactory deserializerFactory) {
        this.d = defaultDeserializationContext.d;
        this.e = deserializerFactory;
        this.f = defaultDeserializationContext.f;
        this.g = defaultDeserializationContext.g;
        this.h = defaultDeserializationContext.h;
        this.i = defaultDeserializationContext.i;
    }
}

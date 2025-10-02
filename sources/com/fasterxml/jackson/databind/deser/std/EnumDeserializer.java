package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.util.ArrayList;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    public final Object[] g;
    public final Enum h;
    public final CompactStringObjectMap i;
    public CompactStringObjectMap j;
    public final Boolean k;
    public final boolean l;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14259a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f14259a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14259a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14259a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this.i = enumDeserializer.i;
        this.g = enumDeserializer.g;
        this.h = enumDeserializer.h;
        this.k = bool;
        this.l = enumDeserializer.l;
    }

    public static JsonDeserializer p0(DeserializationConfig deserializationConfig, Class cls, AnnotatedMethod annotatedMethod, StdValueInstantiator stdValueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) throws SecurityException {
        deserializationConfig.getClass();
        if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            ClassUtil.e(annotatedMethod.g, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.t(0), stdValueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer q0(DeserializationConfig deserializationConfig, Class cls, AnnotatedMethod annotatedMethod) throws SecurityException {
        deserializationConfig.getClass();
        if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            ClassUtil.e(annotatedMethod.g, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, this.d);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.e) : null;
        Boolean bool = this.k;
        if (boolB == null) {
            boolB = bool;
        }
        return Objects.equals(bool, boolB) ? this : new EnumDeserializer(this, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.a1(JsonToken.VALUE_STRING)) {
            return o0(deserializationContext, jsonParser.k0());
        }
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NUMBER_INT);
        Class cls = this.d;
        if (!zA1) {
            if (jsonParser.y1()) {
                deserializationContext.E(jsonParser, cls);
                throw null;
            }
            if (jsonParser.a1(JsonToken.START_ARRAY)) {
                return E(jsonParser, deserializationContext);
            }
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        if (this.l) {
            return o0(deserializationContext, jsonParser.k0());
        }
        int iH = jsonParser.H();
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.l, cls, CoercionInputShape.d);
        if (coercionActionN == CoercionAction.d) {
            if (deserializationContext.N(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                deserializationContext.I(cls, Integer.valueOf(iH), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
                throw null;
            }
            q(deserializationContext, coercionActionN, Integer.valueOf(iH), YU.a.e(iH, "Integer value (", ")"));
        }
        int iOrdinal = coercionActionN.ordinal();
        if (iOrdinal != 2) {
            Enum r4 = this.h;
            if (iOrdinal == 3) {
                return r4;
            }
            Object[] objArr = this.g;
            if (iH >= 0 && iH < objArr.length) {
                return objArr[iH];
            }
            if (r4 != null && deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r4;
            }
            if (!deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                deserializationContext.I(cls, Integer.valueOf(iH), "index value outside legal index range [0..%s]", Integer.valueOf(objArr.length - 1));
                throw null;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.l;
    }

    public final Object o0(DeserializationContext deserializationContext, String str) throws InvalidFormatException, NumberFormatException {
        CompactStringObjectMap compactStringObjectMapB;
        char cCharAt;
        Object obj;
        CoercionAction coercionActionO;
        Object objA;
        if (deserializationContext.N(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
            compactStringObjectMapB = this.j;
            if (compactStringObjectMapB == null) {
                synchronized (this) {
                    compactStringObjectMapB = EnumResolver.c(deserializationContext.f, this.d).b();
                }
                this.j = compactStringObjectMapB;
            }
        } else {
            compactStringObjectMapB = this.i;
        }
        Object objA2 = compactStringObjectMapB.a(str);
        if (objA2 != null) {
            return objA2;
        }
        String strTrim = str.trim();
        if (strTrim != str && (objA = compactStringObjectMapB.a(strTrim)) != null) {
            return objA;
        }
        Class cls = this.d;
        LogicalType logicalType = LogicalType.l;
        Enum r3 = this.h;
        String strTrim2 = strTrim.trim();
        if (strTrim2.isEmpty()) {
            if (r3 != null && deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r3;
            }
            if (!deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                if (strTrim.isEmpty()) {
                    coercionActionO = deserializationContext.n(logicalType, this.d, CoercionInputShape.i);
                    q(deserializationContext, coercionActionO, strTrim, "empty String (\"\")");
                } else {
                    coercionActionO = deserializationContext.o(logicalType, this.d);
                    q(deserializationContext, coercionActionO, strTrim, "blank String (all whitespace)");
                }
                int iOrdinal = coercionActionO.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    return r3;
                }
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.k)) {
            Object[] objArr = compactStringObjectMapB.f;
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && ((String) obj2).equalsIgnoreCase(strTrim2)) {
                    obj = objArr[i + 1];
                    break;
                }
                i += 2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!deserializationContext.N(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this.l && (cCharAt = strTrim2.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i2 = Integer.parseInt(strTrim2);
                if (!deserializationContext.f.m(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    deserializationContext.J(cls, strTrim2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    throw null;
                }
                if (i2 >= 0) {
                    Object[] objArr2 = this.g;
                    if (i2 < objArr2.length) {
                        return objArr2[i2];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (r3 != null && deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return r3;
        }
        if (deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        Object[] objArr3 = compactStringObjectMapB.f;
        int length2 = objArr3.length;
        ArrayList arrayList = new ArrayList(length2 >> 2);
        for (int i3 = 0; i3 < length2; i3 += 2) {
            Object obj3 = objArr3[i3];
            if (obj3 != null) {
                arrayList.add((String) obj3);
            }
        }
        deserializationContext.J(cls, strTrim2, "not one of the values accepted for Enum class: %s", arrayList);
        throw null;
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.d);
        this.i = enumResolver.b();
        this.g = enumResolver.e;
        this.h = enumResolver.g;
        this.k = bool;
        this.l = enumResolver.i;
    }
}

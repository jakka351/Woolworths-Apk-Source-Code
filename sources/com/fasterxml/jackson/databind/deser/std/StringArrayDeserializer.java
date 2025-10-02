package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    public static final String[] k = new String[0];
    public static final StringArrayDeserializer l = new StringArrayDeserializer(null, null, null);
    public final JsonDeserializer g;
    public final NullValueProvider h;
    public final Boolean i;
    public final boolean j;

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(String[].class);
        this.g = jsonDeserializer;
        this.h = nullValueProvider;
        this.i = bool;
        this.j = NullsConstantProvider.a(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        JsonDeserializer jsonDeserializer = this.g;
        JsonDeserializer jsonDeserializerG0 = StdDeserializer.g0(deserializationContext, beanProperty, jsonDeserializer);
        JavaType javaTypeL = deserializationContext.l(String.class);
        JsonDeserializer jsonDeserializerP = jsonDeserializerG0 == null ? deserializationContext.p(javaTypeL, beanProperty) : deserializationContext.C(jsonDeserializerG0, beanProperty, javaTypeL);
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, String[].class);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        NullValueProvider nullValueProviderF0 = StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerP);
        if (jsonDeserializerP != null && ClassUtil.x(jsonDeserializerP)) {
            jsonDeserializerP = null;
        }
        return (jsonDeserializer == jsonDeserializerP && Objects.equals(this.i, boolB) && this.h == nullValueProviderF0) ? this : new StringArrayDeserializer(jsonDeserializerP, nullValueProviderF0, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        String strK1;
        int i;
        if (!jsonParser.x1()) {
            return p0(jsonParser, deserializationContext);
        }
        if (this.g != null) {
            return o0(jsonParser, deserializationContext, null);
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        Object[] objArrG = objectBufferP.g();
        int i2 = 0;
        while (true) {
            try {
                strK1 = jsonParser.K1();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (strK1 == null) {
                    JsonToken jsonTokenE = jsonParser.e();
                    if (jsonTokenE == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) objectBufferP.f(objArrG, i2, String.class);
                        deserializationContext.a0(objectBufferP);
                        return strArr;
                    }
                    JsonToken jsonToken = JsonToken.VALUE_NULL;
                    NullValueProvider nullValueProvider = this.h;
                    if (jsonTokenE != jsonToken) {
                        strK1 = a0(jsonParser, deserializationContext, nullValueProvider);
                    } else if (!this.j) {
                        strK1 = (String) nullValueProvider.c(deserializationContext);
                    }
                }
                objArrG[i2] = strK1;
                i2 = i;
            } catch (Exception e2) {
                e = e2;
                i2 = i;
                throw JsonMappingException.i(e, objArrG, objectBufferP.c + i2);
            }
            if (i2 >= objArrG.length) {
                objArrG = objectBufferP.c(objArrG);
                i2 = 0;
            }
            i = i2 + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        String[] strArr = (String[]) obj;
        if (!jsonParser.x1()) {
            String[] strArrP0 = p0(jsonParser, deserializationContext);
            if (strArrP0 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrP0.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrP0, 0, strArr2, length, strArrP0.length);
            return strArr2;
        }
        if (this.g != null) {
            return o0(jsonParser, deserializationContext, strArr);
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        int length2 = strArr.length;
        Object[] objArrH = objectBufferP.h(length2, strArr);
        while (true) {
            try {
                String strK1 = jsonParser.K1();
                if (strK1 == null) {
                    JsonToken jsonTokenE = jsonParser.e();
                    if (jsonTokenE == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) objectBufferP.f(objArrH, length2, String.class);
                        deserializationContext.a0(objectBufferP);
                        return strArr3;
                    }
                    JsonToken jsonToken = JsonToken.VALUE_NULL;
                    NullValueProvider nullValueProvider = this.h;
                    if (jsonTokenE != jsonToken) {
                        strK1 = a0(jsonParser, deserializationContext, nullValueProvider);
                    } else {
                        if (this.j) {
                            return k;
                        }
                        strK1 = (String) nullValueProvider.c(deserializationContext);
                    }
                }
                if (length2 >= objArrH.length) {
                    objArrH = objectBufferP.c(objArrH);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    objArrH[length2] = strK1;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.i(e, objArrH, objectBufferP.c + length2);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return k;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public final String[] o0(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws JsonMappingException {
        int length;
        Object[] objArrH;
        String str;
        int i;
        ObjectBuffer objectBufferP = deserializationContext.P();
        if (strArr == null) {
            objArrH = objectBufferP.g();
            length = 0;
        } else {
            length = strArr.length;
            objArrH = objectBufferP.h(length, strArr);
        }
        while (true) {
            try {
                String strK1 = jsonParser.K1();
                JsonDeserializer jsonDeserializer = this.g;
                try {
                    if (strK1 == null) {
                        JsonToken jsonTokenE = jsonParser.e();
                        if (jsonTokenE == JsonToken.END_ARRAY) {
                            String[] strArr2 = (String[]) objectBufferP.f(objArrH, length, String.class);
                            deserializationContext.a0(objectBufferP);
                            return strArr2;
                        }
                        if (jsonTokenE != JsonToken.VALUE_NULL) {
                            str = (String) jsonDeserializer.e(jsonParser, deserializationContext);
                        } else if (!this.j) {
                            str = (String) this.h.c(deserializationContext);
                        }
                    } else {
                        str = (String) jsonDeserializer.e(jsonParser, deserializationContext);
                    }
                    objArrH[length] = str;
                    length = i;
                } catch (Exception e) {
                    e = e;
                    length = i;
                    throw JsonMappingException.i(e, String.class, length);
                }
                if (length >= objArrH.length) {
                    objArrH = objectBufferP.c(objArrH);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    public final String[] p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        String strA0;
        CoercionAction coercionActionO;
        Boolean bool = Boolean.TRUE;
        Class cls = this.d;
        Boolean bool2 = this.i;
        if (bool2 != bool && (bool2 != null || !deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                return (String[]) G(jsonParser, deserializationContext);
            }
            deserializationContext.E(jsonParser, cls);
            throw null;
        }
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.h;
        if (zA1) {
            strA0 = (String) nullValueProvider.c(deserializationContext);
        } else {
            if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                String strK0 = jsonParser.k0();
                boolean zIsEmpty = strK0.isEmpty();
                CoercionAction coercionAction = CoercionAction.d;
                LogicalType logicalType = LogicalType.d;
                if (zIsEmpty) {
                    CoercionAction coercionActionN = deserializationContext.n(logicalType, cls, CoercionInputShape.i);
                    if (coercionActionN != coercionAction) {
                        return (String[]) F(deserializationContext, coercionActionN);
                    }
                } else if (StdDeserializer.I(strK0) && (coercionActionO = deserializationContext.o(logicalType, cls)) != coercionAction) {
                    return (String[]) F(deserializationContext, coercionActionO);
                }
            }
            strA0 = a0(jsonParser, deserializationContext, nullValueProvider);
        }
        return new String[]{strA0};
    }
}

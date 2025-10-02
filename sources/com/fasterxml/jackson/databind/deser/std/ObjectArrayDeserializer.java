package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
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
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.lang.reflect.Array;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements ContextualDeserializer {
    public final boolean k;
    public final Class l;
    public final JsonDeserializer m;
    public final TypeDeserializer n;
    public final Object[] o;

    public ObjectArrayDeserializer(ArrayType arrayType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(arrayType, (NullValueProvider) null, (Boolean) null);
        Class cls = arrayType.m.d;
        this.l = cls;
        this.k = cls == Object.class;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
        this.o = (Object[]) arrayType.n;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        JavaType javaType = this.g;
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, javaType.d);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        JsonDeserializer jsonDeserializer = this.m;
        JsonDeserializer jsonDeserializerG0 = StdDeserializer.g0(deserializationContext, beanProperty, jsonDeserializer);
        JavaType javaTypeK = javaType.k();
        JsonDeserializer jsonDeserializerP = jsonDeserializerG0 == null ? deserializationContext.p(javaTypeK, beanProperty) : deserializationContext.C(jsonDeserializerG0, beanProperty, javaTypeK);
        TypeDeserializer typeDeserializer = this.n;
        TypeDeserializer typeDeserializerF = typeDeserializer != null ? typeDeserializer.f(beanProperty) : typeDeserializer;
        NullValueProvider nullValueProviderF0 = StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerP);
        return (Objects.equals(boolB, this.j) && nullValueProviderF0 == this.h && jsonDeserializerP == jsonDeserializer && typeDeserializerF == typeDeserializer) ? this : new ObjectArrayDeserializer(this, jsonDeserializerP, typeDeserializerF, nullValueProviderF0, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        Object objE;
        int i;
        if (!jsonParser.x1()) {
            return q0(jsonParser, deserializationContext);
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        Object[] objArrG = objectBufferP.g();
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenN1 = jsonParser.N1();
                if (jsonTokenN1 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                        JsonDeserializer jsonDeserializer = this.m;
                        TypeDeserializer typeDeserializer = this.n;
                        objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this.i) {
                        objE = this.h.c(deserializationContext);
                    }
                    objArrG[i2] = objE;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.i(e, objArrG, objectBufferP.c + i2);
                }
                if (i2 >= objArrG.length) {
                    objArrG = objectBufferP.c(objArrG);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        Object[] objArrE = this.k ? objectBufferP.e(i2, objArrG) : objectBufferP.f(objArrG, i2, this.l);
        deserializationContext.a0(objectBufferP);
        return objArrE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        Object objE;
        int i;
        Object[] objArr = (Object[]) obj;
        if (!jsonParser.x1()) {
            Object[] objArrQ0 = q0(jsonParser, deserializationContext);
            if (objArrQ0 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrQ0.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrQ0, 0, objArr2, length, objArrQ0.length);
            return objArr2;
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        int length2 = objArr.length;
        Object[] objArrH = objectBufferP.h(length2, objArr);
        while (true) {
            try {
                JsonToken jsonTokenN1 = jsonParser.N1();
                if (jsonTokenN1 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                        JsonDeserializer jsonDeserializer = this.m;
                        TypeDeserializer typeDeserializer = this.n;
                        objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this.i) {
                        objE = this.h.c(deserializationContext);
                    }
                    objArrH[length2] = objE;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.i(e, objArrH, objectBufferP.c + length2);
                }
                if (length2 >= objArrH.length) {
                    objArrH = objectBufferP.c(objArrH);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        Object[] objArrE = this.k ? objectBufferP.e(length2, objArrH) : objectBufferP.f(objArrH, length2, this.l);
        deserializationContext.a0(objectBufferP);
        return objArrE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return (Object[]) typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.e;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return this.o;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.m == null && this.n == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.m;
    }

    public final Object[] q0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        Object objE;
        CoercionAction coercionActionO;
        Boolean bool = Boolean.TRUE;
        Class cls = this.l;
        Boolean bool2 = this.j;
        if (bool2 != bool && (bool2 != null || !deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!jsonParser.a1(JsonToken.VALUE_STRING)) {
                deserializationContext.D(jsonParser, this.g);
                throw null;
            }
            if (cls != Byte.class) {
                return (Object[]) G(jsonParser, deserializationContext);
            }
            byte[] bArrH = jsonParser.h(deserializationContext.f.e.j);
            Byte[] bArr = new Byte[bArrH.length];
            int length = bArrH.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.valueOf(bArrH[i]);
            }
            return bArr;
        }
        if (!jsonParser.a1(JsonToken.VALUE_NULL)) {
            if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                String strK0 = jsonParser.k0();
                boolean zIsEmpty = strK0.isEmpty();
                CoercionAction coercionAction = CoercionAction.d;
                Class cls2 = this.d;
                LogicalType logicalType = LogicalType.d;
                if (zIsEmpty) {
                    CoercionAction coercionActionN = deserializationContext.n(logicalType, cls2, CoercionInputShape.i);
                    if (coercionActionN != coercionAction) {
                        return (Object[]) F(deserializationContext, coercionActionN);
                    }
                } else if (StdDeserializer.I(strK0) && (coercionActionO = deserializationContext.o(logicalType, cls2)) != coercionAction) {
                    return (Object[]) F(deserializationContext, coercionActionO);
                }
            }
            JsonDeserializer jsonDeserializer = this.m;
            TypeDeserializer typeDeserializer = this.n;
            objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
        } else {
            if (this.i) {
                return this.o;
            }
            objE = this.h.c(deserializationContext);
        }
        Object[] objArr = this.k ? new Object[1] : (Object[]) Array.newInstance((Class<?>) cls, 1);
        objArr[0] = objE;
        return objArr;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(objectArrayDeserializer, nullValueProvider, bool);
        this.l = objectArrayDeserializer.l;
        this.k = objectArrayDeserializer.k;
        this.o = objectArrayDeserializer.o;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
    }
}

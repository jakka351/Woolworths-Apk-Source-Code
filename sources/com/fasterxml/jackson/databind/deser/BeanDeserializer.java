package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public transient NullPointerException B;
    public volatile transient NameTransformer C;

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14238a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f14238a = iArr2;
            try {
                iArr2[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14238a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14238a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14238a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14238a[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14238a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14238a[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14238a[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14238a[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14238a[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static class BeanReferring extends ReadableObjectId.Referring {
        public final DeserializationContext b;
        public final SettableBeanProperty c;
        public Object d;

        public BeanReferring(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.b = deserializationContext;
            this.c = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void a(Object obj, Object obj2) throws MismatchedInputException {
            Object obj3 = this.d;
            SettableBeanProperty settableBeanProperty = this.c;
            if (obj3 != null) {
                settableBeanProperty.z(obj3, obj2);
            } else {
                this.b.U(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.f.d, settableBeanProperty.m().getName());
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Object E(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer jsonDeserializer = this.k;
        if (jsonDeserializer != null || (jsonDeserializer = this.j) != null) {
            Object objX = this.i.x(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
            if (this.p != null) {
                G0(deserializationContext, objX);
            }
            return objX;
        }
        CoercionAction coercionActionN = deserializationContext.n(LogicalType.g, l(), CoercionInputShape.h);
        boolean zN = deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zN || coercionActionN != CoercionAction.d) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenN1 == jsonToken) {
                int iOrdinal = coercionActionN.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return null;
                }
                if (iOrdinal == 3) {
                    return j(deserializationContext);
                }
                deserializationContext.F(l0(deserializationContext), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
                throw null;
            }
            if (zN) {
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                if (jsonTokenN1 == jsonToken2) {
                    JavaType javaTypeL0 = l0(deserializationContext);
                    deserializationContext.F(javaTypeL0, jsonToken2, jsonParser, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", ClassUtil.t(javaTypeL0), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
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
        deserializationContext.D(jsonParser, l0(deserializationContext));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase H0(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase I0(Set set, Set set2) {
        return new BeanDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase J0() {
        return new BeanDeserializer(this, true);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase K0(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    public final Object N0(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.g(jsonParser, deserializationContext);
        } catch (Exception e) {
            BeanDeserializerBase.L0(deserializationContext, e, this.g.d, settableBeanProperty.f.d);
            throw null;
        }
    }

    public final Object O0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, ExternalTypeHandler externalTypeHandler) throws IOException {
        if (this.u) {
            deserializationContext.getClass();
        }
        JsonToken jsonTokenE = jsonParser.e();
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            JsonToken jsonTokenN1 = jsonParser.N1();
            SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
            if (settableBeanPropertyG != null) {
                if (jsonTokenN1.k) {
                    externalTypeHandler.f(jsonParser, deserializationContext, obj, strD);
                }
                try {
                    settableBeanPropertyG.h(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    BeanDeserializerBase.L0(deserializationContext, e, obj, strD);
                    throw null;
                }
            } else if (IgnorePropertiesUtil.b(strD, this.r, this.s)) {
                B0(jsonParser, deserializationContext, obj, strD);
            } else if (externalTypeHandler.e(jsonParser, deserializationContext, obj, strD)) {
                continue;
            } else {
                SettableAnyProperty settableAnyProperty = this.q;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.c(jsonParser, deserializationContext, obj, strD);
                    } catch (Exception e2) {
                        BeanDeserializerBase.L0(deserializationContext, e2, obj, strD);
                        throw null;
                    }
                } else {
                    E0(jsonParser, deserializationContext, obj, strD);
                }
            }
            jsonTokenE = jsonParser.N1();
        }
        externalTypeHandler.d(jsonParser, deserializationContext, obj);
        return obj;
    }

    public Object P0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objZ;
        ObjectIdReader objectIdReader = this.z;
        if (objectIdReader != null) {
            objectIdReader.f.getClass();
        }
        boolean z = this.m;
        ValueInjector[] valueInjectorArr = this.p;
        boolean z2 = this.u;
        ValueInstantiator valueInstantiator = this.i;
        BeanPropertyMap beanPropertyMap = this.o;
        if (!z) {
            Object objY = valueInstantiator.y(deserializationContext);
            jsonParser.U1(objY);
            if (jsonParser.a() && (objZ = jsonParser.Z()) != null) {
                r0(jsonParser, deserializationContext, objY, objZ);
            }
            if (valueInjectorArr != null) {
                G0(deserializationContext, objY);
            }
            if (z2) {
                deserializationContext.getClass();
            }
            if (jsonParser.b1()) {
                String strD = jsonParser.d();
                do {
                    jsonParser.N1();
                    SettableBeanProperty settableBeanPropertyG = beanPropertyMap.g(strD);
                    if (settableBeanPropertyG != null) {
                        try {
                            settableBeanPropertyG.h(jsonParser, deserializationContext, objY);
                        } catch (Exception e) {
                            BeanDeserializerBase.L0(deserializationContext, e, objY, strD);
                            throw null;
                        }
                    } else {
                        F0(jsonParser, deserializationContext, objY, strD);
                    }
                    strD = jsonParser.J1();
                } while (strD != null);
            }
            return objY;
        }
        UnwrappedPropertyHandler unwrappedPropertyHandler = this.x;
        JavaType javaType = this.g;
        Set set = this.r;
        Set set2 = this.s;
        if (unwrappedPropertyHandler == null) {
            ExternalTypeHandler externalTypeHandler = this.y;
            if (externalTypeHandler == null) {
                return y0(jsonParser, deserializationContext);
            }
            if (this.l == null) {
                JsonDeserializer jsonDeserializer = this.j;
                if (jsonDeserializer != null) {
                    return valueInstantiator.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
                }
                Object objY2 = valueInstantiator.y(deserializationContext);
                Q0(jsonParser, deserializationContext, objY2);
                return objY2;
            }
            ExternalTypeHandler externalTypeHandler2 = new ExternalTypeHandler(externalTypeHandler);
            PropertyBasedCreator propertyBasedCreator = this.l;
            PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, objectIdReader);
            if (z2) {
                deserializationContext.getClass();
            }
            JsonToken jsonTokenE = jsonParser.e();
            while (jsonTokenE == JsonToken.FIELD_NAME) {
                String strD2 = jsonParser.d();
                JsonToken jsonTokenN1 = jsonParser.N1();
                SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strD2);
                if (!propertyValueBufferD.f(strD2) || settableBeanPropertyC != null) {
                    if (settableBeanPropertyC == null) {
                        SettableBeanProperty settableBeanPropertyG2 = beanPropertyMap.g(strD2);
                        if (settableBeanPropertyG2 != null) {
                            if (jsonTokenN1.k) {
                                externalTypeHandler2.f(jsonParser, deserializationContext, null, strD2);
                            }
                            propertyValueBufferD.e(settableBeanPropertyG2, settableBeanPropertyG2.g(jsonParser, deserializationContext));
                        } else if (!externalTypeHandler2.e(jsonParser, deserializationContext, null, strD2)) {
                            if (IgnorePropertiesUtil.b(strD2, set, set2)) {
                                B0(jsonParser, deserializationContext, javaType.d, strD2);
                            } else {
                                SettableAnyProperty settableAnyProperty = this.q;
                                if (settableAnyProperty != null) {
                                    propertyValueBufferD.c(settableAnyProperty, strD2, settableAnyProperty.b(jsonParser, deserializationContext));
                                } else {
                                    E0(jsonParser, deserializationContext, this.d, strD2);
                                }
                            }
                        }
                    } else if (!externalTypeHandler2.e(jsonParser, deserializationContext, null, strD2) && propertyValueBufferD.b(settableBeanPropertyC, N0(jsonParser, deserializationContext, settableBeanPropertyC))) {
                        jsonParser.N1();
                        try {
                            Object objA = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                            if (objA.getClass() == javaType.d) {
                                O0(jsonParser, deserializationContext, objA, externalTypeHandler2);
                                return objA;
                            }
                            deserializationContext.j(String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objA.getClass()));
                            throw null;
                        } catch (Exception e2) {
                            BeanDeserializerBase.L0(deserializationContext, e2, javaType.d, strD2);
                            throw null;
                        }
                    }
                }
                jsonTokenE = jsonParser.N1();
            }
            try {
                return externalTypeHandler2.c(jsonParser, deserializationContext, propertyValueBufferD, propertyBasedCreator);
            } catch (Exception e3) {
                M0(e3, deserializationContext);
                throw null;
            }
        }
        JsonDeserializer jsonDeserializer2 = this.j;
        if (jsonDeserializer2 != null) {
            return valueInstantiator.z(deserializationContext, jsonDeserializer2.e(jsonParser, deserializationContext));
        }
        PropertyBasedCreator propertyBasedCreator2 = this.l;
        if (propertyBasedCreator2 == null) {
            TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
            tokenBufferK.p1();
            Object objY3 = valueInstantiator.y(deserializationContext);
            jsonParser.U1(objY3);
            if (valueInjectorArr != null) {
                G0(deserializationContext, objY3);
            }
            String strD3 = jsonParser.b1() ? jsonParser.d() : null;
            while (strD3 != null) {
                jsonParser.N1();
                SettableBeanProperty settableBeanPropertyG3 = beanPropertyMap.g(strD3);
                if (settableBeanPropertyG3 != null) {
                    try {
                        settableBeanPropertyG3.h(jsonParser, deserializationContext, objY3);
                    } catch (Exception e4) {
                        BeanDeserializerBase.L0(deserializationContext, e4, objY3, strD3);
                        throw null;
                    }
                } else if (IgnorePropertiesUtil.b(strD3, set, set2)) {
                    B0(jsonParser, deserializationContext, objY3, strD3);
                } else if (this.q == null) {
                    tokenBufferK.U(strD3);
                    tokenBufferK.u2(jsonParser);
                } else {
                    TokenBuffer tokenBufferK2 = deserializationContext.k(jsonParser);
                    tokenBufferK2.u2(jsonParser);
                    tokenBufferK.U(strD3);
                    tokenBufferK.g2(tokenBufferK2);
                    try {
                        SettableAnyProperty settableAnyProperty2 = this.q;
                        TokenBuffer.Parser parserM2 = tokenBufferK2.m2(tokenBufferK2.e);
                        parserM2.N1();
                        settableAnyProperty2.c(parserM2, deserializationContext, objY3, strD3);
                    } catch (Exception e5) {
                        BeanDeserializerBase.L0(deserializationContext, e5, objY3, strD3);
                        throw null;
                    }
                }
                strD3 = jsonParser.J1();
            }
            tokenBufferK.H();
            this.x.a(deserializationContext, objY3, tokenBufferK);
            return objY3;
        }
        PropertyValueBuffer propertyValueBufferD2 = propertyBasedCreator2.d(jsonParser, deserializationContext, objectIdReader);
        TokenBuffer tokenBufferK3 = deserializationContext.k(jsonParser);
        tokenBufferK3.p1();
        JsonToken jsonTokenE2 = jsonParser.e();
        while (jsonTokenE2 == JsonToken.FIELD_NAME) {
            String strD4 = jsonParser.d();
            jsonParser.N1();
            SettableBeanProperty settableBeanPropertyC2 = propertyBasedCreator2.c(strD4);
            if (!propertyValueBufferD2.f(strD4) || settableBeanPropertyC2 != null) {
                if (settableBeanPropertyC2 == null) {
                    SettableBeanProperty settableBeanPropertyG4 = beanPropertyMap.g(strD4);
                    if (settableBeanPropertyG4 != null) {
                        propertyValueBufferD2.e(settableBeanPropertyG4, N0(jsonParser, deserializationContext, settableBeanPropertyG4));
                    } else if (IgnorePropertiesUtil.b(strD4, set, set2)) {
                        B0(jsonParser, deserializationContext, javaType.d, strD4);
                    } else if (this.q == null) {
                        tokenBufferK3.U(strD4);
                        tokenBufferK3.u2(jsonParser);
                    } else {
                        TokenBuffer tokenBufferK4 = deserializationContext.k(jsonParser);
                        tokenBufferK4.u2(jsonParser);
                        tokenBufferK3.U(strD4);
                        tokenBufferK3.g2(tokenBufferK4);
                        try {
                            SettableAnyProperty settableAnyProperty3 = this.q;
                            TokenBuffer.Parser parserM22 = tokenBufferK4.m2(tokenBufferK4.e);
                            parserM22.N1();
                            propertyValueBufferD2.c(settableAnyProperty3, strD4, settableAnyProperty3.b(parserM22, deserializationContext));
                        } catch (Exception e6) {
                            BeanDeserializerBase.L0(deserializationContext, e6, javaType.d, strD4);
                            throw null;
                        }
                    }
                } else if (propertyValueBufferD2.b(settableBeanPropertyC2, N0(jsonParser, deserializationContext, settableBeanPropertyC2))) {
                    JsonToken jsonTokenN12 = jsonParser.N1();
                    try {
                        Object objA2 = propertyBasedCreator2.a(deserializationContext, propertyValueBufferD2);
                        jsonParser.U1(objA2);
                        while (jsonTokenN12 == JsonToken.FIELD_NAME) {
                            tokenBufferK3.u2(jsonParser);
                            jsonTokenN12 = jsonParser.N1();
                        }
                        JsonToken jsonToken = JsonToken.END_OBJECT;
                        if (jsonTokenN12 != jsonToken) {
                            deserializationContext.Z(this, jsonToken, "Attempted to unwrap '%s' value", javaType.d.getName());
                            throw null;
                        }
                        tokenBufferK3.H();
                        if (objA2.getClass() == javaType.d) {
                            this.x.a(deserializationContext, objA2, tokenBufferK3);
                            return objA2;
                        }
                        deserializationContext.U(settableBeanPropertyC2, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                        throw null;
                    } catch (Exception e7) {
                        M0(e7, deserializationContext);
                        throw null;
                    }
                }
            }
            jsonTokenE2 = jsonParser.N1();
        }
        try {
            Object objA3 = propertyBasedCreator2.a(deserializationContext, propertyValueBufferD2);
            this.x.a(deserializationContext, objA3, tokenBufferK3);
            return objA3;
        } catch (Exception e8) {
            M0(e8, deserializationContext);
            throw null;
        }
    }

    public final Object Q0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        ExternalTypeHandler externalTypeHandler = this.y;
        externalTypeHandler.getClass();
        O0(jsonParser, deserializationContext, obj, new ExternalTypeHandler(externalTypeHandler));
        return obj;
    }

    public final Object R0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objY = this.i.y(deserializationContext);
        jsonParser.U1(objY);
        if (jsonParser.b1()) {
            String strD = jsonParser.d();
            do {
                jsonParser.N1();
                SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
                if (settableBeanPropertyG != null) {
                    try {
                        settableBeanPropertyG.h(jsonParser, deserializationContext, objY);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, objY, strD);
                        throw null;
                    }
                } else {
                    F0(jsonParser, deserializationContext, objY, strD);
                }
                strD = jsonParser.J1();
            } while (strD != null);
        }
        return objY;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objP0;
        boolean zY1 = jsonParser.y1();
        ObjectIdReader objectIdReader = this.z;
        if (zY1) {
            if (this.n) {
                jsonParser.N1();
                return R0(jsonParser, deserializationContext);
            }
            jsonParser.N1();
            return objectIdReader != null ? P0(jsonParser, deserializationContext) : P0(jsonParser, deserializationContext);
        }
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE != null) {
            switch (jsonTokenE.ordinal()) {
                case 2:
                case 5:
                    return this.n ? R0(jsonParser, deserializationContext) : objectIdReader != null ? P0(jsonParser, deserializationContext) : P0(jsonParser, deserializationContext);
                case 3:
                    return E(jsonParser, deserializationContext);
                case 6:
                    if (objectIdReader != null) {
                        return x0(jsonParser, deserializationContext);
                    }
                    JsonDeserializer jsonDeserializerO0 = o0();
                    if (jsonDeserializerO0 != null) {
                        ValueInstantiator valueInstantiator = this.i;
                        if (!valueInstantiator.h()) {
                            Object objZ = valueInstantiator.z(deserializationContext, jsonDeserializerO0.e(jsonParser, deserializationContext));
                            if (this.p != null) {
                                G0(deserializationContext, objZ);
                            }
                            return objZ;
                        }
                    }
                    Object objC = jsonParser.C();
                    if (objC != null) {
                        Class<?> cls = objC.getClass();
                        JavaType javaType = this.g;
                        if (!javaType.G(cls)) {
                            deserializationContext.f.getClass();
                            Class cls2 = javaType.d;
                            for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
                                ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
                            }
                            throw new InvalidFormatException(deserializationContext.i, a.j("Cannot deserialize value of type ", ClassUtil.B(cls2), " from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type ", ClassUtil.f(objC), ": incompatible types"), objC);
                        }
                    }
                    return objC;
                case 7:
                    return z0(jsonParser, deserializationContext);
                case 8:
                    return w0(jsonParser, deserializationContext);
                case 9:
                    return v0(jsonParser, deserializationContext);
                case 10:
                case 11:
                    return u0(jsonParser, deserializationContext);
                case 12:
                    if (!jsonParser.R1()) {
                        deserializationContext.D(jsonParser, l0(deserializationContext));
                        throw null;
                    }
                    TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
                    tokenBufferK.H();
                    TokenBuffer.Parser parserK2 = tokenBufferK.k2(jsonParser);
                    parserK2.N1();
                    if (this.n) {
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        objP0 = R0(parserK2, deserializationContext);
                    } else {
                        objP0 = P0(parserK2, deserializationContext);
                    }
                    parserK2.close();
                    return objP0;
            }
        }
        deserializationContext.D(jsonParser, l0(deserializationContext));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9, java.lang.Object r10) throws java.io.IOException {
        /*
            r7 = this;
            r8.U1(r10)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] r0 = r7.p
            if (r0 == 0) goto La
            r7.G0(r9, r10)
        La:
            com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler r0 = r7.x
            r1 = 0
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r2 = r7.o
            if (r0 == 0) goto L85
            com.fasterxml.jackson.core.JsonToken r0 = r8.e()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r3) goto L1d
            com.fasterxml.jackson.core.JsonToken r0 = r8.N1()
        L1d:
            com.fasterxml.jackson.databind.util.TokenBuffer r3 = r9.k(r8)
            r3.p1()
        L24:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r4) goto L7c
            java.lang.String r0 = r8.d()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r2.g(r0)
            r8.N1()
            if (r4 == 0) goto L3e
            r4.h(r8, r9, r10)     // Catch: java.lang.Exception -> L39
            goto L72
        L39:
            r8 = move-exception
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.L0(r9, r8, r10, r0)
            throw r1
        L3e:
            java.util.Set r4 = r7.r
            java.util.Set r5 = r7.s
            boolean r4 = com.fasterxml.jackson.databind.util.IgnorePropertiesUtil.b(r0, r4, r5)
            if (r4 == 0) goto L4c
            r7.B0(r8, r9, r10, r0)
            goto L72
        L4c:
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r4 = r7.q
            if (r4 != 0) goto L57
            r3.U(r0)
            r3.u2(r8)
            goto L72
        L57:
            com.fasterxml.jackson.databind.util.TokenBuffer r4 = r9.k(r8)
            r4.u2(r8)
            r3.U(r0)
            r3.g2(r4)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r5 = r7.q     // Catch: java.lang.Exception -> L77
            com.fasterxml.jackson.core.ObjectCodec r6 = r4.e     // Catch: java.lang.Exception -> L77
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser r4 = r4.m2(r6)     // Catch: java.lang.Exception -> L77
            r4.N1()     // Catch: java.lang.Exception -> L77
            r5.c(r4, r9, r10, r0)     // Catch: java.lang.Exception -> L77
        L72:
            com.fasterxml.jackson.core.JsonToken r0 = r8.N1()
            goto L24
        L77:
            r8 = move-exception
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.L0(r9, r8, r10, r0)
            throw r1
        L7c:
            r3.H()
            com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler r8 = r7.x
            r8.a(r9, r10, r3)
            return r10
        L85:
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler r0 = r7.y
            if (r0 == 0) goto L8d
            r7.Q0(r8, r9, r10)
            return r10
        L8d:
            boolean r0 = r8.y1()
            if (r0 == 0) goto L9a
            java.lang.String r0 = r8.J1()
            if (r0 != 0) goto La4
            goto Lc6
        L9a:
            boolean r0 = r8.b1()
            if (r0 == 0) goto Lc6
            java.lang.String r0 = r8.d()
        La4:
            boolean r3 = r7.u
            if (r3 == 0) goto Lab
            r9.getClass()
        Lab:
            r8.N1()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r3 = r2.g(r0)
            if (r3 == 0) goto Lbd
            r3.h(r8, r9, r10)     // Catch: java.lang.Exception -> Lb8
            goto Lc0
        Lb8:
            r8 = move-exception
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.L0(r9, r8, r10, r0)
            throw r1
        Lbd:
            r7.F0(r8, r9, r10, r0)
        Lc0:
            java.lang.String r0 = r8.J1()
            if (r0 != 0) goto Lab
        Lc6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer p(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this.C == nameTransformer) {
            return this;
        }
        this.C = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this.C = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this.l;
        PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, this.z);
        if (this.u) {
            deserializationContext.getClass();
        }
        JsonToken jsonTokenE = jsonParser.e();
        ArrayList arrayList = null;
        TokenBuffer tokenBufferK = null;
        while (true) {
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            JavaType javaType = this.g;
            if (jsonTokenE != jsonToken) {
                try {
                    Object objA = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                    if (this.p != null) {
                        G0(deserializationContext, objA);
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((BeanReferring) it.next()).d = objA;
                        }
                    }
                    if (tokenBufferK != null) {
                        if (objA.getClass() != javaType.d) {
                            return C0(null, deserializationContext, objA, tokenBufferK);
                        }
                        D0(deserializationContext, objA, tokenBufferK);
                    }
                    return objA;
                } catch (Exception e) {
                    M0(e, deserializationContext);
                    throw null;
                }
            }
            String strD = jsonParser.d();
            jsonParser.N1();
            SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strD);
            if (!propertyValueBufferD.f(strD) || settableBeanPropertyC != null) {
                if (settableBeanPropertyC == null) {
                    SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
                    if (settableBeanPropertyG != null) {
                        try {
                            propertyValueBufferD.e(settableBeanPropertyG, N0(jsonParser, deserializationContext, settableBeanPropertyG));
                        } catch (UnresolvedForwardReference e2) {
                            BeanReferring beanReferring = new BeanReferring(deserializationContext, e2, settableBeanPropertyG.g, settableBeanPropertyG);
                            e2.h.a(beanReferring);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(beanReferring);
                        }
                    } else if (IgnorePropertiesUtil.b(strD, this.r, this.s)) {
                        B0(jsonParser, deserializationContext, javaType.d, strD);
                    } else {
                        SettableAnyProperty settableAnyProperty = this.q;
                        if (settableAnyProperty != null) {
                            try {
                                propertyValueBufferD.c(settableAnyProperty, strD, settableAnyProperty.b(jsonParser, deserializationContext));
                            } catch (Exception e3) {
                                BeanDeserializerBase.L0(deserializationContext, e3, javaType.d, strD);
                                throw null;
                            }
                        } else if (this.t) {
                            jsonParser.V1();
                        } else {
                            if (tokenBufferK == null) {
                                tokenBufferK = deserializationContext.k(jsonParser);
                            }
                            tokenBufferK.U(strD);
                            tokenBufferK.u2(jsonParser);
                        }
                    }
                } else if (propertyValueBufferD.b(settableBeanPropertyC, N0(jsonParser, deserializationContext, settableBeanPropertyC))) {
                    jsonParser.N1();
                    try {
                        Object objA2 = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                        if (objA2 == null) {
                            Class cls = javaType.d;
                            if (this.B == null) {
                                this.B = new NullPointerException("JSON Creator returned null");
                            }
                            deserializationContext.y(this.B, cls);
                            throw null;
                        }
                        jsonParser.U1(objA2);
                        if (objA2.getClass() != javaType.d) {
                            return C0(jsonParser, deserializationContext, objA2, tokenBufferK);
                        }
                        if (tokenBufferK != null) {
                            D0(deserializationContext, objA2, tokenBufferK);
                        }
                        f(jsonParser, deserializationContext, objA2);
                        return objA2;
                    } catch (Exception e4) {
                        M0(e4, deserializationContext);
                        throw null;
                    }
                }
            }
            jsonTokenE = jsonParser.N1();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase t0() {
        return new BeanAsArrayDeserializer(this, this.o.i);
    }
}

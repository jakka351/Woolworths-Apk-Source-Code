package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public final AnnotatedMethod B;
    public final JavaType C;

    /* renamed from: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14240a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f14240a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14240a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14240a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BuilderBasedDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, JavaType javaType, BeanPropertyMap beanPropertyMap, HashMap map, HashSet hashSet, boolean z, HashSet hashSet2, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, hashSet2, z2);
        this.C = javaType;
        this.B = beanDeserializerBuilder.m;
        if (this.z == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + beanDescription.f14226a + ")");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Object E(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        JsonDeserializer jsonDeserializer = this.k;
        if (jsonDeserializer != null || (jsonDeserializer = this.j) != null) {
            Object objX = this.i.x(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
            if (this.p != null) {
                G0(deserializationContext, objX);
            }
            return Q0(deserializationContext, objX);
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
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            if (zN) {
                Object objE = e(jsonParser2, deserializationContext2);
                if (jsonParser2.N1() == jsonToken) {
                    return objE;
                }
                m0(deserializationContext2);
                throw null;
            }
        } else {
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
        }
        deserializationContext2.D(jsonParser2, l0(deserializationContext2));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase H0(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase I0(Set set, Set set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase J0() {
        return new BuilderBasedDeserializer(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase K0(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    public final Object N0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z = this.m;
        ValueInjector[] valueInjectorArr = this.p;
        BeanPropertyMap beanPropertyMap = this.o;
        ValueInstantiator valueInstantiator = this.i;
        if (!z) {
            Object objY = valueInstantiator.y(deserializationContext);
            if (valueInjectorArr != null) {
                G0(deserializationContext, objY);
            }
            if (this.u) {
                deserializationContext.getClass();
            }
            while (jsonParser.e() == JsonToken.FIELD_NAME) {
                String strD = jsonParser.d();
                jsonParser.N1();
                SettableBeanProperty settableBeanPropertyG = beanPropertyMap.g(strD);
                if (settableBeanPropertyG != null) {
                    try {
                        objY = settableBeanPropertyG.i(jsonParser, deserializationContext, objY);
                    } catch (Exception e) {
                        BeanDeserializerBase.L0(deserializationContext, e, objY, strD);
                        throw null;
                    }
                } else {
                    F0(jsonParser, deserializationContext, objY, strD);
                }
                jsonParser.N1();
            }
            return objY;
        }
        if (this.x == null) {
            if (this.y == null) {
                return y0(jsonParser, deserializationContext);
            }
            if (this.l == null) {
                return O0(jsonParser, deserializationContext, valueInstantiator.y(deserializationContext));
            }
            deserializationContext.j(String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", this.C));
            throw null;
        }
        JsonDeserializer jsonDeserializer = this.j;
        if (jsonDeserializer != null) {
            return valueInstantiator.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
        }
        PropertyBasedCreator propertyBasedCreator = this.l;
        Set set = this.s;
        Set set2 = this.r;
        if (propertyBasedCreator == null) {
            TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
            tokenBufferK.p1();
            Object objY2 = valueInstantiator.y(deserializationContext);
            if (valueInjectorArr != null) {
                G0(deserializationContext, objY2);
            }
            while (jsonParser.e() == JsonToken.FIELD_NAME) {
                String strD2 = jsonParser.d();
                jsonParser.N1();
                SettableBeanProperty settableBeanPropertyG2 = beanPropertyMap.g(strD2);
                if (settableBeanPropertyG2 != null) {
                    try {
                        objY2 = settableBeanPropertyG2.i(jsonParser, deserializationContext, objY2);
                    } catch (Exception e2) {
                        BeanDeserializerBase.L0(deserializationContext, e2, objY2, strD2);
                        throw null;
                    }
                } else if (IgnorePropertiesUtil.b(strD2, set2, set)) {
                    B0(jsonParser, deserializationContext, objY2, strD2);
                } else {
                    tokenBufferK.U(strD2);
                    tokenBufferK.u2(jsonParser);
                    SettableAnyProperty settableAnyProperty = this.q;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.c(jsonParser, deserializationContext, objY2, strD2);
                        } catch (Exception e3) {
                            BeanDeserializerBase.L0(deserializationContext, e3, objY2, strD2);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
                jsonParser.N1();
            }
            tokenBufferK.H();
            this.x.a(deserializationContext, objY2, tokenBufferK);
            return objY2;
        }
        PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, this.z);
        TokenBuffer tokenBufferK2 = deserializationContext.k(jsonParser);
        tokenBufferK2.p1();
        JsonToken jsonTokenE = jsonParser.e();
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD3 = jsonParser.d();
            jsonParser.N1();
            SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strD3);
            if (!propertyValueBufferD.f(strD3) || settableBeanPropertyC != null) {
                JavaType javaType = this.g;
                if (settableBeanPropertyC == null) {
                    SettableBeanProperty settableBeanPropertyG3 = beanPropertyMap.g(strD3);
                    if (settableBeanPropertyG3 != null) {
                        propertyValueBufferD.e(settableBeanPropertyG3, settableBeanPropertyG3.g(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.b(strD3, set2, set)) {
                        B0(jsonParser, deserializationContext, javaType.d, strD3);
                    } else {
                        tokenBufferK2.U(strD3);
                        tokenBufferK2.u2(jsonParser);
                        SettableAnyProperty settableAnyProperty2 = this.q;
                        if (settableAnyProperty2 != null) {
                            propertyValueBufferD.c(settableAnyProperty2, strD3, settableAnyProperty2.b(jsonParser, deserializationContext));
                        }
                    }
                } else if (propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext))) {
                    jsonParser.N1();
                    try {
                        Object objA = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                        return objA.getClass() != javaType.d ? C0(jsonParser, deserializationContext, objA, tokenBufferK2) : P0(jsonParser, deserializationContext, objA, tokenBufferK2);
                    } catch (Exception e4) {
                        BeanDeserializerBase.L0(deserializationContext, e4, javaType.d, strD3);
                        throw null;
                    }
                }
            }
            jsonTokenE = jsonParser.N1();
        }
        tokenBufferK2.H();
        try {
            Object objA2 = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
            this.x.a(deserializationContext, objA2, tokenBufferK2);
            return objA2;
        } catch (Exception e5) {
            M0(e5, deserializationContext);
            throw null;
        }
    }

    public final Object O0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this.u) {
            deserializationContext.getClass();
        }
        ExternalTypeHandler externalTypeHandler = this.y;
        externalTypeHandler.getClass();
        ExternalTypeHandler externalTypeHandler2 = new ExternalTypeHandler(externalTypeHandler);
        JsonToken jsonTokenE = jsonParser.e();
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            JsonToken jsonTokenN1 = jsonParser.N1();
            SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
            if (settableBeanPropertyG != null) {
                if (jsonTokenN1.k) {
                    externalTypeHandler2.f(jsonParser, deserializationContext, obj, strD);
                }
                try {
                    obj = settableBeanPropertyG.i(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    BeanDeserializerBase.L0(deserializationContext, e, obj, strD);
                    throw null;
                }
            } else if (IgnorePropertiesUtil.b(strD, this.r, this.s)) {
                B0(jsonParser, deserializationContext, obj, strD);
            } else if (externalTypeHandler2.e(jsonParser, deserializationContext, obj, strD)) {
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
        externalTypeHandler2.d(jsonParser, deserializationContext, obj);
        return obj;
    }

    public final Object P0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        if (this.u) {
            deserializationContext.getClass();
        }
        JsonToken jsonTokenE = jsonParser.e();
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
            jsonParser.N1();
            if (settableBeanPropertyG != null) {
                try {
                    obj = settableBeanPropertyG.i(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    BeanDeserializerBase.L0(deserializationContext, e, obj, strD);
                    throw null;
                }
            } else if (IgnorePropertiesUtil.b(strD, this.r, this.s)) {
                B0(jsonParser, deserializationContext, obj, strD);
            } else {
                tokenBuffer.U(strD);
                tokenBuffer.u2(jsonParser);
                SettableAnyProperty settableAnyProperty = this.q;
                if (settableAnyProperty != null) {
                    settableAnyProperty.c(jsonParser, deserializationContext, obj, strD);
                }
            }
            jsonTokenE = jsonParser.N1();
        }
        tokenBuffer.H();
        this.x.a(deserializationContext, obj, tokenBuffer);
        return obj;
    }

    public final Object Q0(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this.B;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.g.invoke(obj, null);
        } catch (Exception e) {
            M0(e, deserializationContext);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.y1()) {
            switch (jsonParser.f()) {
                case 2:
                case 5:
                    return Q0(deserializationContext, N0(jsonParser, deserializationContext));
                case 3:
                    return E(jsonParser, deserializationContext);
                case 4:
                case 11:
                default:
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                case 6:
                    return Q0(deserializationContext, z0(jsonParser, deserializationContext));
                case 7:
                    return Q0(deserializationContext, w0(jsonParser, deserializationContext));
                case 8:
                    return Q0(deserializationContext, v0(jsonParser, deserializationContext));
                case 9:
                case 10:
                    return Q0(deserializationContext, u0(jsonParser, deserializationContext));
                case 12:
                    return jsonParser.C();
            }
        }
        jsonParser.N1();
        if (!this.n) {
            return Q0(deserializationContext, N0(jsonParser, deserializationContext));
        }
        Object objY = this.i.y(deserializationContext);
        while (jsonParser.e() == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            jsonParser.N1();
            SettableBeanProperty settableBeanPropertyG = this.o.g(strD);
            if (settableBeanPropertyG != null) {
                try {
                    objY = settableBeanPropertyG.i(jsonParser, deserializationContext, objY);
                } catch (Exception e) {
                    BeanDeserializerBase.L0(deserializationContext, e, objY, strD);
                    throw null;
                }
            } else {
                F0(jsonParser, deserializationContext, objY, strD);
            }
            jsonParser.N1();
        }
        return Q0(deserializationContext, objY);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        Class cls = this.g.d;
        Class<?> cls2 = obj.getClass();
        boolean zIsAssignableFrom = cls.isAssignableFrom(cls2);
        JavaType javaType = this.C;
        if (zIsAssignableFrom) {
            deserializationContext.j(String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, cls.getName()));
            throw null;
        }
        deserializationContext.j(String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls2.getName()));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer p(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this.l;
        PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, this.z);
        boolean z = this.u;
        if (z) {
            deserializationContext.getClass();
        }
        JsonToken jsonTokenE = jsonParser.e();
        TokenBuffer tokenBufferK = null;
        while (true) {
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            JavaType javaType = this.g;
            if (jsonTokenE != jsonToken) {
                try {
                    Object objA = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
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
                BeanPropertyMap beanPropertyMap = this.o;
                if (settableBeanPropertyC == null) {
                    SettableBeanProperty settableBeanPropertyG = beanPropertyMap.g(strD);
                    if (settableBeanPropertyG != null) {
                        propertyValueBufferD.e(settableBeanPropertyG, settableBeanPropertyG.g(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.b(strD, this.r, this.s)) {
                        B0(jsonParser, deserializationContext, javaType.d, strD);
                    } else {
                        SettableAnyProperty settableAnyProperty = this.q;
                        if (settableAnyProperty != null) {
                            propertyValueBufferD.c(settableAnyProperty, strD, settableAnyProperty.b(jsonParser, deserializationContext));
                        } else {
                            if (tokenBufferK == null) {
                                tokenBufferK = deserializationContext.k(jsonParser);
                            }
                            tokenBufferK.U(strD);
                            tokenBufferK.u2(jsonParser);
                        }
                    }
                } else if (propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext))) {
                    jsonParser.N1();
                    try {
                        Object objA2 = propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                        if (objA2.getClass() != javaType.d) {
                            return C0(jsonParser, deserializationContext, objA2, tokenBufferK);
                        }
                        if (tokenBufferK != null) {
                            D0(deserializationContext, objA2, tokenBufferK);
                        }
                        if (this.p != null) {
                            G0(deserializationContext, objA2);
                        }
                        if (this.x != null) {
                            if (jsonParser.a1(JsonToken.START_OBJECT)) {
                                jsonParser.N1();
                            }
                            TokenBuffer tokenBufferK2 = deserializationContext.k(jsonParser);
                            tokenBufferK2.p1();
                            return P0(jsonParser, deserializationContext, objA2, tokenBufferK2);
                        }
                        if (this.y != null) {
                            return O0(jsonParser, deserializationContext, objA2);
                        }
                        if (z) {
                            deserializationContext.getClass();
                        }
                        JsonToken jsonTokenE2 = jsonParser.e();
                        if (jsonTokenE2 == JsonToken.START_OBJECT) {
                            jsonTokenE2 = jsonParser.N1();
                        }
                        while (jsonTokenE2 == JsonToken.FIELD_NAME) {
                            String strD2 = jsonParser.d();
                            jsonParser.N1();
                            SettableBeanProperty settableBeanPropertyG2 = beanPropertyMap.g(strD2);
                            if (settableBeanPropertyG2 != null) {
                                try {
                                    objA2 = settableBeanPropertyG2.i(jsonParser, deserializationContext, objA2);
                                } catch (Exception e2) {
                                    BeanDeserializerBase.L0(deserializationContext, e2, objA2, strD2);
                                    throw null;
                                }
                            } else {
                                F0(jsonParser, deserializationContext, objA2, strD2);
                            }
                            jsonTokenE2 = jsonParser.N1();
                        }
                        return objA2;
                    } catch (Exception e3) {
                        BeanDeserializerBase.L0(deserializationContext, e3, javaType.d, strD);
                        throw null;
                    }
                }
            }
            jsonTokenE = jsonParser.N1();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final BeanDeserializerBase t0() {
        return new BeanAsArrayBuilderDeserializer(this, this.C, this.o.i, this.B);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        super((BeanDeserializerBase) builderBasedDeserializer, true);
        this.B = builderBasedDeserializer.B;
        this.C = builderBasedDeserializer.C;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this.B = builderBasedDeserializer.B;
        this.C = builderBasedDeserializer.C;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this.B = builderBasedDeserializer.B;
        this.C = builderBasedDeserializer.C;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set set, Set set2) {
        super(builderBasedDeserializer, set, set2);
        this.B = builderBasedDeserializer.B;
        this.C = builderBasedDeserializer.C;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this.B = builderBasedDeserializer.B;
        this.C = builderBasedDeserializer.C;
    }
}

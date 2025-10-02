package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: classes4.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer, ResolvableDeserializer {
    public final Class k;
    public final KeyDeserializer l;
    public final JsonDeserializer m;
    public final TypeDeserializer n;
    public final ValueInstantiator o;
    public JsonDeserializer p;
    public PropertyBasedCreator q;

    public EnumMapDeserializer(MapType mapType, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(mapType, (NullValueProvider) null, (Boolean) null);
        this.k = mapType.m.d;
        this.l = null;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
        this.o = valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void a(DeserializationContext deserializationContext) throws InvalidDefinitionException {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        ValueInstantiator valueInstantiator = this.o;
        if (valueInstantiator != null) {
            boolean zK = valueInstantiator.k();
            JavaType javaType = this.g;
            if (zK) {
                JavaType javaTypeF = valueInstantiator.F(deserializationConfig);
                if (javaTypeF != null) {
                    this.p = deserializationContext.p(javaTypeF, null);
                    return;
                } else {
                    deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                    throw null;
                }
            }
            if (!valueInstantiator.i()) {
                if (valueInstantiator.g()) {
                    this.q = PropertyBasedCreator.b(deserializationContext, valueInstantiator, valueInstantiator.G(deserializationConfig), deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
            } else {
                JavaType javaTypeC = valueInstantiator.C(deserializationConfig);
                if (javaTypeC != null) {
                    this.p = deserializationContext.p(javaTypeC, null);
                } else {
                    deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                    throw null;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        JavaType javaType = this.g;
        KeyDeserializer keyDeserializer = this.l;
        KeyDeserializer keyDeserializerR = keyDeserializer == null ? deserializationContext.r(javaType.o(), beanProperty) : keyDeserializer;
        JavaType javaTypeK = javaType.k();
        JsonDeserializer jsonDeserializer = this.m;
        JsonDeserializer jsonDeserializerP = jsonDeserializer == null ? deserializationContext.p(javaTypeK, beanProperty) : deserializationContext.C(jsonDeserializer, beanProperty, javaTypeK);
        TypeDeserializer typeDeserializer = this.n;
        TypeDeserializer typeDeserializerF = typeDeserializer != null ? typeDeserializer.f(beanProperty) : typeDeserializer;
        NullValueProvider nullValueProviderF0 = StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerP);
        return (keyDeserializerR == keyDeserializer && nullValueProviderF0 == this.h && jsonDeserializerP == jsonDeserializer && typeDeserializerF == typeDeserializer) ? this : new EnumMapDeserializer(this, keyDeserializerR, jsonDeserializerP, typeDeserializerF, nullValueProviderF0);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objE;
        PropertyBasedCreator propertyBasedCreator = this.q;
        if (propertyBasedCreator == null) {
            JsonDeserializer jsonDeserializer = this.p;
            if (jsonDeserializer != null) {
                return (EnumMap) this.o.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
            }
            int iF = jsonParser.f();
            if (iF != 1 && iF != 2) {
                if (iF == 3) {
                    return (EnumMap) E(jsonParser, deserializationContext);
                }
                if (iF != 5) {
                    if (iF == 6) {
                        return (EnumMap) G(jsonParser, deserializationContext);
                    }
                    deserializationContext.D(jsonParser, l0(deserializationContext));
                    throw null;
                }
            }
            EnumMap enumMapQ0 = q0(deserializationContext);
            r0(jsonParser, deserializationContext, enumMapQ0);
            return enumMapQ0;
        }
        PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, null);
        String strJ1 = jsonParser.y1() ? jsonParser.J1() : jsonParser.a1(JsonToken.FIELD_NAME) ? jsonParser.d() : null;
        while (true) {
            JavaType javaType = this.g;
            if (strJ1 == null) {
                try {
                    return (EnumMap) propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                } catch (Exception e) {
                    ContainerDeserializerBase.p0(deserializationContext, e, javaType.d, strJ1);
                    throw null;
                }
            }
            JsonToken jsonTokenN1 = jsonParser.N1();
            SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strJ1);
            if (settableBeanPropertyC == null) {
                Enum r6 = (Enum) this.l.a(deserializationContext, strJ1);
                if (r6 != null) {
                    try {
                        if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                            TypeDeserializer typeDeserializer = this.n;
                            JsonDeserializer jsonDeserializer2 = this.m;
                            objE = typeDeserializer == null ? jsonDeserializer2.e(jsonParser, deserializationContext) : jsonDeserializer2.g(jsonParser, deserializationContext, typeDeserializer);
                        } else if (!this.i) {
                            objE = this.h.c(deserializationContext);
                        }
                        propertyValueBufferD.d(r6, objE);
                    } catch (Exception e2) {
                        ContainerDeserializerBase.p0(deserializationContext, e2, javaType.d, strJ1);
                        throw null;
                    }
                } else {
                    if (!deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        deserializationContext.J(this.k, strJ1, "value not one of declared Enum instance names for %s", javaType.o());
                        throw null;
                    }
                    jsonParser.N1();
                    jsonParser.V1();
                }
            } else if (propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext))) {
                jsonParser.N1();
                try {
                    EnumMap enumMap = (EnumMap) propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                    r0(jsonParser, deserializationContext, enumMap);
                    return enumMap;
                } catch (Exception e3) {
                    ContainerDeserializerBase.p0(deserializationContext, e3, javaType.d, strJ1);
                    throw null;
                }
            }
            strJ1 = jsonParser.J1();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        EnumMap enumMap = (EnumMap) obj;
        r0(jsonParser, deserializationContext, enumMap);
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.d(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.o;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return q0(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.m == null && this.l == null && this.n == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.m;
    }

    public final EnumMap q0(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this.o;
        if (valueInstantiator == null) {
            return new EnumMap(this.k);
        }
        try {
            if (valueInstantiator.j()) {
                return (EnumMap) valueInstantiator.y(deserializationContext);
            }
            deserializationContext.z(this.d, valueInstantiator, "no default constructor found", new Object[0]);
            throw null;
        } catch (IOException e) {
            ClassUtil.D(deserializationContext, e);
            throw null;
        }
    }

    public final void r0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String strD;
        Object objE;
        jsonParser.U1(enumMap);
        if (jsonParser.y1()) {
            strD = jsonParser.J1();
        } else {
            JsonToken jsonTokenE = jsonParser.e();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenE != jsonToken) {
                if (jsonTokenE == JsonToken.END_OBJECT) {
                    return;
                }
                deserializationContext.Z(this, jsonToken, null, new Object[0]);
                throw null;
            }
            strD = jsonParser.d();
        }
        while (strD != null) {
            Enum r2 = (Enum) this.l.a(deserializationContext, strD);
            JsonToken jsonTokenN1 = jsonParser.N1();
            if (r2 != null) {
                try {
                    if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                        JsonDeserializer jsonDeserializer = this.m;
                        TypeDeserializer typeDeserializer = this.n;
                        objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this.i) {
                        objE = this.h.c(deserializationContext);
                    }
                    enumMap.put((EnumMap) r2, (Enum) objE);
                } catch (Exception e) {
                    ContainerDeserializerBase.p0(deserializationContext, e, enumMap, strD);
                    throw null;
                }
            } else {
                if (!deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    deserializationContext.J(this.k, strD, "value not one of declared Enum instance names for %s", this.g.o());
                    throw null;
                }
                jsonParser.V1();
            }
            strD = jsonParser.J1();
        }
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(enumMapDeserializer, nullValueProvider, enumMapDeserializer.j);
        this.k = enumMapDeserializer.k;
        this.l = keyDeserializer;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
        this.o = enumMapDeserializer.o;
        this.p = enumMapDeserializer.p;
        this.q = enumMapDeserializer.q;
    }
}

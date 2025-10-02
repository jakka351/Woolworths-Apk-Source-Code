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
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    public final JsonDeserializer k;
    public final ValueInstantiator l;
    public final JsonDeserializer m;

    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this.k = jsonDeserializer2;
        this.l = valueInstantiator;
        this.m = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializerC;
        JsonDeserializer jsonDeserializerP;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        ValueInstantiator valueInstantiator = this.l;
        if (valueInstantiator == null) {
            jsonDeserializer = null;
        } else {
            if (valueInstantiator.B() != null) {
                jsonDeserializerP = deserializationContext.p(valueInstantiator.C(deserializationConfig), beanProperty);
            } else {
                if (valueInstantiator.E() != null) {
                    jsonDeserializerP = deserializationContext.p(valueInstantiator.F(deserializationConfig), beanProperty);
                }
                jsonDeserializer = null;
            }
            jsonDeserializer = jsonDeserializerP;
        }
        JavaType javaTypeK = this.g.k();
        JsonDeserializer jsonDeserializer2 = this.k;
        if (jsonDeserializer2 == null) {
            jsonDeserializerC = StdDeserializer.g0(deserializationContext, beanProperty, jsonDeserializer2);
            if (jsonDeserializerC == null) {
                jsonDeserializerC = deserializationContext.p(javaTypeK, beanProperty);
            }
        } else {
            jsonDeserializerC = deserializationContext.C(jsonDeserializer2, beanProperty, javaTypeK);
        }
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, Collection.class);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        NullValueProvider nullValueProviderF0 = StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerC);
        JsonDeserializer jsonDeserializer3 = ClassUtil.x(jsonDeserializerC) ? null : jsonDeserializerC;
        return (Objects.equals(this.j, boolB) && this.h == nullValueProviderF0 && jsonDeserializer2 == jsonDeserializer3 && this.m == jsonDeserializer) ? this : new StringCollectionDeserializer(this.g, this.l, jsonDeserializer, jsonDeserializer3, nullValueProviderF0, boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = this.l;
        JsonDeserializer jsonDeserializer = this.m;
        return jsonDeserializer != null ? (Collection) valueInstantiator.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext)) : f(jsonParser, deserializationContext, (Collection) valueInstantiator.y(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.l;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.k == null && this.m == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.e;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.k;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final Collection f(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) throws JsonMappingException {
        String strA0;
        String str;
        String strA02;
        CoercionAction coercionActionO;
        boolean zX1 = jsonParser.x1();
        JsonDeserializer jsonDeserializer = this.k;
        boolean z = this.i;
        NullValueProvider nullValueProvider = this.h;
        if (!zX1) {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.j;
            if (bool2 != bool && (bool2 != null || !deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                    return (Collection) G(jsonParser, deserializationContext);
                }
                deserializationContext.D(jsonParser, this.g);
                throw null;
            }
            if (jsonParser.e() != JsonToken.VALUE_NULL) {
                if (jsonParser.a1(JsonToken.VALUE_STRING)) {
                    String strK0 = jsonParser.k0();
                    boolean zIsEmpty = strK0.isEmpty();
                    CoercionAction coercionAction = CoercionAction.d;
                    Class cls = this.d;
                    LogicalType logicalType = LogicalType.e;
                    if (zIsEmpty) {
                        CoercionAction coercionActionN = deserializationContext.n(logicalType, cls, CoercionInputShape.i);
                        if (coercionActionN != coercionAction) {
                            return (Collection) F(deserializationContext, coercionActionN);
                        }
                    } else if (StdDeserializer.I(strK0) && (coercionActionO = deserializationContext.o(logicalType, cls)) != coercionAction) {
                        return (Collection) F(deserializationContext, coercionActionO);
                    }
                }
                try {
                    strA02 = jsonDeserializer == null ? a0(jsonParser, deserializationContext, nullValueProvider) : (String) jsonDeserializer.e(jsonParser, deserializationContext);
                } catch (Exception e) {
                    throw JsonMappingException.i(e, collection, collection.size());
                }
            } else if (!z) {
                strA02 = (String) nullValueProvider.c(deserializationContext);
            }
            collection.add(strA02);
            return collection;
        }
        if (jsonDeserializer != null) {
            while (true) {
                try {
                    if (jsonParser.K1() == null) {
                        JsonToken jsonTokenE = jsonParser.e();
                        if (jsonTokenE == JsonToken.END_ARRAY) {
                            break;
                        }
                        if (jsonTokenE != JsonToken.VALUE_NULL) {
                            str = (String) jsonDeserializer.e(jsonParser, deserializationContext);
                        } else if (!z) {
                            str = (String) nullValueProvider.c(deserializationContext);
                        }
                    } else {
                        str = (String) jsonDeserializer.e(jsonParser, deserializationContext);
                    }
                    collection.add(str);
                } catch (Exception e2) {
                    throw JsonMappingException.i(e2, collection, collection.size());
                }
            }
        } else {
            while (true) {
                try {
                    String strK1 = jsonParser.K1();
                    if (strK1 != null) {
                        collection.add(strK1);
                    } else {
                        JsonToken jsonTokenE2 = jsonParser.e();
                        if (jsonTokenE2 == JsonToken.END_ARRAY) {
                            break;
                        }
                        if (jsonTokenE2 != JsonToken.VALUE_NULL) {
                            strA0 = a0(jsonParser, deserializationContext, nullValueProvider);
                        } else if (!z) {
                            strA0 = (String) nullValueProvider.c(deserializationContext);
                        }
                        collection.add(strA0);
                    }
                } catch (Exception e3) {
                    throw JsonMappingException.i(e3, collection, collection.size());
                }
            }
        }
        return collection;
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

/* loaded from: classes4.dex */
class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements ContextualDeserializer {
    public final JavaType g;
    public final AnnotatedMethod h;
    public final JsonDeserializer i;
    public final StdValueInstantiator j;
    public final SettableBeanProperty[] k;
    public final boolean l;
    public transient PropertyBasedCreator m;

    public FactoryBasedEnumDeserializer(Class cls, AnnotatedMethod annotatedMethod, JavaType javaType, StdValueInstantiator stdValueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.h = annotatedMethod;
        this.l = true;
        this.g = (javaType.u(String.class) || javaType.u(CharSequence.class)) ? null : javaType;
        this.i = null;
        this.j = stdValueInstantiator;
        this.k = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JavaType javaType;
        return (this.i == null && (javaType = this.g) != null && this.k == null) ? new FactoryBasedEnumDeserializer(this, deserializationContext.p(javaType, beanProperty)) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strT0;
        Object objE;
        AnnotatedMethod annotatedMethod = this.h;
        Class cls = this.d;
        JsonDeserializer jsonDeserializer = this.i;
        if (jsonDeserializer != null) {
            objE = jsonDeserializer.e(jsonParser, deserializationContext);
        } else {
            if (!this.l) {
                jsonParser.V1();
                try {
                    return annotatedMethod.o();
                } catch (Exception e) {
                    Throwable thS = ClassUtil.s(e);
                    ClassUtil.F(thS);
                    deserializationContext.y(thS, cls);
                    throw null;
                }
            }
            SettableBeanProperty[] settableBeanPropertyArr = this.k;
            if (settableBeanPropertyArr != null) {
                if (!jsonParser.y1()) {
                    deserializationContext.W("Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", ClassUtil.t(l0(deserializationContext)), annotatedMethod, jsonParser.e());
                    throw null;
                }
                if (this.m == null) {
                    this.m = PropertyBasedCreator.b(deserializationContext, this.j, settableBeanPropertyArr, deserializationContext.f.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.N1();
                PropertyBasedCreator propertyBasedCreator = this.m;
                PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, null);
                JsonToken jsonTokenE = jsonParser.e();
                while (jsonTokenE == JsonToken.FIELD_NAME) {
                    String strD = jsonParser.d();
                    jsonParser.N1();
                    SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strD);
                    if (!propertyValueBufferD.f(strD) || settableBeanPropertyC != null) {
                        if (settableBeanPropertyC != null) {
                            try {
                                propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext));
                            } catch (Exception e2) {
                                String str = settableBeanPropertyC.f.d;
                                Throwable thS2 = ClassUtil.s(e2);
                                ClassUtil.E(thS2);
                                if (deserializationContext != null && !deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
                                    z = false;
                                }
                                if (thS2 instanceof IOException) {
                                    if (!z || !(thS2 instanceof JacksonException)) {
                                        throw ((IOException) thS2);
                                    }
                                } else if (!z) {
                                    ClassUtil.G(thS2);
                                }
                                int i = JsonMappingException.g;
                                throw JsonMappingException.h(thS2, new JsonMappingException.Reference(cls, str));
                            }
                        } else {
                            jsonParser.V1();
                        }
                    }
                    jsonTokenE = jsonParser.N1();
                }
                return propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
            }
            JsonToken jsonTokenE2 = jsonParser.e();
            z = jsonTokenE2 == JsonToken.START_ARRAY && deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z) {
                jsonTokenE2 = jsonParser.N1();
            }
            if (jsonTokenE2 == null || !jsonTokenE2.k) {
                jsonParser.V1();
                strT0 = "";
            } else {
                strT0 = jsonParser.T0();
            }
            if (z && jsonParser.N1() != JsonToken.END_ARRAY) {
                m0(deserializationContext);
                throw null;
            }
            objE = strT0;
        }
        try {
            return annotatedMethod.g.invoke(cls, objE);
        } catch (Exception e3) {
            Throwable thS3 = ClassUtil.s(e3);
            ClassUtil.F(thS3);
            if ((thS3 instanceof IllegalArgumentException) && deserializationContext.N(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            deserializationContext.y(thS3, cls);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return this.i == null ? e(jsonParser, deserializationContext) : typeDeserializer.b(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.l;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public FactoryBasedEnumDeserializer(Class cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this.h = annotatedMethod;
        this.l = false;
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, JsonDeserializer jsonDeserializer) {
        super(factoryBasedEnumDeserializer.d);
        this.g = factoryBasedEnumDeserializer.g;
        this.h = factoryBasedEnumDeserializer.h;
        this.l = factoryBasedEnumDeserializer.l;
        this.j = factoryBasedEnumDeserializer.j;
        this.k = factoryBasedEnumDeserializer.k;
        this.i = jsonDeserializer;
    }
}

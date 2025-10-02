package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer {
    public final JavaType g;
    public final ValueInstantiator h;
    public final TypeDeserializer i;
    public final JsonDeserializer j;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        super(javaType);
        this.h = valueInstantiator;
        this.g = javaType;
        this.j = jsonDeserializer;
        this.i = typeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JavaType javaType = this.g;
        JsonDeserializer jsonDeserializer = this.j;
        JsonDeserializer jsonDeserializerP = jsonDeserializer == null ? deserializationContext.p(javaType.a(), beanProperty) : deserializationContext.C(jsonDeserializer, beanProperty, javaType.a());
        TypeDeserializer typeDeserializer = this.i;
        TypeDeserializer typeDeserializerF = typeDeserializer != null ? typeDeserializer.f(beanProperty) : typeDeserializer;
        return (jsonDeserializerP == jsonDeserializer && typeDeserializerF == typeDeserializer) ? this : r0(typeDeserializerF, jsonDeserializerP);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public abstract Object c(DeserializationContext deserializationContext);

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = this.h;
        if (valueInstantiator != null) {
            return f(jsonParser, deserializationContext, valueInstantiator.y(deserializationContext));
        }
        JsonDeserializer jsonDeserializer = this.j;
        TypeDeserializer typeDeserializer = this.i;
        return p0(typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        Object objE;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        JsonDeserializer jsonDeserializer = this.j;
        boolean zEquals = jsonDeserializer.o(deserializationConfig).equals(Boolean.FALSE);
        TypeDeserializer typeDeserializer = this.i;
        if (zEquals || typeDeserializer != null) {
            objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
        } else {
            Object objO0 = o0(obj);
            if (objO0 == null) {
                return p0(typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer));
            }
            objE = jsonDeserializer.f(jsonParser, deserializationContext, objO0);
        }
        return q0(obj, objE);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (jsonParser.a1(JsonToken.VALUE_NULL)) {
            return c(deserializationContext);
        }
        TypeDeserializer typeDeserializer2 = this.i;
        return typeDeserializer2 == null ? e(jsonParser, deserializationContext) : p0(typeDeserializer2.b(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object j(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final JavaType j0() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        JsonDeserializer jsonDeserializer = this.j;
        if (jsonDeserializer != null) {
            return jsonDeserializer.n();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean o(DeserializationConfig deserializationConfig) {
        JsonDeserializer jsonDeserializer = this.j;
        if (jsonDeserializer == null) {
            return null;
        }
        return jsonDeserializer.o(deserializationConfig);
    }

    public abstract Object o0(Object obj);

    public abstract AtomicReference p0(Object obj);

    public abstract AtomicReference q0(Object obj, Object obj2);

    public abstract AtomicReferenceDeserializer r0(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer);
}

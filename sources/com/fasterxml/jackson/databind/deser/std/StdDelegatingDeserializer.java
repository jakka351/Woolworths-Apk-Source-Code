package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

/* loaded from: classes4.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer, ResolvableDeserializer {
    public final Converter g;
    public final JavaType h;
    public final JsonDeserializer i;

    public StdDelegatingDeserializer(Converter converter) {
        super(Object.class);
        this.g = converter;
        this.h = null;
        this.i = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void a(DeserializationContext deserializationContext) {
        NullValueProvider nullValueProvider = this.i;
        if (nullValueProvider == null || !(nullValueProvider instanceof ResolvableDeserializer)) {
            return;
        }
        ((ResolvableDeserializer) nullValueProvider).a(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Converter converter = this.g;
        JsonDeserializer jsonDeserializer = this.i;
        if (jsonDeserializer == null) {
            JavaType javaTypeB = converter.b(deserializationContext.e());
            JsonDeserializer jsonDeserializerP = deserializationContext.p(javaTypeB, beanProperty);
            ClassUtil.H(StdDelegatingDeserializer.class, this, "withDelegate");
            return new StdDelegatingDeserializer(converter, javaTypeB, jsonDeserializerP);
        }
        JavaType javaType = this.h;
        JsonDeserializer jsonDeserializerC = deserializationContext.C(jsonDeserializer, beanProperty, javaType);
        if (jsonDeserializerC == jsonDeserializer) {
            return this;
        }
        ClassUtil.H(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(converter, javaType, jsonDeserializerC);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        Object objC = this.i.c(deserializationContext);
        if (objC == null) {
            return null;
        }
        return this.g.a(objC);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object d(DeserializationContext deserializationContext) {
        Object objD = this.i.d(deserializationContext);
        if (objD == null) {
            return null;
        }
        return this.g.a(objD);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object objE = this.i.e(jsonParser, deserializationContext);
        if (objE == null) {
            return null;
        }
        return this.g.a(objE);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JavaType javaType = this.h;
        if (javaType.d.isAssignableFrom(obj.getClass())) {
            return this.i.f(jsonParser, deserializationContext, obj);
        }
        throw new UnsupportedOperationException(String.format(androidx.constraintlayout.core.state.a.g(obj, "Cannot update object of type %s (using deserializer for type %s)"), javaType));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        Object objE = this.i.e(jsonParser, deserializationContext);
        if (objE == null) {
            return null;
        }
        return this.g.a(objE);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return this.i.i();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        Object objJ = this.i.j(deserializationContext);
        if (objJ == null) {
            return null;
        }
        return this.g.a(objJ);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Class l() {
        return this.i.l();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        JsonDeserializer jsonDeserializer = this.i;
        return jsonDeserializer != null && jsonDeserializer.m();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return this.i.n();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return this.i.o(deserializationConfig);
    }

    public StdDelegatingDeserializer(Converter converter, JavaType javaType, JsonDeserializer jsonDeserializer) {
        super(javaType);
        this.g = converter;
        this.h = javaType;
        this.i = jsonDeserializer;
    }
}

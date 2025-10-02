package com.fasterxml.jackson.databind.deser.impl;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class SetterlessProperty extends SettableBeanProperty {
    public final AnnotatedMethod q;
    public final Method r;

    public SetterlessProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.q = annotatedMethod;
        this.r = annotatedMethod.g;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) {
        z(obj, obj2);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new SetterlessProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new SetterlessProperty(this, this.i, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty E(JsonDeserializer jsonDeserializer) {
        JsonDeserializer jsonDeserializer2 = this.i;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this.k;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new SetterlessProperty(this, jsonDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        if (jsonParser.a1(JsonToken.VALUE_NULL)) {
            return;
        }
        TypeDeserializer typeDeserializer = this.j;
        PropertyName propertyName = this.f;
        if (typeDeserializer != null) {
            deserializationContext.j("Problem deserializing 'setterless' property (\"" + propertyName.d + "\"): no way to handle typed deser with setterless yet");
            throw null;
        }
        try {
            Object objInvoke = this.r.invoke(obj, null);
            if (objInvoke != null) {
                this.i.f(jsonParser, deserializationContext, objInvoke);
                return;
            }
            deserializationContext.j("Problem deserializing 'setterless' property '" + propertyName.d + "': get method returned null");
            throw null;
        } catch (Exception e) {
            ClassUtil.F(e);
            ClassUtil.G(e);
            Throwable thS = ClassUtil.s(e);
            throw new JsonMappingException(jsonParser, ClassUtil.i(thS), thS);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        h(jsonParser, deserializationContext, obj);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) throws SecurityException {
        this.q.g(deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) {
        throw new UnsupportedOperationException(a.o(new StringBuilder("Should never call `set()` on setterless property ('"), this.f.d, "')"));
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(setterlessProperty, jsonDeserializer, nullValueProvider);
        this.q = setterlessProperty.q;
        this.r = setterlessProperty.r;
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, PropertyName propertyName) {
        super(setterlessProperty, propertyName);
        this.q = setterlessProperty.q;
        this.r = setterlessProperty.r;
    }
}

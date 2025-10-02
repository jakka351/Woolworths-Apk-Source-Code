package com.fasterxml.jackson.databind.deser.impl;

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
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public final class FieldProperty extends SettableBeanProperty {
    public final AnnotatedField q;
    public final transient Field r;
    public final boolean s;

    public FieldProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedField annotatedField) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.q = annotatedField;
        this.r = annotatedField.f;
        this.s = NullsConstantProvider.a(this.k);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        try {
            this.r.set(obj, obj2);
            return obj;
        } catch (Exception e) {
            e(null, e, obj2);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new FieldProperty(this, this.i, nullValueProvider);
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
        return new FieldProperty(this, jsonDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        Object objG;
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.k;
        boolean z = this.s;
        if (!zA1) {
            JsonDeserializer jsonDeserializer = this.i;
            TypeDeserializer typeDeserializer = this.j;
            if (typeDeserializer == null) {
                Object objE = jsonDeserializer.e(jsonParser, deserializationContext);
                if (objE != null) {
                    objG = objE;
                } else if (z) {
                    return;
                } else {
                    objG = nullValueProvider.c(deserializationContext);
                }
            } else {
                objG = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
            }
        } else if (z) {
            return;
        } else {
            objG = nullValueProvider.c(deserializationContext);
        }
        try {
            this.r.set(obj, objG);
        } catch (Exception e) {
            e(jsonParser, e, objG);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        Object objG;
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.k;
        boolean z = this.s;
        if (zA1) {
            if (!z) {
                objG = nullValueProvider.c(deserializationContext);
                try {
                    this.r.set(obj, objG);
                    return obj;
                } catch (Exception e) {
                    e(jsonParser, e, objG);
                    throw null;
                }
            }
            return obj;
        }
        JsonDeserializer jsonDeserializer = this.i;
        TypeDeserializer typeDeserializer = this.j;
        if (typeDeserializer == null) {
            Object objE = jsonDeserializer.e(jsonParser, deserializationContext);
            if (objE == null) {
                if (!z) {
                    objG = nullValueProvider.c(deserializationContext);
                }
                return obj;
            }
            objG = objE;
        } else {
            objG = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
        }
        this.r.set(obj, objG);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) throws SecurityException {
        ClassUtil.e(this.r, deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        return new FieldProperty(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        try {
            this.r.set(obj, obj2);
        } catch (Exception e) {
            e(null, e, obj2);
            throw null;
        }
    }

    public FieldProperty(FieldProperty fieldProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(fieldProperty, jsonDeserializer, nullValueProvider);
        this.q = fieldProperty.q;
        this.r = fieldProperty.r;
        this.s = NullsConstantProvider.a(nullValueProvider);
    }

    public FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this.q = fieldProperty.q;
        this.r = fieldProperty.r;
        this.s = fieldProperty.s;
    }

    public FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty.q;
        this.q = annotatedField;
        Field field = annotatedField.f;
        if (field != null) {
            this.r = field;
            this.s = fieldProperty.s;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }
}

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes4.dex */
public class CreatorProperty extends SettableBeanProperty {
    public final AnnotatedParameter q;
    public final JacksonInject.Value r;
    public SettableBeanProperty s;
    public final int t;
    public boolean u;

    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, typeDeserializer, annotations, propertyMetadata);
        this.q = annotatedParameter;
        this.t = i;
        this.r = value;
        this.s = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        return this.s.B(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new CreatorProperty(this, this.i, nullValueProvider);
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
        return new CreatorProperty(this, jsonDeserializer, nullValueProvider);
    }

    public final void F() throws InvalidDefinitionException {
        if (this.s != null) {
            return;
        }
        throw new InvalidDefinitionException(null, "No fallback setter/field defined for creator property " + ClassUtil.A(this.f.d));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public final PropertyMetadata getMetadata() {
        SettableBeanProperty settableBeanProperty = this.s;
        PropertyMetadata propertyMetadata = this.d;
        return settableBeanProperty != null ? propertyMetadata.b(settableBeanProperty.getMetadata().h) : propertyMetadata;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        F();
        this.s.z(obj, g(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws InvalidDefinitionException {
        F();
        return this.s.B(obj, g(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.s;
        if (settableBeanProperty != null) {
            settableBeanProperty.k(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final int l() {
        return this.t;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object n() {
        JacksonInject.Value value = this.r;
        if (value == null) {
            return null;
        }
        return value.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final String toString() {
        return "[creator property, name " + ClassUtil.A(this.f.d) + "; inject id '" + n() + "']";
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final boolean w() {
        return this.u;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final boolean x() {
        JacksonInject.Value value = this.r;
        if (value == null) {
            return false;
        }
        Boolean bool = value.e;
        return !(bool == null ? true : bool.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void y() {
        this.u = true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        this.s.z(obj, obj2);
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this.q = creatorProperty.q;
        this.r = creatorProperty.r;
        this.s = creatorProperty.s;
        this.t = creatorProperty.t;
        this.u = creatorProperty.u;
    }

    public CreatorProperty(CreatorProperty creatorProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(creatorProperty, jsonDeserializer, nullValueProvider);
        this.q = creatorProperty.q;
        this.r = creatorProperty.r;
        this.s = creatorProperty.s;
        this.t = creatorProperty.t;
        this.u = creatorProperty.u;
    }
}

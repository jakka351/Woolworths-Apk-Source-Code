package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* loaded from: classes4.dex */
public final class ObjectIdValueProperty extends SettableBeanProperty {
    public final ObjectIdReader q;

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, PropertyMetadata propertyMetadata) {
        super(objectIdReader.e, objectIdReader.d, propertyMetadata, objectIdReader.h);
        this.q = objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) {
        SettableBeanProperty settableBeanProperty = this.q.i;
        if (settableBeanProperty != null) {
            return settableBeanProperty.B(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new ObjectIdValueProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new ObjectIdValueProperty(this, this.i, nullValueProvider);
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
        return new ObjectIdValueProperty(this, jsonDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        i(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.a1(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object objE = this.i.e(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this.q;
        deserializationContext.t(objE, objectIdReader.f, objectIdReader.g).b(obj);
        SettableBeanProperty settableBeanProperty = objectIdReader.i;
        return settableBeanProperty != null ? settableBeanProperty.B(obj, objE) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) {
        B(obj, obj2);
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(objectIdValueProperty, jsonDeserializer, nullValueProvider);
        this.q = objectIdValueProperty.q;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, PropertyName propertyName) {
        super(objectIdValueProperty, propertyName);
        this.q = objectIdValueProperty.q;
    }
}

package com.fasterxml.jackson.databind.deser.impl;

import androidx.camera.core.impl.b;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;

/* loaded from: classes4.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {
    public final SettableBeanProperty q;

    public static final class PropertyReferring extends ReadableObjectId.Referring {
        public final ObjectIdReferenceProperty b;
        public final Object c;

        public PropertyReferring(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            super(unresolvedForwardReference);
            this.b = objectIdReferenceProperty;
            this.c = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void a(Object obj, Object obj2) {
            if (!obj.equals(this.f14253a.h.b.f)) {
                throw new IllegalArgumentException(b.n(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
            }
            this.b.z(this.c, obj2);
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, ObjectIdInfo objectIdInfo) {
        super(settableBeanProperty);
        this.q = settableBeanProperty;
        this.m = objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) {
        return this.q.B(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new ObjectIdReferenceProperty(this, this.i, nullValueProvider);
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
        return new ObjectIdReferenceProperty(this, jsonDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.q.a();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        i(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        try {
            return this.q.B(obj, g(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this.m == null && this.i.k() == null) {
                throw new JsonMappingException(jsonParser, "Unresolved forward reference but no identity info", e);
            }
            Class cls = this.g.d;
            e.h.a(new PropertyReferring(this, e, obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.q;
        if (settableBeanProperty != null) {
            settableBeanProperty.k(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final int l() {
        return this.q.l();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) {
        this.q.z(obj, obj2);
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(objectIdReferenceProperty, jsonDeserializer, nullValueProvider);
        this.q = objectIdReferenceProperty.q;
        this.m = objectIdReferenceProperty.m;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this.q = objectIdReferenceProperty.q;
        this.m = objectIdReferenceProperty.m;
    }
}

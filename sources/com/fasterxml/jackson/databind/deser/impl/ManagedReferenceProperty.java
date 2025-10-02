package com.fasterxml.jackson.databind.deser.impl;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    public final String r;
    public final boolean s;
    public final SettableBeanProperty t;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this.r = str;
        this.t = settableBeanProperty2;
        this.s = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) {
        if (obj2 != null) {
            boolean z = this.s;
            SettableBeanProperty settableBeanProperty = this.t;
            if (!z) {
                settableBeanProperty.z(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        settableBeanProperty.z(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        settableBeanProperty.z(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    StringBuilder sb = new StringBuilder("Unsupported container type (");
                    sb.append(obj2.getClass().getName());
                    sb.append(") when resolving reference '");
                    throw new IllegalStateException(a.o(sb, this.r, "'"));
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        settableBeanProperty.z(obj5, obj);
                    }
                }
            }
        }
        return this.q.B(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public final SettableBeanProperty F(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        B(obj, this.q.g(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return B(obj, g(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) {
        this.q.k(deserializationConfig);
        this.t.k(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) {
        B(obj, obj2);
    }
}

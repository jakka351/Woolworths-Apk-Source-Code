package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* loaded from: classes4.dex */
public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    public final AnnotatedMember r;

    public MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this.r = annotatedMember;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) {
        return obj2 != null ? this.q.B(obj, obj2) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public final SettableBeanProperty F(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this.r);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object objK = this.r.k(obj);
        SettableBeanProperty settableBeanProperty = this.q;
        Object objG = objK == null ? settableBeanProperty.g(jsonParser, deserializationContext) : settableBeanProperty.j(jsonParser, deserializationContext, objK);
        if (objG != objK) {
            settableBeanProperty.z(obj, objG);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object objK = this.r.k(obj);
        SettableBeanProperty settableBeanProperty = this.q;
        Object objG = objK == null ? settableBeanProperty.g(jsonParser, deserializationContext) : settableBeanProperty.j(jsonParser, deserializationContext, objK);
        return (objG == objK || objG == null) ? obj : settableBeanProperty.B(obj, objG);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) {
        if (obj2 != null) {
            this.q.z(obj, obj2);
        }
    }
}

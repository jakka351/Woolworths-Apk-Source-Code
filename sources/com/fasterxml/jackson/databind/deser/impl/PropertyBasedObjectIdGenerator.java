package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/* loaded from: classes4.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final ObjectIdGenerator b(Class cls) {
        return cls == this.d ? this : new PropertyBasedObjectIdGenerator(cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final ObjectIdGenerator.IdKey e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this.d, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final ObjectIdGenerator f() {
        return this;
    }
}

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    public final BeanPropertyWriter e;

    public PropertyBasedObjectIdGenerator(BeanPropertyWriter beanPropertyWriter, Class cls) {
        super(cls);
        this.e = beanPropertyWriter;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final boolean a(ObjectIdGenerator objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass()) {
            PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
            if (propertyBasedObjectIdGenerator.d() == this.d && propertyBasedObjectIdGenerator.e == this.e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final ObjectIdGenerator b(Class cls) {
        return cls == this.d ? this : new PropertyBasedObjectIdGenerator(this.e, cls);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public final Object c(Object obj) {
        BeanPropertyWriter beanPropertyWriter = this.e;
        try {
            Method method = beanPropertyWriter.m;
            return method == null ? beanPropertyWriter.n.get(obj) : method.invoke(obj, null);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Problem accessing property '" + beanPropertyWriter.f.d + "': " + e2.getMessage(), e2);
        }
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

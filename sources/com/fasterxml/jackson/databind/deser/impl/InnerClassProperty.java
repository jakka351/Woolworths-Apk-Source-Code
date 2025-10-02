package com.fasterxml.jackson.databind.deser.impl;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    public final transient Constructor r;
    public final AnnotatedConstructor s;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor constructor) {
        super(settableBeanProperty);
        this.r = constructor;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public final SettableBeanProperty F(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty == this.q ? this : new InnerClassProperty(settableBeanProperty, this.r);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, InvalidDefinitionException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objG;
        Constructor constructor = this.r;
        JsonToken jsonTokenE = jsonParser.e();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        JsonDeserializer jsonDeserializer = this.i;
        if (jsonTokenE == jsonToken) {
            objG = jsonDeserializer.c(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this.j;
            if (typeDeserializer != null) {
                objG = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
            } else {
                try {
                    Object objNewInstance = constructor.newInstance(obj);
                    jsonDeserializer.f(jsonParser, deserializationContext, objNewInstance);
                    objG = objNewInstance;
                } catch (Exception e) {
                    String strI = a.i("Failed to instantiate class ", constructor.getDeclaringClass().getName(), ", problem: ", e.getMessage());
                    Throwable thS = ClassUtil.s(e);
                    ClassUtil.G(thS);
                    ClassUtil.E(thS);
                    throw new IllegalArgumentException(strI, thS);
                }
            }
        }
        z(obj, objG);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object i(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this.q.B(obj, g(jsonParser, deserializationContext));
    }

    public Object readResolve() {
        return new InnerClassProperty(this, this.s);
    }

    public Object writeReplace() {
        return this.s == null ? new InnerClassProperty(this, new AnnotatedConstructor(null, this.r, null, null)) : this;
    }

    public InnerClassProperty(InnerClassProperty innerClassProperty, AnnotatedConstructor annotatedConstructor) {
        super(innerClassProperty);
        this.s = annotatedConstructor;
        Constructor constructor = annotatedConstructor == null ? null : annotatedConstructor.g;
        this.r = constructor;
        if (constructor == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }
}

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class NullsFailProvider implements NullValueProvider, Serializable {
    public final PropertyName d;

    public NullsFailProvider(PropertyName propertyName, JavaType javaType) {
        this.d = propertyName;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) throws InvalidNullException {
        int i = InvalidNullException.h;
        Annotation[] annotationArr = ClassUtil.f14330a;
        PropertyName propertyName = this.d;
        throw new InvalidNullException(deserializationContext.i, "Invalid `null` value encountered for property ".concat(propertyName == null ? "<UNKNOWN>" : String.format("\"%s\"", propertyName)), null);
    }
}

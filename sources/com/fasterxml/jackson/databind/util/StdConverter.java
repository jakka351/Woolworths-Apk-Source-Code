package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes4.dex */
public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    @Override // com.fasterxml.jackson.databind.util.Converter
    public final JavaType b(TypeFactory typeFactory) {
        return d(typeFactory).d(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public final JavaType c(TypeFactory typeFactory) {
        return d(typeFactory).d(1);
    }

    public final JavaType d(TypeFactory typeFactory) {
        JavaType javaTypeI = typeFactory.k(getClass()).i(Converter.class);
        if (javaTypeI == null || javaTypeI.e() < 2) {
            throw new IllegalStateException("Cannot find OUT type parameter for Converter of type ".concat(getClass().getName()));
        }
        return javaTypeI;
    }
}

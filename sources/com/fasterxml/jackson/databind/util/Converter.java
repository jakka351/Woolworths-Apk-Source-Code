package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes4.dex */
public interface Converter<IN, OUT> {

    public static abstract class None implements Converter<Object, Object> {
    }

    Object a(Object obj);

    JavaType b(TypeFactory typeFactory);

    JavaType c(TypeFactory typeFactory);
}

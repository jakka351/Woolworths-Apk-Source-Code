package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes4.dex */
final class MethodGenericTypeResolver {
    public static ParameterizedType a(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return a(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable b(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return b(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean c(AnnotatedClass annotatedClass, JavaType javaType, Type type) {
        if (javaType.F(annotatedClass.a(type).d)) {
            ParameterizedType parameterizedTypeA = a(type);
            if (parameterizedTypeA == null || !Objects.equals(javaType.d, parameterizedTypeA.getRawType())) {
                return true;
            }
            Type[] actualTypeArguments = parameterizedTypeA.getActualTypeArguments();
            TypeBindings typeBindingsJ = javaType.j();
            if (typeBindingsJ.e.length == actualTypeArguments.length) {
                for (int i = 0; i < typeBindingsJ.e.length; i++) {
                    if (c(annotatedClass, typeBindingsJ.d(i), actualTypeArguments[i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}

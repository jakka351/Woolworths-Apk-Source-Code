package com.fasterxml.jackson.databind.introspect;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    public final transient Method g;
    public Class[] h;
    public final Serialization i;

    public static final class Serialization implements Serializable {
        public Class d;
        public String e;
        public Class[] f;
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.g = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final AnnotatedElement b() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String d() {
        return this.g.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class e() {
        return this.g.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.u(AnnotatedMethod.class, obj)) {
            return false;
        }
        Method method = ((AnnotatedMethod) obj).g;
        Method method2 = this.g;
        return method == null ? method2 == null : method.equals(method2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.d.a(this.g.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class h() {
        return this.g.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final int hashCode() {
        return this.g.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final String i() {
        String strI = super.i();
        Method method = this.g;
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            return a.g(strI, "()");
        }
        if (parameterCount != 1) {
            return String.format("%s(%d params)", super.i(), Integer.valueOf(method.getParameterCount()));
        }
        StringBuilder sbT = a.t(strI, "(");
        sbT.append(u(0).getName());
        sbT.append(")");
        return sbT.toString();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member j() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object k(Object obj) {
        try {
            return this.g.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + i() + ": " + ClassUtil.i(e), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Annotated n(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this.d, this.g, annotationMap, this.f);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object o() {
        return this.g.invoke(null, null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object p(Object[] objArr) {
        return this.g.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object q(Object obj) {
        return this.g.invoke(null, obj);
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        Serialization serialization = this.i;
        Class cls = serialization.d;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.e, serialization.f);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.e(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + serialization.e + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final int s() {
        return this.g.getParameterCount();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final JavaType t(int i) {
        Type[] genericParameterTypes = this.g.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.d.a(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String toString() {
        return "[method " + i() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Class u(int i) {
        if (this.h == null) {
            this.h = this.g.getParameterTypes();
        }
        Class[] clsArr = this.h;
        if (clsArr.length <= 0) {
            return null;
        }
        return clsArr[0];
    }

    public Object writeReplace() {
        Serialization serialization = new Serialization();
        Method method = this.g;
        serialization.d = method.getDeclaringClass();
        serialization.e = method.getName();
        serialization.f = method.getParameterTypes();
        return new AnnotatedMethod(serialization);
    }

    public AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this.g = null;
        this.i = serialization;
    }
}

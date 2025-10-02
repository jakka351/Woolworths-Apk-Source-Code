package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    public final Constructor g;
    public final Serialization h;

    public static final class Serialization implements Serializable {
        public Class d;
        public Class[] e;
    }

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.g = constructor;
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
        return this.g.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.u(AnnotatedConstructor.class, obj)) {
            return false;
        }
        Constructor constructor = ((AnnotatedConstructor) obj).g;
        Constructor constructor2 = this.g;
        return constructor == null ? constructor2 == null : constructor.equals(constructor2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.d.a(this.g.getDeclaringClass());
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
    public final Member j() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object k(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(this.g.getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Annotated n(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this.d, this.g, annotationMap, this.f);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object o() {
        return this.g.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object p(Object[] objArr) {
        return this.g.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object q(Object obj) {
        return this.g.newInstance(obj);
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        Serialization serialization = this.h;
        Class cls = serialization.d;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(serialization.e);
            if (!declaredConstructor.isAccessible()) {
                ClassUtil.e(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + serialization.e.length + " args from Class '" + cls.getName());
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
        Constructor constructor = this.g;
        int parameterCount = constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", ClassUtil.B(constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : "s", this.e);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Class u(int i) {
        Class<?>[] parameterTypes = this.g.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    public Object writeReplace() {
        Serialization serialization = new Serialization();
        Constructor constructor = this.g;
        serialization.d = constructor.getDeclaringClass();
        serialization.e = constructor.getParameterTypes();
        return new AnnotatedConstructor(serialization);
    }

    public AnnotatedConstructor(Serialization serialization) {
        super(null, null, null);
        this.g = null;
        this.h = serialization;
    }
}

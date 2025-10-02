package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes4.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    public final transient Field f;
    public final Serialization g;

    public static final class Serialization implements Serializable {
        public Class d;
        public String e;
    }

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this.f = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final AnnotatedElement b() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String d() {
        return this.f.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class e() {
        return this.f.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.u(AnnotatedField.class, obj)) {
            return false;
        }
        Field field = ((AnnotatedField) obj).f;
        Field field2 = this.f;
        return field == null ? field2 == null : field.equals(field2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.d.a(this.f.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class h() {
        return this.f.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final int hashCode() {
        return this.f.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member j() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object k(Object obj) {
        try {
            return this.f.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + i() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Annotated n(AnnotationMap annotationMap) {
        return new AnnotatedField(this.d, this.f, annotationMap);
    }

    public final void o(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + i() + ": " + e.getMessage(), e);
        }
    }

    public Object readResolve() throws NoSuchFieldException {
        Serialization serialization = this.g;
        Class cls = serialization.d;
        try {
            Field declaredField = cls.getDeclaredField(serialization.e);
            if (!declaredField.isAccessible()) {
                ClassUtil.e(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + serialization.e + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String toString() {
        return "[field " + i() + "]";
    }

    public Object writeReplace() {
        Serialization serialization = new Serialization();
        Field field = this.f;
        serialization.d = field.getDeclaringClass();
        serialization.e = field.getName();
        return new AnnotatedField(serialization);
    }

    public AnnotatedField(Serialization serialization) {
        super(null, null);
        this.f = null;
        this.g = serialization;
    }
}

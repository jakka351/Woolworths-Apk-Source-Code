package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* loaded from: classes4.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    public final AnnotatedWithParams f;
    public final JavaType g;
    public final int h;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, int i) {
        super(typeResolutionContext, annotationMap);
        this.f = annotatedWithParams;
        this.g = javaType;
        this.h = i;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final AnnotatedElement b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String d() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class e() {
        return this.g.d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.u(AnnotatedParameter.class, obj)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter.f.equals(this.f) && annotatedParameter.h == this.h;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class h() {
        return this.f.h();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final int hashCode() {
        return this.f.hashCode() + this.h;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member j() {
        return this.f.j();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object k(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(this.f.h().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Annotated n(AnnotationMap annotationMap) {
        if (annotationMap == this.e) {
            return this;
        }
        AnnotatedWithParams annotatedWithParams = this.f;
        AnnotationMap[] annotationMapArr = annotatedWithParams.f;
        int i = this.h;
        annotationMapArr[i] = annotationMap;
        return annotatedWithParams.r(i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String toString() {
        return "[parameter #" + this.h + ", annotations: " + this.e + "]";
    }
}

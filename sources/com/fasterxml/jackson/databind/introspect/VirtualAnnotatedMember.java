package com.fasterxml.jackson.databind.introspect;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* loaded from: classes4.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    public final Class f;
    public final JavaType g;
    public final String h;

    public VirtualAnnotatedMember(AnnotatedClass annotatedClass, Class cls, String str, JavaType javaType) {
        super(annotatedClass, null);
        this.f = cls;
        this.g = javaType;
        this.h = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final /* bridge */ /* synthetic */ AnnotatedElement b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String d() {
        return this.h;
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
        if (!ClassUtil.u(getClass(), obj)) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember.f == this.f && virtualAnnotatedMember.h.equals(this.h);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class h() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member j() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object k(Object obj) {
        throw new IllegalArgumentException(a.o(new StringBuilder("Cannot get virtual property '"), this.h, "'"));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Annotated n(AnnotationMap annotationMap) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String toString() {
        return "[virtual " + i() + "]";
    }
}

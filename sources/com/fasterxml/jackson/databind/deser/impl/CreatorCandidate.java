package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* loaded from: classes4.dex */
public final class CreatorCandidate {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f14242a;
    public final AnnotatedWithParams b;
    public final int c;
    public final Param[] d;

    public static final class Param {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedParameter f14243a;
        public final BeanPropertyDefinition b;
        public final JacksonInject.Value c;

        public Param(AnnotatedParameter annotatedParameter, BeanPropertyDefinition beanPropertyDefinition, JacksonInject.Value value) {
            this.f14243a = annotatedParameter;
            this.b = beanPropertyDefinition;
            this.c = value;
        }
    }

    public CreatorCandidate(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, Param[] paramArr, int i) {
        this.f14242a = annotationIntrospector;
        this.b = annotatedWithParams;
        this.d = paramArr;
        this.c = i;
    }

    public static CreatorCandidate a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int iS = annotatedWithParams.s();
        Param[] paramArr = new Param[iS];
        for (int i = 0; i < iS; i++) {
            AnnotatedParameter annotatedParameterR = annotatedWithParams.r(i);
            paramArr[i] = new Param(annotatedParameterR, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i], annotationIntrospector.p(annotatedParameterR));
        }
        return new CreatorCandidate(annotationIntrospector, annotatedWithParams, paramArr, iS);
    }

    public final PropertyName b(int i) {
        String strO = this.f14242a.o(this.d[i].f14243a);
        if (strO == null || strO.isEmpty()) {
            return null;
        }
        return PropertyName.a(strO);
    }

    public final PropertyName c(int i) {
        BeanPropertyDefinition beanPropertyDefinition = this.d[i].b;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.b();
        }
        return null;
    }

    public final BeanPropertyDefinition d(int i) {
        return this.d[i].b;
    }

    public final String toString() {
        return this.b.toString();
    }
}

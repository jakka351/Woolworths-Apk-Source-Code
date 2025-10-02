package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    public final AnnotationMap[] f;

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this.f = annotationMapArr;
    }

    public abstract Object o();

    public abstract Object p(Object[] objArr);

    public abstract Object q(Object obj);

    public final AnnotatedParameter r(int i) {
        JavaType javaTypeT = t(i);
        AnnotationMap[] annotationMapArr = this.f;
        return new AnnotatedParameter(this, javaTypeT, this.d, (annotationMapArr == null || i < 0 || i >= annotationMapArr.length) ? null : annotationMapArr[i], i);
    }

    public abstract int s();

    public abstract JavaType t(int i);

    public abstract Class u(int i);
}

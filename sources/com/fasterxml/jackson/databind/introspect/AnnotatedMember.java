package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class AnnotatedMember extends Annotated implements Serializable {
    public final transient TypeResolutionContext d;
    public final transient AnnotationMap e;

    public AnnotatedMember(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap) {
        this.d = typeResolutionContext;
        this.e = annotationMap;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Annotation c(Class cls) {
        AnnotationMap annotationMap = this.e;
        if (annotationMap == null) {
            return null;
        }
        return annotationMap.a(cls);
    }

    public final void g(boolean z) throws SecurityException {
        Member memberJ = j();
        if (memberJ != null) {
            ClassUtil.e(memberJ, z);
        }
    }

    public abstract Class h();

    public String i() {
        return h().getName() + "#" + d();
    }

    public abstract Member j();

    public abstract Object k(Object obj);

    public final boolean l(Class cls) {
        HashMap map;
        AnnotationMap annotationMap = this.e;
        if (annotationMap == null || (map = annotationMap.d) == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    public final boolean m(Class[] clsArr) {
        AnnotationMap annotationMap = this.e;
        if (annotationMap == null || annotationMap.d == null) {
            return false;
        }
        for (Class cls : clsArr) {
            if (annotationMap.d.containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public abstract Annotated n(AnnotationMap annotationMap);
}

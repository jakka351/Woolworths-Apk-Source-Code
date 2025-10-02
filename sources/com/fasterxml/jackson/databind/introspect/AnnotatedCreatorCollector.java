package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class AnnotatedCreatorCollector extends CollectorBase {
    public final AnnotatedClass d;
    public final boolean e;
    public AnnotatedConstructor f;

    public AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, AnnotatedClass annotatedClass, boolean z) {
        super(annotationIntrospector);
        this.d = annotatedClass;
        this.e = z;
    }

    public final AnnotationMap e(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        if (!this.e) {
            return new AnnotationMap();
        }
        Annotation[] declaredAnnotations = ctor.b;
        if (declaredAnnotations == null) {
            declaredAnnotations = ctor.f14331a.getDeclaredAnnotations();
            ctor.b = declaredAnnotations;
        }
        AnnotationCollector annotationCollectorB = b(declaredAnnotations);
        if (ctor2 != null) {
            Annotation[] declaredAnnotations2 = ctor2.b;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = ctor2.f14331a.getDeclaredAnnotations();
                ctor2.b = declaredAnnotations2;
            }
            annotationCollectorB = a(annotationCollectorB, declaredAnnotations2);
        }
        return annotationCollectorB.b();
    }

    public final AnnotationMap[] f(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.e) {
            return CollectorBase.b;
        }
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector annotationCollectorA = a(AnnotationCollector.EmptyCollector.b, annotationArr[i]);
            if (annotationArr2 != null) {
                annotationCollectorA = a(annotationCollectorA, annotationArr2[i]);
            }
            annotationMapArr[i] = annotationCollectorA.b();
        }
        return annotationMapArr;
    }

    public final AnnotatedMethod g(Method method, TypeResolutionContext typeResolutionContext, Method method2) {
        int parameterCount = method.getParameterCount();
        AnnotationIntrospector annotationIntrospector = this.f14274a;
        AnnotationMap[] annotationMapArr = CollectorBase.b;
        if (annotationIntrospector == null) {
            AnnotationMap annotationMap = new AnnotationMap();
            if (parameterCount != 0) {
                annotationMapArr = new AnnotationMap[parameterCount];
                for (int i = 0; i < parameterCount; i++) {
                    annotationMapArr[i] = new AnnotationMap();
                }
            }
            return new AnnotatedMethod(typeResolutionContext, method, annotationMap, annotationMapArr);
        }
        if (parameterCount == 0) {
            AnnotationCollector annotationCollectorB = b(method.getDeclaredAnnotations());
            if (method2 != null) {
                annotationCollectorB = a(annotationCollectorB, method2.getDeclaredAnnotations());
            }
            return new AnnotatedMethod(typeResolutionContext, method, annotationCollectorB.b(), annotationMapArr);
        }
        AnnotationCollector annotationCollectorB2 = b(method.getDeclaredAnnotations());
        if (method2 != null) {
            annotationCollectorB2 = a(annotationCollectorB2, method2.getDeclaredAnnotations());
        }
        return new AnnotatedMethod(typeResolutionContext, method, annotationCollectorB2.b(), f(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.introspect.AnnotatedConstructor h(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r11) {
        /*
            r9 = this;
            int r0 = r10.d
            java.lang.reflect.Constructor r1 = r10.f14331a
            if (r0 >= 0) goto Lc
            int r0 = r1.getParameterCount()
            r10.d = r0
        Lc:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r9.f14274a
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = com.fasterxml.jackson.databind.introspect.CollectorBase.b
            r4 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r5 = r9.d
            if (r2 != 0) goto L31
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap
            r11.<init>()
            if (r0 != 0) goto L1f
            goto L2d
        L1f:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[r0]
        L21:
            if (r4 >= r0) goto L2d
            com.fasterxml.jackson.databind.introspect.AnnotationMap r2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap
            r2.<init>()
            r3[r4] = r2
            int r4 = r4 + 1
            goto L21
        L2d:
            r10.<init>(r5, r1, r11, r3)
            return r10
        L31:
            if (r0 != 0) goto L3d
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r10 = r9.e(r10, r11)
            r0.<init>(r5, r1, r10, r3)
            return r0
        L3d:
            java.lang.annotation.Annotation[][] r2 = r10.c
            if (r2 != 0) goto L47
            java.lang.annotation.Annotation[][] r2 = r1.getParameterAnnotations()
            r10.c = r2
        L47:
            int r3 = r2.length
            r6 = 0
            if (r0 == r3) goto Lac
            java.lang.Class r3 = r1.getDeclaringClass()
            java.lang.annotation.Annotation[] r7 = com.fasterxml.jackson.databind.util.ClassUtil.f14330a
            java.lang.Class<java.lang.Enum> r7 = java.lang.Enum.class
            boolean r7 = r7.isAssignableFrom(r3)
            if (r7 == 0) goto L6c
            int r7 = r2.length
            r8 = 2
            int r7 = r7 + r8
            if (r0 != r7) goto L6c
            int r3 = r2.length
            int r3 = r3 + r8
            java.lang.annotation.Annotation[][] r3 = new java.lang.annotation.Annotation[r3][]
            int r7 = r2.length
            java.lang.System.arraycopy(r2, r4, r3, r8, r7)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r9.f(r3, r6)
        L6a:
            r2 = r3
            goto L88
        L6c:
            boolean r3 = r3.isMemberClass()
            if (r3 == 0) goto L88
            int r3 = r2.length
            r7 = 1
            int r3 = r3 + r7
            if (r0 != r3) goto L88
            int r3 = r2.length
            int r3 = r3 + r7
            java.lang.annotation.Annotation[][] r3 = new java.lang.annotation.Annotation[r3][]
            int r8 = r2.length
            java.lang.System.arraycopy(r2, r4, r3, r7, r8)
            java.lang.annotation.Annotation[] r2 = com.fasterxml.jackson.databind.introspect.CollectorBase.c
            r3[r4] = r2
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r9.f(r3, r6)
            goto L6a
        L88:
            if (r6 == 0) goto L8b
            goto Lc0
        L8b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Class r11 = r1.getDeclaringClass()
            java.lang.String r11 = r11.getName()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1}
            java.lang.String r0 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r11 = java.lang.String.format(r0, r11)
            r10.<init>(r11)
            throw r10
        Lac:
            if (r11 != 0) goto Laf
            goto Lbc
        Laf:
            java.lang.annotation.Annotation[][] r0 = r11.c
            if (r0 != 0) goto Lbb
            java.lang.reflect.Constructor r0 = r11.f14331a
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            r11.c = r0
        Lbb:
            r6 = r0
        Lbc:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r6 = r9.f(r2, r6)
        Lc0:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r10 = r9.e(r10, r11)
            r0.<init>(r5, r1, r10, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.h(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }
}

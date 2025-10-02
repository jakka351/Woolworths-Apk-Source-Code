package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class AnnotatedClassResolver {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f14270a;
    public final ClassIntrospector.MixInResolver b;
    public final TypeBindings c;
    public final Class d;
    public final Class e;
    public final boolean f;

    public AnnotatedClassResolver(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        Class cls = javaType.d;
        this.d = cls;
        this.b = mixInResolver;
        this.c = javaType.j();
        mapperConfig.getClass();
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.m(MapperFeature.USE_ANNOTATIONS) ? mapperConfig.d() : null;
        this.f14270a = annotationIntrospectorD;
        this.e = mixInResolver != null ? mixInResolver.a(cls) : null;
        this.f = (annotationIntrospectorD == null || (ClassUtil.w(cls) && javaType.z())) ? false : true;
    }

    public static void d(JavaType javaType, ArrayList arrayList, boolean z) {
        Class cls = javaType.d;
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((JavaType) arrayList.get(i)).d == cls) {
                    return;
                }
            }
            arrayList.add(javaType);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        Iterator it = javaType.n().iterator();
        while (it.hasNext()) {
            d((JavaType) it.next(), arrayList, true);
        }
    }

    public static void e(JavaType javaType, ArrayList arrayList, boolean z) {
        Class cls = javaType.d;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((JavaType) arrayList.get(i)).d == cls) {
                    return;
                }
            }
            arrayList.add(javaType);
        }
        Iterator it = javaType.n().iterator();
        while (it.hasNext()) {
            d((JavaType) it.next(), arrayList, true);
        }
        JavaType javaTypeQ = javaType.q();
        if (javaTypeQ != null) {
            e(javaTypeQ, arrayList, true);
        }
    }

    public static AnnotatedClass g(MapperConfig mapperConfig, Class cls) {
        if (cls.isArray() && (mapperConfig == null || ((MapperConfigBase) mapperConfig).f.a(cls) == null)) {
            return new AnnotatedClass(cls);
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, cls, mapperConfig);
        List list = Collections.EMPTY_LIST;
        return new AnnotatedClass(null, cls, list, annotatedClassResolver.e, annotatedClassResolver.f(list), annotatedClassResolver.c, annotatedClassResolver.f14270a, mapperConfig, mapperConfig.e.d, annotatedClassResolver.f);
    }

    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.d(annotation)) {
                    annotationCollector = annotationCollector.a(annotation);
                    if (this.f14270a.q0(annotation)) {
                        annotationCollector = c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector b(AnnotationCollector annotationCollector, Class cls, Class cls2) {
        if (cls2 != null) {
            annotationCollector = a(annotationCollector, ClassUtil.j(cls2));
            Iterator it = ClassUtil.n(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = a(annotationCollector, ClassUtil.j((Class) it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.d(annotation2)) {
                annotationCollector = annotationCollector.a(annotation2);
                if (this.f14270a.q0(annotation2)) {
                    annotationCollector = c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.util.Annotations f(java.util.List r8) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r7.f14270a
            if (r0 != 0) goto L5
            goto L1d
        L5:
            com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver r0 = r7.b
            if (r0 == 0) goto L16
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.introspect.SimpleMixInResolver
            if (r1 == 0) goto L14
            r1 = r0
            com.fasterxml.jackson.databind.introspect.SimpleMixInResolver r1 = (com.fasterxml.jackson.databind.introspect.SimpleMixInResolver) r1
            r1.getClass()
            goto L16
        L14:
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            boolean r2 = r7.f
            if (r1 != 0) goto L20
            if (r2 != 0) goto L20
        L1d:
            com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations r8 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.f14273a
            return r8
        L20:
            java.lang.Class r3 = r7.d
            com.fasterxml.jackson.databind.introspect.AnnotationCollector$EmptyCollector r4 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.EmptyCollector.b
            java.lang.Class r5 = r7.e
            if (r5 == 0) goto L2c
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r4 = r7.b(r4, r3, r5)
        L2c:
            if (r2 == 0) goto L36
            java.lang.annotation.Annotation[] r3 = com.fasterxml.jackson.databind.util.ClassUtil.j(r3)
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r4 = r7.a(r4, r3)
        L36:
            java.util.Iterator r8 = r8.iterator()
        L3a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r8.next()
            com.fasterxml.jackson.databind.JavaType r3 = (com.fasterxml.jackson.databind.JavaType) r3
            if (r1 == 0) goto L52
            java.lang.Class r5 = r3.d
            java.lang.Class r6 = r0.a(r5)
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r4 = r7.b(r4, r5, r6)
        L52:
            if (r2 == 0) goto L3a
            java.lang.Class r3 = r3.d
            java.lang.annotation.Annotation[] r3 = com.fasterxml.jackson.databind.util.ClassUtil.j(r3)
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r3 = r7.a(r4, r3)
            r4 = r3
            goto L3a
        L60:
            if (r1 == 0) goto L6c
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Class r0 = r0.a(r8)
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r4 = r7.b(r4, r8, r0)
        L6c:
            com.fasterxml.jackson.databind.util.Annotations r8 = r4.c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.f(java.util.List):com.fasterxml.jackson.databind.util.Annotations");
    }

    public AnnotatedClassResolver(MapperConfig mapperConfig, Class cls, MapperConfig mapperConfig2) {
        this.d = cls;
        this.b = mapperConfig2;
        this.c = TypeBindings.j;
        if (mapperConfig == null) {
            this.f14270a = null;
            this.e = null;
        } else {
            this.f14270a = mapperConfig.m(MapperFeature.USE_ANNOTATIONS) ? mapperConfig.d() : null;
            this.e = mapperConfig2 != null ? ((MapperConfigBase) mapperConfig2).f.a(cls) : null;
        }
        this.f = this.f14270a != null;
    }
}

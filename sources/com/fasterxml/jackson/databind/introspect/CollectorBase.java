package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
class CollectorBase {
    public static final AnnotationMap[] b = new AnnotationMap[0];
    public static final Annotation[] c = new Annotation[0];

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f14274a;

    public CollectorBase(AnnotationIntrospector annotationIntrospector) {
        this.f14274a = annotationIntrospector;
    }

    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.a(annotation);
            if (this.f14274a.q0(annotation)) {
                annotationCollector = d(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector b(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorA = AnnotationCollector.EmptyCollector.b;
        for (Annotation annotation : annotationArr) {
            annotationCollectorA = annotationCollectorA.a(annotation);
            if (this.f14274a.q0(annotation)) {
                annotationCollectorA = d(annotationCollectorA, annotation);
            }
        }
        return annotationCollectorA;
    }

    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.d(annotation)) {
                annotationCollector = annotationCollector.a(annotation);
                AnnotationIntrospector annotationIntrospector = this.f14274a;
                if (annotationIntrospector.q0(annotation)) {
                    for (Annotation annotation2 : ClassUtil.j(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.d(annotation2)) {
                            annotationCollector = annotationCollector.a(annotation2);
                            if (annotationIntrospector.q0(annotation2)) {
                                annotationCollector = d(annotationCollector, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector d(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.f14274a.q0(annotation2)) {
                    annotationCollector = annotationCollector.a(annotation2);
                } else if (!annotationCollector.d(annotation2)) {
                    annotationCollector = d(annotationCollector.a(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }
}

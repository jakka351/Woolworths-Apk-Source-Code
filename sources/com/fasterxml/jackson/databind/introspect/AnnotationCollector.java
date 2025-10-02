package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AnnotationCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final NoAnnotations f14273a = new NoAnnotations();

    public static class EmptyCollector extends AnnotationCollector {
        public static final EmptyCollector b = new EmptyCollector();

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            OneCollector oneCollector = new OneCollector();
            oneCollector.b = clsAnnotationType;
            oneCollector.c = annotation;
            return oneCollector;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap b() {
            return new AnnotationMap();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations c() {
            return AnnotationCollector.f14273a;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean d(Annotation annotation) {
            return false;
        }
    }

    public static class NCollector extends AnnotationCollector {
        public final HashMap b;

        public NCollector(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            HashMap map = new HashMap();
            this.b = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector a(Annotation annotation) {
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap b() {
            AnnotationMap annotationMap = new AnnotationMap();
            for (Annotation annotation : this.b.values()) {
                if (annotationMap.d == null) {
                    annotationMap.d = new HashMap();
                }
                Annotation annotation2 = (Annotation) annotationMap.d.put(annotation.annotationType(), annotation);
                if (annotation2 != null) {
                    annotation2.equals(annotation);
                }
            }
            return annotationMap;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations c() {
            HashMap map = this.b;
            if (map.size() != 2) {
                return new AnnotationMap(map);
            }
            Iterator it = map.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it.next();
            return new TwoAnnotations((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean d(Annotation annotation) {
            return this.b.containsKey(annotation.annotationType());
        }
    }

    public static class NoAnnotations implements Annotations, Serializable {
        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final Annotation a(Class cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements Annotations, Serializable {
        public final Class d;
        public final Annotation e;

        public OneAnnotation(Class cls, Annotation annotation) {
            this.d = cls;
            this.e = annotation;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final Annotation a(Class cls) {
            if (this.d == cls) {
                return this.e;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final int size() {
            return 1;
        }
    }

    public static class OneCollector extends AnnotationCollector {
        public Class b;
        public Annotation c;

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<? extends Annotation> cls = this.b;
            if (cls != clsAnnotationType) {
                return new NCollector(cls, this.c, clsAnnotationType, annotation);
            }
            this.c = annotation;
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap b() {
            Class cls = this.b;
            Annotation annotation = this.c;
            HashMap map = new HashMap(4);
            map.put(cls, annotation);
            return new AnnotationMap(map);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations c() {
            return new OneAnnotation(this.b, this.c);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean d(Annotation annotation) {
            return annotation.annotationType() == this.b;
        }
    }

    public static class TwoAnnotations implements Annotations, Serializable {
        public final Class d;
        public final Class e;
        public final Annotation f;
        public final Annotation g;

        public TwoAnnotations(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            this.d = cls;
            this.f = annotation;
            this.e = cls2;
            this.g = annotation2;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final Annotation a(Class cls) {
            if (this.d == cls) {
                return this.f;
            }
            if (this.e == cls) {
                return this.g;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public final int size() {
            return 2;
        }
    }

    public abstract AnnotationCollector a(Annotation annotation);

    public abstract AnnotationMap b();

    public abstract Annotations c();

    public abstract boolean d(Annotation annotation);
}

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AnnotationMap implements Annotations {
    public HashMap d;

    public AnnotationMap(HashMap map) {
        this.d = map;
    }

    public static AnnotationMap b(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        HashMap map;
        HashMap map2;
        if (annotationMap == null || (map = annotationMap.d) == null || map.isEmpty()) {
            return annotationMap2;
        }
        if (annotationMap2 == null || (map2 = annotationMap2.d) == null || map2.isEmpty()) {
            return annotationMap;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : annotationMap2.d.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : annotationMap.d.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new AnnotationMap(map3);
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public final Annotation a(Class cls) {
        HashMap map = this.d;
        if (map == null) {
            return null;
        }
        return (Annotation) map.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public final int size() {
        HashMap map = this.d;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public final String toString() {
        HashMap map = this.d;
        return map == null ? "[null]" : map.toString();
    }
}

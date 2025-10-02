package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class AnnotatedFieldCollector extends CollectorBase {
    public final TypeFactory d;
    public final ClassIntrospector.MixInResolver e;
    public final boolean f;

    public static final class FieldBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final TypeResolutionContext f14271a;
        public final Field b;
        public AnnotationCollector c = AnnotationCollector.EmptyCollector.b;

        public FieldBuilder(TypeResolutionContext typeResolutionContext, Field field) {
            this.f14271a = typeResolutionContext;
            this.b = field;
        }
    }

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this.d = typeFactory;
        this.e = annotationIntrospector == null ? null : mixInResolver;
        this.f = z;
    }

    public final Map e(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        ClassIntrospector.MixInResolver mixInResolver;
        Class clsA;
        FieldBuilder fieldBuilder;
        JavaType javaTypeQ = javaType.q();
        if (javaTypeQ == null) {
            return null;
        }
        Class cls = javaType.d;
        Map mapE = e(new TypeResolutionContext.Basic(this.d, javaTypeQ.j()), javaTypeQ);
        for (Field field : cls.getDeclaredFields()) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                if (mapE == null) {
                    mapE = new LinkedHashMap();
                }
                FieldBuilder fieldBuilder2 = new FieldBuilder(typeResolutionContext, field);
                if (this.f) {
                    fieldBuilder2.c = a(AnnotationCollector.EmptyCollector.b, field.getDeclaredAnnotations());
                }
                mapE.put(field.getName(), fieldBuilder2);
            }
        }
        if (mapE != null && (mixInResolver = this.e) != null && (clsA = mixInResolver.a(cls)) != null) {
            Iterator it = ClassUtil.n(clsA, cls, true).iterator();
            while (it.hasNext()) {
                for (Field field2 : ((Class) it.next()).getDeclaredFields()) {
                    if (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()) && (fieldBuilder = (FieldBuilder) mapE.get(field2.getName())) != null) {
                        fieldBuilder.c = a(fieldBuilder.c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapE;
    }
}

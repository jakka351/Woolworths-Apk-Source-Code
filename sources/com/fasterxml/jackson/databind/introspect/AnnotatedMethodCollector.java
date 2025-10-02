package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class AnnotatedMethodCollector extends CollectorBase {
    public final ClassIntrospector.MixInResolver d;
    public final boolean e;

    public static final class MethodBuilder {

        /* renamed from: a, reason: collision with root package name */
        public TypeResolutionContext f14272a;
        public Method b;
        public AnnotationCollector c;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.f14272a = typeResolutionContext;
            this.b = method;
            this.c = annotationCollector;
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this.d = annotationIntrospector == null ? null : mixInResolver;
        this.e = z;
    }

    public static boolean g(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterCount() > 2) ? false : true;
    }

    public final void e(TypeResolutionContext typeResolutionContext, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        if (cls2 != null) {
            f(typeResolutionContext, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.p(cls)) {
            if (g(method)) {
                MemberKey memberKey = new MemberKey(method);
                MethodBuilder methodBuilder = (MethodBuilder) linkedHashMap.get(memberKey);
                if (methodBuilder == null) {
                    linkedHashMap.put(memberKey, new MethodBuilder(typeResolutionContext, method, this.f14274a == null ? AnnotationCollector.EmptyCollector.b : b(method.getDeclaredAnnotations())));
                } else {
                    if (this.e) {
                        methodBuilder.c = c(methodBuilder.c, method.getDeclaredAnnotations());
                    }
                    Method method2 = methodBuilder.b;
                    if (method2 == null) {
                        methodBuilder.b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        methodBuilder.b = method;
                        methodBuilder.f14272a = typeResolutionContext;
                    }
                }
            }
        }
    }

    public final void f(TypeResolutionContext typeResolutionContext, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        List list;
        if (this.f14274a == null) {
            return;
        }
        Annotation[] annotationArr = ClassUtil.f14330a;
        if (cls2 == null || cls2 == cls || cls2 == Object.class) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(8);
            ClassUtil.a(cls2, cls, arrayList);
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (g(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = (MethodBuilder) linkedHashMap.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (methodBuilder == null) {
                        linkedHashMap.put(memberKey, new MethodBuilder(typeResolutionContext, null, b(declaredAnnotations)));
                    } else {
                        methodBuilder.c = c(methodBuilder.c, declaredAnnotations);
                    }
                }
            }
        }
    }
}

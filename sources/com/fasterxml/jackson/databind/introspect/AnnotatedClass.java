package com.fasterxml.jackson.databind.introspect;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    public static final Creators r;
    public final JavaType d;
    public final Class e;
    public final TypeBindings f;
    public final List g;
    public final AnnotationIntrospector h;
    public final TypeFactory i;
    public final ClassIntrospector.MixInResolver j;
    public final Class k;
    public final boolean l;
    public final Annotations m;
    public Creators n;
    public AnnotatedMethodMap o;
    public List p;
    public transient Boolean q;

    public static final class Creators {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedConstructor f14269a;
        public final List b;
        public final List c;

        public Creators(AnnotatedConstructor annotatedConstructor, List list, List list2) {
            this.f14269a = annotatedConstructor;
            this.b = list;
            this.c = list2;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        r = new Creators(null, list, list);
    }

    public AnnotatedClass(JavaType javaType, Class cls, List list, Class cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, boolean z) {
        this.d = javaType;
        this.e = cls;
        this.g = list;
        this.k = cls2;
        this.m = annotations;
        this.f = typeBindings;
        this.h = annotationIntrospector;
        this.j = mixInResolver;
        this.i = typeFactory;
        this.l = z;
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public final JavaType a(Type type) {
        return this.i.b(null, type, this.f);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Annotation c(Class cls) {
        return this.m.a(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String d() {
        return this.e.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class e() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.u(AnnotatedClass.class, obj) && ((AnnotatedClass) obj).e == this.e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators g() throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClass.g():com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators");
    }

    public final AnnotatedMethodMap h() throws NoSuchMethodException, SecurityException {
        ClassIntrospector.MixInResolver mixInResolver;
        Class clsA;
        AnnotatedMethodMap annotatedMethodMap = this.o;
        if (annotatedMethodMap == null) {
            JavaType javaType = this.d;
            if (javaType == null) {
                annotatedMethodMap = new AnnotatedMethodMap();
            } else {
                Class cls = javaType.d;
                AnnotatedMethodCollector annotatedMethodCollector = new AnnotatedMethodCollector(this.h, this.j, this.l);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                annotatedMethodCollector.e(this, cls, linkedHashMap, this.k);
                Iterator it = this.g.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    mixInResolver = annotatedMethodCollector.d;
                    Class clsA2 = null;
                    if (!zHasNext) {
                        break;
                    }
                    JavaType javaType2 = (JavaType) it.next();
                    if (mixInResolver != null) {
                        clsA2 = mixInResolver.a(javaType2.d);
                    }
                    annotatedMethodCollector.e(new TypeResolutionContext.Basic(this.i, javaType2.j()), javaType2.d, linkedHashMap, clsA2);
                }
                if (mixInResolver != null && (clsA = mixInResolver.a(Object.class)) != null) {
                    annotatedMethodCollector.f(this, cls, linkedHashMap, clsA);
                    if (annotatedMethodCollector.f14274a != null && !linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            MemberKey memberKey = (MemberKey) entry.getKey();
                            if ("hashCode".equals(memberKey.f14276a) && memberKey.b.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(memberKey.f14276a, null);
                                    if (declaredMethod != null) {
                                        AnnotatedMethodCollector.MethodBuilder methodBuilder = (AnnotatedMethodCollector.MethodBuilder) entry.getValue();
                                        methodBuilder.c = annotatedMethodCollector.c(methodBuilder.c, declaredMethod.getDeclaredAnnotations());
                                        methodBuilder.b = declaredMethod;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    annotatedMethodMap = new AnnotatedMethodMap();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        AnnotatedMethodCollector.MethodBuilder methodBuilder2 = (AnnotatedMethodCollector.MethodBuilder) entry2.getValue();
                        Method method = methodBuilder2.b;
                        AnnotatedMethod annotatedMethod = method == null ? null : new AnnotatedMethod(methodBuilder2.f14272a, method, methodBuilder2.c.b(), null);
                        if (annotatedMethod != null) {
                            linkedHashMap2.put(entry2.getKey(), annotatedMethod);
                        }
                    }
                    AnnotatedMethodMap annotatedMethodMap2 = new AnnotatedMethodMap();
                    annotatedMethodMap2.d = linkedHashMap2;
                    annotatedMethodMap = annotatedMethodMap2;
                }
            }
            this.o = annotatedMethodMap;
        }
        return annotatedMethodMap;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final int hashCode() {
        return this.e.getName().hashCode();
    }

    public final List i() {
        Map mapE;
        List list;
        List list2 = this.p;
        if (list2 != null) {
            return list2;
        }
        JavaType javaType = this.d;
        if (javaType == null || (mapE = new AnnotatedFieldCollector(this.h, this.i, this.j, this.l).e(this, javaType)) == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(mapE.size());
            for (AnnotatedFieldCollector.FieldBuilder fieldBuilder : mapE.values()) {
                arrayList.add(new AnnotatedField(fieldBuilder.f14271a, fieldBuilder.b, fieldBuilder.c.b()));
            }
            list = arrayList;
        }
        this.p = list;
        return list;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String toString() {
        return a.f(this.e, new StringBuilder("[AnnotedClass "), "]");
    }

    public AnnotatedClass(Class cls) {
        this.d = null;
        this.e = cls;
        this.g = Collections.EMPTY_LIST;
        this.k = null;
        this.m = AnnotationCollector.f14273a;
        this.f = TypeBindings.j;
        this.h = null;
        this.j = null;
        this.i = null;
        this.l = false;
    }
}

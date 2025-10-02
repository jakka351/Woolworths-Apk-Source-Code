package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class POJOPropertiesCollector {

    /* renamed from: a, reason: collision with root package name */
    public final MapperConfig f14278a;
    public final AccessorNamingStrategy b;
    public final boolean c;
    public final JavaType d;
    public final AnnotatedClass e;
    public final VisibilityChecker f;
    public final AnnotationIntrospector g;
    public final boolean h;
    public boolean i;
    public LinkedHashMap j;
    public LinkedList k;
    public HashMap l;
    public LinkedList m;
    public LinkedList n;
    public LinkedList o;
    public LinkedList p;
    public LinkedList q;
    public LinkedList r;
    public HashSet s;
    public LinkedHashMap t;

    public POJOPropertiesCollector(MapperConfigBase mapperConfigBase, boolean z, JavaType javaType, AnnotatedClass annotatedClass, AccessorNamingStrategy accessorNamingStrategy) {
        this.f14278a = mapperConfigBase;
        this.c = z;
        this.d = javaType;
        this.e = annotatedClass;
        mapperConfigBase.getClass();
        if (mapperConfigBase.m(MapperFeature.USE_ANNOTATIONS)) {
            this.h = true;
            this.g = mapperConfigBase.d();
        } else {
            this.h = false;
            this.g = NopAnnotationIntrospector.d;
        }
        this.f = mapperConfigBase.o(javaType.d, annotatedClass);
        this.b = accessorNamingStrategy;
        mapperConfigBase.m(MapperFeature.USE_STD_BEAN_NAMING);
    }

    public static boolean f(POJOPropertyBuilder pOJOPropertyBuilder, LinkedList linkedList) {
        if (linkedList != null) {
            String str = pOJOPropertyBuilder.i.d;
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                if (((POJOPropertyBuilder) linkedList.get(i)).i.d.equals(str)) {
                    linkedList.set(i, pOJOPropertyBuilder);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(LinkedList linkedList) {
        do {
            AnnotatedMember annotatedMember = (AnnotatedMember) linkedList.get(0);
            AnnotatedMember annotatedMember2 = (AnnotatedMember) linkedList.get(1);
            if (annotatedMember instanceof AnnotatedField) {
                if (!(annotatedMember2 instanceof AnnotatedMethod)) {
                    return false;
                }
                linkedList.remove(0);
            } else {
                if (!(annotatedMember instanceof AnnotatedMethod) || !(annotatedMember2 instanceof AnnotatedField)) {
                    return false;
                }
                linkedList.remove(1);
            }
        } while (linkedList.size() > 1);
        return true;
    }

    public final void a(LinkedHashMap linkedHashMap, AnnotatedParameter annotatedParameter) {
        POJOPropertyBuilder pOJOPropertyBuilderE;
        JsonCreator.Mode modeE;
        AnnotationIntrospector annotationIntrospector = this.g;
        String strO = annotationIntrospector.o(annotatedParameter);
        if (strO == null) {
            strO = "";
        }
        PropertyName propertyNameU = annotationIntrospector.u(annotatedParameter);
        boolean z = (propertyNameU == null || propertyNameU.d()) ? false : true;
        if (!z) {
            if (strO.isEmpty() || (modeE = annotationIntrospector.e(this.f14278a, annotatedParameter.f)) == null || modeE == JsonCreator.Mode.g) {
                return;
            } else {
                propertyNameU = PropertyName.a(strO);
            }
        }
        PropertyName propertyName = propertyNameU;
        String strB = b(strO);
        if (z && strB.isEmpty()) {
            String str = propertyName.d;
            pOJOPropertyBuilderE = (POJOPropertyBuilder) linkedHashMap.get(str);
            if (pOJOPropertyBuilderE == null) {
                POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(this.f14278a, this.g, this.c, propertyName, propertyName);
                linkedHashMap.put(str, pOJOPropertyBuilder);
                pOJOPropertyBuilderE = pOJOPropertyBuilder;
            }
        } else {
            pOJOPropertyBuilderE = e(strB, linkedHashMap);
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = pOJOPropertyBuilderE;
        pOJOPropertyBuilder2.k = new POJOPropertyBuilder.Linked(annotatedParameter, pOJOPropertyBuilder2.k, propertyName, z, true, false);
        this.k.add(pOJOPropertyBuilder2);
    }

    public final String b(String str) {
        PropertyName propertyName;
        HashMap map = this.l;
        return (map == null || (propertyName = (PropertyName) map.get(PropertyName.b(str, null))) == null) ? str : propertyName.d;
    }

    public final void c(String str) {
        if (this.c || str == null) {
            return;
        }
        if (this.s == null) {
            this.s = new HashSet();
        }
        this.s.add(str);
    }

    public final void d(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object obj = value.d;
        if (this.t == null) {
            this.t = new LinkedHashMap();
        }
        AnnotatedMember annotatedMember2 = (AnnotatedMember) this.t.put(obj, annotatedMember);
        if (annotatedMember2 == null || annotatedMember2.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + obj + "' (of type " + obj.getClass().getName() + ")");
    }

    public final POJOPropertyBuilder e(String str, LinkedHashMap linkedHashMap) {
        POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) linkedHashMap.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        boolean z = this.c;
        PropertyName propertyNameA = PropertyName.a(str);
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this.f14278a, this.g, z, propertyNameA, propertyNameA);
        linkedHashMap.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04d2 A[PHI: r12
  0x04d2: PHI (r12v38 java.lang.Object) = (r12v37 java.lang.Object), (r12v39 java.lang.Object) binds: [B:319:0x0515, B:295:0x04d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0974 A[LOOP:20: B:566:0x096e->B:568:0x0974, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0942 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 2726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.h():void");
    }

    public final void i(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.e + ": " + str);
    }
}

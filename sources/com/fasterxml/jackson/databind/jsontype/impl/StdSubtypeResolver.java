package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class StdSubtypeResolver extends SubtypeResolver implements Serializable {
    public static void a(AnnotatedClass annotatedClass, NamedType namedType, MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap map) {
        String strA0;
        if (!namedType.a() && (strA0 = annotationIntrospector.a0(annotatedClass)) != null) {
            namedType = new NamedType(namedType.d, strA0);
        }
        NamedType namedType2 = new NamedType(namedType.d, null);
        if (map.containsKey(namedType2)) {
            if (!namedType.a() || ((NamedType) map.get(namedType2)).a()) {
                return;
            }
            map.put(namedType2, namedType);
            return;
        }
        map.put(namedType2, namedType);
        List<NamedType> listZ = annotationIntrospector.Z(annotatedClass);
        if (listZ == null || listZ.isEmpty()) {
            return;
        }
        for (NamedType namedType3 : listZ) {
            a(AnnotatedClassResolver.g(mapperConfig, namedType3.d), namedType3, mapperConfig, annotationIntrospector, map);
        }
    }

    public static void b(AnnotatedClass annotatedClass, NamedType namedType, MapperConfig mapperConfig, HashSet hashSet, LinkedHashMap linkedHashMap) {
        List<NamedType> listZ;
        String strA0;
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        if (!namedType.a() && (strA0 = annotationIntrospectorD.a0(annotatedClass)) != null) {
            namedType = new NamedType(namedType.d, strA0);
        }
        if (namedType.a()) {
            linkedHashMap.put(namedType.f, namedType);
        }
        if (!hashSet.add(namedType.d) || (listZ = annotationIntrospectorD.Z(annotatedClass)) == null || listZ.isEmpty()) {
            return;
        }
        for (NamedType namedType2 : listZ) {
            b(AnnotatedClassResolver.g(mapperConfig, namedType2.d), namedType2, mapperConfig, hashSet, linkedHashMap);
        }
    }

    public static ArrayList c(Class cls, HashSet hashSet, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            hashSet.remove(((NamedType) it.next()).d);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new NamedType(cls2, null));
            }
        }
        return arrayList;
    }

    public final Collection d(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        Class clsE;
        List<NamedType> listZ;
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        if (javaType != null) {
            clsE = javaType.d;
        } else {
            if (annotatedMember == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            clsE = annotatedMember.e();
        }
        HashMap map = new HashMap();
        if (annotatedMember != null && (listZ = annotationIntrospectorD.Z(annotatedMember)) != null) {
            for (NamedType namedType : listZ) {
                a(AnnotatedClassResolver.g(mapperConfig, namedType.d), namedType, mapperConfig, annotationIntrospectorD, map);
            }
        }
        a(AnnotatedClassResolver.g(mapperConfig, clsE), new NamedType(clsE, null), mapperConfig, annotationIntrospectorD, map);
        return new ArrayList(map.values());
    }

    public final Collection e(MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        Class cls = annotatedClass.e;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(annotatedClass, new NamedType(cls, null), mapperConfig, hashSet, linkedHashMap);
        return c(cls, hashSet, linkedHashMap);
    }

    public final Collection f(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> listZ;
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        Class cls = javaType.d;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(AnnotatedClassResolver.g(mapperConfig, cls), new NamedType(cls, null), mapperConfig, hashSet, linkedHashMap);
        if (annotatedMember != null && (listZ = annotationIntrospectorD.Z(annotatedMember)) != null) {
            for (NamedType namedType : listZ) {
                b(AnnotatedClassResolver.g(mapperConfig, namedType.d), namedType, mapperConfig, hashSet, linkedHashMap);
            }
        }
        return c(cls, hashSet, linkedHashMap);
    }
}

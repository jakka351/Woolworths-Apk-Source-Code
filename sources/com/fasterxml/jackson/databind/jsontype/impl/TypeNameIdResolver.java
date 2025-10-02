package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class TypeNameIdResolver extends TypeIdResolverBase {
    public final MapperConfig c;
    public final ConcurrentHashMap d;
    public final HashMap e;
    public final boolean f;

    public TypeNameIdResolver(MapperConfig mapperConfig, JavaType javaType, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(javaType, mapperConfig.e.d);
        this.c = mapperConfig;
        this.d = concurrentHashMap;
        this.e = map;
        this.f = mapperConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String a(Object obj) {
        return f(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String b() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((JavaType) entry.getValue()).y()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final JavaType c(DeserializationContext deserializationContext, String str) {
        if (this.f) {
            str = str.toLowerCase();
        }
        return (JavaType) this.e.get(str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String d(Class cls, Object obj) {
        return obj == null ? f(cls) : f(obj.getClass());
    }

    public final String f(Class cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        ConcurrentHashMap concurrentHashMap = this.d;
        String strA0 = (String) concurrentHashMap.get(name);
        if (strA0 == null) {
            Class cls2 = this.f14295a.k(cls).d;
            MapperConfig mapperConfig = this.c;
            mapperConfig.getClass();
            if (mapperConfig.m(MapperFeature.USE_ANNOTATIONS)) {
                strA0 = mapperConfig.d().a0(((BasicBeanDescription) mapperConfig.l(cls2)).e);
            }
            if (strA0 == null) {
                String name2 = cls2.getName();
                int iLastIndexOf = name2.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name2 = name2.substring(iLastIndexOf + 1);
                }
                strA0 = name2;
            }
            concurrentHashMap.put(name, strA0);
        }
        return strA0;
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.e);
    }
}

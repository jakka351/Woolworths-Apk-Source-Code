package com.fasterxml.jackson.databind.introspect;

import YU.a;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class BasicBeanDescription extends BeanDescription {
    public static final Class[] j = new Class[0];
    public final POJOPropertiesCollector b;
    public final MapperConfig c;
    public final AnnotationIntrospector d;
    public final AnnotatedClass e;
    public Class[] f;
    public boolean g;
    public List h;
    public final ObjectIdInfo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBeanDescription(JavaType javaType, MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        super(javaType);
        List list = Collections.EMPTY_LIST;
        this.b = null;
        this.c = mapperConfig;
        if (mapperConfig == null) {
            this.d = null;
        } else {
            this.d = mapperConfig.d();
        }
        this.e = annotatedClass;
        this.h = list;
    }

    public static BasicBeanDescription v(JavaType javaType, MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        List list = Collections.EMPTY_LIST;
        return new BasicBeanDescription(javaType, mapperConfig, annotatedClass);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedMember a() {
        AnnotatedMember annotatedMember;
        AnnotatedMember annotatedMember2;
        POJOPropertiesCollector pOJOPropertiesCollector = this.b;
        if (pOJOPropertiesCollector != null) {
            if (!pOJOPropertiesCollector.i) {
                pOJOPropertiesCollector.h();
            }
            LinkedList linkedList = pOJOPropertiesCollector.m;
            if (linkedList == null) {
                annotatedMember = null;
            } else {
                if (linkedList.size() > 1) {
                    pOJOPropertiesCollector.i("Multiple 'any-getter' methods defined (%s vs %s)", pOJOPropertiesCollector.m.get(0), pOJOPropertiesCollector.m.get(1));
                    throw null;
                }
                annotatedMember = (AnnotatedMember) pOJOPropertiesCollector.m.getFirst();
            }
            if (annotatedMember != null) {
                if (Map.class.isAssignableFrom(annotatedMember.e())) {
                    return annotatedMember;
                }
                throw new IllegalArgumentException(a.h("Invalid 'any-getter' annotation on method ", annotatedMember.d(), "(): return type is not instance of java.util.Map"));
            }
            if (!pOJOPropertiesCollector.i) {
                pOJOPropertiesCollector.h();
            }
            LinkedList linkedList2 = pOJOPropertiesCollector.n;
            if (linkedList2 == null) {
                annotatedMember2 = null;
            } else {
                if (linkedList2.size() > 1) {
                    pOJOPropertiesCollector.i("Multiple 'any-getter' fields defined (%s vs %s)", pOJOPropertiesCollector.n.get(0), pOJOPropertiesCollector.n.get(1));
                    throw null;
                }
                annotatedMember2 = (AnnotatedMember) pOJOPropertiesCollector.n.getFirst();
            }
            if (annotatedMember2 != null) {
                if (Map.class.isAssignableFrom(annotatedMember2.e())) {
                    return annotatedMember2;
                }
                throw new IllegalArgumentException(a.h("Invalid 'any-getter' annotation on field '", annotatedMember2.d(), "': type is not instance of java.util.Map"));
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedMember b() {
        AnnotatedMethod annotatedMethod;
        AnnotatedMember annotatedMember;
        POJOPropertiesCollector pOJOPropertiesCollector = this.b;
        if (pOJOPropertiesCollector != null) {
            if (!pOJOPropertiesCollector.i) {
                pOJOPropertiesCollector.h();
            }
            LinkedList linkedList = pOJOPropertiesCollector.o;
            if (linkedList == null) {
                annotatedMethod = null;
            } else {
                if (linkedList.size() > 1) {
                    pOJOPropertiesCollector.i("Multiple 'any-setter' methods defined (%s vs %s)", pOJOPropertiesCollector.o.get(0), pOJOPropertiesCollector.o.get(1));
                    throw null;
                }
                annotatedMethod = (AnnotatedMethod) pOJOPropertiesCollector.o.getFirst();
            }
            if (annotatedMethod != null) {
                Class clsU = annotatedMethod.u(0);
                if (clsU == String.class || clsU == Object.class) {
                    return annotatedMethod;
                }
                throw new IllegalArgumentException(a.i("Invalid 'any-setter' annotation on method '", annotatedMethod.g.getName(), "()': first argument not of type String or Object, but ", clsU.getName()));
            }
            if (!pOJOPropertiesCollector.i) {
                pOJOPropertiesCollector.h();
            }
            LinkedList linkedList2 = pOJOPropertiesCollector.p;
            if (linkedList2 == null) {
                annotatedMember = null;
            } else {
                if (linkedList2.size() > 1) {
                    pOJOPropertiesCollector.i("Multiple 'any-setter' fields defined (%s vs %s)", pOJOPropertiesCollector.p.get(0), pOJOPropertiesCollector.p.get(1));
                    throw null;
                }
                annotatedMember = (AnnotatedMember) pOJOPropertiesCollector.p.getFirst();
            }
            if (annotatedMember != null) {
                Class clsE = annotatedMember.e();
                if (Map.class.isAssignableFrom(clsE) || JsonNode.class.isAssignableFrom(clsE)) {
                    return annotatedMember;
                }
                throw new IllegalArgumentException(a.h("Invalid 'any-setter' annotation on field '", annotatedMember.d(), "': type is not instance of `java.util.Map` or `JsonNode`"));
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final ArrayList c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition beanPropertyDefinition : u()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyN = beanPropertyDefinition.n();
            if (referencePropertyN != null && referencePropertyN.f14225a == AnnotationIntrospector.ReferenceProperty.Type.e) {
                String str = referencePropertyN.b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(str);
                } else if (!hashSet.add(str)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + ClassUtil.A(str));
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedConstructor d() {
        return this.e.g().f14269a;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final Class[] e() {
        if (!this.g) {
            this.g = true;
            AnnotationIntrospector annotationIntrospector = this.d;
            Class[] clsArrE0 = annotationIntrospector == null ? null : annotationIntrospector.e0(this.e);
            if (clsArrE0 == null && !this.c.m(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrE0 = j;
            }
            this.f = clsArrE0;
        }
        return this.f;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final JsonFormat.Value f() {
        JsonFormat.Value valueN;
        AnnotatedClass annotatedClass = this.e;
        AnnotationIntrospector annotationIntrospector = this.d;
        if (annotationIntrospector == null || (valueN = annotationIntrospector.n(annotatedClass)) == null) {
            valueN = null;
        }
        JsonFormat.Value valueH = this.c.h(annotatedClass.e);
        return valueH != null ? valueN == null ? valueH : valueN.e(valueH) : valueN;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final Map g() {
        POJOPropertiesCollector pOJOPropertiesCollector = this.b;
        if (pOJOPropertiesCollector == null) {
            return Collections.EMPTY_MAP;
        }
        if (!pOJOPropertiesCollector.i) {
            pOJOPropertiesCollector.h();
        }
        return pOJOPropertiesCollector.t;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedMember h() {
        POJOPropertiesCollector pOJOPropertiesCollector = this.b;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        if (!pOJOPropertiesCollector.i) {
            pOJOPropertiesCollector.h();
        }
        LinkedList linkedList = pOJOPropertiesCollector.r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1 || POJOPropertiesCollector.g(pOJOPropertiesCollector.r)) {
            return (AnnotatedMember) pOJOPropertiesCollector.r.get(0);
        }
        pOJOPropertiesCollector.i("Multiple 'as-value' properties defined (%s vs %s)", pOJOPropertiesCollector.r.get(0), pOJOPropertiesCollector.r.get(1));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedMethod i(String str, Class[] clsArr) {
        LinkedHashMap linkedHashMap = this.e.h().d;
        if (linkedHashMap == null) {
            return null;
        }
        return (AnnotatedMethod) linkedHashMap.get(new MemberKey(str, clsArr));
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final List j() {
        return u();
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final JsonInclude.Value k(JsonInclude.Value value) {
        JsonInclude.Value valueL;
        AnnotationIntrospector annotationIntrospector = this.d;
        return (annotationIntrospector == null || (valueL = annotationIntrospector.L(this.e)) == null) ? value : value == null ? valueL : value.a(valueL);
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final Annotations l() {
        return this.e.m;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final AnnotatedClass m() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final List n() {
        return this.e.g().b;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final List o() {
        Class clsU;
        List<AnnotatedMethod> list = this.e.g().c;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : list) {
            Method method = annotatedMethod.g;
            if (this.f14226a.d.isAssignableFrom(method.getReturnType())) {
                JsonCreator.Mode modeE = this.d.e(this.c, annotatedMethod);
                if (modeE == null || modeE == JsonCreator.Mode.g) {
                    String name = method.getName();
                    if ((!"valueOf".equals(name) || method.getParameterCount() != 1) && (!"fromString".equals(name) || method.getParameterCount() != 1 || ((clsU = annotatedMethod.u(0)) != String.class && !CharSequence.class.isAssignableFrom(clsU)))) {
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final Set p() {
        POJOPropertiesCollector pOJOPropertiesCollector = this.b;
        HashSet hashSet = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.s;
        return hashSet == null ? Collections.EMPTY_SET : hashSet;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final ObjectIdInfo q() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final boolean r() {
        return this.e.m.size() > 0;
    }

    @Override // com.fasterxml.jackson.databind.BeanDescription
    public final Object s(boolean z) throws SecurityException {
        AnnotatedClass annotatedClass = this.e;
        AnnotatedConstructor annotatedConstructor = annotatedClass.g().f14269a;
        if (annotatedConstructor == null) {
            return null;
        }
        if (z) {
            annotatedConstructor.g(this.c.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return annotatedConstructor.o();
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ClassUtil.E(e);
            ClassUtil.G(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + annotatedClass.e.getName() + ": (" + e.getClass().getName() + ") " + ClassUtil.i(e), e);
        }
    }

    public final Converter t(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.v(cls)) {
            return null;
        }
        if (!Converter.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        MapperConfig mapperConfig = this.c;
        mapperConfig.e.getClass();
        return (Converter) ClassUtil.h(cls, mapperConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    public final List u() {
        if (this.h == null) {
            POJOPropertiesCollector pOJOPropertiesCollector = this.b;
            if (!pOJOPropertiesCollector.i) {
                pOJOPropertiesCollector.h();
            }
            this.h = new ArrayList(pOJOPropertiesCollector.j.values());
        }
        return this.h;
    }

    public final boolean w(PropertyName propertyName) {
        BeanPropertyDefinition beanPropertyDefinition;
        Iterator it = u().iterator();
        while (true) {
            if (!it.hasNext()) {
                beanPropertyDefinition = null;
                break;
            }
            beanPropertyDefinition = (BeanPropertyDefinition) it.next();
            if (beanPropertyDefinition.A(propertyName)) {
                break;
            }
        }
        return beanPropertyDefinition != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        JavaType javaType = pOJOPropertiesCollector.d;
        AnnotatedClass annotatedClass = pOJOPropertiesCollector.e;
        super(javaType);
        this.b = pOJOPropertiesCollector;
        MapperConfig mapperConfig = pOJOPropertiesCollector.f14278a;
        this.c = mapperConfig;
        if (mapperConfig == null) {
            this.d = null;
        } else {
            this.d = mapperConfig.d();
        }
        this.e = annotatedClass;
        AnnotationIntrospector annotationIntrospector = pOJOPropertiesCollector.g;
        ObjectIdInfo objectIdInfoZ = annotationIntrospector.z(annotatedClass);
        this.i = objectIdInfoZ != null ? annotationIntrospector.B(annotatedClass, objectIdInfoZ) : objectIdInfoZ;
    }
}

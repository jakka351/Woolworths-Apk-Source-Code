package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    public final DeserializerFactoryConfig d;

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14235a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            f14235a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14235a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14235a[0] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class ContainerDefaultMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14236a;
        public static final HashMap b;

        static {
            HashMap map = new HashMap();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            f14236a = map;
            HashMap map2 = new HashMap();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            b = map2;
        }
    }

    public static class CreatorCollectionState {

        /* renamed from: a, reason: collision with root package name */
        public final DeserializationContext f14237a;
        public final BeanDescription b;
        public final VisibilityChecker c;
        public final CreatorCollector d;
        public final Map e;
        public LinkedList f;
        public int g;
        public LinkedList h;
        public int i;

        public CreatorCollectionState(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker visibilityChecker, CreatorCollector creatorCollector, Map map) {
            this.f14237a = deserializationContext;
            this.b = beanDescription;
            this.c = visibilityChecker;
            this.d = creatorCollector;
            this.e = map;
        }
    }

    static {
        new PropertyName("@JsonUnwrapped", null);
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this.d = deserializerFactoryConfig;
    }

    public static boolean r(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        if ((beanPropertyDefinition == null || !beanPropertyDefinition.D()) && annotationIntrospector.p(annotatedWithParams.r(0)) == null) {
            return (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.f()) ? false : true;
        }
        return true;
    }

    public static void t(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) throws SecurityException {
        Class clsU = annotatedWithParams.u(0);
        if (clsU == String.class || clsU == CharSequence.class) {
            if (z || z2) {
                creatorCollector.e(annotatedWithParams, 1, z);
                return;
            }
            return;
        }
        if (clsU == Integer.TYPE || clsU == Integer.class) {
            if (z || z2) {
                creatorCollector.e(annotatedWithParams, 2, z);
                return;
            }
            return;
        }
        if (clsU == Long.TYPE || clsU == Long.class) {
            if (z || z2) {
                creatorCollector.e(annotatedWithParams, 3, z);
                return;
            }
            return;
        }
        if (clsU == Double.TYPE || clsU == Double.class) {
            if (z || z2) {
                creatorCollector.e(annotatedWithParams, 5, z);
                return;
            }
            return;
        }
        if (clsU == Boolean.TYPE || clsU == Boolean.class) {
            if (z || z2) {
                creatorCollector.e(annotatedWithParams, 7, z);
                return;
            }
            return;
        }
        if (clsU == BigInteger.class && (z || z2)) {
            creatorCollector.e(annotatedWithParams, 4, z);
        }
        if (clsU == BigDecimal.class && (z || z2)) {
            creatorCollector.e(annotatedWithParams, 6, z);
        }
        if (z) {
            creatorCollector.b(annotatedWithParams, z, null, 0);
        }
    }

    public static boolean u(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams) {
        MapperConfig mapperConfig = deserializationContext.f;
        JsonCreator.Mode modeE = mapperConfig.d().e(mapperConfig, annotatedWithParams);
        return (modeE == null || modeE == JsonCreator.Mode.g) ? false : true;
    }

    public static EnumResolver x(Class cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) throws SecurityException {
        if (annotatedMember != null) {
            deserializationConfig.getClass();
            if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                ClassUtil.e(annotatedMember.j(), deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
            boolean zM = deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
            Enum[] enumArrA = EnumResolver.a(cls);
            HashMap map = new HashMap();
            int length = enumArrA.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum r2 = enumArrA[length];
                try {
                    Object objK = annotatedMember.k(r2);
                    if (objK != null) {
                        map.put(objK.toString(), r2);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Failed to access @JsonValue of Enum value ");
                    sb.append(r2);
                    sb.append(": ");
                    throw new IllegalArgumentException(a.f(e, sb));
                }
            }
            Enum enumG = annotationIntrospectorD.g(cls);
            Class clsE = annotatedMember.e();
            if (clsE.isPrimitive()) {
                clsE = ClassUtil.I(clsE);
            }
            return new EnumResolver(cls, enumArrA, map, enumG, zM, clsE == Long.class || clsE == Integer.class || clsE == Short.class || clsE == Byte.class);
        }
        AnnotationIntrospector annotationIntrospectorD2 = deserializationConfig.d();
        boolean zM2 = deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA2 = EnumResolver.a(cls);
        String[] strArrL = annotationIntrospectorD2.l(cls, enumArrA2, new String[enumArrA2.length]);
        String[][] strArr = new String[strArrL.length][];
        annotationIntrospectorD2.k(cls, enumArrA2, strArr);
        HashMap map2 = new HashMap();
        int length2 = enumArrA2.length;
        for (int i = 0; i < length2; i++) {
            Enum r3 = enumArrA2[i];
            String strName = strArrL[i];
            if (strName == null) {
                strName = r3.name();
            }
            map2.put(strName, r3);
            String[] strArr2 = strArr[i];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map2.containsKey(str)) {
                        map2.put(str, r3);
                    }
                }
            }
        }
        return new EnumResolver(cls, enumArrA2, map2, annotationIntrospectorD2.g(cls), zM2, false);
    }

    public static JsonDeserializer y(DeserializationContext deserializationContext, Annotated annotated) {
        Object objJ = deserializationContext.f.d().j(annotated);
        if (objJ != null) {
            return deserializationContext.m(annotated, objJ);
        }
        return null;
    }

    public static KeyDeserializer z(DeserializationContext deserializationContext, Annotated annotated) {
        Object objR = deserializationContext.f.d().r(annotated);
        if (objR != null) {
            return deserializationContext.O(annotated, objR);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.deser.ValueInstantiator B(com.fasterxml.jackson.databind.BeanDescription r5, com.fasterxml.jackson.databind.DeserializationContext r6) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.f
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r1 = r5.m()
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r0.d()
            java.lang.Object r1 = r2.d0(r1)
            r2 = 0
            if (r1 == 0) goto L74
            boolean r3 = r1 instanceof com.fasterxml.jackson.databind.deser.ValueInstantiator
            if (r3 == 0) goto L18
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r1
            goto L75
        L18:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L53
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r3 = com.fasterxml.jackson.databind.util.ClassUtil.v(r1)
            if (r3 == 0) goto L25
            goto L74
        L25:
            java.lang.Class<com.fasterxml.jackson.databind.deser.ValueInstantiator> r3 = com.fasterxml.jackson.databind.deser.ValueInstantiator.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L40
            com.fasterxml.jackson.databind.cfg.BaseSettings r3 = r0.e
            r3.getClass()
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r0.m(r3)
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ClassUtil.h(r1, r0)
            r1 = r0
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = (com.fasterxml.jackson.databind.deser.ValueInstantiator) r1
            goto L75
        L40:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            r6.<init>(r0)
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r6 = androidx.constraintlayout.core.state.a.f(r1, r6, r0)
            r5.<init>(r6)
            throw r5
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            r6.<init>(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r6.append(r0)
            java.lang.String r0 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L74:
            r1 = r2
        L75:
            if (r1 != 0) goto L85
            com.fasterxml.jackson.databind.JavaType r0 = r5.f14226a
            java.lang.Class r0 = r0.d
            com.fasterxml.jackson.databind.deser.ValueInstantiator$Base r1 = com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators.a(r0)
            if (r1 != 0) goto L85
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator r1 = r4.s(r5, r6)
        L85:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r4.d
            com.fasterxml.jackson.databind.deser.ValueInstantiators[] r0 = r0.h
            int r3 = r0.length
            if (r3 <= 0) goto Lb6
            com.fasterxml.jackson.databind.util.ArrayIterator r3 = new com.fasterxml.jackson.databind.util.ArrayIterator
            r3.<init>(r0)
        L91:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r3.next()
            com.fasterxml.jackson.databind.deser.ValueInstantiators r0 = (com.fasterxml.jackson.databind.deser.ValueInstantiators) r0
            com.fasterxml.jackson.databind.deser.ValueInstantiator r1 = r0.a(r5, r1)
            if (r1 == 0) goto La4
            goto L91
        La4:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator"
            r6.T(r5, r1, r0)
            throw r2
        Lb6:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r5 = r1.m(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.B(com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.DeserializationContext):com.fasterxml.jackson.databind.deser.ValueInstantiator");
    }

    public final JavaType C(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) {
        Object objA;
        KeyDeserializer keyDeserializerO;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
        if (javaType.E() && javaType.o() != null && (keyDeserializerO = deserializationContext.O(annotatedMember, annotationIntrospectorD.r(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).U(keyDeserializerO);
        }
        if (javaType.r()) {
            JsonDeserializer jsonDeserializerM = deserializationContext.m(annotatedMember, annotationIntrospectorD.c(annotatedMember));
            if (jsonDeserializerM != null) {
                javaType = javaType.K(jsonDeserializerM);
            }
            TypeResolverBuilder typeResolverBuilderG = deserializationConfig.d().G(deserializationConfig, annotatedMember, javaType);
            JavaType javaTypeK = javaType.k();
            Object objL = typeResolverBuilderG == null ? l(deserializationConfig, javaTypeK) : typeResolverBuilderG.a(deserializationConfig, javaTypeK, deserializationConfig.g.f(deserializationConfig, annotatedMember, javaTypeK));
            if (objL != null) {
                javaType = javaType.J(objL);
            }
        }
        TypeResolverBuilder typeResolverBuilderO = deserializationConfig.d().O(deserializationConfig, annotatedMember, javaType);
        if (typeResolverBuilderO == null) {
            objA = l(deserializationConfig, javaType);
        } else {
            try {
                objA = typeResolverBuilderO.a(deserializationConfig, javaType, deserializationConfig.g.f(deserializationConfig, annotatedMember, javaType));
            } catch (IllegalArgumentException | IllegalStateException e) {
                InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, ClassUtil.i(e));
                invalidDefinitionException.initCause(e);
                throw invalidDefinitionException;
            }
        }
        if (objA != null) {
            javaType = javaType.N(objA);
        }
        return annotationIntrospectorD.t0(deserializationConfig, annotatedMember, javaType);
    }

    public abstract BeanDeserializerFactory D(DeserializerFactoryConfig deserializerFactoryConfig);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer a(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) {
        JsonDeserializer objectArrayDeserializer;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        JavaType javaType = arrayType.m;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) javaType.f;
        TypeDeserializer typeDeserializerL = (TypeDeserializer) javaType.g;
        if (typeDeserializerL == null) {
            typeDeserializerL = l(deserializationConfig, javaType);
        }
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                objectArrayDeserializer = null;
                break;
            }
            objectArrayDeserializer = ((Deserializers) arrayIteratorB.next()).f(arrayType);
            if (objectArrayDeserializer != null) {
                break;
            }
        }
        if (objectArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class cls = javaType.d;
                if (cls.isPrimitive()) {
                    return PrimitiveArrayDeserializers.q0(cls);
                }
                if (cls == String.class) {
                    return StringArrayDeserializer.l;
                }
            }
            objectArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializerL);
        }
        if (deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return objectArrayDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer d(com.fasterxml.jackson.databind.DeserializationContext r12, com.fasterxml.jackson.databind.type.CollectionType r13, com.fasterxml.jackson.databind.BeanDescription r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.d(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer e(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
        JsonDeserializer jsonDeserializerD;
        JavaType javaType = collectionLikeType.m;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        if (((TypeDeserializer) javaType.g) == null) {
            l(deserializationConfig, javaType);
        }
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                jsonDeserializerD = null;
                break;
            }
            jsonDeserializerD = ((Deserializers) arrayIteratorB.next()).d(collectionLikeType);
            if (jsonDeserializerD != null) {
                break;
            }
        }
        if (jsonDeserializerD != null && deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return jsonDeserializerD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer f(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws InvalidDefinitionException, SecurityException {
        JsonDeserializer enumDeserializer;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        Class<?> cls = javaType.d;
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                enumDeserializer = null;
                break;
            }
            enumDeserializer = ((Deserializers) arrayIteratorB.next()).b(cls);
            if (enumDeserializer != null) {
                break;
            }
        }
        if (enumDeserializer == null) {
            if (cls == Enum.class) {
                return new AbstractDeserializer(beanDescription);
            }
            StdValueInstantiator stdValueInstantiatorS = s(beanDescription, deserializationContext);
            SettableBeanProperty[] settableBeanPropertyArr = stdValueInstantiatorS.h;
            Iterator it = beanDescription.o().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) it.next();
                if (u(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.g.getParameterCount() == 0) {
                        enumDeserializer = EnumDeserializer.q0(deserializationConfig, cls, annotatedMethod);
                    } else {
                        if (!annotatedMethod.g.getReturnType().isAssignableFrom(cls)) {
                            deserializationContext.j("Invalid `@JsonCreator` annotated Enum factory method [" + annotatedMethod.toString() + "]: needs to return compatible type");
                            throw null;
                        }
                        enumDeserializer = EnumDeserializer.p0(deserializationConfig, cls, annotatedMethod, stdValueInstantiatorS, settableBeanPropertyArr);
                    }
                }
            }
            if (enumDeserializer == null) {
                enumDeserializer = new EnumDeserializer(x(cls, deserializationConfig, beanDescription.h()), Boolean.valueOf(deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return enumDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        r1 = new java.lang.StringBuilder("Unsuitable method (");
        r1.append(r10);
        r1.append(") decorated with @JsonCreator (for Enum type ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.constraintlayout.core.state.a.f(r5, r1, ")"));
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.KeyDeserializer g(com.fasterxml.jackson.databind.DeserializationContext r17, com.fasterxml.jackson.databind.JavaType r18) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.g(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.KeyDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer h(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription) {
        ?? mapDeserializer;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        JavaType javaType = mapType.m;
        Class cls = mapType.d;
        JavaType javaType2 = mapType.n;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) javaType2.f;
        KeyDeserializer keyDeserializer = (KeyDeserializer) javaType.f;
        TypeDeserializer typeDeserializerL = (TypeDeserializer) javaType2.g;
        if (typeDeserializerL == null) {
            typeDeserializerL = l(deserializationConfig, javaType2);
        }
        TypeDeserializer typeDeserializer = typeDeserializerL;
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                mapDeserializer = 0;
                break;
            }
            mapDeserializer = ((Deserializers) arrayIteratorB.next()).e(mapType);
            if (mapDeserializer != 0) {
                break;
            }
        }
        if (mapDeserializer == 0) {
            mapDeserializer = mapDeserializer;
            if (EnumMap.class.isAssignableFrom(cls)) {
                ValueInstantiator valueInstantiatorB = cls == EnumMap.class ? null : B(beanDescription, deserializationContext);
                Class cls2 = javaType.d;
                Annotation[] annotationArr = ClassUtil.f14330a;
                if (!Enum.class.isAssignableFrom(cls2) || cls2 == Enum.class) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                mapDeserializer = new EnumMapDeserializer(mapType, valueInstantiatorB, jsonDeserializer, typeDeserializer);
            }
            if (mapDeserializer == 0) {
                if (cls.isInterface() || mapType.w()) {
                    Class cls3 = (Class) ContainerDefaultMappings.b.get(cls.getName());
                    MapType mapType2 = cls3 != null ? (MapType) deserializationConfig.e.d.j(mapType, cls3, true) : null;
                    if (mapType2 != null) {
                        beanDescription = deserializationConfig.e.e.b(deserializationConfig, mapType2, deserializationConfig);
                        mapType = mapType2;
                        mapDeserializer = mapDeserializer;
                    } else {
                        if (mapType.g == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType);
                        }
                        mapDeserializer = new AbstractDeserializer(beanDescription);
                    }
                } else {
                    StdDelegatingDeserializer stdDelegatingDeserializerB = JavaUtilCollectionsDeserializers.b(mapType);
                    if (stdDelegatingDeserializerB != null) {
                        return stdDelegatingDeserializerB;
                    }
                    mapDeserializer = stdDelegatingDeserializerB;
                }
                MapType mapType3 = mapType;
                if (mapDeserializer == 0) {
                    mapDeserializer = new MapDeserializer(mapType3, B(beanDescription, deserializationContext), keyDeserializer, jsonDeserializer, typeDeserializer);
                    JsonIgnoreProperties.Value valueN = deserializationConfig.n(Map.class, beanDescription.m());
                    Set set = valueN == null ? null : valueN.g ? Collections.EMPTY_SET : valueN.d;
                    if (set == null || set.isEmpty()) {
                        set = null;
                    }
                    mapDeserializer.s = set;
                    mapDeserializer.u = IgnorePropertiesUtil.a(set, mapDeserializer.t);
                    JsonIncludeProperties.Value valueM = deserializationConfig.d().M(beanDescription.m());
                    Set set2 = valueM != null ? valueM.d : null;
                    mapDeserializer.t = set2;
                    mapDeserializer.u = IgnorePropertiesUtil.a(mapDeserializer.s, set2);
                }
            }
        }
        if (deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return mapDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer i(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) {
        JsonDeserializer jsonDeserializerI;
        JavaType javaType = mapLikeType.m;
        JavaType javaType2 = mapLikeType.n;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        if (((TypeDeserializer) javaType2.g) == null) {
            l(deserializationConfig, javaType2);
        }
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                jsonDeserializerI = null;
                break;
            }
            jsonDeserializerI = ((Deserializers) arrayIteratorB.next()).i(mapLikeType);
            if (jsonDeserializerI != null) {
                break;
            }
        }
        if (jsonDeserializerI != null && deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return jsonDeserializerI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer j(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) {
        JsonDeserializer jsonDeserializerA;
        JavaType javaType = referenceType.m;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) javaType.f;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        TypeDeserializer typeDeserializerL = (TypeDeserializer) javaType.g;
        if (typeDeserializerL == null) {
            typeDeserializerL = l(deserializationConfig, javaType);
        }
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        ArrayIterator arrayIteratorB = deserializerFactoryConfig.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                jsonDeserializerA = null;
                break;
            }
            jsonDeserializerA = ((Deserializers) arrayIteratorB.next()).a(referenceType);
            if (jsonDeserializerA != null) {
                break;
            }
        }
        if (jsonDeserializerA == null && referenceType.F(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.d != AtomicReference.class ? B(beanDescription, deserializationContext) : null, typeDeserializerL, jsonDeserializer);
        }
        if (jsonDeserializerA != null && deserializerFactoryConfig.c()) {
            ArrayIterator arrayIteratorA = deserializerFactoryConfig.a();
            while (arrayIteratorA.hasNext()) {
                ((BeanDeserializerModifier) arrayIteratorA.next()).getClass();
            }
        }
        return jsonDeserializerA;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JsonDeserializer k(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer jsonDeserializerG;
        Class cls = javaType.d;
        ArrayIterator arrayIteratorB = this.d.b();
        while (true) {
            if (!arrayIteratorB.hasNext()) {
                jsonDeserializerG = null;
                break;
            }
            jsonDeserializerG = ((Deserializers) arrayIteratorB.next()).g(cls);
            if (jsonDeserializerG != null) {
                break;
            }
        }
        return jsonDeserializerG != null ? jsonDeserializerG : JsonNodeDeserializer.z0(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final TypeDeserializer l(DeserializationConfig deserializationConfig, JavaType javaType) {
        AnnotatedClass annotatedClass = ((BasicBeanDescription) deserializationConfig.l(javaType.d)).e;
        TypeResolverBuilder typeResolverBuilderB0 = deserializationConfig.d().b0(javaType, deserializationConfig, annotatedClass);
        if (typeResolverBuilderB0 == null) {
            deserializationConfig.e.getClass();
            return null;
        }
        Collection collectionE = deserializationConfig.g.e(deserializationConfig, annotatedClass);
        if (typeResolverBuilderB0.f() == null && javaType.w()) {
            JavaType javaTypeM = m(deserializationConfig, javaType);
            if (!javaTypeM.u(javaType.d)) {
                typeResolverBuilderB0 = typeResolverBuilderB0.e(javaTypeM.d);
            }
        }
        try {
            return typeResolverBuilderB0.a(deserializationConfig, javaType, collectionE);
        } catch (IllegalArgumentException | IllegalStateException e) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(null, ClassUtil.i(e));
            invalidDefinitionException.initCause(e);
            throw invalidDefinitionException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final JavaType m(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType javaType2;
        while (true) {
            Class cls = javaType.d;
            AbstractTypeResolver[] abstractTypeResolverArr = this.d.g;
            if (abstractTypeResolverArr.length > 0) {
                ArrayIterator arrayIterator = new ArrayIterator(abstractTypeResolverArr);
                while (arrayIterator.hasNext()) {
                    JavaType javaTypeA = ((AbstractTypeResolver) arrayIterator.next()).a(javaType);
                    if (javaTypeA != null && !javaTypeA.u(cls)) {
                        javaType2 = javaTypeA;
                        break;
                    }
                }
                javaType2 = null;
            } else {
                javaType2 = null;
            }
            if (javaType2 == null) {
                return javaType;
            }
            Class cls2 = javaType.d;
            Class cls3 = javaType2.d;
            if (cls2 == cls3 || !cls2.isAssignableFrom(cls3)) {
                break;
            }
            javaType = javaType2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaType2 + ": latter is not a subtype of former");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory n(Deserializers deserializers) {
        if (deserializers == null) {
            throw new IllegalArgumentException("Cannot pass null Deserializers");
        }
        DeserializerFactoryConfig deserializerFactoryConfig = this.d;
        return D(new DeserializerFactoryConfig((Deserializers[]) ArrayBuilders.b(deserializerFactoryConfig.d, deserializers), deserializerFactoryConfig.e, deserializerFactoryConfig.f, deserializerFactoryConfig.g, deserializerFactoryConfig.h));
    }

    public final void o(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate, ConstructorDetector constructorDetector) throws InvalidDefinitionException, SecurityException {
        int i = creatorCandidate.c;
        CreatorCandidate.Param[] paramArr = creatorCandidate.d;
        AnnotatedWithParams annotatedWithParams = creatorCandidate.b;
        int i2 = 0;
        if (1 != i) {
            constructorDetector.getClass();
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= i) {
                    i3 = i4;
                    break;
                }
                if (paramArr[i2].c == null) {
                    if (i4 >= 0) {
                        break;
                    } else {
                        i4 = i2;
                    }
                }
                i2++;
            }
            if (i3 < 0 || creatorCandidate.c(i3) != null) {
                q(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            } else {
                p(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            }
        }
        CreatorCandidate.Param param = paramArr[0];
        AnnotatedParameter annotatedParameter = param.f14243a;
        JacksonInject.Value value = param.c;
        constructorDetector.getClass();
        BeanPropertyDefinition beanPropertyDefinitionD = creatorCandidate.d(0);
        BeanPropertyDefinition beanPropertyDefinition = paramArr[0].b;
        PropertyName propertyNameB = (beanPropertyDefinition == null || !beanPropertyDefinition.D()) ? null : beanPropertyDefinition.b();
        boolean z = (propertyNameB == null && value == null) ? false : true;
        if (!z && beanPropertyDefinitionD != null) {
            propertyNameB = creatorCandidate.c(0);
            z = propertyNameB != null && beanPropertyDefinitionD.f();
        }
        PropertyName propertyName = propertyNameB;
        if (z) {
            creatorCollector.c(annotatedWithParams, true, new SettableBeanProperty[]{w(deserializationContext, beanDescription, propertyName, 0, annotatedParameter, value)});
            return;
        }
        t(creatorCollector, annotatedWithParams, true, true);
        BeanPropertyDefinition beanPropertyDefinitionD2 = creatorCandidate.d(0);
        if (beanPropertyDefinitionD2 != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionD2).k = null;
        }
    }

    public final void p(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws InvalidDefinitionException, SecurityException {
        int i = creatorCandidate.c;
        AnnotatedWithParams annotatedWithParams = creatorCandidate.b;
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            CreatorCandidate.Param param = creatorCandidate.d[i3];
            AnnotatedParameter annotatedParameter = param.f14243a;
            JacksonInject.Value value = param.c;
            if (value != null) {
                settableBeanPropertyArr[i3] = w(deserializationContext, beanDescription, null, i3, annotatedParameter, value);
            } else {
                if (i2 >= 0) {
                    deserializationContext.T(beanDescription, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i2), Integer.valueOf(i3), creatorCandidate);
                    throw null;
                }
                i2 = i3;
            }
        }
        if (i2 < 0) {
            deserializationContext.T(beanDescription, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate);
            throw null;
        }
        if (i != 1) {
            creatorCollector.b(annotatedWithParams, true, settableBeanPropertyArr, i2);
            return;
        }
        t(creatorCollector, annotatedWithParams, true, true);
        BeanPropertyDefinition beanPropertyDefinitionD = creatorCandidate.d(0);
        if (beanPropertyDefinitionD != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionD).k = null;
        }
    }

    public final void q(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws InvalidDefinitionException {
        int i = creatorCandidate.c;
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
        int i2 = 0;
        while (i2 < i) {
            CreatorCandidate.Param param = creatorCandidate.d[i2];
            JacksonInject.Value value = param.c;
            AnnotatedParameter annotatedParameter = param.f14243a;
            PropertyName propertyNameC = creatorCandidate.c(i2);
            if (propertyNameC == null) {
                if (deserializationContext.f.d().c0(annotatedParameter) != null) {
                    deserializationContext.T(beanDescription, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.h));
                    throw null;
                }
                propertyNameC = creatorCandidate.b(i2);
                if (propertyNameC == null && value == null) {
                    deserializationContext.T(beanDescription, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i2), creatorCandidate);
                    throw null;
                }
            }
            DeserializationContext deserializationContext2 = deserializationContext;
            BeanDescription beanDescription2 = beanDescription;
            settableBeanPropertyArr[i2] = w(deserializationContext2, beanDescription2, propertyNameC, i2, annotatedParameter, value);
            i2++;
            deserializationContext = deserializationContext2;
            beanDescription = beanDescription2;
        }
        creatorCollector.c(creatorCandidate.b, true, settableBeanPropertyArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x047b, code lost:
    
        r1.T(r2, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", java.lang.Integer.valueOf(r11), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x048a, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0514 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.deser.std.StdValueInstantiator s(com.fasterxml.jackson.databind.BeanDescription r36, com.fasterxml.jackson.databind.DeserializationContext r37) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.s(com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.DeserializationContext):com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
    }

    public final CreatorProperty w(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) {
        Nulls nulls;
        Nulls nulls2;
        Nulls nulls3;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
        PropertyMetadata propertyMetadataA = PropertyMetadata.a(annotationIntrospectorD.p0(annotatedParameter), annotationIntrospectorD.I(annotatedParameter), annotationIntrospectorD.N(annotatedParameter), annotationIntrospectorD.H(annotatedParameter));
        PropertyName propertyNameF0 = annotationIntrospectorD.f0();
        JavaType javaTypeC = C(deserializationContext, annotatedParameter, annotatedParameter.g);
        TypeDeserializer typeDeserializerL = (TypeDeserializer) javaTypeC.g;
        if (typeDeserializerL == null) {
            typeDeserializerL = l(deserializationConfig, javaTypeC);
        }
        JsonSetter.Value valueY = deserializationConfig.d().Y(annotatedParameter);
        Nulls nulls4 = Nulls.g;
        if (valueY != null) {
            nulls2 = valueY.d;
            if (nulls2 == nulls4) {
                nulls2 = null;
            }
            nulls = valueY.e;
            if (nulls == nulls4) {
                nulls = null;
            }
        } else {
            nulls = null;
            nulls2 = null;
        }
        deserializationConfig.e(javaTypeC.d);
        JsonSetter.Value value2 = deserializationConfig.j.e;
        if (nulls2 == null && (nulls2 = value2.d) == nulls4) {
            nulls2 = null;
        }
        Nulls nulls5 = nulls2;
        if (nulls == null) {
            Nulls nulls6 = value2.e;
            nulls3 = nulls6 != nulls4 ? nulls6 : null;
        } else {
            nulls3 = nulls;
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, javaTypeC, propertyNameF0, typeDeserializerL, beanDescription.l(), annotatedParameter, i, value, (nulls5 == null && nulls3 == null) ? propertyMetadataA : new PropertyMetadata(propertyMetadataA.d, propertyMetadataA.e, propertyMetadataA.f, propertyMetadataA.g, propertyMetadataA.h, nulls5, nulls3));
        JsonDeserializer jsonDeserializerY = y(deserializationContext, annotatedParameter);
        if (jsonDeserializerY == null) {
            jsonDeserializerY = (JsonDeserializer) javaTypeC.f;
        }
        return jsonDeserializerY != null ? (CreatorProperty) creatorProperty.E(deserializationContext.B(jsonDeserializerY, creatorProperty, javaTypeC)) : creatorProperty;
    }
}

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public class BasicClassIntrospector extends ClassIntrospector implements Serializable {
    public static final BasicBeanDescription d = BasicBeanDescription.v(SimpleType.R(String.class), null, new AnnotatedClass(String.class));
    public static final BasicBeanDescription e;
    public static final BasicBeanDescription f;
    public static final BasicBeanDescription g;
    public static final BasicBeanDescription h;

    static {
        Class cls = Boolean.TYPE;
        e = BasicBeanDescription.v(SimpleType.R(cls), null, new AnnotatedClass(cls));
        Class cls2 = Integer.TYPE;
        f = BasicBeanDescription.v(SimpleType.R(cls2), null, new AnnotatedClass(cls2));
        Class cls3 = Long.TYPE;
        g = BasicBeanDescription.v(SimpleType.R(cls3), null, new AnnotatedClass(cls3));
        h = BasicBeanDescription.v(SimpleType.R(Object.class), null, new AnnotatedClass(Object.class));
    }

    public static BasicBeanDescription f(MapperConfigBase mapperConfigBase, JavaType javaType) {
        if (!javaType.z() || (javaType instanceof ArrayType)) {
            return null;
        }
        Class cls = javaType.d;
        if (!ClassUtil.w(cls)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return BasicBeanDescription.v(javaType, mapperConfigBase, h(mapperConfigBase, javaType, mapperConfigBase));
        }
        return null;
    }

    public static BasicBeanDescription g(MapperConfig mapperConfig, JavaType javaType) {
        Class cls = javaType.d;
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Boolean.TYPE) {
                        return null;
                    }
                    return e;
                }
                return g;
            }
            return f;
        }
        if (!ClassUtil.w(cls)) {
            if (JsonNode.class.isAssignableFrom(cls)) {
                return BasicBeanDescription.v(javaType, mapperConfig, new AnnotatedClass(cls));
            }
            return null;
        }
        if (cls == Object.class) {
            return h;
        }
        if (cls == String.class) {
            return d;
        }
        if (cls != Integer.class) {
            if (cls != Long.class) {
                if (cls != Boolean.class) {
                    return null;
                }
                return e;
            }
            return g;
        }
        return f;
    }

    public static AnnotatedClass h(MapperConfig mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        javaType.getClass();
        Class cls = javaType.d;
        if ((javaType instanceof ArrayType) && (mapperConfig == null || ((MapperConfigBase) mapperConfig).f.a(cls) == null)) {
            return new AnnotatedClass(cls);
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver);
        ArrayList arrayList = new ArrayList(8);
        if (!javaType.u(Object.class)) {
            if (cls.isInterface()) {
                AnnotatedClassResolver.d(javaType, arrayList, false);
            } else {
                AnnotatedClassResolver.e(javaType, arrayList, false);
            }
        }
        return new AnnotatedClass(javaType, annotatedClassResolver.d, arrayList, annotatedClassResolver.e, annotatedClassResolver.f(arrayList), annotatedClassResolver.c, annotatedClassResolver.f14270a, mixInResolver, mapperConfig.e.d, annotatedClassResolver.f);
    }

    public static POJOPropertiesCollector i(MapperConfigBase mapperConfigBase, JavaType javaType, MapperConfigBase mapperConfigBase2, boolean z) {
        AccessorNamingStrategy defaultAccessorNamingStrategy;
        BaseSettings baseSettings = mapperConfigBase.e;
        AnnotatedClass annotatedClassH = h(mapperConfigBase, javaType, mapperConfigBase2);
        if (ClassUtil.z(javaType.d)) {
            DefaultAccessorNamingStrategy.Provider provider = baseSettings.g;
            defaultAccessorNamingStrategy = new DefaultAccessorNamingStrategy.RecordNaming(mapperConfigBase, annotatedClassH);
        } else {
            DefaultAccessorNamingStrategy.Provider provider2 = baseSettings.g;
            defaultAccessorNamingStrategy = new DefaultAccessorNamingStrategy(mapperConfigBase, "set");
        }
        return new POJOPropertiesCollector(mapperConfigBase, z, javaType, annotatedClassH, defaultAccessorNamingStrategy);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public final BasicBeanDescription a(MapperConfig mapperConfig, JavaType javaType, MapperConfig mapperConfig2) {
        BasicBeanDescription basicBeanDescriptionG = g(mapperConfig, javaType);
        return basicBeanDescriptionG == null ? BasicBeanDescription.v(javaType, mapperConfig, h(mapperConfig, javaType, mapperConfig2)) : basicBeanDescriptionG;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public final BasicBeanDescription b(DeserializationConfig deserializationConfig, JavaType javaType, DeserializationConfig deserializationConfig2) {
        BasicBeanDescription basicBeanDescriptionG = g(deserializationConfig, javaType);
        return (basicBeanDescriptionG == null && (basicBeanDescriptionG = f(deserializationConfig, javaType)) == null) ? new BasicBeanDescription(i(deserializationConfig, javaType, deserializationConfig2, false)) : basicBeanDescriptionG;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public final BasicBeanDescription c(DeserializationConfig deserializationConfig, JavaType javaType, DeserializationConfig deserializationConfig2) {
        BasicBeanDescription basicBeanDescriptionG = g(deserializationConfig, javaType);
        return (basicBeanDescriptionG == null && (basicBeanDescriptionG = f(deserializationConfig, javaType)) == null) ? new BasicBeanDescription(i(deserializationConfig, javaType, deserializationConfig2, false)) : basicBeanDescriptionG;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public final BasicBeanDescription d(DeserializationConfig deserializationConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver, BeanDescription beanDescription) {
        AnnotatedClass annotatedClassH = h(deserializationConfig, javaType, mixInResolver);
        DefaultAccessorNamingStrategy.Provider provider = deserializationConfig.e.g;
        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.m(MapperFeature.USE_ANNOTATIONS) ? deserializationConfig.d() : null;
        JsonPOJOBuilder.Value valueD = annotationIntrospectorD != null ? annotationIntrospectorD.D(annotatedClassH) : null;
        return new BasicBeanDescription(new POJOPropertiesCollector(deserializationConfig, false, javaType, annotatedClassH, new DefaultAccessorNamingStrategy(deserializationConfig, valueD == null ? "with" : valueD.b)));
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector
    public final BasicBeanDescription e(SerializationConfig serializationConfig, JavaType javaType, SerializationConfig serializationConfig2) {
        BasicBeanDescription basicBeanDescriptionG = g(serializationConfig, javaType);
        return (basicBeanDescriptionG == null && (basicBeanDescriptionG = f(serializationConfig, javaType)) == null) ? new BasicBeanDescription(i(serializationConfig, javaType, serializationConfig2, true)) : basicBeanDescriptionG;
    }
}

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class DeserializerCache implements Serializable {
    public final HashMap e = new HashMap(8);
    public final LRUMap d = new LRUMap(Math.min(64, 500), 2000);

    public static JsonDeserializer b(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer jsonDeserializerM;
        Object objC;
        JsonDeserializer jsonDeserializerM2;
        JavaType javaTypeO;
        Object objR;
        KeyDeserializer keyDeserializerO;
        DeserializationConfig deserializationConfig = deserializationContext.f;
        if (javaType.w() || javaType.E() || javaType.x()) {
            javaType = deserializerFactory.m(deserializationConfig, javaType);
        }
        BeanDescription beanDescriptionQ = deserializationConfig.q(javaType);
        Annotated annotated = ((BasicBeanDescription) beanDescriptionQ).e;
        Object objJ = deserializationConfig.d().j(annotated);
        if (objJ == null) {
            jsonDeserializerM = null;
        } else {
            jsonDeserializerM = deserializationContext.m(annotated, objJ);
            Object objI = deserializationConfig.d().i(annotated);
            Converter converterC = objI == null ? null : deserializationContext.c(objI);
            if (converterC != null) {
                jsonDeserializerM = new StdDelegatingDeserializer(converterC, converterC.b(deserializationContext.e()), jsonDeserializerM);
            }
        }
        if (jsonDeserializerM != null) {
            return jsonDeserializerM;
        }
        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
        JavaType javaTypeU = (!javaType.E() || (javaTypeO = javaType.o()) == null || javaTypeO.f != null || (objR = annotationIntrospectorD.r(annotated)) == null || (keyDeserializerO = deserializationContext.O(annotated, objR)) == null) ? javaType : ((MapLikeType) javaType).U(keyDeserializerO);
        JavaType javaTypeK = javaTypeU.k();
        if (javaTypeK != null && javaTypeK.f == null && (objC = annotationIntrospectorD.c(annotated)) != null) {
            if (objC instanceof JsonDeserializer) {
                jsonDeserializerM2 = (JsonDeserializer) objC;
            } else {
                if (!(objC instanceof Class)) {
                    throw new IllegalStateException("AnnotationIntrospector.findContentDeserializer() returned value of type " + objC.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
                }
                Class cls = (Class) objC;
                if (cls == JsonDeserializer.None.class || ClassUtil.v(cls)) {
                    cls = null;
                }
                jsonDeserializerM2 = cls != null ? deserializationContext.m(annotated, cls) : null;
            }
            if (jsonDeserializerM2 != null) {
                javaTypeU = javaTypeU.K(jsonDeserializerM2);
            }
        }
        JavaType javaTypeT0 = annotationIntrospectorD.t0(deserializationConfig, annotated, javaTypeU);
        if (javaTypeT0 != javaType) {
            beanDescriptionQ = deserializationConfig.q(javaTypeT0);
            javaType = javaTypeT0;
        }
        BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescriptionQ;
        AnnotatedClass annotatedClass = basicBeanDescription.e;
        AnnotationIntrospector annotationIntrospector = basicBeanDescription.d;
        Class clsC = annotationIntrospector == null ? null : annotationIntrospector.C(annotatedClass);
        if (clsC != null) {
            return deserializerFactory.c(deserializationContext, javaType, beanDescriptionQ, clsC);
        }
        Converter converterT = annotationIntrospector != null ? basicBeanDescription.t(annotationIntrospector.i(annotatedClass)) : null;
        if (converterT == null) {
            return c(deserializationContext, deserializerFactory, javaType, beanDescriptionQ);
        }
        JavaType javaTypeB = converterT.b(deserializationContext.e());
        if (!javaTypeB.u(javaType.d)) {
            beanDescriptionQ = deserializationConfig.q(javaTypeB);
        }
        return new StdDelegatingDeserializer(converterT, javaTypeB, c(deserializationContext, deserializerFactory, javaTypeB, beanDescriptionQ));
    }

    public static JsonDeserializer c(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        if (javaType.B()) {
            return deserializerFactory.f(deserializationContext, javaType, beanDescription);
        }
        if (javaType.z()) {
            if (javaType instanceof ArrayType) {
                return deserializerFactory.a(deserializationContext, (ArrayType) javaType, beanDescription);
            }
            boolean zE = javaType.E();
            JsonFormat.Shape shape = JsonFormat.Shape.h;
            if (zE && beanDescription.f().e != shape) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                return mapLikeType instanceof MapType ? deserializerFactory.h(deserializationContext, (MapType) mapLikeType, beanDescription) : deserializerFactory.i(deserializationContext, mapLikeType, beanDescription);
            }
            if (javaType.x() && beanDescription.f().e != shape) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                return collectionLikeType instanceof CollectionType ? deserializerFactory.d(deserializationContext, (CollectionType) collectionLikeType, beanDescription) : deserializerFactory.e(deserializationContext, collectionLikeType, beanDescription);
            }
        }
        return javaType.b() ? deserializerFactory.j(deserializationContext, (ReferenceType) javaType, beanDescription) : JsonNode.class.isAssignableFrom(javaType.d) ? deserializerFactory.k(deserializationConfig, javaType, beanDescription) : deserializerFactory.b(deserializationContext, javaType, beanDescription);
    }

    public static boolean d(JavaType javaType) {
        if (!javaType.z()) {
            return false;
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK == null || (javaTypeK.f == null && javaTypeK.g == null)) {
            return javaType.E() && javaType.o().f != null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer a(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws InvalidDefinitionException {
        try {
            JsonDeserializer jsonDeserializerB = b(deserializationContext, deserializerFactory, javaType);
            if (jsonDeserializerB == 0) {
                return null;
            }
            boolean z = !d(javaType) && jsonDeserializerB.m();
            if (jsonDeserializerB instanceof ResolvableDeserializer) {
                HashMap map = this.e;
                map.put(javaType, jsonDeserializerB);
                ((ResolvableDeserializer) jsonDeserializerB).a(deserializationContext);
                map.remove(javaType);
            }
            if (z) {
                this.d.f.f(javaType, jsonDeserializerB, false);
            }
            return jsonDeserializerB;
        } catch (IllegalArgumentException e) {
            deserializationContext.j(ClassUtil.i(e));
            throw null;
        }
    }

    public final JsonDeserializer e(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws InvalidDefinitionException {
        JsonDeserializer jsonDeserializerA;
        JsonDeserializer jsonDeserializer;
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        JsonDeserializer jsonDeserializer2 = d(javaType) ? null : (JsonDeserializer) this.d.f.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        synchronized (this.e) {
            try {
                jsonDeserializerA = d(javaType) ? null : (JsonDeserializer) this.d.f.get(javaType);
                if (jsonDeserializerA == null) {
                    int size = this.e.size();
                    if (size <= 0 || (jsonDeserializer = (JsonDeserializer) this.e.get(javaType)) == null) {
                        try {
                            jsonDeserializerA = a(deserializationContext, deserializerFactory, javaType);
                        } finally {
                            if (size == 0 && this.e.size() > 0) {
                                this.e.clear();
                            }
                        }
                    } else {
                        jsonDeserializerA = jsonDeserializer;
                    }
                }
            } finally {
            }
        }
        if (jsonDeserializerA != null) {
            return jsonDeserializerA;
        }
        Class cls = javaType.d;
        Annotation[] annotationArr = ClassUtil.f14330a;
        if ((cls.getModifiers() & 1536) == 0) {
            deserializationContext.j("Cannot find a Value deserializer for type " + javaType);
            throw null;
        }
        deserializationContext.j("Cannot find a Value deserializer for abstract type " + javaType);
        throw null;
    }

    public Object writeReplace() {
        this.e.clear();
        return this;
    }
}

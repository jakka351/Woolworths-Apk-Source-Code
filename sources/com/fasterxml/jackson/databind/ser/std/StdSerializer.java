package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class StdSerializer<T> extends JsonSerializer<T> implements JsonFormatVisitable, SchemaAware, Serializable {
    public static final Object e = new Object();
    public final Class d;

    public StdSerializer(JavaType javaType) {
        this.d = javaType.d;
    }

    public static JsonSerializer j(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        Map map;
        JsonSerializer stdDelegatingSerializer;
        AnnotatedMember annotatedMemberA;
        Object objS;
        JsonSerializer jsonSerializerB;
        Map map2 = (Map) serializerProvider.g.a(e);
        if (map2 != null) {
            Object obj = map2.get(beanProperty);
            map = map2;
            if (obj != null) {
                return jsonSerializer;
            }
        } else {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            serializerProvider.g = serializerProvider.g.b(identityHashMap);
            map = identityHashMap;
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            AnnotationIntrospector annotationIntrospectorD = serializerProvider.d.d();
            if (!(beanProperty != null) || (annotatedMemberA = beanProperty.a()) == null || (objS = annotationIntrospectorD.S(annotatedMemberA)) == null) {
                stdDelegatingSerializer = jsonSerializer;
            } else {
                beanProperty.a();
                Converter converterC = serializerProvider.c(objS);
                JavaType javaTypeC = converterC.c(serializerProvider.e());
                if (jsonSerializer != null || javaTypeC.D()) {
                    jsonSerializerB = jsonSerializer;
                } else {
                    jsonSerializerB = serializerProvider.k.b(javaTypeC);
                    if (jsonSerializerB == null && (jsonSerializerB = serializerProvider.f.a(javaTypeC)) == null && (jsonSerializerB = serializerProvider.k(javaTypeC)) == null) {
                        jsonSerializerB = serializerProvider.B(javaTypeC.d);
                    }
                }
                stdDelegatingSerializer = new StdDelegatingSerializer(converterC, javaTypeC, jsonSerializerB);
            }
            return stdDelegatingSerializer != null ? serializerProvider.D(stdDelegatingSerializer, beanProperty) : jsonSerializer;
        } finally {
            map.remove(beanProperty);
        }
    }

    public static JsonFormat.Value k(SerializerProvider serializerProvider, BeanProperty beanProperty, Class cls) {
        return beanProperty != null ? beanProperty.c(serializerProvider.d, cls) : serializerProvider.d.h(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(com.fasterxml.jackson.databind.SerializerProvider r1, java.lang.Exception r2, java.lang.Object r3, int r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            com.fasterxml.jackson.databind.util.ClassUtil.E(r2)
            if (r1 == 0) goto L21
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS
            com.fasterxml.jackson.databind.SerializationConfig r1 = r1.d
            boolean r1 = r1.r(r0)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2c
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L34
        L2c:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L2f:
            if (r1 != 0) goto L34
            com.fasterxml.jackson.databind.util.ClassUtil.G(r2)
        L34:
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.i(r2, r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.m(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Exception, java.lang.Object, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(com.fasterxml.jackson.databind.SerializerProvider r1, java.lang.Exception r2, java.lang.Object r3, java.lang.String r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            com.fasterxml.jackson.databind.util.ClassUtil.E(r2)
            if (r1 == 0) goto L21
            com.fasterxml.jackson.databind.SerializationFeature r0 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS
            com.fasterxml.jackson.databind.SerializationConfig r1 = r1.d
            boolean r1 = r1.r(r0)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2c
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L34
        L2c:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L2f:
            if (r1 != 0) goto L34
            com.fasterxml.jackson.databind.util.ClassUtil.G(r2)
        L34:
            int r1 = com.fasterxml.jackson.databind.JsonMappingException.g
            com.fasterxml.jackson.databind.JsonMappingException$Reference r1 = new com.fasterxml.jackson.databind.JsonMappingException$Reference
            r1.<init>(r3, r4)
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.h(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.n(com.fasterxml.jackson.databind.SerializerProvider, java.lang.Exception, java.lang.Object, java.lang.String):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final Class c() {
        return this.d;
    }

    public final PropertyFilter l(SerializerProvider serializerProvider, Object obj, Object obj2) {
        serializerProvider.d.getClass();
        serializerProvider.i(this.d, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        throw null;
    }

    public StdSerializer(StdSerializer stdSerializer) {
        this.d = stdSerializer.d;
    }

    public StdSerializer(Class cls) {
        this.d = cls;
    }

    public StdSerializer(Class cls, int i) {
        this.d = cls;
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements ContextualSerializer {
    public final boolean h;
    public final JavaType i;
    public final TypeSerializer j;
    public final JsonSerializer k;
    public PropertySerializerMap l;

    public ObjectArraySerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(Object[].class);
        this.i = javaType;
        this.h = z;
        this.j = typeSerializer;
        this.l = PropertySerializerMap.a();
        this.k = jsonSerializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r9, com.fasterxml.jackson.databind.BeanProperty r10) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r8.j
            if (r0 == 0) goto La
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r1 = r0.a(r10)
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            r1 = 0
            if (r10 == 0) goto L25
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r10.a()
            com.fasterxml.jackson.databind.SerializationConfig r3 = r9.d
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r3.d()
            if (r2 == 0) goto L25
            java.lang.Object r3 = r3.d(r2)
            if (r3 == 0) goto L25
            com.fasterxml.jackson.databind.JsonSerializer r2 = r9.I(r2, r3)
            goto L26
        L25:
            r2 = r1
        L26:
            java.lang.Class r3 = r8.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r9, r10, r3)
            if (r3 == 0) goto L34
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f
            java.lang.Boolean r1 = r3.b(r1)
        L34:
            r7 = r1
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.k
            if (r2 != 0) goto L3a
            r2 = r1
        L3a:
            com.fasterxml.jackson.databind.JsonSerializer r2 = com.fasterxml.jackson.databind.ser.std.StdSerializer.j(r9, r10, r2)
            if (r2 != 0) goto L52
            com.fasterxml.jackson.databind.JavaType r3 = r8.i
            if (r3 == 0) goto L52
            boolean r4 = r8.h
            if (r4 == 0) goto L52
            boolean r4 = r3.D()
            if (r4 != 0) goto L52
            com.fasterxml.jackson.databind.JsonSerializer r2 = r9.p(r3, r10)
        L52:
            r6 = r2
            com.fasterxml.jackson.databind.BeanProperty r9 = r8.f
            if (r9 != r10) goto L64
            if (r6 != r1) goto L64
            if (r0 != r5) goto L64
            java.lang.Boolean r9 = r8.g
            boolean r9 = java.util.Objects.equals(r9, r7)
            if (r9 == 0) goto L64
            return r8
        L64:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r2 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            r3 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.SerializerProvider r7) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r1 = r4.g
            if (r1 != 0) goto L14
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r3 = r7.d
            boolean r2 = r3.r(r2)
            if (r2 != 0) goto L18
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1c
        L18:
            r4.s(r5, r6, r7)
            return
        L1c:
            r6.a1(r0, r5)
            r4.s(r5, r6, r7)
            r6.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new ObjectArraySerializer(this.i, this.h, typeSerializer, this.k);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        return ((Object[]) obj).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this.j, this.k, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void s(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj;
        Object obj2;
        PropertySerializerMap propertySerializerMapC;
        JavaType javaType = this.i;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        TypeSerializer typeSerializer = this.j;
        int i = 0;
        JsonSerializer jsonSerializer = this.k;
        if (jsonSerializer != null) {
            int length2 = objArr.length;
            Object obj3 = null;
            while (i < length2) {
                try {
                    obj3 = objArr[i];
                    if (obj3 == null) {
                        serializerProvider.o(jsonGenerator);
                    } else if (typeSerializer == null) {
                        jsonSerializer.f(obj3, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer.g(obj3, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                } catch (Exception e) {
                    StdSerializer.m(serializerProvider, e, obj3, i);
                    throw null;
                }
            }
            return;
        }
        BeanProperty beanProperty = this.f;
        if (typeSerializer != null) {
            int length3 = objArr.length;
            try {
                PropertySerializerMap propertySerializerMap = this.l;
                obj2 = null;
                while (i < length3) {
                    try {
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            serializerProvider.o(jsonGenerator);
                        } else {
                            Class<?> cls = obj2.getClass();
                            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
                            if (jsonSerializerD == null && propertySerializerMap != (propertySerializerMapC = propertySerializerMap.c(cls, (jsonSerializerD = serializerProvider.q(cls, beanProperty))))) {
                                this.l = propertySerializerMapC;
                            }
                            jsonSerializerD.g(obj2, jsonGenerator, serializerProvider, typeSerializer);
                        }
                        i++;
                    } catch (Exception e2) {
                        e = e2;
                        StdSerializer.m(serializerProvider, e, obj2, i);
                        throw null;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                obj2 = null;
            }
        } else {
            try {
                PropertySerializerMap propertySerializerMap2 = this.l;
                obj = null;
                while (i < length) {
                    try {
                        obj = objArr[i];
                        if (obj == null) {
                            serializerProvider.o(jsonGenerator);
                        } else {
                            Class<?> cls2 = obj.getClass();
                            JsonSerializer jsonSerializerD2 = propertySerializerMap2.d(cls2);
                            if (jsonSerializerD2 == null) {
                                if (javaType.s()) {
                                    PropertySerializerMap.SerializerAndMapResult serializerAndMapResultB = propertySerializerMap2.b(serializerProvider.n(javaType, cls2), serializerProvider, beanProperty);
                                    PropertySerializerMap propertySerializerMap3 = serializerAndMapResultB.b;
                                    if (propertySerializerMap2 != propertySerializerMap3) {
                                        this.l = propertySerializerMap3;
                                    }
                                    jsonSerializerD2 = serializerAndMapResultB.f14312a;
                                } else {
                                    jsonSerializerD2 = serializerProvider.q(cls2, beanProperty);
                                    PropertySerializerMap propertySerializerMapC2 = propertySerializerMap2.c(cls2, jsonSerializerD2);
                                    if (propertySerializerMap2 != propertySerializerMapC2) {
                                        this.l = propertySerializerMapC2;
                                    }
                                }
                            }
                            jsonSerializerD2.f(obj, jsonGenerator, serializerProvider);
                        }
                        i++;
                    } catch (Exception e4) {
                        e = e4;
                        StdSerializer.m(serializerProvider, e, obj, i);
                        throw null;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                obj = null;
            }
        }
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this.i = objectArraySerializer.i;
        this.j = typeSerializer;
        this.h = objectArraySerializer.h;
        this.l = PropertySerializerMap.a();
        this.k = jsonSerializer;
    }
}

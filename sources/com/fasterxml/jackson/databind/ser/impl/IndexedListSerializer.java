package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes4.dex */
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.SerializerProvider r7) throws java.io.IOException {
        /*
            r4 = this;
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L1f
            java.lang.Boolean r1 = r4.i
            if (r1 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r3 = r7.d
            boolean r2 = r3.r(r2)
            if (r2 != 0) goto L1b
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1f
        L1b:
            r4.r(r5, r6, r7)
            return
        L1f:
            r6.a1(r0, r5)
            r4.r(r5, r6, r7)
            r6.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new IndexedListSerializer(this, this.g, typeSerializer, this.k, this.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        return ((List) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public final AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int i = 0;
        TypeSerializer typeSerializer = this.j;
        JsonSerializer jsonSerializer = this.k;
        if (jsonSerializer != null) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    try {
                        serializerProvider.o(jsonGenerator);
                    } catch (Exception e) {
                        StdSerializer.m(serializerProvider, e, list, i);
                        throw null;
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.f(obj, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.g(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            }
            return;
        }
        BeanProperty beanProperty = this.g;
        JavaType javaType = this.f;
        if (typeSerializer != null) {
            int size2 = list.size();
            if (size2 == 0) {
                return;
            }
            try {
                PropertySerializerMap propertySerializerMap = this.l;
                while (i < size2) {
                    Object obj2 = list.get(i);
                    if (obj2 == null) {
                        serializerProvider.o(jsonGenerator);
                    } else {
                        Class<?> cls = obj2.getClass();
                        JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
                        if (jsonSerializerD == null) {
                            if (javaType.s()) {
                                jsonSerializerD = q(propertySerializerMap, serializerProvider.n(javaType, cls), serializerProvider);
                            } else {
                                jsonSerializerD = serializerProvider.q(cls, beanProperty);
                                PropertySerializerMap propertySerializerMapC = propertySerializerMap.c(cls, jsonSerializerD);
                                if (propertySerializerMap != propertySerializerMapC) {
                                    this.l = propertySerializerMapC;
                                }
                            }
                            propertySerializerMap = this.l;
                        }
                        jsonSerializerD.g(obj2, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                }
                return;
            } catch (Exception e2) {
                StdSerializer.m(serializerProvider, e2, list, i);
                throw null;
            }
        }
        int size3 = list.size();
        if (size3 == 0) {
            return;
        }
        try {
            PropertySerializerMap propertySerializerMap2 = this.l;
            while (i < size3) {
                Object obj3 = list.get(i);
                if (obj3 == null) {
                    serializerProvider.o(jsonGenerator);
                } else {
                    Class<?> cls2 = obj3.getClass();
                    JsonSerializer jsonSerializerD2 = propertySerializerMap2.d(cls2);
                    if (jsonSerializerD2 == null) {
                        if (javaType.s()) {
                            jsonSerializerD2 = q(propertySerializerMap2, serializerProvider.n(javaType, cls2), serializerProvider);
                        } else {
                            jsonSerializerD2 = serializerProvider.q(cls2, beanProperty);
                            PropertySerializerMap propertySerializerMapC2 = propertySerializerMap2.c(cls2, jsonSerializerD2);
                            if (propertySerializerMap2 != propertySerializerMapC2) {
                                this.l = propertySerializerMapC2;
                            }
                        }
                        propertySerializerMap2 = this.l;
                    }
                    jsonSerializerD2.f(obj3, jsonGenerator, serializerProvider);
                }
                i++;
            }
        } catch (Exception e3) {
            StdSerializer.m(serializerProvider, e3, list, i);
            throw null;
        }
    }
}

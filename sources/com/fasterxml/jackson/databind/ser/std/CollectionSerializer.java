package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    public CollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(Collection.class, javaType, z, typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((Collection) obj).isEmpty();
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
            java.util.Collection r5 = (java.util.Collection) r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.CollectionSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new CollectionSerializer(this, this.g, typeSerializer, this.k, this.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        return ((Collection) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public final AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JavaType javaType = this.f;
        jsonGenerator.i(collection);
        int i = 0;
        TypeSerializer typeSerializer = this.j;
        JsonSerializer jsonSerializer = this.k;
        if (jsonSerializer != null) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            serializerProvider.o(jsonGenerator);
                        } catch (Exception e) {
                            StdSerializer.m(serializerProvider, e, collection, i);
                            throw null;
                        }
                    } else if (typeSerializer == null) {
                        jsonSerializer.f(next, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer.g(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator it2 = collection.iterator();
        if (it2.hasNext()) {
            PropertySerializerMap propertySerializerMap = this.l;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        serializerProvider.o(jsonGenerator);
                    } else {
                        Class<?> cls = next2.getClass();
                        JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
                        if (jsonSerializerD == null) {
                            if (javaType.s()) {
                                jsonSerializerD = q(propertySerializerMap, serializerProvider.n(javaType, cls), serializerProvider);
                            } else {
                                jsonSerializerD = serializerProvider.q(cls, this.g);
                                PropertySerializerMap propertySerializerMapC = propertySerializerMap.c(cls, jsonSerializerD);
                                if (propertySerializerMap != propertySerializerMapC) {
                                    this.l = propertySerializerMapC;
                                }
                            }
                            propertySerializerMap = this.l;
                        }
                        if (typeSerializer == null) {
                            jsonSerializerD.f(next2, jsonGenerator, serializerProvider);
                        } else {
                            jsonSerializerD.g(next2, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                    i++;
                } catch (Exception e2) {
                    StdSerializer.m(serializerProvider, e2, collection, i);
                    throw null;
                }
            } while (it2.hasNext());
        }
    }
}

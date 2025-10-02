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
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Iterator it = (Iterator) obj;
        jsonGenerator.b1(it);
        r(it, jsonGenerator, serializerProvider);
        jsonGenerator.F();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new IteratorSerializer(this, this.g, typeSerializer, this.k, this.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final /* bridge */ /* synthetic */ boolean p(Object obj) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public final AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(Iterator it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this.j;
            JsonSerializer jsonSerializer = this.k;
            if (jsonSerializer != null) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        serializerProvider.o(jsonGenerator);
                    } else if (typeSerializer == null) {
                        jsonSerializer.f(next, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer.g(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                } while (it.hasNext());
                return;
            }
            PropertySerializerMap propertySerializerMap = this.l;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    serializerProvider.o(jsonGenerator);
                } else {
                    Class<?> cls = next2.getClass();
                    JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
                    if (jsonSerializerD == null) {
                        JavaType javaType = this.f;
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
            } while (it.hasNext());
        }
    }
}

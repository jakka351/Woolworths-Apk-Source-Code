package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r4, com.fasterxml.jackson.core.JsonGenerator r5, com.fasterxml.jackson.databind.SerializerProvider r6) {
        /*
            r3 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Boolean r0 = r3.i
            if (r0 != 0) goto L10
            com.fasterxml.jackson.databind.SerializationFeature r1 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r2 = r6.d
            boolean r1 = r2.r(r1)
            if (r1 != 0) goto L14
        L10:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L2d
        L14:
            if (r4 == 0) goto L2d
            java.util.Iterator r0 = r4.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            r0.next()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2d
            r3.r(r4, r5, r6)
            return
        L2d:
            r5.b1(r4)
            r3.r(r4, r5, r6)
            r5.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.IterableSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new IterableSerializer(this, this.g, typeSerializer, this.k, this.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public final AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new IterableSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(Iterable iterable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Class<?> cls = null;
            JsonSerializer jsonSerializerY = null;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.o(jsonGenerator);
                } else {
                    JsonSerializer jsonSerializer2 = this.k;
                    if (jsonSerializer2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializerY = serializerProvider.y(cls2, this.g);
                            cls = cls2;
                        }
                        jsonSerializer = jsonSerializerY;
                    } else {
                        jsonSerializer = jsonSerializerY;
                        jsonSerializerY = jsonSerializer2;
                    }
                    TypeSerializer typeSerializer = this.j;
                    if (typeSerializer == null) {
                        jsonSerializerY.f(next, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializerY.g(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    jsonSerializerY = jsonSerializer;
                }
            } while (it.hasNext());
        }
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((EnumSet) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.SerializerProvider r7) {
        /*
            r4 = this;
            java.util.EnumSet r5 = (java.util.EnumSet) r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.EnumSetSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        return ((EnumSet) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public final AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(EnumSet enumSet, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Iterator it = enumSet.iterator();
        JsonSerializer jsonSerializerQ = this.k;
        while (it.hasNext()) {
            Enum r1 = (Enum) it.next();
            if (jsonSerializerQ == null) {
                jsonSerializerQ = serializerProvider.q(r1.getDeclaringClass(), this.g);
            }
            jsonSerializerQ.f(r1, jsonGenerator, serializerProvider);
        }
    }
}

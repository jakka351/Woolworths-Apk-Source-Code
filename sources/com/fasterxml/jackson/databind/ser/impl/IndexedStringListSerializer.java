package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes4.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer g = new IndexedStringListSerializer(List.class);

    public static void q(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    serializerProvider.o(jsonGenerator);
                } else {
                    jsonGenerator.J1(str);
                }
            } catch (Exception e) {
                StdSerializer.m(serializerProvider, e, list, i2);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r6, com.fasterxml.jackson.core.JsonGenerator r7, com.fasterxml.jackson.databind.SerializerProvider r8) throws java.io.IOException {
        /*
            r5 = this;
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L1f
            java.lang.Boolean r2 = r5.f
            if (r2 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r3 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r4 = r8.d
            boolean r3 = r4.r(r3)
            if (r3 != 0) goto L1b
        L17:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r2 != r3) goto L1f
        L1b:
            q(r6, r7, r8, r1)
            return
        L1f:
            r7.a1(r0, r6)
            q(r6, r7, r8, r0)
            r7.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        List list = (List) obj;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, list));
        jsonGenerator.i(list);
        q(list, jsonGenerator, serializerProvider, list.size());
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public final JsonSerializer o(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    /* renamed from: p */
    public final void g(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        List list = (List) collection;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, list));
        jsonGenerator.i(list);
        q(list, jsonGenerator, serializerProvider, list.size());
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}

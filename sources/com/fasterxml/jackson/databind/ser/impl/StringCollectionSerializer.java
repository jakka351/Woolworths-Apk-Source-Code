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
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer g = new StringCollectionSerializer(Collection.class);

    public static void q(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    serializerProvider.o(jsonGenerator);
                } else {
                    jsonGenerator.J1(str);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.m(serializerProvider, e, collection, i);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
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
            java.lang.Boolean r1 = r4.f
            if (r1 != 0) goto L17
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r3 = r7.d
            boolean r2 = r3.r(r2)
            if (r2 != 0) goto L1b
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1f
        L1b:
            q(r5, r6, r7)
            return
        L1f:
            r6.a1(r0, r5)
            q(r5, r6, r7)
            r6.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public final JsonSerializer o(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: p */
    public final void g(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, collection));
        jsonGenerator.i(collection);
        q(collection, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}

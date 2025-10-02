package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class ByteArraySerializer extends StdSerializer<byte[]> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((byte[]) obj).length == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        byte[] bArr = (byte[]) obj;
        jsonGenerator.x(serializerProvider.d.e.j, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        byte[] bArr = (byte[]) obj;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_EMBEDDED_OBJECT, bArr));
        jsonGenerator.x(serializerProvider.d.e.j, bArr, 0, bArr.length);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}

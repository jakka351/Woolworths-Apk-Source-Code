package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

/* loaded from: classes4.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.J1(((Path) obj).toUri().toString());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Path path = (Path) obj;
        WritableTypeId writableTypeIdD = typeSerializer.d(JsonToken.VALUE_STRING, path);
        writableTypeIdD.b = Path.class;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, writableTypeIdD);
        jsonGenerator.J1(path.toUri().toString());
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}

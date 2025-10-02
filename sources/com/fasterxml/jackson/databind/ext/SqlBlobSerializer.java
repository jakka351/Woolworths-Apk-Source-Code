package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;
import java.sql.SQLException;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class SqlBlobSerializer extends StdScalarSerializer<Blob> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((Blob) obj) == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws SQLException, JsonMappingException {
        try {
            jsonGenerator.v(serializerProvider.d.e.j, ((Blob) obj).getBinaryStream(), -1);
        } catch (SQLException e) {
            serializerProvider.getClass();
            throw new JsonMappingException(serializerProvider.z(), "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws SQLException, JsonMappingException {
        Blob blob = (Blob) obj;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_EMBEDDED_OBJECT, blob));
        try {
            jsonGenerator.v(serializerProvider.d.e.j, blob.getBinaryStream(), -1);
            typeSerializer.f(jsonGenerator, writableTypeIdE);
        } catch (SQLException e) {
            serializerProvider.getClass();
            throw new JsonMappingException(serializerProvider.z(), "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.J1(((TimeZone) obj).getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        TimeZone timeZone = (TimeZone) obj;
        WritableTypeId writableTypeIdD = typeSerializer.d(JsonToken.VALUE_STRING, timeZone);
        writableTypeIdD.b = TimeZone.class;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, writableTypeIdD);
        jsonGenerator.J1(timeZone.getID());
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}
